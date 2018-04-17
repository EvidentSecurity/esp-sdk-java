# AttributionApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**show**](AttributionApi.md#show) | **GET** api/v2/alerts/{alert_id}/attribution.json_api | Show the attribution for an alert


<a name="show"></a>
# **show**
> Attribution show(alertId, include)

Show the attribution for an alert



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.AttributionApi;


AttributionApi apiInstance = new AttributionApi();
Integer alertId = 56; // Integer | The ID of the alert to retrieve user attribution for
String include = "include_example"; // String | Related objects that can be included in the response:  alert See Including Objects for more information.
try {
    Attribution result = apiInstance.show(alertId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttributionApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **Integer**| The ID of the alert to retrieve user attribution for |
 **include** | **String**| Related objects that can be included in the response:  alert See Including Objects for more information. | [optional]

### Return type

[**Attribution**](Attribution.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

