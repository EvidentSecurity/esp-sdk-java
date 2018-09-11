package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.Integration;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface IntegrationsApi {
  /**
   * Delete a(n) Integration
   * Use this endpoint to destory any type of Integration.
   * @param id Integration ID (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/integrations/{id}.json_api")
  Call<Meta> delete(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Disable a single Integration
   * This will disable any type of Integration
   * @param id Integration ID (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @PATCH("api/v2/integrations/{id}/disable.json_api")
  Call<Meta> disable(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a list of Integrations
   * This will return a list of every type of Integration.
   * @param include Related objects that can be included in the response:  organization, creator, external_accounts, signatures, custom_signatures See Including Objects for more information. (optional)
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, organization_id, name, service_type] Matching Searchable Attributes: [name, service_type]   Searchable Associations: [teams, signatures, custom_signatures] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. (optional, default to {:number=>1,+:size=>20})
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/integrations.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Query("include") String include, @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page
  );

  /**
   * Show a single Integration
   * This will return any type of Integration.
   * @param id Integration ID (required)
   * @param include Related objects that can be included in the response:  organization, creator, external_accounts, signatures, custom_signatures See Including Objects for more information. (optional)
   * @return Call&lt;Integration&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/integrations/{id}.json_api")
  Call<Integration> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Test an Integration
   * This will test any type of Integration.
   * @param id Integration ID (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @POST("api/v2/integrations/{id}/test_notify.json_api")
  Call<Meta> testNotify(
    @retrofit2.http.Path("id") Integer id
  );

}
