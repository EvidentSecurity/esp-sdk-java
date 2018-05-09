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
        List<Integer> externalAccountIds = null;
        String incidentType = null;
        String instanceUrl = null;
        String name = null;
        String password = null;
        String username = null;
        String include = null;
        Boolean allHighRisk = null;
        Boolean allLowRisk = null;
        Boolean allMediumRisk = null;
        List<Integer> customSignatureIds = null;
        Boolean sendUpdates = null;
        Boolean sendWhenSuppressed = null;
        List<Integer> signatureIds = null;
        List<String> statuses = null;
        // IntegrationServicenow response = api.create(externalAccountIds, incidentType, instanceUrl, name, password, username, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, sendUpdates, sendWhenSuppressed, signatureIds, statuses);

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
        String include = null;
        Boolean allHighRisk = null;
        Boolean allLowRisk = null;
        Boolean allMediumRisk = null;
        List<Integer> customSignatureIds = null;
        List<Integer> externalAccountIds = null;
        String incidentType = null;
        String instanceUrl = null;
        String name = null;
        String password = null;
        Boolean sendUpdates = null;
        Boolean sendWhenSuppressed = null;
        List<Integer> signatureIds = null;
        List<String> statuses = null;
        String username = null;
        // IntegrationServicenow response = api.update(integrationId, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, externalAccountIds, incidentType, instanceUrl, name, password, sendUpdates, sendWhenSuppressed, signatureIds, statuses, username);

        // TODO: test validations
    }
    
}
