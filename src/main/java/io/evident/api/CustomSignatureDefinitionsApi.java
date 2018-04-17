package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.CustomSignatureDefinition;
import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface CustomSignatureDefinitionsApi {
  /**
   * Activate a Custom Signature Definition
   * A successful call to this API marks the definition for activation.  The definition will go into the &#39;validating&#39; state and will be tested before activating. The definition must have a status of editable to be activated.
   * @param customSignatureDefinitionId ID of Custom Signature Definition (required)
   * @param include Related objects that can be included in the response:  custom_signature, results See Including Objects for more information. (optional)
   * @return Call&lt;CustomSignatureDefinition&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @PATCH("api/v2/custom_signature_definitions/{custom_signature_definition_id}/activate.json_api")
  Call<CustomSignatureDefinition> activate(
    @retrofit2.http.Path("custom_signature_definition_id") Integer customSignatureDefinitionId, @retrofit2.http.Query("include") String include
  );

  /**
   * Archive a Custom Signature Definition
   * A successful call to this API archives and returns a specific custom signature definition identified by the id parameter. The definition must have a status of active to be archived.
   * @param customSignatureDefinitionId ID of Custom Signature Definition (required)
   * @param include Related objects that can be included in the response:  custom_signature, results See Including Objects for more information. (optional)
   * @return Call&lt;CustomSignatureDefinition&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @PATCH("api/v2/custom_signature_definitions/{custom_signature_definition_id}/archive.json_api")
  Call<CustomSignatureDefinition> archive(
    @retrofit2.http.Path("custom_signature_definition_id") Integer customSignatureDefinitionId, @retrofit2.http.Query("include") String include
  );

  /**
   * Create a(n) Custom Signature Definition
   * 
   * @param customSignatureId ID of the custom signature this definition belongs to (required)
   * @param include Related objects that can be included in the response:  custom_signature, results See Including Objects for more information. (optional)
   * @return Call&lt;CustomSignatureDefinition&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/custom_signature_definitions.json_api")
  Call<CustomSignatureDefinition> create(
    @retrofit2.http.Field("custom_signature_id") Integer customSignatureId, @retrofit2.http.Query("include") String include
  );

  /**
   * Delete a(n) Custom Signature Definition
   * 
   * @param id  ID (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/custom_signature_definitions/{id}.json_api")
  Call<Meta> delete(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a list of Custom Signature Definitions
   * 
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, language, status, version_number]    Searchable Association: [custom_signature] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  custom_signature, results See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/custom_signature_definitions.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Show a single Custom Signature Definition
   * 
   * @param id Custom Signature Definition ID (required)
   * @param include Related objects that can be included in the response:  custom_signature, results See Including Objects for more information. (optional)
   * @return Call&lt;CustomSignatureDefinition&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/custom_signature_definitions/{id}.json_api")
  Call<CustomSignatureDefinition> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a(n) Custom Signature Definition
   * 
   * @param id Custom Signature Definition ID (required)
   * @param code The code for this definition (optional)
   * @param language The language of the definition. Valid values are ruby, javascript (optional)
   * @param include Related objects that can be included in the response:  custom_signature, results See Including Objects for more information. (optional)
   * @return Call&lt;CustomSignatureDefinition&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/custom_signature_definitions/{id}.json_api")
  Call<CustomSignatureDefinition> update(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Field("code") String code, @retrofit2.http.Field("language") String language, @retrofit2.http.Query("include") String include
  );

}
