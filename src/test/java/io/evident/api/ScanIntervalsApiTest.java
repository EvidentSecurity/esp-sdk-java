package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import io.evident.models.ScanInterval;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScanIntervalsApi
 */
public class ScanIntervalsApiTest {

    private ScanIntervalsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ScanIntervalsApi.class);
    }

    
    /**
     * Create a(n) Scan Interval
     *
     * 
     */
    @Test
    public void createTest() {
        Integer externalAccountId = null;
        Integer interval = null;
        Integer serviceId = null;
        String include = null;
        // ScanInterval response = api.create(externalAccountId, interval, serviceId, include);

        // TODO: test validations
    }
    
    /**
     * Delete a(n) Scan Interval
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
     * Get a list of Scan Intervals
     *
     * 
     */
    @Test
    public void listForExternalAccountTest() {
        Integer externalAccountId = null;
        String page = null;
        String include = null;
        // PaginatedCollection response = api.listForExternalAccount(externalAccountId, page, include);

        // TODO: test validations
    }
    
    /**
     * Show a single Scan Interval
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // ScanInterval response = api.show(id, include);

        // TODO: test validations
    }
    
    /**
     * Update a(n) Scan Interval
     *
     * 
     */
    @Test
    public void updateTest() {
        Integer id = null;
        Integer externalAccountId = null;
        Integer interval = null;
        Integer serviceId = null;
        String include = null;
        // ScanInterval response = api.update(id, externalAccountId, interval, serviceId, include);

        // TODO: test validations
    }
    
}
