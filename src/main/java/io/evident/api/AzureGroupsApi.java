package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.AzureGroup;
import io.evident.models.ExternalAccount;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AzureGroupsApi {
  /**
   * Add an External Account to an Azure Group
   * 
   * @param azureGroupId The ID of the Azure group associated with this memberhsip (required)
   * @param externalAccountId The ID of the External Account associated with this memberhsip (required)
   * @param include Related objects that can be included in the response:  organization, sub_organization, team, scan_intervals, disabled_signatures, suppressions, azure_group, credentials See Including Objects for more information. (optional)
   * @return Call&lt;ExternalAccount&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/azure_groups/{azure_group_id}/memberships.json_api")
  Call<ExternalAccount> addExternalAccount(
    @retrofit2.http.Path("azure_group_id") Integer azureGroupId, @retrofit2.http.Field("external_account_id") Integer externalAccountId, @retrofit2.http.Query("include") String include
  );

  /**
   * Create a(n) Azure Group
   * The URL will only be returned once when the group is first created
   * @param name Name (required)
   * @param include Related objects that can be included in the response:  organization, external_accounts See Including Objects for more information. (optional)
   * @return Call&lt;AzureGroup&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/azure_groups.json_api")
  Call<AzureGroup> create(
    @retrofit2.http.Field("name") String name, @retrofit2.http.Query("include") String include
  );

  /**
   * Delete a(n) Azure Group
   * 
   * @param id Azure Group ID (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/azure_groups/{id}.json_api")
  Call<Meta> delete(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a list of Azure Groups
   * 
   * @param include Related objects that can be included in the response:  organization, external_accounts See Including Objects for more information. (optional)
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, name] Matching Searchable Attribute: [name]  Sortable Attributes: [id, name] Searchable Associations: [organization, external_accounts] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. (optional, default to {:number=>1,+:size=>20})
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/azure_groups.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Query("include") String include, @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page
  );

  /**
   * Remove an External Account from an Azure Group
   * 
   * @param azureGroupId The ID of the Azure group associated with this memberhsip (required)
   * @param externalAccountId The ID of the External Account associated with this memberhsip (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/azure_groups/{azure_group_id}/memberships/{external_account_id}.json_api")
  Call<Meta> removeExternalAccount(
    @retrofit2.http.Path("azure_group_id") Integer azureGroupId, @retrofit2.http.Path("external_account_id") Integer externalAccountId
  );

  /**
   * Show a single Azure Group
   * 
   * @param id Azure Group ID (required)
   * @param include Related objects that can be included in the response:  organization, external_accounts See Including Objects for more information. (optional)
   * @return Call&lt;AzureGroup&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/azure_groups/{id}.json_api")
  Call<AzureGroup> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a(n) Azure Group
   * 
   * @param id Azure Group ID (required)
   * @param include Related objects that can be included in the response:  organization, external_accounts See Including Objects for more information. (optional)
   * @param name Name (optional)
   * @return Call&lt;AzureGroup&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/azure_groups/{id}.json_api")
  Call<AzureGroup> update(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("name") String name
  );

}
