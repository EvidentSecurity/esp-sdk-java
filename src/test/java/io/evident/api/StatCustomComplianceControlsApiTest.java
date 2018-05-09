package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.PaginatedCollection;
import io.evident.models.StatCustomComplianceControl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatCustomComplianceControlsApi
 */
public class StatCustomComplianceControlsApiTest {

    private StatCustomComplianceControlsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StatCustomComplianceControlsApi.class);
    }

    
    /**
     * Statistics for custom compliance controls
     *
     * A successful call to this API returns all the statistics of all the custom compliance controls for a report identified by the stat_id parameter. Said report contains all statistics for this alert triggered from signatures contained in all custom compliance controls for the selected hour.
     */
    @Test
    public void listForStatTest() {
        Integer statId = null;
        String include = null;
        Map<String, String> filter = null;
        String page = null;
        // PaginatedCollection response = api.listForStat(statId, include, filter, page);

        // TODO: test validations
    }
    
    /**
     * Show a single Stat Custom Compliance Control
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // StatCustomComplianceControl response = api.show(id, include);

        // TODO: test validations
    }
    
}
