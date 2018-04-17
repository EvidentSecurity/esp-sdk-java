package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.PaginatedCollection;
import io.evident.models.Stat;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatsApi
 */
public class StatsApiTest {

    private StatsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StatsApi.class);
    }

    
    /**
     * Stats for a report
     *
     * A successful call to this API returns all the stats of all the alerts for a report identified by the report_id parameter. Said report contains all statistics for this alert triggered from signatures contained in all regions for the selected hour.
     */
    @Test
    public void forReportTest() {
        Integer reportId = null;
        String include = null;
        // Stat response = api.forReport(reportId, include);

        // TODO: test validations
    }
    
    /**
     * Stats for teams
     *
     * A successful call to this API returns all the stats for the most recent report of each team accessible by the given API key
     */
    @Test
    public void latestForTeamsTest() {
        Map<String, String> filter = null;
        String page = null;
        String include = null;
        // PaginatedCollection response = api.latestForTeams(filter, page, include);

        // TODO: test validations
    }
    
    /**
     * Show a single Stat
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // Stat response = api.show(id, include);

        // TODO: test validations
    }
    
}
