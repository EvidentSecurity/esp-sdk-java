package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.CustomComplianceStandard;
import io.evident.models.Meta;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomComplianceStandardsApi
 */
public class CustomComplianceStandardsApiTest {

    private CustomComplianceStandardsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CustomComplianceStandardsApi.class);
    }

    
    /**
     * Create a(n) Custom Compliance Standard
     *
     * 
     */
    @Test
    public void createTest() {
        String description = null;
        String name = null;
        String include = null;
        // CustomComplianceStandard response = api.create(description, name, include);

        // TODO: test validations
    }
    
    /**
     * Delete a(n) Custom Compliance Standard
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
     * Show a single Custom Compliance Standard
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // CustomComplianceStandard response = api.show(id, include);

        // TODO: test validations
    }
    
    /**
     * Update a(n) Custom Compliance Standard
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer id = null;
        String include = null;
        String description = null;
        String name = null;
        // CustomComplianceStandard response = api.update(id, include, description, name);

        // TODO: test validations
    }
    
}
