package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.Attribution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AttributionApi {
  /**
   * Show the attribution for an alert
   * 
   * @param alertId The ID of the alert to retrieve user attribution for (required)
   * @param include Related objects that can be included in the response:  alert See Including Objects for more information. (optional)
   * @return Call&lt;Attribution&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/alerts/{alert_id}/attribution.json_api")
  Call<Attribution> show(
    @retrofit2.http.Path("alert_id") Integer alertId, @retrofit2.http.Query("include") String include
  );

}
