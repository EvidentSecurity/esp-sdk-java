package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.ExternalAccount;
import io.evident.models.ExternalAccountUserAttributionChannel;
import io.evident.models.Meta;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserAttributionsApi
 */
public class UserAttributionsApiTest {

    private UserAttributionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UserAttributionsApi.class);
    }

    
    /**
     * Create a User Attribution Channel for an external account
     *
     * URL will only be returned in this response and will not be accessible again.
     */
    @Test
    public void addChannelTest() {
        Integer externalAccountId = null;
        String include = null;
        // ExternalAccountUserAttributionChannel response = api.addChannel(externalAccountId, include);

        // TODO: test validations
    }
    
    /**
     * Remove the User Attribution Channel for an external account
     *
     * 
     */
    @Test
    public void removeChannelTest() {
        Integer externalAccountId = null;
        // Meta response = api.removeChannel(externalAccountId);

        // TODO: test validations
    }
    
    /**
     * Show the User Attribution Channel of an external account
     *
     * The channel url will not be returned.
     */
    @Test
    public void showChannelTest() {
        Integer externalAccountId = null;
        String include = null;
        // ExternalAccountUserAttributionChannel response = api.showChannel(externalAccountId, include);

        // TODO: test validations
    }
    
    /**
     * Update the user attributions on an external account
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer externalAccountId = null;
        String cloudtrailName = null;
        String include = null;
        // ExternalAccount response = api.update(externalAccountId, cloudtrailName, include);

        // TODO: test validations
    }
    
}
