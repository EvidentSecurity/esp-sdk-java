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
        List<Integer> externalAccountIds = null;
        String issueType = null;
        String name = null;
        String password = null;
        String projectKey = null;
        String url = null;
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
        // IntegrationJira response = api.create(externalAccountIds, issueType, name, password, projectKey, url, username, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, sendUpdates, sendWhenSuppressed, signatureIds, statuses);

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
        String include = null;
        Boolean allHighRisk = null;
        Boolean allLowRisk = null;
        Boolean allMediumRisk = null;
        List<Integer> customSignatureIds = null;
        List<Integer> externalAccountIds = null;
        String issueType = null;
        String name = null;
        String password = null;
        String projectKey = null;
        Boolean sendUpdates = null;
        Boolean sendWhenSuppressed = null;
        List<Integer> signatureIds = null;
        List<String> statuses = null;
        String url = null;
        String username = null;
        // IntegrationJira response = api.update(integrationId, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, externalAccountIds, issueType, name, password, projectKey, sendUpdates, sendWhenSuppressed, signatureIds, statuses, url, username);

        // TODO: test validations
    }
    
}
