package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.PaginatedCollection;
import io.evident.models.StatCustomComplianceControl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface StatCustomComplianceControlsApi {
  /**
   * Stats for custom compliance controls
   * A successful call to this API returns all the stats of all the custom compliance controls for a report identified by the stat_id parameter. Said report contains all statistics for this alert triggered from signatures contained in all custom compliance controls for the selected hour.
   * @param statId The ID of the stat to retrieve custom compliance control stats for (required)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  custom_compliance_control, stat See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/stats/{stat_id}/custom_compliance_controls.json_api")
  Call<PaginatedCollection> listForStat(
    @retrofit2.http.Path("stat_id") Integer statId, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Show a single Stat Custom Compliance Control
   * 
   * @param id Stat Custom Compliance Control ID (required)
   * @param include Related objects that can be included in the response:  custom_compliance_control, stat See Including Objects for more information. (optional)
   * @return Call&lt;StatCustomComplianceControl&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/stats/custom_compliance_controls/{id}.json_api")
  Call<StatCustomComplianceControl> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

}
