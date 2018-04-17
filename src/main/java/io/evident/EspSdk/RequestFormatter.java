/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.evident.EspSdk;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.regex.Pattern;
import lombok.NonNull;
import lombok.SneakyThrows;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

/**
 *
 * @author shaun
 */
public class RequestFormatter implements Interceptor {

    class ParsingException extends Exception {}

    @Override
    @SneakyThrows(IOException.class)
    public Response intercept(@NonNull Chain chain) throws IOException {
        Request request = processRequest(chain.request());
        return chain.proceed(request);
    }

    public Request processRequest(Request request) throws IOException {
        Request retVal = request;
        String body = bodyToString(request.body());
        if (body != null && !body.isEmpty()) {
            try {
                body = URLDecoder.decode(body, "UTF-8");
                StringBuilder newBody = new StringBuilder();
                MediaType mediaType = null;

                String pairs[] = splitPairs(body);

                if (hasCondition(body)) {
                    mediaType = MediaType.parse("text/plain; charset=utf-8");
                    for (String curCondition : pairs) {
                        newBody = addConditionalValueToBody(curCondition, newBody);
                    }
                    newBody.insert(0, "{").append("}");
                } else {
                    mediaType = MediaType.parse("application/json; charset=utf-8");
                    for (String curPair : pairs) {
                        addFormValuesToBody(curPair, newBody);
                    }
                    newBody.deleteCharAt(newBody.length()-1).insert(0, "{\"data\":{\"attributes\":{").append("}}}");
                }

                RequestBody newRequestBody = RequestBody.create(mediaType, newBody.toString());
                retVal = new Request.Builder().url(request.url()).tag(request.tag()).method(request.method(), newRequestBody)
                        .headers(request.headers()).removeHeader("Content-Length").addHeader("Content-Length", ""+newBody.length())
                        .build();
            } catch(ParsingException pe) {
                System.out.printf("%s\nRequest Body:\n\nEncountered difficulty splitting into value pairs. Sending across as-is.\n\n",
                        pe.getClass(), body);
            } catch(Exception e) {
                throw new IOException(e.getMessage());
            }
        }
        return retVal;
    }

    @SneakyThrows(IOException.class)
    public static String bodyToString(RequestBody requestBody) throws IOException {
        String retVal = null;
        if (requestBody != null) {
            Buffer buffer = new Buffer();
            requestBody.writeTo(buffer);
            retVal = buffer.readUtf8();
        }
        return retVal;
    }

    private static String[] splitPairs(String body) {
        return body.split("(?<!\\\\)&");
    }

    private static boolean hasCondition(String body) {
        return Pattern.compile("\\b(filter|page)\\=").matcher(body).find();
    }

    private StringBuilder addConditionalValueToBody(String condition, StringBuilder newBody) throws ParsingException {
        String values[] = condition.split("=", 2);
        if (newBody.length() > 0) {
            newBody.append(",");
        }
        newBody.append("\"").append(values[0]).append("\":{");
        String rules[] = values[1].replaceFirst("^\\{", "").replaceFirst("\\}$", "").split(",(?=[a-zA-Z_]*=)");
        for (String curRule : rules) {
            addFormValuesToBody(curRule, newBody);
        }
        newBody.deleteCharAt(newBody.length()-1).append("}");
        newBody = new StringBuilder(newBody.toString().replaceAll("\"\\[", "\\[").replaceAll("\\]\"", "\\]"));
        return newBody;
    }

    private void addFormValuesToBody(String curPair, StringBuilder newBody) throws ParsingException {
        String values[] = curPair.split("(?<!\\\\)=");
        if (values.length != 2) {
            // this is not the match we are looking for
            throw new ParsingException();
        }
        newBody.append("\"").append(values[0]).append("\":\"").append(values[1]).append("\",");
    }
}
