package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.CustomSignature;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface CustomSignaturesApi {
  /**
   * Create a(n) Custom Signature
   * 
   * @param identifier The identifier to use for the custom signature. Common format is AWS:- such as AWS:IAM-001 (required)
   * @param name The name of the custom signature (required)
   * @param riskLevel The risk-level of the problem identified by the custom signature. Valid values are low, medium, high (required)
   * @param externalAccountIds The external account IDs this custom signature should run for. If no accounts are selected the custom signature will not be run. (required)
   * @param description The description of the custom signature that is displayed on alerts (optional)
   * @param resolution Details for how to resolve this custom signature that is displayed on alerts (optional)
   * @param include Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions See Including Objects for more information. (optional)
   * @return Call&lt;CustomSignature&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/custom_signatures.json_api")
  Call<CustomSignature> create(
    @retrofit2.http.Field("identifier") String identifier, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("risk_level") String riskLevel, @retrofit2.http.Field("external_account_ids") List<Integer> externalAccountIds, @retrofit2.http.Field("description") String description, @retrofit2.http.Field("resolution") String resolution, @retrofit2.http.Query("include") String include
  );

  /**
   * Delete a(n) Custom Signature
   * 
   * @param id  ID (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/custom_signatures/{id}.json_api")
  Call<Meta> delete(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a list of Custom Signatures
   * 
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, risk_level, service_id, name, identifier] Matching Searchable Attributes: [name, identifier]  Sortable Attributes: [name, updated_at, created_at, id] Searchable Associations: [organization, teams, definitions, integrations, suppressions] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/custom_signatures.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Show a single Custom Signature
   * 
   * @param id Custom Signature ID (required)
   * @param include Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions See Including Objects for more information. (optional)
   * @return Call&lt;CustomSignature&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/custom_signatures/{id}.json_api")
  Call<CustomSignature> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a(n) Custom Signature
   * 
   * @param id Custom Signature ID (required)
   * @param description The description of the custom signature that is displayed on alerts (optional)
   * @param identifier The identifier to use for the custom signature. Common format is AWS:- such as AWS:IAM-001 (optional)
   * @param name The name of the custom signature (optional)
   * @param resolution Details for how to resolve this custom signature that is displayed on alerts (optional)
   * @param riskLevel The risk-level of the problem identified by the custom signature. Valid values are low, medium, high (optional)
   * @param externalAccountIds The external account IDs this custom signature should run for. If no accounts are selected the custom signature will not be run. (optional)
   * @param include Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions See Including Objects for more information. (optional)
   * @return Call&lt;CustomSignature&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/custom_signatures/{id}.json_api")
  Call<CustomSignature> update(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Field("description") String description, @retrofit2.http.Field("identifier") String identifier, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("resolution") String resolution, @retrofit2.http.Field("risk_level") String riskLevel, @retrofit2.http.Field("external_account_ids") List<Integer> externalAccountIds, @retrofit2.http.Query("include") String include
  );

}
