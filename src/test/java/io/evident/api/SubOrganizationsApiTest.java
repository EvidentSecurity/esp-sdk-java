package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import io.evident.models.SubOrganization;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubOrganizationsApi
 */
public class SubOrganizationsApiTest {

    private SubOrganizationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SubOrganizationsApi.class);
    }

    
    /**
     * Create a(n) Sub Organization
     *
     * 
     */
    @Test
    public void createTest() {
        String name = null;
        Integer organizationId = null;
        String include = null;
        // SubOrganization response = api.create(name, organizationId, include);

        // TODO: test validations
    }
    
    /**
     * Delete a(n) Sub Organization
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
     * Get a list of Sub Organizations
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
     * Show a single Sub Organization
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // SubOrganization response = api.show(id, include);

        // TODO: test validations
    }
    
    /**
     * Update a(n) Sub Organization
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer id = null;
        String include = null;
        String name = null;
        // SubOrganization response = api.update(id, include, name);

        // TODO: test validations
    }
    
}
