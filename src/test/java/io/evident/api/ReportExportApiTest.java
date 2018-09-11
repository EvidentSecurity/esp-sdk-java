package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.ExportedReport;
import io.evident.models.Meta;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportExportApi
 */
public class ReportExportApiTest {

    private ReportExportApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ReportExportApi.class);
    }

    
    /**
     * Export all alerts for a set of reports to a file
     *
     * &lt;p&gt;An email will be sent to the calling user once the file is ready for download.&lt;/p&gt; &lt;p&gt;The URL and filename attributes will be blank on create. When exporting is complete these attributes will be filled in and can be viewed using the show action.&lt;/p&gt;
     */
    @Test
    public void requestFileTest() {
        List<Integer> reportIds = null;
        String requestedFormat = null;
        Map<String, String> filter = null;
        // ExportedReport response = api.requestFile(reportIds, requestedFormat, filter);

        // TODO: test validations
    }
    
    /**
     * Export all alerts on reports to an integration
     *
     * 
     */
    @Test
    public void sendToIntegrationTest() {
        Integer integrationId = null;
        List<Integer> reportIds = null;
        Map<String, String> filter = null;
        // Meta response = api.sendToIntegration(integrationId, reportIds, filter);

        // TODO: test validations
    }
    
    /**
     * Show a single Exported Report
     *
     * The URL provided is temporary and will expire shortly after the request. To download the exported file you will need to follow the URL provided.
     */
    @Test
    public void showFileDetailsTest() {
        Integer id = null;
        // ExportedReport response = api.showFileDetails(id);

        // TODO: test validations
    }
    
}
