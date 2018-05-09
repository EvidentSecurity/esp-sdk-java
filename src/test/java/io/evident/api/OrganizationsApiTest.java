package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.Organization;
import io.evident.models.PaginatedCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganizationsApi
 */
public class OrganizationsApiTest {

    private OrganizationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(OrganizationsApi.class);
    }

    
    /**
     * Get a list of Organizations
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
     * Get a list of compliance standards for an organization
     *
     * 
     */
    @Test
    public void listComplianceStandardsTest() {
        Integer organizationId = null;
        String include = null;
        String page = null;
        // PaginatedCollection response = api.listComplianceStandards(organizationId, include, page);

        // TODO: test validations
    }
    
    /**
     * Show a single Organization
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // Organization response = api.show(id, include);

        // TODO: test validations
    }
    
    /**
     * Update a(n) Organization
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer id = null;
        String include = null;
        String name = null;
        Boolean requireMfa = null;
        // Organization response = api.update(id, include, name, requireMfa);

        // TODO: test validations
    }
    
}
