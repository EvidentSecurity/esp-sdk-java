package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.PaginatedCollection;
import io.evident.models.Report;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportsApi
 */
public class ReportsApiTest {

    private ReportsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ReportsApi.class);
    }

    
    /**
     * Create a(n) Report
     *
     * 
     */
    @Test
    public void createTest() {
        Integer teamId = null;
        String include = null;
        // Report response = api.create(teamId, include);

        // TODO: test validations
    }
    
    /**
     * Get a list of Reports
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
     * Show a single Report
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // Report response = api.show(id, include);

        // TODO: test validations
    }
    
}
