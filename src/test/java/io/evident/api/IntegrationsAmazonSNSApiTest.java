package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.IntegrationAmazonSns;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationsAmazonSNSApi
 */
public class IntegrationsAmazonSNSApiTest {

    private IntegrationsAmazonSNSApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(IntegrationsAmazonSNSApi.class);
    }

    
    /**
     * Create an Amazon SNS Integration
     *
     * 
     */
    @Test
    public void createTest() {
        String arn = null;
        List<Integer> externalAccountIds = null;
        String externalId = null;
        String name = null;
        String topic = null;
        String include = null;
        Boolean allHighRisk = null;
        Boolean allLowRisk = null;
        Boolean allMediumRisk = null;
        List<Integer> customSignatureIds = null;
        Boolean sendUpdates = null;
        Boolean sendWhenSuppressed = null;
        List<Integer> signatureIds = null;
        List<String> statuses = null;
        // IntegrationAmazonSns response = api.create(arn, externalAccountIds, externalId, name, topic, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, sendUpdates, sendWhenSuppressed, signatureIds, statuses);

        // TODO: test validations
    }
    
    /**
     * Show a single Amazon SNS Integration
     *
     * 
     */
    @Test
    public void showTest() {
        Integer integrationId = null;
        String include = null;
        // IntegrationAmazonSns response = api.show(integrationId, include);

        // TODO: test validations
    }
    
    /**
     * Update an Amazon SNS Integration
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
        String arn = null;
        List<Integer> customSignatureIds = null;
        List<Integer> externalAccountIds = null;
        String externalId = null;
        String name = null;
        Boolean sendUpdates = null;
        Boolean sendWhenSuppressed = null;
        List<Integer> signatureIds = null;
        List<String> statuses = null;
        String topic = null;
        // IntegrationAmazonSns response = api.update(integrationId, include, allHighRisk, allLowRisk, allMediumRisk, arn, customSignatureIds, externalAccountIds, externalId, name, sendUpdates, sendWhenSuppressed, signatureIds, statuses, topic);

        // TODO: test validations
    }
    
}
