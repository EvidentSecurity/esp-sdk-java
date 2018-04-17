package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.Alert;
import io.evident.models.PaginatedCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AlertsApi {
  /**
   * Get a list of Compliance Controls for an Alert
   * 
   * @param alertId The ID of the alert the compliance controls belong to (required)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  compliance_standard, compliance_domain, signatures See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/alerts/{alert_id}/compliance_controls.json_api")
  Call<PaginatedCollection> listComplianceControls(
    @retrofit2.http.Path("alert_id") Integer alertId, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Get a list of Custom Compliance Controls for an Alert
   * 
   * @param alertId The ID of the alert the custom compliance controls belong to (required)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_domain, signatures, custom_signatures See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/alerts/{alert_id}/custom_compliance_controls.json_api")
  Call<PaginatedCollection> listCustomComplianceControls(
    @retrofit2.http.Path("alert_id") Integer alertId, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Get a list of Alerts for a Report
   * 
   * @param reportId ID of the Report to Return Alerts For (required)
   * @param filter Filter Params for Searching.  Equality Searchable Attribute: [id]  Limited Searchable Attributes: [signature_service_id_in, signature_risk_level_in, risk_level_in, risk_level_eq, resource_or_tag_cont, suppressed, not_suppressed, signature_name_cont, signature_identifier_cont, external_account_id_in, external_account_id_eq, external_account_team_id_in, external_account_team_id_eq, region_id_in, region_id_eq, status_in, status_eq, attribution_present, cloud_trail_events_present, open_as_of, signature_id_in, signature_id_eq, external_account_provider_eq]   (optional)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  external_account, region, signature, custom_signature, suppression, metadata, attribution, cloud_trail_events, tags, compliance_controls, custom_compliance_controls See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/reports/{report_id}/alerts.json_api")
  Call<PaginatedCollection> listForReport(
    @retrofit2.http.Path("report_id") Integer reportId, @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Show a single Alert
   * 
   * @param id Alert ID (required)
   * @param include Related objects that can be included in the response:  external_account, region, signature, custom_signature, suppression, metadata, attribution, cloud_trail_events, tags, compliance_controls, custom_compliance_controls See Including Objects for more information. (optional)
   * @return Call&lt;Alert&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/alerts/{id}.json_api")
  Call<Alert> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

}
