package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.PaginatedCollection;
import io.evident.models.Tag;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TagsApi
 */
public class TagsApiTest {

    private TagsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TagsApi.class);
    }

    
    /**
     * Get a list of Tags
     *
     * 
     */
    @Test
    public void listForAlertTest() {
        Integer alertId = null;
        String page = null;
        String include = null;
        // PaginatedCollection response = api.listForAlert(alertId, page, include);

        // TODO: test validations
    }
    
    /**
     * Show a single Tag
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // Tag response = api.show(id, include);

        // TODO: test validations
    }
    
}
