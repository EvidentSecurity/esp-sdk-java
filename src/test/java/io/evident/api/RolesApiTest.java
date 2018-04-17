package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.PaginatedCollection;
import io.evident.models.Role;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RolesApi
 */
public class RolesApiTest {

    private RolesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RolesApi.class);
    }

    
    /**
     * Get a list of Roles
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
     * Show a single Role
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // Role response = api.show(id, include);

        // TODO: test validations
    }
    
}
