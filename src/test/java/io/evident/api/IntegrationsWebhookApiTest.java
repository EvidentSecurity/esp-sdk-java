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
        List<Integer> externalAccountIds = null;
        String name = null;
        Integer throttleRate = null;
        String url = null;
        String include = null;
        Boolean allHighRisk = null;
        Boolean allLowRisk = null;
        Boolean allMediumRisk = null;
        List<Integer> customSignatureIds = null;
        Boolean sendUpdates = null;
        Boolean sendWhenSuppressed = null;
        List<Integer> signatureIds = null;
        List<String> statuses = null;
        // IntegrationWebhook response = api.create(externalAccountIds, name, throttleRate, url, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, sendUpdates, sendWhenSuppressed, signatureIds, statuses);

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
        String include = null;
        Boolean allHighRisk = null;
        Boolean allLowRisk = null;
        Boolean allMediumRisk = null;
        List<Integer> customSignatureIds = null;
        List<Integer> externalAccountIds = null;
        String name = null;
        Boolean sendUpdates = null;
        Boolean sendWhenSuppressed = null;
        List<Integer> signatureIds = null;
        List<String> statuses = null;
        Integer throttleRate = null;
        String url = null;
        // IntegrationWebhook response = api.update(integrationId, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, externalAccountIds, name, sendUpdates, sendWhenSuppressed, signatureIds, statuses, throttleRate, url);

        // TODO: test validations
    }
    
}
