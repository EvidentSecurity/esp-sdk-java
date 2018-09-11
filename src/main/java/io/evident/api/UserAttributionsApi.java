package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.ExternalAccount;
import io.evident.models.ExternalAccountUserAttributionChannel;
import io.evident.models.Meta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UserAttributionsApi {
  /**
   * Create a User Attribution Channel for an external account
   * URL will only be returned in this response and will not be accessible again.
   * @param externalAccountId The ID of the external account to create a User Attribution Channel for (required)
   * @return Call&lt;ExternalAccountUserAttributionChannel&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @POST("api/v2/external_accounts/{external_account_id}/user_attribution/channel.json_api")
  Call<ExternalAccountUserAttributionChannel> addChannel(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId
  );

  /**
   * Remove the User Attribution Channel for an external account
   * 
   * @param externalAccountId The ID of the external account to remove the User Attribution Channel from (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/external_accounts/{external_account_id}/user_attribution/channel.json_api")
  Call<Meta> removeChannel(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId
  );

  /**
   * Show the User Attribution Channel of an external account
   * The channel url will not be returned.
   * @param externalAccountId The ID of the external account to show the user attribution channel for (required)
   * @return Call&lt;ExternalAccountUserAttributionChannel&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/external_accounts/{external_account_id}/user_attribution/channel.json_api")
  Call<ExternalAccountUserAttributionChannel> showChannel(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId
  );

  /**
   * Update the user attributions on an external account
   * 
   * @param externalAccountId The ID of the external account to update the user attributions of (required)
   * @param include Related objects that can be included in the response:  organization, sub_organization, team, scan_intervals, disabled_signatures, suppressions, azure_group See Including Objects for more information. (optional)
   * @param cloudtrailName The name of the cloudetrail associated with the user attribution. (optional)
   * @return Call&lt;ExternalAccount&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/external_accounts/{external_account_id}/user_attribution.json_api")
  Call<ExternalAccount> update(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("cloudtrail_name") String cloudtrailName
  );

}
