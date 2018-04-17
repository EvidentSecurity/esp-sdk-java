package io.evident.api;

import io.evident.EspSdk.ApiClient;
import io.evident.models.AuditLog;
import io.evident.models.PaginatedCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuditLogsApi
 */
public class AuditLogsApiTest {

    private AuditLogsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuditLogsApi.class);
    }

    
    /**
     * Get a list of Audit Logs
     *
     * 
     */
    @Test
    public void listTest() {
        Map<String, String> filter = null;
        String page = null;
        String include = null;
        // PaginatedCollection response = api.list(filter, page, include);

        // TODO: test validations
    }
    
    /**
     * Show a single Audit Log
     *
     * 
     */
    @Test
    public void showTest() {
        Integer id = null;
        String include = null;
        // AuditLog response = api.show(id, include);

        // TODO: test validations
    }
    
}
