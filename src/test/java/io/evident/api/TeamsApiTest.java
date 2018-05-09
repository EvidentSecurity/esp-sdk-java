package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import io.evident.models.Team;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamsApi
 */
public class TeamsApiTest {

    private TeamsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TeamsApi.class);
    }

    
    /**
     * Create a(n) Team
     *
     * 
     */
    @Test
    public void createTest() {
        String name = null;
        Integer subOrganizationId = null;
        String include = null;
        Integer reportInterval = null;
        // Team response = api.create(name, subOrganizationId, include, reportInterval);

        // TODO: test validations
    }
    
    /**
     * Delete a(n) Team
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
     * Get a list of Teams
     *
     * 
     */
    @Test
    public void listTest() {
        String include = null;
        Map<String, String> filter = null;
        String page = null;
        // PaginatedCollection response = api.list(include, filter, page);

        // TODO: test validations
    }
    
    /**
     * Show a single Team
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // Team response = api.show(id, include);

        // TODO: test validations
    }
    
    /**
     * Update a(n) Team
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer id = null;
        String include = null;
        String name = null;
        Integer reportInterval = null;
        // Team response = api.update(id, include, name, reportInterval);

        // TODO: test validations
    }
    
}
