package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.IntegrationPagerDuty;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationsPagerDutyApi
 */
public class IntegrationsPagerDutyApiTest {

    private IntegrationsPagerDutyApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(IntegrationsPagerDutyApi.class);
    }

    
    /**
     * Create a Pager Duty Integration
     *
     * 
     */
    @Test
    public void createTest() {
        String apiKey = null;
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
        // IntegrationPagerDuty response = api.create(apiKey, name, externalAccountIds, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, customSignatureIds, include);

        // TODO: test validations
    }
    
    /**
     * Show a single Pager Duty Integration
     *
     * 
     */
    @Test
    public void showTest() {
        Integer integrationId = null;
        String include = null;
        // IntegrationPagerDuty response = api.show(integrationId, include);

        // TODO: test validations
    }
    
    /**
     * Update a Pager Duty Integration
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer integrationId = null;
        String apiKey = null;
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
        // IntegrationPagerDuty response = api.update(integrationId, apiKey, name, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, externalAccountIds, customSignatureIds, include);

        // TODO: test validations
    }
    
}
