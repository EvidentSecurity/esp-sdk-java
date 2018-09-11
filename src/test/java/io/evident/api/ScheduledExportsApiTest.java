package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import io.evident.models.ScheduledExport;
import io.evident.models.ScheduledExportResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScheduledExportsApi
 */
public class ScheduledExportsApiTest {

    private ScheduledExportsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ScheduledExportsApi.class);
    }

    
    /**
     * Update a(n) Scheduled Export
     *
     * 
     */
    @Test
    public void activateExportTest() {
        Integer scheduledExportId = null;
        String include = null;
        // ScheduledExport response = api.activateExport(scheduledExportId, include);

        // TODO: test validations
    }
    
    /**
     * Create a(n) Scheduled Export
     *
     * 
     */
    @Test
    public void createTest() {
        List<Integer> externalAccountIds = null;
        String frequency = null;
        Integer hour = null;
        String timeZone = null;
        String include = null;
        String day = null;
        Map<String, String> filter = null;
        String name = null;
        List<String> recipients = null;
        // ScheduledExport response = api.create(externalAccountIds, frequency, hour, timeZone, include, day, filter, name, recipients);

        // TODO: test validations
    }
    
    /**
     * Delete a(n) Scheduled Export
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
     * Update a(n) Scheduled Export
     *
     * 
     */
    @Test
    public void disableExportTest() {
        Integer scheduledExportId = null;
        String include = null;
        // ScheduledExport response = api.disableExport(scheduledExportId, include);

        // TODO: test validations
    }
    
    /**
     * Get a list of Scheduled Exports
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
     * Show a single Scheduled Export
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // ScheduledExport response = api.show(id, include);

        // TODO: test validations
    }
    
    /**
     * Show a single Scheduled Export Result
     *
     * The URL provided is temporary and will expire shortly after the request. To download the exported file you will need to follow the URL provided.
     */
    @Test
    public void showFileDetailsTest() {
        String uuid = null;
        String include = null;
        // ScheduledExportResult response = api.showFileDetails(uuid, include);

        // TODO: test validations
    }
    
    /**
     * Update a(n) Scheduled Export
     *
     * 
     */
    @Test
    public void unsubscribeExportTest() {
        String uuid = null;
        String email = null;
        String include = null;
        // ScheduledExport response = api.unsubscribeExport(uuid, email, include);

        // TODO: test validations
    }
    
    /**
     * Update a(n) Scheduled Export
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer id = null;
        String include = null;
        String day = null;
        List<Integer> externalAccountIds = null;
        Map<String, String> filter = null;
        Integer hour = null;
        String name = null;
        List<String> recipients = null;
        String timeZone = null;
        // ScheduledExport response = api.update(id, include, day, externalAccountIds, filter, hour, name, recipients, timeZone);

        // TODO: test validations
    }
    
}
