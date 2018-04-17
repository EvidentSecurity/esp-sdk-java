package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.ExternalAccountAmazonIAM;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExternalAccountsAmazonApi
 */
public class ExternalAccountsAmazonApiTest {

    private ExternalAccountsAmazonApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ExternalAccountsAmazonApi.class);
    }

    
    /**
     * Create an Amazon External Account
     *
     *  The related external_account object will be returned with the response.
     */
    @Test
    public void createTest() {
        String arn = null;
        String externalId = null;
        String name = null;
        Integer teamId = null;
        // ExternalAccountAmazonIAM response = api.create(arn, externalId, name, teamId);

        // TODO: test validations
    }
    
    /**
     * Show an Amazon External Account
     *
     * 
     */
    @Test
    public void showTest() {
        Integer externalAccountId = null;
        String include = null;
        // ExternalAccountAmazonIAM response = api.show(externalAccountId, include);

        // TODO: test validations
    }
    
    /**
     * Update an Amazon External Account
     *
     *  The related external_account object will be returned with the response.
     */
    @Test
    public void updateTest() {
        Integer externalAccountId = null;
        String arn = null;
        String externalId = null;
        String name = null;
        Integer teamId = null;
        // ExternalAccountAmazonIAM response = api.update(externalAccountId, arn, externalId, name, teamId);

        // TODO: test validations
    }
    
}
