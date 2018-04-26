package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.CustomComplianceDomain;
import io.evident.models.Meta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface CustomComplianceDomainsApi {
  /**
   * Create a(n) Custom Compliance Domain
   * 
   * @param customComplianceStandardId The ID of the Custom Compliance Standard this custom domain belongs to (required)
   * @param identifier The identifier of this custom domain (required)
   * @param name Name (required)
   * @param include Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_controls See Including Objects for more information. (optional)
   * @param position The position of this custom domain within the custom standard (optional)
   * @return Call&lt;CustomComplianceDomain&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/custom_compliance_domains.json_api")
  Call<CustomComplianceDomain> create(
    @retrofit2.http.Field("custom_compliance_standard_id") Integer customComplianceStandardId, @retrofit2.http.Field("identifier") String identifier, @retrofit2.http.Field("name") String name, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("position") Integer position
  );

  /**
   * Delete a(n) Custom Compliance Domain
   * 
   * @param id Custom Compliance Domain ID (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/custom_compliance_domains/{id}.json_api")
  Call<Meta> delete(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Show a single Custom Compliance Domain
   * 
   * @param id Custom Compliance Domain ID (required)
   * @param include Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_controls See Including Objects for more information. (optional)
   * @return Call&lt;CustomComplianceDomain&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/custom_compliance_domains/{id}.json_api")
  Call<CustomComplianceDomain> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a(n) Custom Compliance Domain
   * 
   * @param id Custom Compliance Domain ID (required)
   * @param include Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_controls See Including Objects for more information. (optional)
   * @param customComplianceStandardId The ID of the Custom Compliance Standard this custom domain belongs to (optional)
   * @param identifier The identifier of this custom domain (optional)
   * @param name Name (optional)
   * @param position The position of this custom domain within the custom standard (optional)
   * @return Call&lt;CustomComplianceDomain&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/custom_compliance_domains/{id}.json_api")
  Call<CustomComplianceDomain> update(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("custom_compliance_standard_id") Integer customComplianceStandardId, @retrofit2.http.Field("identifier") String identifier, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("position") Integer position
  );

}
