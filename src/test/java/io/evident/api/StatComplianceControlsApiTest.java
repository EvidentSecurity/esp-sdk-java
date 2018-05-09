package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.PaginatedCollection;
import io.evident.models.StatComplianceControl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatComplianceControlsApi
 */
public class StatComplianceControlsApiTest {

    private StatComplianceControlsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StatComplianceControlsApi.class);
    }

    
    /**
     * Statistics for compliance controls
     *
     * A successful call to this API returns all the statistics of all the compliance controls for a report identified by the stat_id parameter. Said report contains all statistics for this alert triggered from signatures contained in all compliance controls for the selected hour.
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
     * Show a single Stat Compliance Control
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // StatComplianceControl response = api.show(id, include);

        // TODO: test validations
    }
    
}
