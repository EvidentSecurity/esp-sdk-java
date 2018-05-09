package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.CustomComplianceDomain;
import io.evident.models.Meta;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomComplianceDomainsApi
 */
public class CustomComplianceDomainsApiTest {

    private CustomComplianceDomainsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CustomComplianceDomainsApi.class);
    }

    
    /**
     * Create a(n) Custom Compliance Domain
     *
     * 
     */
    @Test
    public void createTest() {
        Integer customComplianceStandardId = null;
        String identifier = null;
        String name = null;
        String include = null;
        Integer position = null;
        // CustomComplianceDomain response = api.create(customComplianceStandardId, identifier, name, include, position);

        // TODO: test validations
    }
    
    /**
     * Delete a(n) Custom Compliance Domain
     *
     * 
     */
    @Test
    public void deleteTest() {
        Integer id = null;
        // Meta response = api.delete(id);

        // TODO: test validations
    }
    
    /**
     * Show a single Custom Compliance Domain
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // CustomComplianceDomain response = api.show(id, include);

        // TODO: test validations
    }
    
    /**
     * Update a(n) Custom Compliance Domain
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer id = null;
        String include = null;
        Integer customComplianceStandardId = null;
        String identifier = null;
        String name = null;
        Integer position = null;
        // CustomComplianceDomain response = api.update(id, include, customComplianceStandardId, identifier, name, position);

        // TODO: test validations
    }
    
}
