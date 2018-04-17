package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.IntegrationHipchat;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationsHipchatApi
 */
public class IntegrationsHipchatApiTest {

    private IntegrationsHipchatApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(IntegrationsHipchatApi.class);
    }

    
    /**
     * Create a Hipchat Integration
     *
     * 
     */
    @Test
    public void createTest() {
        String token = null;
        String room = null;
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
        // IntegrationHipchat response = api.create(token, room, name, externalAccountIds, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, customSignatureIds, include);

        // TODO: test validations
    }
    
    /**
     * Show a single Hipchat Integration
     *
     * 
     */
    @Test
    public void showTest() {
        Integer integrationId = null;
        String include = null;
        // IntegrationHipchat response = api.show(integrationId, include);

        // TODO: test validations
    }
    
    /**
     * Update a Hipchat Integration
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer integrationId = null;
        String token = null;
        String room = null;
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
        // IntegrationHipchat response = api.update(integrationId, token, room, name, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, externalAccountIds, customSignatureIds, include);

        // TODO: test validations
    }
    
}
