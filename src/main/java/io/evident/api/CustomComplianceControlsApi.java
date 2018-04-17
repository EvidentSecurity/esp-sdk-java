package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.CustomComplianceControl;
import io.evident.models.CustomSignature;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import io.evident.models.Signature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface CustomComplianceControlsApi {
  /**
   * Add a Custom Signature to a Custom Compliance Control
   * 
   * @param customComplianceControlId The ID of the Custom Compliance Control this custom signature belongs to (required)
   * @param customSignatureId The ID of the custom signature that belongs to this custom control (required)
   * @param include Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions See Including Objects for more information. (optional)
   * @return Call&lt;CustomSignature&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/custom_compliance_controls/{custom_compliance_control_id}/custom_signatures.json_api")
  Call<CustomSignature> addCustomSignature(
    @retrofit2.http.Path("custom_compliance_control_id") Integer customComplianceControlId, @retrofit2.http.Field("custom_signature_id") Integer customSignatureId, @retrofit2.http.Query("include") String include
  );

  /**
   * Add a Signature to a Custom Compliance Control
   * 
   * @param customComplianceControlId The ID of the Custom Compliance Control this signature belongs to (required)
   * @param signatureId The ID of the signature that belongs to this custom control (required)
   * @param include Related objects that can be included in the response:  service, suppressions See Including Objects for more information. (optional)
   * @return Call&lt;Signature&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/custom_compliance_controls/{custom_compliance_control_id}/signatures.json_api")
  Call<Signature> addSignature(
    @retrofit2.http.Path("custom_compliance_control_id") Integer customComplianceControlId, @retrofit2.http.Field("signature_id") Integer signatureId, @retrofit2.http.Query("include") String include
  );

  /**
   * Create a(n) Custom Compliance Control
   * 
   * @param identifier The identifier of this custom control (required)
   * @param customComplianceDomainId The ID of the Custom Compliance Domain this custom control belongs to (required)
   * @param name Name (required)
   * @param description The description for this custom control (optional)
   * @param position The position of this custom control within the custom domain (optional)
   * @param signatureIds An array of signatures identified by signature_id that belong to this custom control (optional)
   * @param customSignatureIds An array of custom signatures identified by custom_signature_id that belong to this custom control (optional)
   * @param include Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_domain, signatures, custom_signatures See Including Objects for more information. (optional)
   * @return Call&lt;CustomComplianceControl&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/custom_compliance_controls.json_api")
  Call<CustomComplianceControl> create(
    @retrofit2.http.Field("identifier") String identifier, @retrofit2.http.Field("custom_compliance_domain_id") Integer customComplianceDomainId, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("description") String description, @retrofit2.http.Field("position") Integer position, @retrofit2.http.Field("signature_ids") List<Integer> signatureIds, @retrofit2.http.Field("custom_signature_ids") List<Integer> customSignatureIds, @retrofit2.http.Query("include") String include
  );

  /**
   * Delete a(n) Custom Compliance Control
   * 
   * @param id  ID (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/custom_compliance_controls/{id}.json_api")
  Call<Meta> delete(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a list of Custom Signatures for a Custom Compliance Control
   * 
   * @param customComplianceControlId The ID of the Custom Compliance Control this custom signature belongs to (required)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/custom_compliance_controls/{custom_compliance_control_id}/custom_signatures.json_api")
  Call<PaginatedCollection> listCustomSignatures(
    @retrofit2.http.Path("custom_compliance_control_id") Integer customComplianceControlId, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Get a list of Signatures for a Custom Compliance Control
   * 
   * @param customComplianceControlId The ID of the Custom Compliance Control this signature belongs to (required)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  service, suppressions See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/custom_compliance_controls/{custom_compliance_control_id}/signatures.json_api")
  Call<PaginatedCollection> listSignatures(
    @retrofit2.http.Path("custom_compliance_control_id") Integer customComplianceControlId, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Remove a Custom Signature from a Custom Compliance Control
   * 
   * @param customComplianceControlId The ID of the Custom Compliance Control this custom signature belongs to (required)
   * @param customSignatureId The ID of the custom signature that belongs to this custom control (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/custom_compliance_controls/{custom_compliance_control_id}/custom_signatures/{custom_signature_id}.json_api")
  Call<Meta> removeCustomSignature(
    @retrofit2.http.Path("custom_compliance_control_id") Integer customComplianceControlId, @retrofit2.http.Path("custom_signature_id") Integer customSignatureId
  );

  /**
   * Remove a Signature from a Custom Compliance Control
   * 
   * @param customComplianceControlId The ID of the Custom Compliance Control this signature belongs to (required)
   * @param signatureId The ID of the signature that belongs to this custom control (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/custom_compliance_controls/{custom_compliance_control_id}/signatures/{signature_id}.json_api")
  Call<Meta> removeSignature(
    @retrofit2.http.Path("custom_compliance_control_id") Integer customComplianceControlId, @retrofit2.http.Path("signature_id") Integer signatureId
  );

  /**
   * Show a single Custom Compliance Control
   * 
   * @param id Custom Compliance Control ID (required)
   * @param include Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_domain, signatures, custom_signatures See Including Objects for more information. (optional)
   * @return Call&lt;CustomComplianceControl&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/custom_compliance_controls/{id}.json_api")
  Call<CustomComplianceControl> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a(n) Custom Compliance Control
   * 
   * @param id Custom Compliance Control ID (required)
   * @param identifier The identifier of this custom control (optional)
   * @param customComplianceDomainId The ID of the Custom Compliance Domain this custom control belongs to (optional)
   * @param description The description for this custom control (optional)
   * @param name Name (optional)
   * @param position The position of this custom control within the custom domain (optional)
   * @param signatureIds An array of signatures identified by signature_id that belong to this custom control (optional)
   * @param customSignatureIds An array of custom signatures identified by custom_signature_id that belong to this custom control (optional)
   * @param include Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_domain, signatures, custom_signatures See Including Objects for more information. (optional)
   * @return Call&lt;CustomComplianceControl&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/custom_compliance_controls/{id}.json_api")
  Call<CustomComplianceControl> update(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Field("identifier") String identifier, @retrofit2.http.Field("custom_compliance_domain_id") Integer customComplianceDomainId, @retrofit2.http.Field("description") String description, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("position") Integer position, @retrofit2.http.Field("signature_ids") List<Integer> signatureIds, @retrofit2.http.Field("custom_signature_ids") List<Integer> customSignatureIds, @retrofit2.http.Query("include") String include
  );

}
