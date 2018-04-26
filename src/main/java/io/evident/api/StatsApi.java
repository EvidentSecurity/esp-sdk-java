package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.PaginatedCollection;
import io.evident.models.Stat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface StatsApi {
  /**
   * Stats for a report
   * A successful call to this API returns all the stats of all the alerts for a report identified by the report_id parameter. Said report contains all statistics for this alert triggered from signatures contained in all regions for the selected hour.
   * @param reportId The ID of the report to retrieve stats for (required)
   * @param include Related objects that can be included in the response:  report, regions, services, signatures, custom_signatures, custom_compliance_controls, compliance_controls See Including Objects for more information. (optional)
   * @return Call&lt;Stat&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/reports/{report_id}/stats.json_api")
  Call<Stat> forReport(
    @retrofit2.http.Path("report_id") Integer reportId, @retrofit2.http.Query("include") String include
  );

  /**
   * Statistics for teams
   * A successful call to this API returns all the statistics for the most recent report of each team accessible by the given API key
   * @param include Related objects that can be included in the response:  report, regions, services, signatures, custom_signatures, custom_compliance_controls, compliance_controls See Including Objects for more information. (optional)
   * @param filter Filter Params for Searching.      Searchable Association: [report] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. (optional, default to {:number=>1,+:size=>20})
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/stats/latest_for_teams.json_api")
  Call<PaginatedCollection> latestForTeams(
    @retrofit2.http.Query("include") String include, @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page
  );

  /**
   * Show a single Stat
   * 
   * @param id Stat ID (required)
   * @param include Related objects that can be included in the response:  report, regions, services, signatures, custom_signatures, custom_compliance_controls, compliance_controls See Including Objects for more information. (optional)
   * @return Call&lt;Stat&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/stats/{id}.json_api")
  Call<Stat> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

}
