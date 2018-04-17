package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.Alert;
import io.evident.models.PaginatedCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AlertsApi
 */
public class AlertsApiTest {

    private AlertsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AlertsApi.class);
    }

    
    /**
     * Get a list of Compliance Controls for an Alert
     *
     * 
     */
    @Test
    public void listComplianceControlsTest() {
        Integer alertId = null;
        String page = null;
        String include = null;
        // PaginatedCollection response = api.listComplianceControls(alertId, page, include);

        // TODO: test validations
    }
    
    /**
     * Get a list of Custom Compliance Controls for an Alert
     *
     * 
     */
    @Test
    public void listCustomComplianceControlsTest() {
        Integer alertId = null;
        String page = null;
        String include = null;
        // PaginatedCollection response = api.listCustomComplianceControls(alertId, page, include);

        // TODO: test validations
    }
    
    /**
     * Get a list of Alerts for a Report
     *
     * 
     */
    @Test
    public void listForReportTest() {
        Integer reportId = null;
        Map<String, String> filter = null;
        String page = null;
        String include = null;
        // PaginatedCollection response = api.listForReport(reportId, filter, page, include);

        // TODO: test validations
    }
    
    /**
     * Show a single Alert
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // Alert response = api.show(id, include);

        // TODO: test validations
    }
    
}
