package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.PaginatedCollection;
import io.evident.models.StatCustomSignature;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatCustomSignaturesApi
 */
public class StatCustomSignaturesApiTest {

    private StatCustomSignaturesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StatCustomSignaturesApi.class);
    }

    
    /**
     * Statistics for custom signatures
     *
     * A successful call to this API returns all the statistics of all the custom signatures for a report identified by the stat_id parameter. Said report contains all statistics for this alert triggered from signatures contained in all custom_signatures for the selected hour.
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
     * Show a single Stat Custom Signature
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // StatCustomSignature response = api.show(id, include);

        // TODO: test validations
    }
    
}
