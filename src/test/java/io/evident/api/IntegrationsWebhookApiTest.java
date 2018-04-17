package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.IntegrationWebhook;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationsWebhookApi
 */
public class IntegrationsWebhookApiTest {

    private IntegrationsWebhookApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(IntegrationsWebhookApi.class);
    }

    
    /**
     * Create a Webhook Integration
     *
     * 
     */
    @Test
    public void createTest() {
        String url = null;
        Integer throttleRate = null;
        String name = null;
        List<Integer> externalAccountIds = null;
        Boolean allHighRisk = null;
        Boolean allMediumRisk = null;
        Boolean allLowRisk = null;
        Boolean sendUpdates = null;
        Boolean sendWhenSuppressed = null;
        List<Integer> signatureIds = null;
        List<String> statuses = null;
        List<Integer> customSignatureIds = null;
        String include = null;
        // IntegrationWebhook response = api.create(url, throttleRate, name, externalAccountIds, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, customSignatureIds, include);

        // TODO: test validations
    }
    
    /**
     * Show a single Webhook Integration
     *
     * 
     */
    @Test
    public void showTest() {
        Integer integrationId = null;
        String include = null;
        // IntegrationWebhook response = api.show(integrationId, include);

        // TODO: test validations
    }
    
    /**
     * Update a Webhook Integration
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer integrationId = null;
        String url = null;
        Integer throttleRate = null;
        String name = null;
        Boolean allHighRisk = null;
        Boolean allMediumRisk = null;
        Boolean allLowRisk = null;
        Boolean sendUpdates = null;
        Boolean sendWhenSuppressed = null;
        List<Integer> signatureIds = null;
        List<String> statuses = null;
        List<Integer> externalAccountIds = null;
        List<Integer> customSignatureIds = null;
        String include = null;
        // IntegrationWebhook response = api.update(integrationId, url, throttleRate, name, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, externalAccountIds, customSignatureIds, include);

        // TODO: test validations
    }
    
}
