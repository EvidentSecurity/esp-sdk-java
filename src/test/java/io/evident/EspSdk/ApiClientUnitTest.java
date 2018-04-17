/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.evident.EspSdk;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.evident.models.Alert;
import io.evident.models.Organization;
import io.evident.models.PaginatedCollection;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shaun
 */
public class ApiClientUnitTest {

    private static final Gson GSON = new GsonBuilder()
                                            .setDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'")
                                            .registerTypeAdapter(DateTime.class, new DateTimeTypeAdapter())
                                            .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
                                            .create();
    public ApiClientUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testTimeouts() {
        ApiClient espClient = new ApiClient();
        int defaultConnectionTimeout = espClient.getConnectionTimeoutMs();
        int setConnectionTimeout = 15000;
        assertNotEquals(defaultConnectionTimeout, setConnectionTimeout);
        espClient.setTimeoutsMs(setConnectionTimeout);
        int newConnectionTimeout = espClient.getConnectionTimeoutMs();
        assertEquals(newConnectionTimeout, setConnectionTimeout);
    }

    @Test
    public void testProvidingOKHttpClientBuilder() {
        OkHttpClient.Builder okClientBuilder = new OkHttpClient.Builder();
        int setConnectionTimeout = 60000;
        okClientBuilder.connectTimeout(setConnectionTimeout, TimeUnit.MILLISECONDS);
        ApiClient espClient = new ApiClient(okClientBuilder);
        int connectionTimeout = espClient.getConnectionTimeoutMs();
        assertEquals(connectionTimeout, setConnectionTimeout);
    }
    
    @Test
    public void testHMAC_AuthInterceptPresent() {
        ApiClient espClient = new ApiClient();
        Map<String, Interceptor> intercepts = espClient.getApiIntercepts();
        assertNotNull(intercepts.get("HmacAuth"));
    }

    @Test
    public void testHandlesPaginatedCollections() throws IOException {
        String rawResponse = "{\"data\":[{\"id\":\"1\",\"type\":\"organizations\",\"attributes\":{\"country\":\"United States of America\",\"created_at\":\"2018-03-07T15:28:05.000Z\",\"name\":\"Default\",\"require_mfa\":false,\"updated_at\":\"2018-03-07T15:28:05.000Z\"},\"relationships\":{\"subscription\":{\"links\":{\"related\":\"http://test.host/api/v2/subscriptions/1.json\"}},\"custom_signatures\":{\"links\":{\"related\":\"http://test.host/api/v2/custom_signatures.json?filter%5Borganization_id_eq%5D=1\"}},\"external_accounts\":{\"links\":{\"related\":\"http://test.host/api/v2/external_accounts.json?filter%5Borganization_id_eq%5D=1\"}},\"sub_organizations\":{\"links\":{\"related\":\"http://test.host/api/v2/sub_organizations.json?filter%5Borganization_id_eq%5D=1\"}},\"teams\":{\"links\":{\"related\":\"http://test.host/api/v2/teams.json?filter%5Borganization_id_eq%5D=1\"}},\"users\":{\"links\":{\"related\":\"http://test.host/api/v2/users.json?filter%5Borganization_id_eq%5D=1\"}},\"compliance_standards\":{\"links\":{\"related\":\"http://test.host/api/v2/organizations/1/compliance_standards.json\"}},\"integrations\":{\"links\":{\"related\":\"http://test.host/api/v2/integrations.json?filter%5Borganization_id_eq%5D=1\"}}}}],\"links\":{}}";
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), rawResponse);
        GsonResponseBodyConverterToString<PaginatedCollection> responseBodyConverter = 
                new GsonResponseBodyConverterToString<>(GSON, PaginatedCollection.class);
        PaginatedCollection collection = responseBodyConverter.convert(responseBody);
        assertEquals(collection.getClass(), PaginatedCollection.class);
        assertEquals(collection.getData().get(0).getClass(), Organization.class);
    }

    @Test
    public void testHandlesEspObjects() throws IOException {
        String rawResponse = "{\"data\":{\"id\":\"1\",\"type\":\"alerts\",\"attributes\":{\"created_at\":\"2018-03-07T15:28:06.000Z\",\"status\":\"fail\",\"risk_level\":\"high\",\"resource\":null,\"ended_reason\":null,\"replaced_by_id\":null,\"replaced_by_status\":null,\"updated_at\":\"2018-03-07T15:28:06.000Z\",\"started_at\":\"2018-03-07T15:23:06.000Z\",\"ended_at\":null},\"relationships\":{\"external_account\":{\"links\":{\"related\":\"http://test.host/api/v2/external_accounts/1.json\"}},\"region\":{\"links\":{\"related\":\"http://test.host/api/v2/regions/1.json\"}},\"signature\":{\"links\":{\"related\":\"http://test.host/api/v2/signatures/1.json\"}},\"custom_signature\":{\"links\":{\"related\":null}},\"suppression\":{\"links\":{\"related\":null}},\"metadata\":{\"links\":{\"related\":\"http://test.host/api/v2/alerts/1/metadata.json\"}},\"attribution\":{\"links\":{\"related\":\"http://test.host/api/v2/alerts/1/attribution.json\"}},\"cloud_trail_events\":{\"links\":{\"related\":\"http://test.host/api/v2/alerts/1/cloud_trail_events.json\"}},\"tags\":{\"links\":{\"related\":\"http://test.host/api/v2/alerts/1/tags.json\"}},\"compliance_controls\":{\"links\":{\"related\":\"http://test.host/api/v2/alerts/1/compliance_controls.json\"}},\"custom_compliance_controls\":{\"links\":{\"related\":\"http://test.host/api/v2/alerts/1/custom_compliance_controls.json\"}}}}}";
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), rawResponse);
        GsonResponseBodyConverterToString<PaginatedCollection> responseBodyConverter = 
                new GsonResponseBodyConverterToString<>(GSON, Alert.class);
        Object data = responseBodyConverter.convert(responseBody);
        assertEquals(data.getClass(), Alert.class);
    }
    
    @Test
    public void testFilterParams() throws IOException {
        RequestBody newRequestBody = RequestBody.create(MediaType.parse("text/plain; charset=utf-8"), "filter={name_cont=Evid}");
        Request request = new Request.Builder().url("http://localhost:3000/api/v2/sub_organizations.json_api").method("PUT", newRequestBody).build();
        RequestFormatter requestFormatter = new RequestFormatter();
        Request processedRequest = requestFormatter.processRequest(request);
        assertEquals("{\"filter\":{\"name_cont\":\"Evid\"}}",RequestFormatter.bodyToString(processedRequest.body()));
    }

    @Test
    public void testPageParams() throws IOException {
        RequestBody newRequestBody = RequestBody.create(MediaType.parse("text/plain; charset=utf-8"), "page={number=3,size=20}");
        Request request = new Request.Builder().url("http://localhost:3000/api/v2/sub_organizations.json_api").method("PUT", newRequestBody).build();
        RequestFormatter requestFormatter = new RequestFormatter();
        Request processedRequest = requestFormatter.processRequest(request);
        assertEquals("{\"page\":{\"number\":\"3\",\"size\":\"20\"}}",RequestFormatter.bodyToString(processedRequest.body()));
    }

    @Test
    public void testFormParams() throws IOException {
        RequestBody newRequestBody = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), "organization_id=1&name=Testing");
        Request request = new Request.Builder().url("http://localhost:3000/api/v2/sub_organizations.json_api").method("POST", newRequestBody).build();
        RequestFormatter requestFormatter = new RequestFormatter();
        Request processedRequest = requestFormatter.processRequest(request);
        assertEquals("{\"data\":{\"attributes\":{\"organization_id\":\"1\",\"name\":\"Testing\"}}}",RequestFormatter.bodyToString(processedRequest.body()));
    }
}
