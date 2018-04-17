package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.APIKey;
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
        String name = null;
        String include = null;
        // APIKey response = api.create(name, include);

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
        String page = null;
        String include = null;
        // PaginatedCollection response = api.list(page, include);

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
        // APIKey response = api.show(id, include);

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
        String name = null;
        String include = null;
        // APIKey response = api.update(id, name, include);

        // TODO: test validations
    }
    
}
