package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.ExternalAccountAzure;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExternalAccountsAzureApi
 */
public class ExternalAccountsAzureApiTest {

    private ExternalAccountsAzureApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ExternalAccountsAzureApi.class);
    }

    
    /**
     * Create an Azure External Account
     *
     * The channel_url will only be returned in this response and will not be accessible again. The related external_account object will be returned with the response.
     */
    @Test
    public void createTest() {
        String subscriptionId = null;
        String clientId = null;
        String tenantId = null;
        String appKey = null;
        String name = null;
        Integer teamId = null;
        // ExternalAccountAzure response = api.create(subscriptionId, clientId, tenantId, appKey, name, teamId);

        // TODO: test validations
    }
    
    /**
     * Reset Log URL for an Azure External Account
     *
     * This endpoint invalidates the previous URL and generates a new one. The channel_url will only be returned in this response and will not be accessible again. The related external_account object will be returned with the response.
     */
    @Test
    public void resetUrlTest() {
        Integer externalAccountId = null;
        // ExternalAccountAzure response = api.resetUrl(externalAccountId);

        // TODO: test validations
    }
    
    /**
     * Show an Azure External Account
     *
     * 
     */
    @Test
    public void showTest() {
        Integer externalAccountId = null;
        String include = null;
        // ExternalAccountAzure response = api.show(externalAccountId, include);

        // TODO: test validations
    }
    
    /**
     * Update an Azure External Account
     *
     *  The related external_account object will be returned with the response.
     */
    @Test
    public void updateTest() {
        Integer externalAccountId = null;
        String subscriptionId = null;
        String clientId = null;
        String tenantId = null;
        String appKey = null;
        String name = null;
        Integer teamId = null;
        // ExternalAccountAzure response = api.update(externalAccountId, subscriptionId, clientId, tenantId, appKey, name, teamId);

        // TODO: test validations
    }
    
}
