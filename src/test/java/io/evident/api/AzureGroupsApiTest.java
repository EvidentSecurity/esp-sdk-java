package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.AzureGroup;
import io.evident.models.ExternalAccount;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AzureGroupsApi
 */
public class AzureGroupsApiTest {

    private AzureGroupsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AzureGroupsApi.class);
    }

    
    /**
     * Add an External Account to an Azure Group
     *
     * 
     */
    @Test
    public void addExternalAccountTest() {
        Integer azureGroupId = null;
        Integer externalAccountId = null;
        String include = null;
        // ExternalAccount response = api.addExternalAccount(azureGroupId, externalAccountId, include);

        // TODO: test validations
    }
    
    /**
     * Create a(n) Azure Group
     *
     * The URL will only be returned once when the group is first created
     */
    @Test
    public void createTest() {
        String name = null;
        String include = null;
        // AzureGroup response = api.create(name, include);

        // TODO: test validations
    }
    
    /**
     * Delete a(n) Azure Group
     *
     * 
     */
    @Test
    public void deleteTest() {
        Integer id = null;
        // Meta response = api.delete(id);

        // TODO: test validations
    }
    
    /**
     * Get a list of Azure Groups
     *
     * 
     */
    @Test
    public void listTest() {
        String include = null;
        Map<String, String> filter = null;
        String page = null;
        // PaginatedCollection response = api.list(include, filter, page);

        // TODO: test validations
    }
    
    /**
     * Remove an External Account from an Azure Group
     *
     * 
     */
    @Test
    public void removeExternalAccountTest() {
        Integer azureGroupId = null;
        Integer externalAccountId = null;
        // Meta response = api.removeExternalAccount(azureGroupId, externalAccountId);

        // TODO: test validations
    }
    
    /**
     * Show a single Azure Group
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // AzureGroup response = api.show(id, include);

        // TODO: test validations
    }
    
    /**
     * Update a(n) Azure Group
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer id = null;
        String include = null;
        String name = null;
        // AzureGroup response = api.update(id, include, name);

        // TODO: test validations
    }
    
}
