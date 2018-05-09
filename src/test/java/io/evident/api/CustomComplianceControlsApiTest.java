package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.CustomComplianceControl;
import io.evident.models.CustomSignature;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import io.evident.models.Signature;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomComplianceControlsApi
 */
public class CustomComplianceControlsApiTest {

    private CustomComplianceControlsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CustomComplianceControlsApi.class);
    }

    
    /**
     * Add a Custom Signature to a Custom Compliance Control
     *
     * 
     */
    @Test
    public void addCustomSignatureTest() {
        Integer customComplianceControlId = null;
        Integer customSignatureId = null;
        String include = null;
        // CustomSignature response = api.addCustomSignature(customComplianceControlId, customSignatureId, include);

        // TODO: test validations
    }
    
    /**
     * Add a Signature to a Custom Compliance Control
     *
     * 
     */
    @Test
    public void addSignatureTest() {
        Integer customComplianceControlId = null;
        Integer signatureId = null;
        String include = null;
        // Signature response = api.addSignature(customComplianceControlId, signatureId, include);

        // TODO: test validations
    }
    
    /**
     * Create a(n) Custom Compliance Control
     *
     * 
     */
    @Test
    public void createTest() {
        Integer customComplianceDomainId = null;
        String identifier = null;
        String name = null;
        String include = null;
        List<Integer> customSignatureIds = null;
        String description = null;
        Integer position = null;
        List<Integer> signatureIds = null;
        // CustomComplianceControl response = api.create(customComplianceDomainId, identifier, name, include, customSignatureIds, description, position, signatureIds);

        // TODO: test validations
    }
    
    /**
     * Delete a(n) Custom Compliance Control
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
     * Get a list of Custom Signatures for a Custom Compliance Control
     *
     * 
     */
    @Test
    public void listCustomSignaturesTest() {
        Integer customComplianceControlId = null;
        String include = null;
        String page = null;
        // PaginatedCollection response = api.listCustomSignatures(customComplianceControlId, include, page);

        // TODO: test validations
    }
    
    /**
     * Get a list of Signatures for a Custom Compliance Control
     *
     * 
     */
    @Test
    public void listSignaturesTest() {
        Integer customComplianceControlId = null;
        String include = null;
        String page = null;
        // PaginatedCollection response = api.listSignatures(customComplianceControlId, include, page);

        // TODO: test validations
    }
    
    /**
     * Remove a Custom Signature from a Custom Compliance Control
     *
     * 
     */
    @Test
    public void removeCustomSignatureTest() {
        Integer customComplianceControlId = null;
        Integer customSignatureId = null;
        // Meta response = api.removeCustomSignature(customComplianceControlId, customSignatureId);

        // TODO: test validations
    }
    
    /**
     * Remove a Signature from a Custom Compliance Control
     *
     * 
     */
    @Test
    public void removeSignatureTest() {
        Integer customComplianceControlId = null;
        Integer signatureId = null;
        // Meta response = api.removeSignature(customComplianceControlId, signatureId);

        // TODO: test validations
    }
    
    /**
     * Show a single Custom Compliance Control
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // CustomComplianceControl response = api.show(id, include);

        // TODO: test validations
    }
    
    /**
     * Update a(n) Custom Compliance Control
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer id = null;
        String include = null;
        Integer customComplianceDomainId = null;
        List<Integer> customSignatureIds = null;
        String description = null;
        String identifier = null;
        String name = null;
        Integer position = null;
        List<Integer> signatureIds = null;
        // CustomComplianceControl response = api.update(id, include, customComplianceDomainId, customSignatureIds, description, identifier, name, position, signatureIds);

        // TODO: test validations
    }
    
}
