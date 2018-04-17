package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.PaginatedCollection;
import io.evident.models.Suppression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface SuppressionsApi {
  /**
   * Create a suppression
   * 
   * @param reason The reason for the suppresion (required)
   * @param regions Codes of regions to be suppressed (required)
   * @param externalAccountIds IDs of external accounts to be suppressed (required)
   * @param resource The resource string this suppression will suppress alerts for (optional)
   * @param signatureIds IDs of signatures to be suppressed (optional)
   * @param customSignatureIds IDs of custom signatures to be suppressed (optional)
   * @param include Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information. (optional)
   * @return Call&lt;Suppression&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/suppressions.json_api")
  Call<Suppression> create(
    @retrofit2.http.Field("reason") String reason, @retrofit2.http.Field("regions") List<String> regions, @retrofit2.http.Field("external_account_ids") List<Integer> externalAccountIds, @retrofit2.http.Field("resource") String resource, @retrofit2.http.Field("signature_ids") List<Integer> signatureIds, @retrofit2.http.Field("custom_signature_ids") List<Integer> customSignatureIds, @retrofit2.http.Query("include") String include
  );

  /**
   * Creates a suppression from an alert
   * A successful call to this API creates a new suppression based on the supplied alert_id. The body of the request must contain a json api compliant hash of the suppression reason and an alert id.
   * @param alertId The ID for the alert you want to create a suppression for (required)
   * @param reason The reason for creating the suppression (required)
   * @param include Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information. (optional)
   * @return Call&lt;Suppression&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/suppressions/alerts.json_api")
  Call<Suppression> createFromAlert(
    @retrofit2.http.Field("alert_id") Integer alertId, @retrofit2.http.Field("reason") String reason, @retrofit2.http.Query("include") String include
  );

  /**
   * Deactivate a suppression
   * 
   * @param id Suppression ID (required)
   * @param include Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information. (optional)
   * @return Call&lt;Suppression&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @PATCH("api/v2/suppressions/{id}/deactivate.json_api")
  Call<Suppression> deactivate(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Get a list of Suppressions
   * 
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, aasm_state, status, suppression_type, resource, reason] Matching Searchable Attributes: [resource, reason]  Sortable Attributes: [updated_at, created_at, id, status] Searchable Associations: [regions, external_accounts, created_by, user, signatures, custom_signatures] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/suppressions.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Show a single Suppression
   * 
   * @param id Suppression ID (required)
   * @param include Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information. (optional)
   * @return Call&lt;Suppression&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/suppressions/{id}.json_api")
  Call<Suppression> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

}
