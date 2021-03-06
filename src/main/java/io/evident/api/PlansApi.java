package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.PaginatedCollection;
import io.evident.models.Plan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface PlansApi {
  /**
   * Get a list of Plans
   * 
   * @param page Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. (optional, default to {:number=>1,+:size=>20})
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/plans.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Field("page") String page
  );

  /**
   * Show a single Plan
   * 
   * @param id Plan ID (required)
   * @return Call&lt;Plan&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/plans/{id}.json_api")
  Call<Plan> show(
    @retrofit2.http.Path("id") Integer id
  );

}
