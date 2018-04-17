package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.Subscription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface SubscriptionsApi {
  /**
   * Show a single Subscription
   * 
   * @param id Subscription ID (required)
   * @param include Related objects that can be included in the response:  organization, plan See Including Objects for more information. (optional)
   * @return Call&lt;Subscription&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/subscriptions/{id}.json_api")
  Call<Subscription> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

}
