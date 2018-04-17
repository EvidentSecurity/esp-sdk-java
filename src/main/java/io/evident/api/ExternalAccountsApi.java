package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.ComplianceStandard;
import io.evident.models.ExternalAccount;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import io.evident.models.Signature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ExternalAccountsApi {
  /**
   * Add a compliance standard to an external account
   * 
   * @param externalAccountId The ID of the external account this compliance standard belongs to (required)
   * @param complianceStandardId The ID of the compliance standard that belongs to this external account (required)
   * @param include Related objects that can be included in the response:  compliance_domains, compliance_controls See Including Objects for more information. (optional)
   * @return Call&lt;ComplianceStandard&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/external_accounts/{external_account_id}/compliance_standards.json_api")
  Call<ComplianceStandard> addComplianceStandard(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Field("compliance_standard_id") Integer complianceStandardId, @retrofit2.http.Query("include") String include
  );

  /**
   * Add a custom compliance standard to an external account
   * 
   * @param externalAccountId The ID of the external account this custom compliance standard belongs to (required)
   * @param customComplianceStandardId The ID of the custom compliance standard that belongs to this external account (required)
   * @return Call&lt;Meta&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/external_accounts/{external_account_id}/custom_compliance_standards.json_api")
  Call<Meta> addCustomComplianceStandard(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Field("custom_compliance_standard_id") Integer customComplianceStandardId
  );

  /**
   * Disable a signature for an external account
   * 
   * @param externalAccountId The ID of the external account to disable a signature on (required)
   * @param signatureId The ID of the signature to disable (required)
   * @param include Related objects that can be included in the response:  service, suppressions See Including Objects for more information. (optional)
   * @return Call&lt;Signature&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/external_accounts/{external_account_id}/disabled_signatures.json_api")
  Call<Signature> addDisabledSignature(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Field("signature_id") Integer signatureId, @retrofit2.http.Query("include") String include
  );

  /**
   * Delete a(n) External Account
   * 
   * @param id  ID (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/external_accounts/{id}.json_api")
  Call<Meta> delete(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a list of External Accounts
   * 
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, nickname, name] Matching Searchable Attributes: [nickname, name] Limited Searchable Attributes: [account_eq, arn_eq, provider_eq, subscription_id_eq] Sortable Attributes: [name, updated_at, created_at, id] Searchable Associations: [organization, sub_organization, team, compliance_standards, azure_group, disabled_signatures, suppressions] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  organization, sub_organization, team, scan_intervals, disabled_signatures, suppressions, azure_group, credentials See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/external_accounts.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Get a list of compliance standards for an external account
   * 
   * @param externalAccountId The ID of the external account this compliance standard belongs to (required)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  compliance_domains, compliance_controls See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/external_accounts/{external_account_id}/compliance_standards.json_api")
  Call<PaginatedCollection> listComplianceStandards(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Get a list of custom compliance standards for an external account
   * 
   * @param externalAccountId The ID of the external account this custom compliance standard belongs to (required)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  custom_compliance_domains, custom_compliance_controls See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/external_accounts/{external_account_id}/custom_compliance_standards.json_api")
  Call<PaginatedCollection> listCustomComplianceStandards(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Get a list all the disabled signatures for an external account
   * 
   * @param externalAccountId The ID of the external account to retrieve the disabled signatures for (required)
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, risk_level, service_id, disabled, supports_user_attribution, name, identifier, description, resolution] Matching Searchable Attributes: [name, identifier, description, resolution] Limited Searchable Attribute: [service_provider_eq] Sortable Attributes: [name, identifier, updated_at, created_at, id] Searchable Associations: [signature_copy, disabled_external_accounts, integrations, suppressions] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  service, suppressions See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/external_accounts/{external_account_id}/disabled_signatures.json_api")
  Call<PaginatedCollection> listDisabledSignatures(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Remove a compliance standard from an external account
   * 
   * @param externalAccountId The ID of the external account this compliance standard belongs to (required)
   * @param complianceStandardId The ID of the compliance standard that belongs to this external account (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/external_accounts/{external_account_id}/compliance_standards/{compliance_standard_id}.json_api")
  Call<Meta> removeComplianceStandard(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Path("compliance_standard_id") Integer complianceStandardId
  );

  /**
   * Remove a custom compliance standard from an external account
   * 
   * @param externalAccountId The ID of the external account this custom compliance standard belongs to (required)
   * @param customComplianceStandardId The ID of the custom compliance standard that belongs to this external account (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/external_accounts/{external_account_id}/custom_compliance_standards/{custom_compliance_standard_id}.json_api")
  Call<Meta> removeCustomComplianceStandard(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Path("custom_compliance_standard_id") Integer customComplianceStandardId
  );

  /**
   * Re-enable a signature for an external account
   * 
   * @param externalAccountId The ID of the external account to enable a signature on (required)
   * @param signatureId The ID of the signature to enable (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/external_accounts/{external_account_id}/disabled_signatures/{signature_id}.json_api")
  Call<Meta> removeDisabledSignature(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Path("signature_id") Integer signatureId
  );

  /**
   * Show a single External Account
   * 
   * @param id External Account ID (required)
   * @param include Related objects that can be included in the response:  organization, sub_organization, team, scan_intervals, disabled_signatures, suppressions, azure_group, credentials See Including Objects for more information. (optional)
   * @return Call&lt;ExternalAccount&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/external_accounts/{id}.json_api")
  Call<ExternalAccount> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

}
