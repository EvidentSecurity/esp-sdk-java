package io.evident.api;

import io.evident.EspSdk.ApiClient;
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
 * API tests for SignaturesApi
 */
public class SignaturesApiTest {

    private SignaturesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SignaturesApi.class);
    }

    
    /**
     * Get a list of Signatures
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
     * Get a list of disabled External Accounts for a signature
     *
     * 
     */
    @Test
    public void listDisabledExternalAccountsTest() {
        Integer signatureId = null;
        String include = null;
        Map<String, String> filter = null;
        String page = null;
        // PaginatedCollection response = api.listDisabledExternalAccounts(signatureId, include, filter, page);

        // TODO: test validations
    }
    
    /**
     * Get A list of Signatures with default and custom risk levels for an External Account
     *
     * Return only signatures that have a custom risk level set by searching with &#x60;filter:{custom_risk_level_present: 1}&#x60;
     */
    @Test
    public void listWithCustomRiskLevelForExternalAccountTest() {
        Integer externalAccountId = null;
        String include = null;
        Map<String, String> filter = null;
        String page = null;
        // PaginatedCollection response = api.listWithCustomRiskLevelForExternalAccount(externalAccountId, include, filter, page);

        // TODO: test validations
    }
    
    /**
     * Remove a custom risk level to a Signature for an External Account
     *
     * 
     */
    @Test
    public void removeCustomRiskLevelForExternalAccountTest() {
        Integer externalAccountId = null;
        Integer signatureId = null;
        // Meta response = api.removeCustomRiskLevelForExternalAccount(externalAccountId, signatureId);

        // TODO: test validations
    }
    
    /**
     * Add a custom risk level to a Signature for an External Account
     *
     * 
     */
    @Test
    public void setCustomRiskLevelForExternalAccountTest() {
        Integer externalAccountId = null;
        String riskLevel = null;
        Integer signatureId = null;
        String include = null;
        // Signature response = api.setCustomRiskLevelForExternalAccount(externalAccountId, riskLevel, signatureId, include);

        // TODO: test validations
    }
    
    /**
     * Show a single Signature
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // Signature response = api.show(id, include);

        // TODO: test validations
    }
    
    /**
     * Update a Signature&#39;s custom risk level for an External Account
     *
     * 
     */
    @Test
    public void updateCustomRiskLevelForExternalAccountTest() {
        Integer externalAccountId = null;
        Integer signatureId = null;
        String include = null;
        String riskLevel = null;
        // Signature response = api.updateCustomRiskLevelForExternalAccount(externalAccountId, signatureId, include, riskLevel);

        // TODO: test validations
    }
    
}
