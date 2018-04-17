package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.AuditLogFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AuditLogExportApi {
  /**
   * Export an Audit Log File
   * An email will be sent to the user(having organization level access) requesting creation once the file is ready for download. The file will have all audit logs for the organization in CSV format.  The URL and filename in the response will be blank on create but will be present in the response on the show endpoint once the export has been generated.
   * @param include Related objects that can be included in the response:  organization, user See Including Objects for more information. (optional)
   * @return Call&lt;AuditLogFile&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @POST("api/v2/audit_logs/export/files.json_api")
  Call<AuditLogFile> requestFile(
    @retrofit2.http.Query("include") String include
  );

  /**
   * Show a single Audit Log File
   * The URL returned will expire and will no longer work after the expiration
   * @param id Audit Log File ID (required)
   * @param include Related objects that can be included in the response:  organization, user See Including Objects for more information. (optional)
   * @return Call&lt;AuditLogFile&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/audit_logs/export/files/{id}.json_api")
  Call<AuditLogFile> showFileDetails(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

}
