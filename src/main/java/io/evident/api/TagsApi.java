package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.PaginatedCollection;
import io.evident.models.Tag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface TagsApi {
  /**
   * Get a list of Tags
   * 
   * @param alertId The ID of the alert to list tags for (required)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:   See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/alerts/{alert_id}/tags.json_api")
  Call<PaginatedCollection> listForAlert(
    @retrofit2.http.Path("alert_id") Integer alertId, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Show a single Tag
   * 
   * @param id Tag ID (required)
   * @param include Related objects that can be included in the response:   See Including Objects for more information. (optional)
   * @return Call&lt;Tag&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/tags/{id}.json_api")
  Call<Tag> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

}
