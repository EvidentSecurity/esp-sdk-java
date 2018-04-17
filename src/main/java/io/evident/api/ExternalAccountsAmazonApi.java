package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.ExternalAccountAmazonIAM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ExternalAccountsAmazonApi {
  /**
   * Create an Amazon External Account
   *  The related external_account object will be returned with the response.
   * @param arn Amazon Resource Name for the IAM role (required)
   * @param externalId External Identifier set on the role (required)
   * @param name Name (required)
   * @param teamId The ID of the team the external account belongs to (required)
   * @return Call&lt;ExternalAccountAmazonIAM&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/external_accounts/amazon.json_api")
  Call<ExternalAccountAmazonIAM> create(
    @retrofit2.http.Field("arn") String arn, @retrofit2.http.Field("external_id") String externalId, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("team_id") Integer teamId
  );

  /**
   * Show an Amazon External Account
   * 
   * @param externalAccountId The ID of the external account to show an Amazon IAM credential for (required)
   * @param include Related objects that can be included in the response:  external_account See Including Objects for more information. (optional)
   * @return Call&lt;ExternalAccountAmazonIAM&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/external_accounts/{external_account_id}/amazon.json_api")
  Call<ExternalAccountAmazonIAM> show(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Query("include") String include
  );

  /**
   * Update an Amazon External Account
   *  The related external_account object will be returned with the response.
   * @param externalAccountId The ID of the external account to update an Amazon IAM credential of (required)
   * @param arn Amazon Resource Name for the IAM role (optional)
   * @param externalId External Identifier set on the role (optional)
   * @param name Name (optional)
   * @param teamId The ID of the team the external account belongs to (optional)
   * @return Call&lt;ExternalAccountAmazonIAM&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/external_accounts/{external_account_id}/amazon.json_api")
  Call<ExternalAccountAmazonIAM> update(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Field("arn") String arn, @retrofit2.http.Field("external_id") String externalId, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("team_id") Integer teamId
  );

}
