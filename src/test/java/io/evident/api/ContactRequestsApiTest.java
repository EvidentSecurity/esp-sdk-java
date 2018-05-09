package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.ContactRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactRequestsApi
 */
public class ContactRequestsApiTest {

    private ContactRequestsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ContactRequestsApi.class);
    }

    
    /**
     * Create a(n) Contact Request
     *
     * 
     */
    @Test
    public void createTest() {
        String description = null;
        String requestType = null;
        String title = null;
        String include = null;
        // ContactRequest response = api.create(description, requestType, title, include);

        // TODO: test validations
    }
    
}
