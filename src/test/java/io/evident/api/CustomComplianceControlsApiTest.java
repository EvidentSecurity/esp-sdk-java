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
        String identifier = null;
        Integer customComplianceDomainId = null;
        String name = null;
        String description = null;
        Integer position = null;
        List<Integer> signatureIds = null;
        List<Integer> customSignatureIds = null;
        String include = null;
        // CustomComplianceControl response = api.create(identifier, customComplianceDomainId, name, description, position, signatureIds, customSignatureIds, include);

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
        String page = null;
        String include = null;
        // PaginatedCollection response = api.listCustomSignatures(customComplianceControlId, page, include);

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
        String page = null;
        String include = null;
        // PaginatedCollection response = api.listSignatures(customComplianceControlId, page, include);

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
        String identifier = null;
        Integer customComplianceDomainId = null;
        String description = null;
        String name = null;
        Integer position = null;
        List<Integer> signatureIds = null;
        List<Integer> customSignatureIds = null;
        String include = null;
        // CustomComplianceControl response = api.update(id, identifier, customComplianceDomainId, description, name, position, signatureIds, customSignatureIds, include);

        // TODO: test validations
    }
    
}
