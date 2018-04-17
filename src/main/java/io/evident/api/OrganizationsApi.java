package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.Organization;
import io.evident.models.PaginatedCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface OrganizationsApi {
  /**
   * Get a list of Organizations
   * 
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, name] Matching Searchable Attribute: [name]  Sortable Attributes: [name, updated_at, created_at, id]  (optional)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  subscription, custom_signatures, external_accounts, sub_organizations, teams, users, compliance_standards, integrations See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/organizations.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Get a list of compliance standards for an organization
   * 
   * @param organizationId The ID of the organization this compliance standard belongs to (required)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  compliance_domains, compliance_controls See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/organizations/{organization_id}/compliance_standards.json_api")
  Call<PaginatedCollection> listComplianceStandards(
    @retrofit2.http.Path("organization_id") Integer organizationId, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Show a single Organization
   * 
   * @param id Organization ID (required)
   * @param include Related objects that can be included in the response:  subscription, custom_signatures, external_accounts, sub_organizations, teams, users, compliance_standards, integrations See Including Objects for more information. (optional)
   * @return Call&lt;Organization&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/organizations/{id}.json_api")
  Call<Organization> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a(n) Organization
   * 
   * @param id Organization ID (required)
   * @param name Name of the organization (optional)
   * @param requireMfa Whether or not users for this organization are required to enable Multi Factor Authentication (optional)
   * @param include Related objects that can be included in the response:  subscription, custom_signatures, external_accounts, sub_organizations, teams, users, compliance_standards, integrations See Including Objects for more information. (optional)
   * @return Call&lt;Organization&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/organizations/{id}.json_api")
  Call<Organization> update(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("require_mfa") Boolean requireMfa, @retrofit2.http.Query("include") String include
  );

}
