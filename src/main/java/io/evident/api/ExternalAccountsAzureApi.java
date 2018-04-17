package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.ExternalAccountAzure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ExternalAccountsAzureApi {
  /**
   * Create an Azure External Account
   * The channel_url will only be returned in this response and will not be accessible again. The related external_account object will be returned with the response.
   * @param subscriptionId Azure subscription ID (required)
   * @param clientId Azure client ID (required)
   * @param tenantId Azure tenant ID (required)
   * @param appKey Azure app key (required)
   * @param name Name (required)
   * @param teamId The ID of the team the external account belongs to (required)
   * @return Call&lt;ExternalAccountAzure&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/external_accounts/azure.json_api")
  Call<ExternalAccountAzure> create(
    @retrofit2.http.Field("subscription_id") String subscriptionId, @retrofit2.http.Field("client_id") String clientId, @retrofit2.http.Field("tenant_id") String tenantId, @retrofit2.http.Field("app_key") String appKey, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("team_id") Integer teamId
  );

  /**
   * Reset Log URL for an Azure External Account
   * This endpoint invalidates the previous URL and generates a new one. The channel_url will only be returned in this response and will not be accessible again. The related external_account object will be returned with the response.
   * @param externalAccountId The ID of the external account to reset an Azure log URL for (required)
   * @return Call&lt;ExternalAccountAzure&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @PATCH("api/v2/external_accounts/{external_account_id}/azure/log_url.json_api")
  Call<ExternalAccountAzure> resetUrl(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId
  );

  /**
   * Show an Azure External Account
   * 
   * @param externalAccountId The ID of the external account to show an Azure credential for (required)
   * @param include Related objects that can be included in the response:  external_account See Including Objects for more information. (optional)
   * @return Call&lt;ExternalAccountAzure&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/external_accounts/{external_account_id}/azure.json_api")
  Call<ExternalAccountAzure> show(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Query("include") String include
  );

  /**
   * Update an Azure External Account
   *  The related external_account object will be returned with the response.
   * @param externalAccountId The ID of the external account to update an Azure credential for (required)
   * @param subscriptionId Azure subscription ID (optional)
   * @param clientId Azure client ID (optional)
   * @param tenantId Azure tenant ID (optional)
   * @param appKey Azure app key (optional)
   * @param name Name (optional)
   * @param teamId The ID of the team the external account belongs to (optional)
   * @return Call&lt;ExternalAccountAzure&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/external_accounts/{external_account_id}/azure.json_api")
  Call<ExternalAccountAzure> update(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Field("subscription_id") String subscriptionId, @retrofit2.http.Field("client_id") String clientId, @retrofit2.http.Field("tenant_id") String tenantId, @retrofit2.http.Field("app_key") String appKey, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("team_id") Integer teamId
  );

}
