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
        List<Integer> externalAccountIds = null;
        String name = null;
        String include = null;
        Boolean allHighRisk = null;
        Boolean allLowRisk = null;
        Boolean allMediumRisk = null;
        List<Integer> customSignatureIds = null;
        Boolean sendUpdates = null;
        Boolean sendWhenSuppressed = null;
        List<Integer> signatureIds = null;
        List<String> statuses = null;
        // IntegrationPagerDuty response = api.create(apiKey, externalAccountIds, name, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, sendUpdates, sendWhenSuppressed, signatureIds, statuses);

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
        String include = null;
        Boolean allHighRisk = null;
        Boolean allLowRisk = null;
        Boolean allMediumRisk = null;
        String apiKey = null;
        List<Integer> customSignatureIds = null;
        List<Integer> externalAccountIds = null;
        String name = null;
        Boolean sendUpdates = null;
        Boolean sendWhenSuppressed = null;
        List<Integer> signatureIds = null;
        List<String> statuses = null;
        // IntegrationPagerDuty response = api.update(integrationId, include, allHighRisk, allLowRisk, allMediumRisk, apiKey, customSignatureIds, externalAccountIds, name, sendUpdates, sendWhenSuppressed, signatureIds, statuses);

        // TODO: test validations
    }
    
}
