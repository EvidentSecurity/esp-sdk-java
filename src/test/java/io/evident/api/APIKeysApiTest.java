package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.ApiKey;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for APIKeysApi
 */
public class APIKeysApiTest {

    private APIKeysApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(APIKeysApi.class);
    }

    
    /**
     * Create a(n) API Key
     *
     * The secret key will only be returned once when the key is first created
     */
    @Test
    public void createTest() {
        String include = null;
        String name = null;
        // ApiKey response = api.create(include, name);

        // TODO: test validations
    }
    
    /**
     * Delete a(n) API Key
     *
     * 
     */
    @Test
    public void deleteTest() {
        Integer id = null;
        // Meta response = api.delete(id);

        // TODO: test validations
    }
    
    /**
     * Get a list of API Keys
     *
     * 
     */
    @Test
    public void listTest() {
        String include = null;
        String page = null;
        // PaginatedCollection response = api.list(include, page);

        // TODO: test validations
    }
    
    /**
     * Show a single API Key
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // ApiKey response = api.show(id, include);

        // TODO: test validations
    }
    
    /**
     * Update a(n) API Key
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer id = null;
        String include = null;
        String name = null;
        // ApiKey response = api.update(id, include, name);

        // TODO: test validations
    }
    
}
