package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.PaginatedCollection;
import io.evident.models.StatService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface StatServicesApi {
  /**
   * Get a list of statistics for services
   * A successful call to this API returns all the statistics of all the services for a report identified by the stat_id parameter. Said report contains all statistics for this alert triggered from services contained in all services for the selected hour.
   * @param statId The ID of the stat to retrieve service statistics for (required)
   * @param include Related objects that can be included in the response:  service, stat See Including Objects for more information. (optional)
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [stat_id, type_id]     (optional)
   * @param page Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. (optional, default to {:number=>1,+:size=>20})
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/stats/{stat_id}/services.json_api")
  Call<PaginatedCollection> listForStat(
    @retrofit2.http.Path("stat_id") Integer statId, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page
  );

  /**
   * Show a single Stat Service
   * 
   * @param id Stat Service ID (required)
   * @param include Related objects that can be included in the response:  service, stat See Including Objects for more information. (optional)
   * @return Call&lt;StatService&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/stats/services/{id}.json_api")
  Call<StatService> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

}
