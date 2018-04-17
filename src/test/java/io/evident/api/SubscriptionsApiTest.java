package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.Subscription;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionsApi
 */
public class SubscriptionsApiTest {

    private SubscriptionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SubscriptionsApi.class);
    }

    
    /**
     * Show a single Subscription
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // Subscription response = api.show(id, include);

        // TODO: test validations
    }
    
}
