package io.evident.EspSdk;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.oltu.oauth2.client.request.OAuthClientRequest.AuthenticationRequestBuilder;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.TokenRequestBuilder;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import retrofit2.Converter;
import retrofit2.Retrofit;

import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;


import io.evident.EspSdk.auth.ApiKeyAuth;
import io.evident.EspSdk.auth.HmacAuth;
import io.evident.EspSdk.auth.HttpBasicAuth;
import io.evident.EspSdk.auth.OAuth;
import io.evident.EspSdk.auth.OAuth.AccessTokenListener;
import io.evident.EspSdk.auth.OAuthFlow;
import io.evident.models.PaginatedCollection;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ApiClient {

    private static final Gson gson = new GsonBuilder()
                                            .setDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'")
                                            .registerTypeAdapter(DateTime.class, new DateTimeTypeAdapter())
                                            .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
                                            .create();

    private Map<String, Interceptor> apiRequestIntercepts;
    private OkHttpClient.Builder okBuilder;
    private Retrofit.Builder adapterBuilder;

    public ApiClient() {
        this(new OkHttpClient.Builder());
    }

    public ApiClient(OkHttpClient.Builder useBuilder) {
        apiRequestIntercepts = new LinkedHashMap<>();
        okBuilder = useBuilder;
        String baseUrl = System.getenv("ESP_HOST");
        if (baseUrl == null) {
            baseUrl = ("development".equalsIgnoreCase(System.getenv("ESP_ENV")) ? "http://localhost:3000" : "https://api.evident.io");
        }
        setURL(baseUrl);
        addIntercept("RequestFormatter", new RequestFormatter());
        addIntercept("HmacAuth", new HmacAuth());
    }

    public boolean setURL(String url) {
        boolean retVal = (url != null);
        if (retVal) {
            if (!url.endsWith("/")) {
                url = url + "/";
            }
            adapterBuilder = new Retrofit
                    .Builder()
                    .baseUrl(url)

                    .addConverterFactory(GsonCustomConverterFactory.create(gson));
        }
        return retVal;
    }

    public void setTimeoutsMs(int timeoutMs) {
        setConnectionTimeoutMs(timeoutMs);
        setReadTimeoutMs(timeoutMs);
        setWriteTimeoutMs(timeoutMs);
    }

    public void setConnectionTimeoutMs(int timeoutMs) {
        okBuilder.connectTimeout(timeoutMs, TimeUnit.MILLISECONDS);
    }

    public void setReadTimeoutMs(int timeoutMs) {
        okBuilder.readTimeout(timeoutMs, TimeUnit.MILLISECONDS);
    }

    public void setWriteTimeoutMs(int timeoutMs) {
        okBuilder.writeTimeout(timeoutMs, TimeUnit.MILLISECONDS);
    }

    public int getConnectionTimeoutMs() {
        return okBuilder.build().connectTimeoutMillis();
    }

    public int getReadTimeoutMs() {
        return okBuilder.build().readTimeoutMillis();
    }

    public int getWriteTimeoutMs() {
        return okBuilder.build().writeTimeoutMillis();
    }

    public <S> S createService(Class<S> serviceClass) {
        return adapterBuilder
            .client(okBuilder.build())
            .build()
            .create(serviceClass);

    }

    public static Map<String,String> filter(String... conditions) {
        Map<String,String> filterMap = null;
        int numConditions = conditions.length;
        if (numConditions > 0) {
            if ((numConditions & 1) == 0) {
                filterMap = new HashMap<>();
                for (int i=0; i < numConditions; i++) {
                    filterMap.put(conditions[i], conditions[++i]);
                }
            } else {
                throw new IllegalArgumentException("Conditions must be supplied as consecutive String parameters. Odd number of parameters sent to filter() method." + conditions.toString());
            }
        }
        return filterMap;
    }
    /**
     * Helper method to configure the username/password for basic auth or password oauth
     * @param accessKeyId access key id from Evident
     * @param secretAccessKey secret access key from Evident
     */
    public boolean setHmacCredentials(String accessKeyId, String secretAccessKey) {
        boolean retVal = false;
        for(Interceptor apiIntercept : apiRequestIntercepts.values()) {
            if (apiIntercept instanceof HmacAuth) {
                HmacAuth basicAuth = (HmacAuth) apiIntercept;
                basicAuth.setAccessKeys(accessKeyId, secretAccessKey);
                retVal = true;
                break;
            }
        }
        return retVal;
    }

    /**
     * Adds an interceptor to be used by the client
     * @param interceptName Interceptor name
     * @param intercpetor Interceptor
     */
    private void addIntercept(String interceptName, Interceptor intercpetor) {
        if (apiRequestIntercepts.containsKey(interceptName)) {
            throw new RuntimeException("Interceptor with name \"" + interceptName + "\" already in api intercept list");
        }
        apiRequestIntercepts.put(interceptName, intercpetor);
        okBuilder.addNetworkInterceptor(intercpetor);
    }

    public Map<String, Interceptor> getApiIntercepts() {
        return apiRequestIntercepts;
    }

    public void setApiIntercepts(Map<String, Interceptor> apiRequestIntercepts) {
        this.apiRequestIntercepts = apiRequestIntercepts;
    }

    public Retrofit.Builder getAdapterBuilder() {
        return adapterBuilder;
    }

    public void setAdapterBuilder(Retrofit.Builder adapterBuilder) {
        this.adapterBuilder = adapterBuilder;
    }

    public OkHttpClient.Builder getOkBuilder() {
        return okBuilder;
    }

    private void addInterceptsToOkBuilder(OkHttpClient.Builder okBuilder) {
        for(Interceptor apiIntercept : apiRequestIntercepts.values()) {
            okBuilder.addInterceptor(apiIntercept);
        }
    }

    /**
     * Clones the okBuilder given in parameter, adds the auth interceptors and uses it to configure the Retrofit
     * @param okClient An instance of OK HTTP client
     */
    public void configureFromOkclient(OkHttpClient okClient) {
        this.okBuilder = okClient.newBuilder();
        addInterceptsToOkBuilder(this.okBuilder);

    }
}

/**
 * This wrapper is to take care of this case:
 * when the deserialization fails due to JsonParseException and the
 * expected type is String, then just return the body string.
 */
class GsonResponseBodyConverterToString<T> implements Converter<ResponseBody, T> {
    private final Gson gson;
    private final Type type;

    GsonResponseBodyConverterToString(Gson gson, Type type) {
      this.gson = gson;
      this.type = type;
    }

    @Override public T convert(ResponseBody value) throws IOException {
        String returned = value.string();
        try {
            if (type == PaginatedCollection.class) {
                return (T)processPaginatedCollection(returned);
            } else {
                ResponseFormatter rf = new ResponseFormatter();
                return gson.fromJson(rf.cleanUpResponse(returned), type);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (type.equals(String.class))
                return (T) returned;
            else throw (e);
        }
    }

    private PaginatedCollection processPaginatedCollection(String body) {
        PaginatedCollection result = new PaginatedCollection();
        ResponseFormatter rf = new ResponseFormatter();
        List<String> dataObjectsJson = new ArrayList<>();
        List<ResponseFormatter.ClassNJson> includedObjectsJson = new ArrayList<>();
        Map<String,String> linksJson = new HashMap<>();
        Class dataObjectClass = rf.getPaginatedData(body, dataObjectsJson, includedObjectsJson, linksJson);
        Iterator<String> dataIterator = dataObjectsJson.iterator();
        while(dataIterator.hasNext()){
            String curObj = dataIterator.next();
            result.addDataItem(gson.fromJson(curObj, dataObjectClass));
        }
        Iterator<ResponseFormatter.ClassNJson> includedIterator = includedObjectsJson.iterator();
        while(includedIterator.hasNext()){
            ResponseFormatter.ClassNJson curObj = includedIterator.next();
            result.addIncludedItem(gson.fromJson(curObj.myData, curObj.myClass));
        }
        result.links(linksJson);
        return result;
    }
}

class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private final Type type;
    private final Annotation[] parameterAnnotations;
    private final Annotation[] methodAnnotations;
    private final Retrofit retrofit;

    GsonRequestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        this.type = type;
        this.parameterAnnotations = parameterAnnotations;
        this.methodAnnotations = methodAnnotations;
        this.retrofit = retrofit;
    }

    @Override public RequestBody convert(T value) throws IOException {
        return null;
    }
}

class GsonCustomConverterFactory extends Converter.Factory
{
    public static GsonCustomConverterFactory create(Gson gson) {
        return new GsonCustomConverterFactory(gson);
    }

    private final Gson gson;
    private final GsonConverterFactory gsonConverterFactory;

    private GsonCustomConverterFactory(Gson gson) {
        if (gson == null) {
            throw new NullPointerException("gson == null");
        }
        this.gson = gson;
        this.gsonConverterFactory = GsonConverterFactory.create(gson);
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        return new GsonResponseBodyConverterToString<>(gson, type);
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return new GsonRequestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
    }
}

/**
 * Gson TypeAdapter for Joda DateTime type
 */
class DateTimeTypeAdapter extends TypeAdapter<DateTime> {

    private final DateTimeFormatter parseFormatter = ISODateTimeFormat.dateOptionalTimeParser();
    private final DateTimeFormatter printFormatter = ISODateTimeFormat.dateTime();

    @Override
    public void write(JsonWriter out, DateTime date) throws IOException {
        if (date == null) {
            out.nullValue();
        } else {
            out.value(printFormatter.print(date));
        }
    }

    @Override
    public DateTime read(JsonReader in) throws IOException {
        switch (in.peek()) {
            case NULL:
                in.nextNull();
                return null;
            default:
                String date = in.nextString();
                return parseFormatter.parseDateTime(date);
        }
    }
}

/**
 * Gson TypeAdapter for Joda LocalDate type
 */
class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

    private final DateTimeFormatter formatter = ISODateTimeFormat.date();

    @Override
    public void write(JsonWriter out, LocalDate date) throws IOException {
        if (date == null) {
            out.nullValue();
        } else {
            out.value(formatter.print(date));
        }
    }

    @Override
    public LocalDate read(JsonReader in) throws IOException {
        switch (in.peek()) {
            case NULL:
                in.nextNull();
                return null;
            default:
                String date = in.nextString();
                return formatter.parseLocalDate(date);
        }
    }
}
