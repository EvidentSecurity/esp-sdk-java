package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.Meta;
import io.evident.models.PaginatedCollection;
import io.evident.models.ScanInterval;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ScanIntervalsApi {
  /**
   * Create a(n) Scan Interval
   * 
   * @param externalAccountId The ID of the external account this scan interval is for (required)
   * @param interval The interval, in minutes, this service will be scanned (required)
   * @param serviceId The service ID for the scan interval (required)
   * @param include Related objects that can be included in the response:  external_account, service See Including Objects for more information. (optional)
   * @return Call&lt;ScanInterval&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/scan_intervals.json_api")
  Call<ScanInterval> create(
    @retrofit2.http.Field("external_account_id") Integer externalAccountId, @retrofit2.http.Field("interval") Integer interval, @retrofit2.http.Field("service_id") Integer serviceId, @retrofit2.http.Query("include") String include
  );

  /**
   * Delete a(n) Scan Interval
   * 
   * @param id  ID (required)
   * @return Call&lt;Meta&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @DELETE("api/v2/scan_intervals/{id}.json_api")
  Call<Meta> delete(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a list of Scan Intervals
   * 
   * @param externalAccountId The ID of the external account to retrieve (required)
   * @param page Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page (optional, default to {:number=>1,+:size=>20})
   * @param include Related objects that can be included in the response:  external_account, service See Including Objects for more information. (optional)
   * @return Call&lt;PaginatedCollection&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @GET("api/v2/external_accounts/{external_account_id}/scan_intervals.json_api")
  Call<PaginatedCollection> listForExternalAccount(
    @retrofit2.http.Path("external_account_id") Integer externalAccountId, @retrofit2.http.Field("page") String page, @retrofit2.http.Query("include") String include
  );

  /**
   * Show a single Scan Interval
   * 
   * @param id Scan Interval ID (required)
   * @param include Related objects that can be included in the response:  external_account, service See Including Objects for more information. (optional)
   * @return Call&lt;ScanInterval&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/scan_intervals/{id}.json_api")
  Call<ScanInterval> show(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a(n) Scan Interval
   * 
   * @param id Scan Interval ID (required)
   * @param externalAccountId The ID of the external account this scan interval is for (optional)
   * @param interval The interval, in minutes, this service will be scanned (optional)
   * @param serviceId The service ID for the scan interval (optional)
   * @param include Related objects that can be included in the response:  external_account, service See Including Objects for more information. (optional)
   * @return Call&lt;ScanInterval&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/scan_intervals/{id}.json_api")
  Call<ScanInterval> update(
    @retrofit2.http.Path("id") Integer id, @retrofit2.http.Field("external_account_id") Integer externalAccountId, @retrofit2.http.Field("interval") Integer interval, @retrofit2.http.Field("service_id") Integer serviceId, @retrofit2.http.Query("include") String include
  );

}
