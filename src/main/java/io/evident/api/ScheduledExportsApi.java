package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import io.evident.models.ScheduledExport;
import io.evident.models.ScheduledExportResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ScheduledExportsApi {
  /**
   * Update a(n) Scheduled Export
   * 
   * @param scheduledExportId The id of the scheduled export to be activated (required)
   * @param include Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information. (optional)
   * @return Call&lt;ScheduledExport&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @PATCH("api/v2/scheduled_exports/{scheduled_export_id}/activate.json_api")
  Call<ScheduledExport> activateExport(
    @retrofit2.http.Path("scheduled_export_id") Integer scheduledExportId, @retrofit2.http.Query("include") String include
  );

  /**
   * Create a(n) Scheduled Export
   * 
   * @param externalAccountIds The ids of the external accounts the report will be exported for (required)
   * @param frequency Frequency of the export. Valid values are weekly, daily, monthly (required)
   * @param hour Hour of the day to perform the export. Valid values are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 (required)
   * @param timeZone Time zone to use when calculating hour and day (required)
   * @param include Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information. (optional)
   * @param day Day of the week or day of the month to perform the export.  Allowed Values: Daily: nil - Weekly: sunday, monday, tuesday, wednesday, thursday, friday, or saturday - Monthly: 1 to 31. Valid values are sunday, monday, tuesday, wednesday, thursday, friday, saturday, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 (optional)
   * @param filter Params used to filter the alerts that will be exported (optional)
   * @param name A name that describes the export (optional)
   * @param recipients Email addresses the export will be sent to (optional)
   * @return Call&lt;ScheduledExport&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/scheduled_exports.json_api")
  Call<ScheduledExport> create(
    @retrofit2.http.Field("external_account_ids") List<Integer> externalAccountIds, @retrofit2.http.Field("frequency") String frequency, @retrofit2.http.Field("hour") Integer hour, @retrofit2.http.Field("time_zone") String timeZone, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("day") String day, @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("recipients") List<String> recipients
  );

  /**
   * Delete a(n) Scheduled Export
   * 
   * @param id Scheduled Export ID (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/scheduled_exports/{id}.json_api")
  Call<Meta> delete(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Update a(n) Scheduled Export
   * 
   * @param scheduledExportId The id of the scheduled export to be disabled (required)
   * @param include Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information. (optional)
   * @return Call&lt;ScheduledExport&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @PATCH("api/v2/scheduled_exports/{scheduled_export_id}/disable.json_api")
  Call<ScheduledExport> disableExport(
    @retrofit2.http.Path("scheduled_export_id") Integer scheduledExportId, @retrofit2.http.Query("include") String include
  );

  /**
   * Get a list of Scheduled Exports
   * 
   * @param include Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information. (optional)
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, hour, day, status, recipients, time_zone, name] Matching Searchable Attributes: [recipients, time_zone, name] Limited Searchable Attribute: [frequency_eq] Sortable Attributes: [updated_at, created_at, id, name] Searchable Associations: [creator, external_accounts] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. (optional, default to {:number=>1,+:size=>20})
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/scheduled_exports.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Query("include") String include, @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page
  );

  /**
   * Show a single Scheduled Export
   * 
   * @param id Scheduled Export ID (required)
   * @param include Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information. (optional)
   * @return Call&lt;ScheduledExport&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/scheduled_exports/{id}.json_api")
  Call<ScheduledExport> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Show a single Scheduled Export Result
   * The URL provided is temporary and will expire shortly after the request. To download the exported file you will need to follow the URL provided.
   * @param uuid The uuid to access the result (required)
   * @param include Related objects that can be included in the response:  scheduled_export See Including Objects for more information. (optional)
   * @return Call&lt;ScheduledExportResult&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/reports/scheduled_export/files/{uuid}.json_api")
  Call<ScheduledExportResult> showFileDetails(
    @retrofit2.http.Path("uuid") String uuid, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a(n) Scheduled Export
   * 
   * @param uuid The uuid of the export to unsubscribe (required)
   * @param email The email to unsubscribe. Nested under: \&quot;data\&quot;: { \&quot;meta\&quot;: { \&quot;email\&quot;: ... } } (required)
   * @param include Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information. (optional)
   * @return Call&lt;ScheduledExport&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/scheduled_exports/{uuid}/unsubscribe.json_api")
  Call<ScheduledExport> unsubscribeExport(
    @retrofit2.http.Path("uuid") String uuid, @retrofit2.http.Field("email") String email, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a(n) Scheduled Export
   * 
   * @param id Scheduled Export ID (required)
   * @param include Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information. (optional)
   * @param day Day of the week or day of the month to perform the export.  Allowed Values: Daily: nil - Weekly: sunday, monday, tuesday, wednesday, thursday, friday, or saturday - Monthly: 1 to 31. Valid values are sunday, monday, tuesday, wednesday, thursday, friday, saturday, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 (optional)
   * @param externalAccountIds The ids of the external accounts the report will be exported for (optional)
   * @param filter Params used to filter the alerts that will be exported (optional)
   * @param hour Hour of the day to perform the export. Valid values are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 (optional)
   * @param name A name that describes the export (optional)
   * @param recipients Email addresses the export will be sent to (optional)
   * @param timeZone Time zone to use when calculating hour and day (optional)
   * @return Call&lt;ScheduledExport&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/scheduled_exports/{id}.json_api")
  Call<ScheduledExport> update(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("day") String day, @retrofit2.http.Field("external_account_ids") List<Integer> externalAccountIds, @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("hour") Integer hour, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("recipients") List<String> recipients, @retrofit2.http.Field("time_zone") String timeZone
  );

}
