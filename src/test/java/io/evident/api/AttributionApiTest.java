package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.Attribution;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AttributionApi
 */
public class AttributionApiTest {

    private AttributionApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AttributionApi.class);
    }

    
    /**
     * Show the attribution for an alert
     *
     * 
     */
    @Test
    public void showTest() {
        Integer alertId = null;
        String include = null;
        // Attribution response = api.show(alertId, include);

        // TODO: test validations
    }
    
}
