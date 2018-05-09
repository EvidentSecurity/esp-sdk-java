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
        List<Integer> externalAccountIds = null;
        String name = null;
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
        // IntegrationSlack response = api.create(externalAccountIds, name, url, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, sendUpdates, sendWhenSuppressed, signatureIds, statuses);

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
        String url = null;
        // IntegrationSlack response = api.update(integrationId, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, externalAccountIds, name, sendUpdates, sendWhenSuppressed, signatureIds, statuses, url);

        // TODO: test validations
    }
    
}
