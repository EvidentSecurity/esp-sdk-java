package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.PaginatedCollection;
import io.evident.models.Report;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ReportsApi {
  /**
   * Create a(n) Report
   * 
   * @param teamId The ID of the team to create a report for (required)
   * @param include Related objects that can be included in the response:  organization, sub_organization, team, external_account, stat See Including Objects for more information. (optional)
   * @return Call&lt;Report&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/reports.json_api")
  Call<Report> create(
    @retrofit2.http.Field("team_id") Integer teamId, @retrofit2.http.Query("include") String include
  );

  /**
   * Get a list of Reports
   * 
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, created_at]  Limited Searchable Attributes: [external_account_arn_eq, external_account_provider_eq] Sortable Attributes: [created_at, id] Searchable Associations: [organization, sub_organization, team, external_account] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  organization, sub_organization, team, external_account, stat See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/reports.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Show a single Report
   * 
   * @param id Report ID (required)
   * @param include Related objects that can be included in the response:  organization, sub_organization, team, external_account, stat See Including Objects for more information. (optional)
   * @return Call&lt;Report&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/reports/{id}.json_api")
  Call<Report> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

}
