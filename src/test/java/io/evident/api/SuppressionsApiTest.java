package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.PaginatedCollection;
import io.evident.models.Suppression;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SuppressionsApi
 */
public class SuppressionsApiTest {

    private SuppressionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SuppressionsApi.class);
    }

    
    /**
     * Create a suppression
     *
     * 
     */
    @Test
    public void createTest() {
        List<Integer> externalAccountIds = null;
        String reason = null;
        List<String> regions = null;
        String include = null;
        List<Integer> customSignatureIds = null;
        String resource = null;
        List<Integer> signatureIds = null;
        // Suppression response = api.create(externalAccountIds, reason, regions, include, customSignatureIds, resource, signatureIds);

        // TODO: test validations
    }
    
    /**
     * Creates a suppression from an alert
     *
     * A successful call to this API creates a new suppression based on the supplied alert_id. The body of the request must contain a json api compliant hash of the suppression reason and an alert id.
     */
    @Test
    public void createFromAlertTest() {
        String reason = null;
        String include = null;
        // Suppression response = api.createFromAlert(reason, include);

        // TODO: test validations
    }
    
    /**
     * Deactivate a suppression
     *
     * 
     */
    @Test
    public void deactivateTest() {
        Integer id = null;
        String include = null;
        // Suppression response = api.deactivate(id, include);

        // TODO: test validations
    }
    
    /**
     * Get a list of Suppressions
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
     * Show a single Suppression
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // Suppression response = api.show(id, include);

        // TODO: test validations
    }
    
}
