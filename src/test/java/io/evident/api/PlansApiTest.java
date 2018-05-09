package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.PaginatedCollection;
import io.evident.models.Plan;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlansApi
 */
public class PlansApiTest {

    private PlansApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PlansApi.class);
    }

    
    /**
     * Get a list of Plans
     *
     * 
     */
    @Test
    public void listTest() {
        String page = null;
        // PaginatedCollection response = api.list(page);

        // TODO: test validations
    }
    
    /**
     * Show a single Plan
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        // Plan response = api.show(id);

        // TODO: test validations
    }
    
}
