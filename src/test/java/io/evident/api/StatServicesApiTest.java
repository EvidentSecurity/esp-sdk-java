package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.PaginatedCollection;
import io.evident.models.StatService;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatServicesApi
 */
public class StatServicesApiTest {

    private StatServicesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StatServicesApi.class);
    }

    
    /**
     * Get a list of stats for services
     *
     * A successful call to this API returns all the stats of all the services for a report identified by the stat_id parameter. Said report contains all statistics for this alert triggered from services contained in all services for the selected hour.
     */
    @Test
    public void listForStatTest() {
        Integer statId = null;
        String page = null;
        String include = null;
        // PaginatedCollection response = api.listForStat(statId, page, include);

        // TODO: test validations
    }
    
    /**
     * Show a single Stat Service
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // StatService response = api.show(id, include);

        // TODO: test validations
    }
    
}
