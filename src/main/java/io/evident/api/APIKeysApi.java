package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.ApiKey;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface APIKeysApi {
  /**
   * Create a(n) API Key
   * The secret key will only be returned once when the key is first created
   * @param include Related objects that can be included in the response:  user See Including Objects for more information. (optional)
   * @param name The name of the API Key (optional)
   * @return Call&lt;ApiKey&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/api_keys.json_api")
  Call<ApiKey> create(
    @retrofit2.http.Query("include") String include, @retrofit2.http.Field("name") String name
  );

  /**
   * Delete a(n) API Key
   * 
   * @param id API Key ID (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/api_keys/{id}.json_api")
  Call<Meta> delete(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a list of API Keys
   * 
   * @param include Related objects that can be included in the response:  user See Including Objects for more information. (optional)
   * @param page Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. (optional, default to {:number=>1,+:size=>20})
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/api_keys.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Query("include") String include, @retrofit2.http.Field("page") String page
  );

  /**
   * Show a single API Key
   * 
   * @param id API Key ID (required)
   * @param include Related objects that can be included in the response:  user See Including Objects for more information. (optional)
   * @return Call&lt;ApiKey&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/api_keys/{id}.json_api")
  Call<ApiKey> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a(n) API Key
   * 
   * @param id API Key ID (required)
   * @param include Related objects that can be included in the response:  user See Including Objects for more information. (optional)
   * @param name The name of the API Key (optional)
   * @return Call&lt;ApiKey&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/api_keys/{id}.json_api")
  Call<ApiKey> update(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("name") String name
  );

}
