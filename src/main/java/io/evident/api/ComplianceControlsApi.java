package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.ComplianceControl;
import io.evident.models.PaginatedCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ComplianceControlsApi {
  /**
   * Get a list of Compliance Controls
   * 
   * @param include Related objects that can be included in the response:  compliance_standard, compliance_domain, signatures See Including Objects for more information. (optional)
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, identifier, name] Matching Searchable Attributes: [identifier, name]  Sortable Attributes: [id, identifier, name, position] Searchable Associations: [compliance_standard, compliance_domain] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. (optional, default to {:number=>1,+:size=>20})
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/compliance_controls.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Query("include") String include, @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page
  );

  /**
   * Get a list of Signatures for a Compliance Control
   * The compliance standard must be paid for to view signatures for a control on that standard.
   * @param complianceControlId The ID of the Compliance Control this signature belongs to (required)
   * @param include Related objects that can be included in the response:  service, suppressions See Including Objects for more information. (optional)
   * @param page Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. (optional, default to {:number=>1,+:size=>20})
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/compliance_controls/{compliance_control_id}/signatures.json_api")
  Call<PaginatedCollection> listSignatures(
    @retrofit2.http.Path("compliance_control_id") Integer complianceControlId, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("page") String page
  );

  /**
   * Show a single Compliance Control
   * 
   * @param id Compliance Control ID (required)
   * @param include Related objects that can be included in the response:  compliance_standard, compliance_domain, signatures See Including Objects for more information. (optional)
   * @return Call&lt;ComplianceControl&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/compliance_controls/{id}.json_api")
  Call<ComplianceControl> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

}
