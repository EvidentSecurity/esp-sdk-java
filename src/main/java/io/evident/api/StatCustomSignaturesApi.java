package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.PaginatedCollection;
import io.evident.models.StatCustomSignature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface StatCustomSignaturesApi {
  /**
   * Statistics for custom signatures
   * A successful call to this API returns all the statistics of all the custom signatures for a report identified by the stat_id parameter. Said report contains all statistics for this alert triggered from signatures contained in all custom_signatures for the selected hour.
   * @param statId The ID of the stat to retrieve custom signature statistics for (required)
   * @param include Related objects that can be included in the response:  custom_signature, stat See Including Objects for more information. (optional)
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [stat_id, type_id]     (optional)
   * @param page Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. (optional, default to {:number=>1,+:size=>20})
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/stats/{stat_id}/custom_signatures.json_api")
  Call<PaginatedCollection> listForStat(
    @retrofit2.http.Path("stat_id") Integer statId, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page
  );

  /**
   * Show a single Stat Custom Signature
   * 
   * @param id Stat Custom Signature ID (required)
   * @param include Related objects that can be included in the response:  custom_signature, stat See Including Objects for more information. (optional)
   * @return Call&lt;StatCustomSignature&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/stats/custom_signatures/{id}.json_api")
  Call<StatCustomSignature> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

}
