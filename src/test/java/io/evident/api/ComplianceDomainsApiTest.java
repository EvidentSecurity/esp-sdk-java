package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.ComplianceDomain;
import io.evident.models.PaginatedCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ComplianceDomainsApi
 */
public class ComplianceDomainsApiTest {

    private ComplianceDomainsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ComplianceDomainsApi.class);
    }

    
    /**
     * Get a list of Compliance Domains
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
     * Show a single Compliance Domain
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // ComplianceDomain response = api.show(id, include);

        // TODO: test validations
    }
    
}
