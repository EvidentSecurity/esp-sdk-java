package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import io.evident.models.Signature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface SignaturesApi {
  /**
   * Get a list of Signatures
   * 
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, risk_level, service_id, disabled, supports_user_attribution, name, identifier, description, resolution] Matching Searchable Attributes: [name, identifier, description, resolution] Limited Searchable Attribute: [service_provider_eq] Sortable Attributes: [name, identifier, updated_at, created_at, id] Searchable Associations: [signature_copy, disabled_external_accounts, integrations, suppressions] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  service, suppressions See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/signatures.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Get a list of disabled External Accounts for a signature
   * 
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, nickname, name] Matching Searchable Attributes: [nickname, name] Limited Searchable Attributes: [account_eq, arn_eq, provider_eq, subscription_id_eq] Sortable Attributes: [name, updated_at, created_at, id] Searchable Associations: [organization, sub_organization, team, compliance_standards, azure_group, disabled_signatures, suppressions] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  organization, sub_organization, team, scan_intervals, disabled_signatures, suppressions, azure_group, credentials See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/signatures/{signature_id}/disabled_external_accounts.json_api")
  Call<PaginatedCollection> listDisabledExternalAccounts(
    @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Get A list of Signatures with default and custom risk levels for an External Account
   * Return only signatures that have a custom risk level set by searching with &#x60;filter:{custom_risk_level_present: 1}&#x60;
   * @param externalAccountId The ID of the external account to retrieve (required)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  service, suppressions See Including Objects for more information. (optional)
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, risk_level, service_id, disabled, supports_user_attribution, name, identifier, description, resolution] Matching Searchable Attributes: [name, identifier, description, resolution] Limited Searchable Attributes: [custom_risk_level_present, service_provider_eq] Sortable Attributes: [name, identifier, updated_at, created_at, id] Searchable Associations: [signature_copy, disabled_external_accounts, integrations, suppressions] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/external_accounts/{external_account_id}/signature_custom_risk_levels.json_api")
  Call<PaginatedCollection> listWithCustomRiskLevelForExternalAccount(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("filter") Map<String, String> filter
  );

  /**
   * Remove a custom risk level to a Signature for an External Account
   * 
   * @param externalAccountId The ID of the external account this signature custom risk level is for (required)
   * @param signatureId The signature ID this signature custom risk level is for (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/external_accounts/{external_account_id}/signature_custom_risk_levels/{signature_id}.json_api")
  Call<Meta> removeCustomRiskLevelForExternalAccount(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Path("signature_id") Integer signatureId
  );

  /**
   * Add a custom risk level to a Signature for an External Account
   * 
   * @param externalAccountId The ID of the external account this signature custom risk level is for (required)
   * @param signatureId The signature ID this signature custom risk level is for (required)
   * @param riskLevel The custom risk-level of the problem identified by the signature for this external_account. Valid values are low, medium, high (required)
   * @param include Related objects that can be included in the response:  service, suppressions See Including Objects for more information. (optional)
   * @return Call&lt;Signature&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/external_accounts/{external_account_id}/signature_custom_risk_levels.json_api")
  Call<Signature> setCustomRiskLevelForExternalAccount(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Field("signature_id") Integer signatureId, @retrofit2.http.Field("risk_level") String riskLevel, @retrofit2.http.Query("include") String include
  );

  /**
   * Show a single Signature
   * 
   * @param id Signature ID (required)
   * @param include Related objects that can be included in the response:  service, suppressions See Including Objects for more information. (optional)
   * @return Call&lt;Signature&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/signatures/{id}.json_api")
  Call<Signature> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a Signature&#39;s custom risk level for an External Account
   * 
   * @param externalAccountId The ID of the external account this signature custom risk level is for (required)
   * @param signatureId The signature ID this signature custom risk level is for (required)
   * @param riskLevel The custom risk-level of the problem identified by the signature for this external_account. Valid values are low, medium, high (optional)
   * @param include Related objects that can be included in the response:  service, suppressions See Including Objects for more information. (optional)
   * @return Call&lt;Signature&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/external_accounts/{external_account_id}/signature_custom_risk_levels/{signature_id}.json_api")
  Call<Signature> updateCustomRiskLevelForExternalAccount(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Path("signature_id") Integer signatureId, @retrofit2.http.Field("risk_level") String riskLevel, @retrofit2.http.Query("include") String include
  );

}
