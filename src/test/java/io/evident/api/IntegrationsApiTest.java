package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.Integration;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationsApi
 */
public class IntegrationsApiTest {

    private IntegrationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(IntegrationsApi.class);
    }

    
    /**
     * Delete a(n) Integration
     *
     * Use this endpoint to destory any type of Integration.
     */
    @Test
    public void deleteTest() {
        Integer id = null;
        // Meta response = api.delete(id);

        // TODO: test validations
    }
    
    /**
     * Disable a single Integration
     *
     * This will disable any type of Integration
     */
    @Test
    public void disableTest() {
        Integer id = null;
        // Meta response = api.disable(id);

        // TODO: test validations
    }
    
    /**
     * Get a list of Integrations
     *
     * This will return a list of every type of Integration.
     */
    @Test
    public void listTest() {
        Map<String, String> filter = null;
        String page = null;
        String include = null;
        // PaginatedCollection response = api.list(filter, page, include);

        // TODO: test validations
    }
    
    /**
     * Show a single Integration
     *
     * This will return any type of Integration.
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // Integration response = api.show(id, include);

        // TODO: test validations
    }
    
    /**
     * Test an Integration
     *
     * This will test any type of Integration.
     */
    @Test
    public void testNotifyTest() {
        Integer id = null;
        // Meta response = api.testNotify(id);

        // TODO: test validations
    }
    
}
