package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import io.evident.models.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
public class UsersApiTest {

    private UsersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersApi.class);
    }

    
    /**
     * Create a(n) User
     *
     * 
     */
    @Test
    public void createTest() {
        String email = null;
        String firstName = null;
        String lastName = null;
        String include = null;
        String accessLevel = null;
        Boolean disableDailyEmails = null;
        String phone = null;
        Integer roleId = null;
        List<Integer> subOrganizationIds = null;
        List<Integer> teamIds = null;
        String timeZone = null;
        // User response = api.create(email, firstName, lastName, include, accessLevel, disableDailyEmails, phone, roleId, subOrganizationIds, teamIds, timeZone);

        // TODO: test validations
    }
    
    /**
     * Delete a(n) User
     *
     * The users current password is required when deleting yourself.
     */
    @Test
    public void deleteTest() {
        Integer id = null;
        String currentPassword = null;
        // Meta response = api.delete(id, currentPassword);

        // TODO: test validations
    }
    
    /**
     * Get a list of Users
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
     * Show a single User
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // User response = api.show(id, include);

        // TODO: test validations
    }
    
    /**
     * Update a(n) User
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer id = null;
        String include = null;
        String accessLevel = null;
        Boolean disableDailyEmails = null;
        String firstName = null;
        String lastName = null;
        String phone = null;
        Integer roleId = null;
        List<Integer> subOrganizationIds = null;
        List<Integer> teamIds = null;
        String timeZone = null;
        // User response = api.update(id, include, accessLevel, disableDailyEmails, firstName, lastName, phone, roleId, subOrganizationIds, teamIds, timeZone);

        // TODO: test validations
    }
    
}
