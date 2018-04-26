package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.AuditLog;
import io.evident.models.PaginatedCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AuditLogsApi {
  /**
   * Get a list of Audit Logs
   * 
   * @param include Related objects that can be included in the response:  organization, user See Including Objects for more information. (optional)
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, item_id, item_type] Matching Searchable Attribute: [item_type]  Sortable Attribute: [id] Searchable Associations: [user, organization] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. (optional, default to {:number=>1,+:size=>20})
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/audit_logs.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Query("include") String include, @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page
  );

  /**
   * Show a single Audit Log
   * 
   * @param id Audit Log ID (required)
   * @param include Related objects that can be included in the response:  organization, user See Including Objects for more information. (optional)
   * @return Call&lt;AuditLog&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/audit_logs/{id}.json_api")
  Call<AuditLog> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

}
