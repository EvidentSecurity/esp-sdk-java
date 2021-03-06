package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.CustomSignatureResult;
import io.evident.models.PaginatedCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomSignatureResultsApi
 */
public class CustomSignatureResultsApiTest {

    private CustomSignatureResultsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CustomSignatureResultsApi.class);
    }

    
    /**
     * Create a(n) Custom Signature Result
     *
     * 
     */
    @Test
    public void createTest() {
        String code = null;
        Integer customSignatureDefinitionId = null;
        Integer externalAccountId = null;
        String language = null;
        String include = null;
        String region = null;
        Integer regionId = null;
        // CustomSignatureResult response = api.create(code, customSignatureDefinitionId, externalAccountId, language, include, region, regionId);

        // TODO: test validations
    }
    
    /**
     * Get a list of Custom Signature Results
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
     * Returns the Alerts for a given Custom Signature Result
     *
     * This format is slightly different than the standard alert format. A successful call to this API returns a list of alerts for the custom signature result identified by the custom_signature_result_id parameter.
     */
    @Test
    public void listAlertsTest() {
        Integer customSignatureResultId = null;
        String include = null;
        String page = null;
        // PaginatedCollection response = api.listAlerts(customSignatureResultId, include, page);

        // TODO: test validations
    }
    
    /**
     * Show a single Custom Signature Result
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // CustomSignatureResult response = api.show(id, include);

        // TODO: test validations
    }
    
}
