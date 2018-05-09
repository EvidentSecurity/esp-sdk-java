package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.Metadata;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetadataApi
 */
public class MetadataApiTest {

    private MetadataApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MetadataApi.class);
    }

    
    /**
     * Show the metadata for an alert
     *
     * 
     */
    @Test
    public void forAlertTest() {
        Integer alertId = null;
        // Metadata response = api.forAlert(alertId);

        // TODO: test validations
    }
    
    /**
     * Show a single Metadata
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        // Metadata response = api.show(id);

        // TODO: test validations
    }
    
}
