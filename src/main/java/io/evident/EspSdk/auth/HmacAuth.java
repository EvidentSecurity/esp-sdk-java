package io.evident.EspSdk.auth;

import lombok.NonNull;
import lombok.SneakyThrows;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * OkHttp Interceptor to add esp_web authorization headers to request.
 */
public class HmacAuth implements Interceptor {
    private static final String algorithm = "HmacSHA1";
    private String accessKeyId;
    private String secretAccessKey;

    public HmacAuth() {
        setAccessKeys(System.getenv("ESP_ACCESS_KEY_ID"), System.getenv("ESP_SECRET_ACCESS_KEY"));
    }

    public void setAccessKeys(String useAccessKeyId, String useSecretAccessKey) {
        accessKeyId = useAccessKeyId;
        secretAccessKey = useSecretAccessKey;
    }

    @Override
    @SneakyThrows(IOException.class)
    public Response intercept(@NonNull Chain chain) throws IOException {
        if (accessKeyId == null || secretAccessKey == null) {
            throw new IOException("Authentication keys are not properly set.");
        }

        Request newRequest = addHMAC_Headers(chain.request());
        return chain.proceed(newRequest);
    }

    @SneakyThrows(IOException.class)
    public Request addHMAC_Headers(Request originalReq) throws IOException {
        Request newRequest = null;
        if (originalReq != null) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(secretAccessKey.getBytes(StandardCharsets.UTF_8), algorithm);
                String bodyString = bodyToString(originalReq.body());
                String md5Body = base64MD5(bodyString);
                String date = rfc1123ZonedDateTime();
                String authorization = authString(originalReq, md5Body, date, accessKeyId, secretKeySpec);
                newRequest = originalReq.newBuilder()
                        .header("Authorization", authorization)
                        .header("Date", date)
                        .header("Content-Type", "application/vnd.api+json")
                        .header("Accept", "application/vnd.api+json")
                        .header("Content-MD5", md5Body)
                        .build();
            } catch (Exception e) {
                throw new IOException(e.getMessage());
            }
        }
        return newRequest;
    }

    @SneakyThrows(IOException.class)
    private static String bodyToString(RequestBody requestBody) throws IOException {
        String retVal = null;
        if (requestBody != null) {
            Buffer buffer = new Buffer();
            requestBody.writeTo(buffer);
            retVal = buffer.readUtf8();
        }
        return retVal;
    }

    private String base64MD5(String str) {
        String retVal = "";
        if (str != null) {
            byte[] md5Bytes = DigestUtils.md5(str);
            byte[] base64Encoded = Base64.encodeBase64(md5Bytes);
            retVal = new String(base64Encoded, StandardCharsets.UTF_8);
        }
        return retVal;
    }

    private String rfc1123ZonedDateTime() {
        DateTime dt = new DateTime(DateTimeZone.UTC);
        DateTimeFormatter rfc1123_2 = DateTimeFormat.forPattern("EEE, dd MMM yyyy HH:mm:ss 'GMT'")
                .withLocale(Locale.US);
        return rfc1123_2.print(dt);
    }

    @SneakyThrows({NoSuchAlgorithmException.class, InvalidKeyException.class})
    private String signature(String data, SecretKeySpec secretKeySpec) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance(algorithm);
        mac.init(secretKeySpec);
        byte[] rawHmac = mac.doFinal(data.getBytes(StandardCharsets.UTF_8));
        return new String(Base64.encodeBase64(rawHmac), StandardCharsets.UTF_8);
    }

    private String authString(Request request,
                              String md5Body,
                              String date,
                              String accessKeyId,
                              SecretKeySpec secretKeySpec) throws NoSuchAlgorithmException, InvalidKeyException {

        String endpoint = request.url().toString().replaceFirst(".*(?=/api)", "");
        String accept = "application/vnd.api+json";
        String signature = signature(
                String.format("%s,%s,%s,%s,%s", request.method(), accept, md5Body, endpoint, date),
                secretKeySpec
        );
        return String.format("APIAuth %s:%s", accessKeyId, signature);
    }
}