package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.CustomComplianceStandard;
import io.evident.models.Meta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface CustomComplianceStandardsApi {
  /**
   * Create a(n) Custom Compliance Standard
   * 
   * @param description The description for this Compliance Standard (required)
   * @param name Name (required)
   * @param include Related objects that can be included in the response:  custom_compliance_domains, custom_compliance_controls See Including Objects for more information. (optional)
   * @return Call&lt;CustomComplianceStandard&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/custom_compliance_standards.json_api")
  Call<CustomComplianceStandard> create(
    @retrofit2.http.Field("description") String description, @retrofit2.http.Field("name") String name, @retrofit2.http.Query("include") String include
  );

  /**
   * Delete a(n) Custom Compliance Standard
   * 
   * @param id Custom Compliance Standard ID (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/custom_compliance_standards/{id}.json_api")
  Call<Meta> delete(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Show a single Custom Compliance Standard
   * 
   * @param id Custom Compliance Standard ID (required)
   * @param include Related objects that can be included in the response:  custom_compliance_domains, custom_compliance_controls See Including Objects for more information. (optional)
   * @return Call&lt;CustomComplianceStandard&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/custom_compliance_standards/{id}.json_api")
  Call<CustomComplianceStandard> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a(n) Custom Compliance Standard
   * 
   * @param id Custom Compliance Standard ID (required)
   * @param include Related objects that can be included in the response:  custom_compliance_domains, custom_compliance_controls See Including Objects for more information. (optional)
   * @param description The description for this Compliance Standard (optional)
   * @param name Name (optional)
   * @return Call&lt;CustomComplianceStandard&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/custom_compliance_standards/{id}.json_api")
  Call<CustomComplianceStandard> update(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("description") String description, @retrofit2.http.Field("name") String name
  );

}
