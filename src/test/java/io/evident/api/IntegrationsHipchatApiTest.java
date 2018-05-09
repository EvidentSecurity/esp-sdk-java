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
        List<Integer> externalAccountIds = null;
        String name = null;
        String room = null;
        String token = null;
        String include = null;
        Boolean allHighRisk = null;
        Boolean allLowRisk = null;
        Boolean allMediumRisk = null;
        List<Integer> customSignatureIds = null;
        Boolean sendUpdates = null;
        Boolean sendWhenSuppressed = null;
        List<Integer> signatureIds = null;
        List<String> statuses = null;
        // IntegrationHipchat response = api.create(externalAccountIds, name, room, token, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, sendUpdates, sendWhenSuppressed, signatureIds, statuses);

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
        String include = null;
        Boolean allHighRisk = null;
        Boolean allLowRisk = null;
        Boolean allMediumRisk = null;
        List<Integer> customSignatureIds = null;
        List<Integer> externalAccountIds = null;
        String name = null;
        String room = null;
        Boolean sendUpdates = null;
        Boolean sendWhenSuppressed = null;
        List<Integer> signatureIds = null;
        List<String> statuses = null;
        String token = null;
        // IntegrationHipchat response = api.update(integrationId, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, externalAccountIds, name, room, sendUpdates, sendWhenSuppressed, signatureIds, statuses, token);

        // TODO: test validations
    }
    
}
