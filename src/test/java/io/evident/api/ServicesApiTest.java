package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.PaginatedCollection;
import io.evident.models.Service;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServicesApi
 */
public class ServicesApiTest {

    private ServicesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ServicesApi.class);
    }

    
    /**
     * Get a list of Services
     *
     * 
     */
    @Test
    public void listTest() {
        Map<String, String> filter = null;
        String page = null;
        // PaginatedCollection response = api.list(filter, page);

        // TODO: test validations
    }
    
    /**
     * Show a single Service
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        // Service response = api.show(id);

        // TODO: test validations
    }
    
}
