package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.CustomSignature;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomSignaturesApi
 */
public class CustomSignaturesApiTest {

    private CustomSignaturesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CustomSignaturesApi.class);
    }

    
    /**
     * Create a(n) Custom Signature
     *
     * 
     */
    @Test
    public void createTest() {
        String identifier = null;
        String name = null;
        String riskLevel = null;
        List<Integer> externalAccountIds = null;
        String description = null;
        String resolution = null;
        String include = null;
        // CustomSignature response = api.create(identifier, name, riskLevel, externalAccountIds, description, resolution, include);

        // TODO: test validations
    }
    
    /**
     * Delete a(n) Custom Signature
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
     * Get a list of Custom Signatures
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
     * Show a single Custom Signature
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // CustomSignature response = api.show(id, include);

        // TODO: test validations
    }
    
    /**
     * Update a(n) Custom Signature
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer id = null;
        String description = null;
        String identifier = null;
        String name = null;
        String resolution = null;
        String riskLevel = null;
        List<Integer> externalAccountIds = null;
        String include = null;
        // CustomSignature response = api.update(id, description, identifier, name, resolution, riskLevel, externalAccountIds, include);

        // TODO: test validations
    }
    
}
