package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.ExportedReport;
import io.evident.models.Meta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ReportExportApi {
  /**
   * Export all alerts for a set of reports to a file
   * &lt;p&gt;An email will be sent to the calling user once the file is ready for download.&lt;/p&gt; &lt;p&gt;The URL and filename attributes will be blank on create. When exporting is complete these attributes will be filled in and can be viewed using the show action.&lt;/p&gt;
   * @param requestedFormat The file format of the export. Valid values are csv, json, pdf (required)
   * @param reportIds An array of report IDs to export alerts for (required)
   * @param filter Params used to filter the alerts that will be exported (optional)
   * @param include Related objects that can be included in the response:  user See Including Objects for more information. (optional)
   * @return Call&lt;ExportedReport&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/reports/export/files.json_api")
  Call<ExportedReport> requestFile(
    @retrofit2.http.Field("requested_format") String requestedFormat, @retrofit2.http.Field("report_ids") List<Integer> reportIds, @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Query("include") String include
  );

  /**
   * Export all alerts on reports to an integration
   * 
   * @param reportIds An array of report IDs (required)
   * @param integrationId The ID of the integration to send the alerts to (required)
   * @param filter Params used to filter the alerts that will be exported (optional)
   * @return Call&lt;Meta&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/reports/export/integrations.json_api")
  Call<Meta> sendToIntegration(
    @retrofit2.http.Field("report_ids") List<Integer> reportIds, @retrofit2.http.Field("integration_id") Integer integrationId, @retrofit2.http.Field("filter") Map<String, String> filter
  );

  /**
   * Show a single Exported Report
   * The URL provided is temporary and will expire shortly after the request. To download the exported file you will need to follow the URL provided.
   * @param id Exported Report ID (required)
   * @param include Related objects that can be included in the response:  user See Including Objects for more information. (optional)
   * @return Call&lt;ExportedReport&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/reports/export/files/{id}.json_api")
  Call<ExportedReport> showFileDetails(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

}
