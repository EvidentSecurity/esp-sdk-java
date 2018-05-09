package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.ComplianceControl;
import io.evident.models.PaginatedCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ComplianceControlsApi
 */
public class ComplianceControlsApiTest {

    private ComplianceControlsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ComplianceControlsApi.class);
    }

    
    /**
     * Get a list of Compliance Controls
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
     * Get a list of Signatures for a Compliance Control
     *
     * The compliance standard must be paid for to view signatures for a control on that standard.
     */
    @Test
    public void listSignaturesTest() {
        Integer complianceControlId = null;
        String include = null;
        String page = null;
        // PaginatedCollection response = api.listSignatures(complianceControlId, include, page);

        // TODO: test validations
    }
    
    /**
     * Show a single Compliance Control
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // ComplianceControl response = api.show(id, include);

        // TODO: test validations
    }
    
}
