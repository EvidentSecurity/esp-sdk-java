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
        String firstName = null;
        String lastName = null;
        String email = null;
        Integer roleId = null;
        List<Integer> subOrganizationIds = null;
        List<Integer> teamIds = null;
        Boolean disableDailyEmails = null;
        String phone = null;
        String timeZone = null;
        String include = null;
        // User response = api.create(firstName, lastName, email, roleId, subOrganizationIds, teamIds, disableDailyEmails, phone, timeZone, include);

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
        Map<String, String> filter = null;
        String page = null;
        String include = null;
        // PaginatedCollection response = api.list(filter, page, include);

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
        String firstName = null;
        String lastName = null;
        String email = null;
        Integer roleId = null;
        List<Integer> subOrganizationIds = null;
        List<Integer> teamIds = null;
        Boolean disableDailyEmails = null;
        String phone = null;
        String timeZone = null;
        String include = null;
        // User response = api.update(id, firstName, lastName, email, roleId, subOrganizationIds, teamIds, disableDailyEmails, phone, timeZone, include);

        // TODO: test validations
    }
    
}
