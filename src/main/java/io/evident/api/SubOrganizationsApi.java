package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import io.evident.models.SubOrganization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface SubOrganizationsApi {
  /**
   * Create a(n) Sub Organization
   * 
   * @param name Name of the sub organization (required)
   * @param organizationId The ID of the organization this sub organization should belong to (required)
   * @param include Related objects that can be included in the response:  external_accounts, organization, teams See Including Objects for more information. (optional)
   * @return Call&lt;SubOrganization&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/sub_organizations.json_api")
  Call<SubOrganization> create(
    @retrofit2.http.Field("name") String name, @retrofit2.http.Field("organization_id") Integer organizationId, @retrofit2.http.Query("include") String include
  );

  /**
   * Delete a(n) Sub Organization
   * 
   * @param id Sub Organization ID (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/sub_organizations/{id}.json_api")
  Call<Meta> delete(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a list of Sub Organizations
   * 
   * @param include Related objects that can be included in the response:  external_accounts, organization, teams See Including Objects for more information. (optional)
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, name] Matching Searchable Attribute: [name]  Sortable Attributes: [name, updated_at, created_at, id] Searchable Association: [organization] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. (optional, default to {:number=>1,+:size=>20})
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/sub_organizations.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Query("include") String include, @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page
  );

  /**
   * Show a single Sub Organization
   * 
   * @param id Sub Organization ID (required)
   * @param include Related objects that can be included in the response:  external_accounts, organization, teams See Including Objects for more information. (optional)
   * @return Call&lt;SubOrganization&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/sub_organizations/{id}.json_api")
  Call<SubOrganization> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a(n) Sub Organization
   * 
   * @param id Sub Organization ID (required)
   * @param include Related objects that can be included in the response:  external_accounts, organization, teams See Including Objects for more information. (optional)
   * @param name Name of the sub organization (optional)
   * @return Call&lt;SubOrganization&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/sub_organizations/{id}.json_api")
  Call<SubOrganization> update(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("name") String name
  );

}
