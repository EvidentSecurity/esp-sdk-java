package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.IntegrationJira;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationsJiraApi
 */
public class IntegrationsJiraApiTest {

    private IntegrationsJiraApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(IntegrationsJiraApi.class);
    }

    
    /**
     * Create a JIRA Integration
     *
     * 
     */
    @Test
    public void createTest() {
        String url = null;
        String projectKey = null;
        String issueType = null;
        String username = null;
        String password = null;
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
        // IntegrationJira response = api.create(url, projectKey, issueType, username, password, name, externalAccountIds, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, customSignatureIds, include);

        // TODO: test validations
    }
    
    /**
     * Show a single Jira Integration
     *
     * Password is not returned.
     */
    @Test
    public void showTest() {
        Integer integrationId = null;
        String include = null;
        // IntegrationJira response = api.show(integrationId, include);

        // TODO: test validations
    }
    
    /**
     * Update a JIRA Integration
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer integrationId = null;
        String url = null;
        String projectKey = null;
        String issueType = null;
        String username = null;
        String password = null;
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
        // IntegrationJira response = api.update(integrationId, url, projectKey, issueType, username, password, name, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, externalAccountIds, customSignatureIds, include);

        // TODO: test validations
    }
    
}
