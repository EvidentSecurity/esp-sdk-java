package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.CustomSignatureDefinition;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomSignatureDefinitionsApi
 */
public class CustomSignatureDefinitionsApiTest {

    private CustomSignatureDefinitionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CustomSignatureDefinitionsApi.class);
    }

    
    /**
     * Activate a Custom Signature Definition
     *
     * A successful call to this API marks the definition for activation.  The definition will go into the &#39;validating&#39; state and will be tested before activating. The definition must have a status of editable to be activated.
     */
    @Test
    public void activateTest() {
        Integer customSignatureDefinitionId = null;
        String include = null;
        // CustomSignatureDefinition response = api.activate(customSignatureDefinitionId, include);

        // TODO: test validations
    }
    
    /**
     * Archive a Custom Signature Definition
     *
     * A successful call to this API archives and returns a specific custom signature definition identified by the id parameter. The definition must have a status of active to be archived.
     */
    @Test
    public void archiveTest() {
        Integer customSignatureDefinitionId = null;
        String include = null;
        // CustomSignatureDefinition response = api.archive(customSignatureDefinitionId, include);

        // TODO: test validations
    }
    
    /**
     * Create a(n) Custom Signature Definition
     *
     * 
     */
    @Test
    public void createTest() {
        Integer customSignatureId = null;
        String include = null;
        // CustomSignatureDefinition response = api.create(customSignatureId, include);

        // TODO: test validations
    }
    
    /**
     * Delete a(n) Custom Signature Definition
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
     * Get a list of Custom Signature Definitions
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
     * Show a single Custom Signature Definition
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // CustomSignatureDefinition response = api.show(id, include);

        // TODO: test validations
    }
    
    /**
     * Update a(n) Custom Signature Definition
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer id = null;
        String code = null;
        String language = null;
        String include = null;
        // CustomSignatureDefinition response = api.update(id, code, language, include);

        // TODO: test validations
    }
    
}
