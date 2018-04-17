package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.IntegrationServicenow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface IntegrationsServiceNowApi {
  /**
   * Create a ServiceNow Integration
   * 
   * @param instanceUrl The URL for the ServiceNow instance (required)
   * @param username The username for accessing the ServiceNow instance (required)
   * @param password A password to access the JIRA project (required)
   * @param incidentType The password for accessing the ServiceNow instance. Valid values are incident, sn_si_incident (required)
   * @param name Name of the integration (required)
   * @param externalAccountIds External accounts for integration (required)
   * @param allHighRisk Send all high risk alerts (optional)
   * @param allMediumRisk Send all medium risk alerts (optional)
   * @param allLowRisk Send all low risk alerts (optional)
   * @param sendUpdates This feature enables the integration to send alerts when they are updated. When disabled, alerts will only be sent when they are initially created. When enabled, alerts will additionally be sent when a change is made such as the alert ending. An alert may end for multiple reasons. (optional)
   * @param sendWhenSuppressed Send notifications for suppressed alerts (optional)
   * @param signatureIds Signatures for integration (optional)
   * @param statuses Only send alerts that have the status in this list. Valid values are fail, warn, error, pass, info (optional)
   * @param customSignatureIds Custom signatures for integration (optional)
   * @param include Related objects that can be included in the response:  integration See Including Objects for more information. (optional)
   * @return Call&lt;IntegrationServicenow&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/integrations/servicenow.json_api")
  Call<IntegrationServicenow> create(
    @retrofit2.http.Field("instance_url") String instanceUrl, @retrofit2.http.Field("username") String username, @retrofit2.http.Field("password") String password, @retrofit2.http.Field("incident_type") String incidentType, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("external_account_ids") List<Integer> externalAccountIds, @retrofit2.http.Field("all_high_risk") Boolean allHighRisk, @retrofit2.http.Field("all_medium_risk") Boolean allMediumRisk, @retrofit2.http.Field("all_low_risk") Boolean allLowRisk, @retrofit2.http.Field("send_updates") Boolean sendUpdates, @retrofit2.http.Field("send_when_suppressed") Boolean sendWhenSuppressed, @retrofit2.http.Field("signature_ids") List<Integer> signatureIds, @retrofit2.http.Field("statuses") List<String> statuses, @retrofit2.http.Field("custom_signature_ids") List<Integer> customSignatureIds, @retrofit2.http.Query("include") String include
  );

  /**
   * Show a single ServiceNow Integration
   * 
   * @param integrationId The ID of the integration (required)
   * @param include Related objects that can be included in the response:  integration See Including Objects for more information. (optional)
   * @return Call&lt;IntegrationServicenow&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/integrations/{integration_id}/servicenow.json_api")
  Call<IntegrationServicenow> show(
    @retrofit2.http.Path("integration_id") Integer integrationId, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a ServiceNow Integration
   * 
   * @param integrationId The ID of the integration (required)
   * @param instanceUrl The URL for the ServiceNow instance (optional)
   * @param username The username for accessing the ServiceNow instance (optional)
   * @param password A password to access the JIRA project (optional)
   * @param incidentType The password for accessing the ServiceNow instance. Valid values are incident, sn_si_incident (optional)
   * @param name Name of the integration (optional)
   * @param allHighRisk Send all high risk alerts (optional)
   * @param allMediumRisk Send all medium risk alerts (optional)
   * @param allLowRisk Send all low risk alerts (optional)
   * @param sendUpdates This feature enables the integration to send alerts when they are updated. When disabled, alerts will only be sent when they are initially created. When enabled, alerts will additionally be sent when a change is made such as the alert ending. An alert may end for multiple reasons. (optional)
   * @param sendWhenSuppressed Send notifications for suppressed alerts (optional)
   * @param signatureIds Signatures for integration (optional)
   * @param statuses Only send alerts that have the status in this list. Valid values are fail, warn, error, pass, info (optional)
   * @param externalAccountIds External accounts for integration (optional)
   * @param customSignatureIds Custom signatures for integration (optional)
   * @param include Related objects that can be included in the response:  integration See Including Objects for more information. (optional)
   * @return Call&lt;IntegrationServicenow&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/integrations/{integration_id}/servicenow.json_api")
  Call<IntegrationServicenow> update(
    @retrofit2.http.Path("integration_id") Integer integrationId, @retrofit2.http.Field("instance_url") String instanceUrl, @retrofit2.http.Field("username") String username, @retrofit2.http.Field("password") String password, @retrofit2.http.Field("incident_type") String incidentType, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("all_high_risk") Boolean allHighRisk, @retrofit2.http.Field("all_medium_risk") Boolean allMediumRisk, @retrofit2.http.Field("all_low_risk") Boolean allLowRisk, @retrofit2.http.Field("send_updates") Boolean sendUpdates, @retrofit2.http.Field("send_when_suppressed") Boolean sendWhenSuppressed, @retrofit2.http.Field("signature_ids") List<Integer> signatureIds, @retrofit2.http.Field("statuses") List<String> statuses, @retrofit2.http.Field("external_account_ids") List<Integer> externalAccountIds, @retrofit2.http.Field("custom_signature_ids") List<Integer> customSignatureIds, @retrofit2.http.Query("include") String include
  );

}
