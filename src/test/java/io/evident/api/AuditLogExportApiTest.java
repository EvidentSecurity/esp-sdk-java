package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.AuditLogFile;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuditLogExportApi
 */
public class AuditLogExportApiTest {

    private AuditLogExportApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuditLogExportApi.class);
    }

    
    /**
     * Export an Audit Log File
     *
     * An email will be sent to the user(having organization level access) requesting creation once the file is ready for download. The file will have all audit logs for the organization in CSV format.  The URL and filename in the response will be blank on create but will be present in the response on the show endpoint once the export has been generated.
     */
    @Test
    public void requestFileTest() {
        String include = null;
        // AuditLogFile response = api.requestFile(include);

        // TODO: test validations
    }
    
    /**
     * Show a single Audit Log File
     *
     * The URL returned will expire and will no longer work after the expiration
     */
    @Test
    public void showFileDetailsTest() {
        Integer id = null;
        String include = null;
        // AuditLogFile response = api.showFileDetails(id, include);

        // TODO: test validations
    }
    
}
