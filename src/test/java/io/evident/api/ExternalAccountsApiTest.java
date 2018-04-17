package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.ComplianceStandard;
import io.evident.models.ExternalAccount;
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
 * API tests for ExternalAccountsApi
 */
public class ExternalAccountsApiTest {

    private ExternalAccountsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ExternalAccountsApi.class);
    }

    
    /**
     * Add a compliance standard to an external account
     *
     * 
     */
    @Test
    public void addComplianceStandardTest() {
        Integer externalAccountId = null;
        Integer complianceStandardId = null;
        String include = null;
        // ComplianceStandard response = api.addComplianceStandard(externalAccountId, complianceStandardId, include);

        // TODO: test validations
    }
    
    /**
     * Add a custom compliance standard to an external account
     *
     * 
     */
    @Test
    public void addCustomComplianceStandardTest() {
        Integer externalAccountId = null;
        Integer customComplianceStandardId = null;
        // Meta response = api.addCustomComplianceStandard(externalAccountId, customComplianceStandardId);

        // TODO: test validations
    }
    
    /**
     * Disable a signature for an external account
     *
     * 
     */
    @Test
    public void addDisabledSignatureTest() {
        Integer externalAccountId = null;
        Integer signatureId = null;
        String include = null;
        // Signature response = api.addDisabledSignature(externalAccountId, signatureId, include);

        // TODO: test validations
    }
    
    /**
     * Delete a(n) External Account
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
     * Get a list of External Accounts
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
     * Get a list of compliance standards for an external account
     *
     * 
     */
    @Test
    public void listComplianceStandardsTest() {
        Integer externalAccountId = null;
        String page = null;
        String include = null;
        // PaginatedCollection response = api.listComplianceStandards(externalAccountId, page, include);

        // TODO: test validations
    }
    
    /**
     * Get a list of custom compliance standards for an external account
     *
     * 
     */
    @Test
    public void listCustomComplianceStandardsTest() {
        Integer externalAccountId = null;
        String page = null;
        String include = null;
        // PaginatedCollection response = api.listCustomComplianceStandards(externalAccountId, page, include);

        // TODO: test validations
    }
    
    /**
     * Get a list all the disabled signatures for an external account
     *
     * 
     */
    @Test
    public void listDisabledSignaturesTest() {
        Integer externalAccountId = null;
        Map<String, String> filter = null;
        String page = null;
        String include = null;
        // PaginatedCollection response = api.listDisabledSignatures(externalAccountId, filter, page, include);

        // TODO: test validations
    }
    
    /**
     * Remove a compliance standard from an external account
     *
     * 
     */
    @Test
    public void removeComplianceStandardTest() {
        Integer externalAccountId = null;
        Integer complianceStandardId = null;
        // Meta response = api.removeComplianceStandard(externalAccountId, complianceStandardId);

        // TODO: test validations
    }
    
    /**
     * Remove a custom compliance standard from an external account
     *
     * 
     */
    @Test
    public void removeCustomComplianceStandardTest() {
        Integer externalAccountId = null;
        Integer customComplianceStandardId = null;
        // Meta response = api.removeCustomComplianceStandard(externalAccountId, customComplianceStandardId);

        // TODO: test validations
    }
    
    /**
     * Re-enable a signature for an external account
     *
     * 
     */
    @Test
    public void removeDisabledSignatureTest() {
        Integer externalAccountId = null;
        Integer signatureId = null;
        // Meta response = api.removeDisabledSignature(externalAccountId, signatureId);

        // TODO: test validations
    }
    
    /**
     * Show a single External Account
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // ExternalAccount response = api.show(id, include);

        // TODO: test validations
    }
    
}
