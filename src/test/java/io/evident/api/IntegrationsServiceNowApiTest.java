package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.IntegrationServicenow;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationsServiceNowApi
 */
public class IntegrationsServiceNowApiTest {

    private IntegrationsServiceNowApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(IntegrationsServiceNowApi.class);
    }

    
    /**
     * Create a ServiceNow Integration
     *
     * 
     */
    @Test
    public void createTest() {
        String instanceUrl = null;
        String username = null;
        String password = null;
        String incidentType = null;
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
        // IntegrationServicenow response = api.create(instanceUrl, username, password, incidentType, name, externalAccountIds, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, customSignatureIds, include);

        // TODO: test validations
    }
    
    /**
     * Show a single ServiceNow Integration
     *
     * 
     */
    @Test
    public void showTest() {
        Integer integrationId = null;
        String include = null;
        // IntegrationServicenow response = api.show(integrationId, include);

        // TODO: test validations
    }
    
    /**
     * Update a ServiceNow Integration
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer integrationId = null;
        String instanceUrl = null;
        String username = null;
        String password = null;
        String incidentType = null;
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
        // IntegrationServicenow response = api.update(integrationId, instanceUrl, username, password, incidentType, name, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, externalAccountIds, customSignatureIds, include);

        // TODO: test validations
    }
    
}
