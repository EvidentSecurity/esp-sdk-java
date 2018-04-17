package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.CustomSignatureResult;
import io.evident.models.PaginatedCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface CustomSignatureResultsApi {
  /**
   * Create a(n) Custom Signature Result
   * 
   * @param code The code for this definition (required)
   * @param customSignatureDefinitionId ID of the custom signature definition this result belongs to (required)
   * @param externalAccountId ID of the external account the code should run for (required)
   * @param language The language of the definition. Valid values are ruby, javascript (required)
   * @param regionId ID of the region the code should run for.  Required if region is not supplied. (optional)
   * @param region Code of the region the result code should run for. Ex: us-east-1. This can be sent instead of region_id (optional)
   * @param include Related objects that can be included in the response:  external_account, region, definition See Including Objects for more information. (optional)
   * @return Call&lt;CustomSignatureResult&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/custom_signature_results.json_api")
  Call<CustomSignatureResult> create(
    @retrofit2.http.Field("code") String code, @retrofit2.http.Field("custom_signature_definition_id") Integer customSignatureDefinitionId, @retrofit2.http.Field("external_account_id") Integer externalAccountId, @retrofit2.http.Field("language") String language, @retrofit2.http.Field("region_id") Integer regionId, @retrofit2.http.Field("region") String region, @retrofit2.http.Query("include") String include
  );

  /**
   * Get a list of Custom Signature Results
   * 
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, language, status]   Sortable Attribute: [id] Searchable Associations: [definition, region, external_account] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  external_account, region, definition See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/custom_signature_results.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Returns the Alerts for a given Custom Signature Result
   * This format is slightly different than the standard alert format. A successful call to this API returns a list of alerts for the custom signature result identified by the custom_signature_result_id parameter.
   * @param customSignatureResultId Custom Signature Result ID (required)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  external_account, region, custom_signature See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/custom_signature_results/{custom_signature_result_id}/alerts.json_api")
  Call<PaginatedCollection> listAlerts(
    @retrofit2.http.Path("custom_signature_result_id") Integer customSignatureResultId, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Show a single Custom Signature Result
   * 
   * @param id Custom Signature Result ID (required)
   * @param include Related objects that can be included in the response:  external_account, region, definition See Including Objects for more information. (optional)
   * @return Call&lt;CustomSignatureResult&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/custom_signature_results/{id}.json_api")
  Call<CustomSignatureResult> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

}
