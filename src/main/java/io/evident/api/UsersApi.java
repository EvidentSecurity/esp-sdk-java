package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import io.evident.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface UsersApi {
  /**
   * Create a(n) User
   * 
   * @param firstName The first name of the user (required)
   * @param lastName The last name of the user (required)
   * @param email The email of the user (required)
   * @param roleId The ID of the role of the user (optional)
   * @param subOrganizationIds A list of sub organization IDs that the user should have access to (optional)
   * @param teamIds A list of team IDs that the user should have access to (optional)
   * @param disableDailyEmails Specifies whether the daily emails should be turned off or not (optional)
   * @param phone The phone number of the user (optional)
   * @param timeZone The time zone of the user. See Time Zones for a list of valid time zones (optional)
   * @param include Related objects that can be included in the response:  organization, sub_organizations, teams, role See Including Objects for more information. (optional)
   * @return Call&lt;User&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/users.json_api")
  Call<User> create(
    @retrofit2.http.Field("first_name") String firstName, @retrofit2.http.Field("last_name") String lastName, @retrofit2.http.Field("email") String email, @retrofit2.http.Field("role_id") Integer roleId, @retrofit2.http.Field("sub_organization_ids") List<Integer> subOrganizationIds, @retrofit2.http.Field("team_ids") List<Integer> teamIds, @retrofit2.http.Field("disable_daily_emails") Boolean disableDailyEmails, @retrofit2.http.Field("phone") String phone, @retrofit2.http.Field("time_zone") String timeZone, @retrofit2.http.Query("include") String include
  );

  /**
   * Delete a(n) User
   * The users current password is required when deleting yourself.
   * @param id  ID (required)
   * @param currentPassword The user&#39;s currently stored password (optional)
   * @return Call&lt;Meta&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @DELETE("api/v2/users/{id}.json_api")
  Call<Meta> delete(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Field("current_password") String currentPassword
  );

  /**
   * Get a list of Users
   * 
   * @param filter Filter Params for Searching.  Equality Searchable Attributes: [id, email] Matching Searchable Attribute: [email]  Sortable Attributes: [email, current_sign_in_at, updated_at, created_at, id] Searchable Associations: [role, organization, sub_organizations, teams] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. (optional)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  organization, sub_organizations, teams, role See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PUT("api/v2/users.json_api")
  Call<PaginatedCollection> list(
    @retrofit2.http.Field("filter") Map<String, String> filter, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Show a single User
   * 
   * @param id User ID (required)
   * @param include Related objects that can be included in the response:  organization, sub_organizations, teams, role See Including Objects for more information. (optional)
   * @return Call&lt;User&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/users/{id}.json_api")
  Call<User> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a(n) User
   * 
   * @param id User ID (required)
   * @param firstName The first name of the user (optional)
   * @param lastName The last name of the user (optional)
   * @param email The email of the user (optional)
   * @param roleId The ID of the role of the user (optional)
   * @param subOrganizationIds A list of sub organization IDs that the user should have access to (optional)
   * @param teamIds A list of team IDs that the user should have access to (optional)
   * @param disableDailyEmails Specifies whether the daily emails should be turned off or not (optional)
   * @param phone The phone number of the user (optional)
   * @param timeZone The time zone of the user. See Time Zones for a list of valid time zones (optional)
   * @param include Related objects that can be included in the response:  organization, sub_organizations, teams, role See Including Objects for more information. (optional)
   * @return Call&lt;User&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/users/{id}.json_api")
  Call<User> update(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Field("first_name") String firstName, @retrofit2.http.Field("last_name") String lastName, @retrofit2.http.Field("email") String email, @retrofit2.http.Field("role_id") Integer roleId, @retrofit2.http.Field("sub_organization_ids") List<Integer> subOrganizationIds, @retrofit2.http.Field("team_ids") List<Integer> teamIds, @retrofit2.http.Field("disable_daily_emails") Boolean disableDailyEmails, @retrofit2.http.Field("phone") String phone, @retrofit2.http.Field("time_zone") String timeZone, @retrofit2.http.Query("include") String include
  );

}
