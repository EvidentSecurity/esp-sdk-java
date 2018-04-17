package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.ContactRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ContactRequestsApi {
  /**
   * Create a(n) Contact Request
   * 
   * @param title Subject of your message (required)
   * @param description Body of your message (required)
   * @param requestType Type of contact request. Valid values are support, feature (required)
   * @param include Related objects that can be included in the response:  user See Including Objects for more information. (optional)
   * @return Call&lt;ContactRequest&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/contact_requests.json_api")
  Call<ContactRequest> create(
    @retrofit2.http.Field("title") String title, @retrofit2.http.Field("description") String description, @retrofit2.http.Field("request_type") String requestType, @retrofit2.http.Query("include") String include
  );

}
