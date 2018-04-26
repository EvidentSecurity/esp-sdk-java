package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.PaginatedCollection;
import io.evident.models.Region;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface RegionsApi {
  /**
   * Get a list of Regions
   * 
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, code, name] Matching Searchable Attributes: [code, name] Limited Searchable Attribute: [provider_eq]  Searchable Association: [suppressions] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. (optional, default to {:number=>1,+:size=>20})
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/regions.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page
  );

  /**
   * Show a single Region
   * 
   * @param id Region ID (required)
   * @return Call&lt;Region&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/regions/{id}.json_api")
  Call<Region> show(
    @retrofit2.http.Path("id") Integer id
  );

}
