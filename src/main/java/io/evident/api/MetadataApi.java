package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.Metadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MetadataApi {
  /**
   * Show the metadata for an alert
   * 
   * @param alertId Alert Id (required)
   * @return Call&lt;Metadata&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/alerts/{alert_id}/metadata.json_api")
  Call<Metadata> forAlert(
    @retrofit2.http.Path("alert_id") Integer alertId
  );

  /**
   * Show a single Metadata
   * 
   * @param id Metadata ID (required)
   * @return Call&lt;Metadata&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/metadata/{id}.json_api")
  Call<Metadata> show(
    @retrofit2.http.Path("id") Integer id
  );

}
