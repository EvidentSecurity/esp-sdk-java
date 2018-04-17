package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.PaginatedCollection;
import io.evident.models.Region;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RegionsApi
 */
public class RegionsApiTest {

    private RegionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RegionsApi.class);
    }

    
    /**
     * Get a list of Regions
     *
     * 
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
     * Show a single Region
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // Region response = api.show(id, include);

        // TODO: test validations
    }
    
}
