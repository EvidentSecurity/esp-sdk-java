package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import io.evident.models.Team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface TeamsApi {
  /**
   * Create a(n) Team
   * 
   * @param name Name of the team (required)
   * @param subOrganizationId The ID of the sub organization to attach this team to (required)
   * @param include Related objects that can be included in the response:  custom_signatures, external_accounts, organization, sub_organization See Including Objects for more information. (optional)
   * @param reportInterval The interval period in hours for Evident.io to run reports (optional)
   * @return Call&lt;Team&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/teams.json_api")
  Call<Team> create(
    @retrofit2.http.Field("name") String name, @retrofit2.http.Field("sub_organization_id") Integer subOrganizationId, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("report_interval") Integer reportInterval
  );

  /**
   * Delete a(n) Team
   * 
   * @param id Team ID (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/teams/{id}.json_api")
  Call<Meta> delete(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a list of Teams
   * 
   * @param include Related objects that can be included in the response:  custom_signatures, external_accounts, organization, sub_organization See Including Objects for more information. (optional)
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, name] Matching Searchable Attribute: [name]  Sortable Attributes: [name, updated_at, created_at, id] Searchable Associations: [organization, sub_organization, custom_signatures, integrations] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. (optional, default to {:number=>1,+:size=>20})
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/teams.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Query("include") String include, @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page
  );

  /**
   * Show a single Team
   * 
   * @param id Team ID (required)
   * @param include Related objects that can be included in the response:  custom_signatures, external_accounts, organization, sub_organization See Including Objects for more information. (optional)
   * @return Call&lt;Team&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/teams/{id}.json_api")
  Call<Team> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a(n) Team
   * 
   * @param id Team ID (required)
   * @param include Related objects that can be included in the response:  custom_signatures, external_accounts, organization, sub_organization See Including Objects for more information. (optional)
   * @param name Name of the team (optional)
   * @param reportInterval The interval period in hours for Evident.io to run reports (optional)
   * @return Call&lt;Team&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/teams/{id}.json_api")
  Call<Team> update(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("report_interval") Integer reportInterval
  );

}
