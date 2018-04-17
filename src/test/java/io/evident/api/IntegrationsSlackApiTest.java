package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.IntegrationSlack;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationsSlackApi
 */
public class IntegrationsSlackApiTest {

    private IntegrationsSlackApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(IntegrationsSlackApi.class);
    }

    
    /**
     * Create a Slack Integration
     *
     * 
     */
    @Test
    public void createTest() {
        String url = null;
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
        // IntegrationSlack response = api.create(url, name, externalAccountIds, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, customSignatureIds, include);

        // TODO: test validations
    }
    
    /**
     * Show a single Slack Integration
     *
     * 
     */
    @Test
    public void showTest() {
        Integer integrationId = null;
        String include = null;
        // IntegrationSlack response = api.show(integrationId, include);

        // TODO: test validations
    }
    
    /**
     * Update a Slack Integration
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer integrationId = null;
        String url = null;
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
        // IntegrationSlack response = api.update(integrationId, url, name, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, externalAccountIds, customSignatureIds, include);

        // TODO: test validations
    }
    
}
