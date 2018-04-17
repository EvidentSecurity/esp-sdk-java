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
        String externalId = null;
        String topic = null;
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
        // IntegrationAmazonSns response = api.create(arn, externalId, topic, name, externalAccountIds, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, customSignatureIds, include);

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
        String arn = null;
        String externalId = null;
        String topic = null;
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
        // IntegrationAmazonSns response = api.update(integrationId, arn, externalId, topic, name, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, externalAccountIds, customSignatureIds, include);

        // TODO: test validations
    }
    
}
