package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.ComplianceStandard;
import io.evident.models.PaginatedCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ComplianceStandardsApi
 */
public class ComplianceStandardsApiTest {

    private ComplianceStandardsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ComplianceStandardsApi.class);
    }

    
    /**
     * Get a list of Compliance Standards
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
     * Show a single Compliance Standard
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // ComplianceStandard response = api.show(id, include);

        // TODO: test validations
    }
    
}
