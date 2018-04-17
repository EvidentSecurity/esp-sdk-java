# MetadataApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**forAlert**](MetadataApi.md#forAlert) | **GET** api/v2/alerts/{alert_id}/metadata.json_api | Show the metadata for an alert
[**show**](MetadataApi.md#show) | **GET** api/v2/metadata/{id}.json_api | Show a single Metadata


<a name="forAlert"></a>
# **forAlert**
> Metadata forAlert(alertId, include)

Show the metadata for an alert



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.MetadataApi;


MetadataApi apiInstance = new MetadataApi();
Integer alertId = 56; // Integer | Alert Id
String include = "include_example"; // String | Related objects that can be included in the response:   See Including Objects for more information.
try {
    Metadata result = apiInstance.forAlert(alertId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataApi#forAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **Integer**| Alert Id |
 **include** | **String**| Related objects that can be included in the response:   See Including Objects for more information. | [optional]

### Return type

[**Metadata**](Metadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> Metadata show(id, include)

Show a single Metadata



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.MetadataApi;


MetadataApi apiInstance = new MetadataApi();
Integer id = 56; // Integer | Metadata ID
String include = "include_example"; // String | Related objects that can be included in the response:   See Including Objects for more information.
try {
    Metadata result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Metadata ID |
 **include** | **String**| Related objects that can be included in the response:   See Including Objects for more information. | [optional]

### Return type

[**Metadata**](Metadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

