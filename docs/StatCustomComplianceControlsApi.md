# StatCustomComplianceControlsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listForStat**](StatCustomComplianceControlsApi.md#listForStat) | **GET** api/v2/stats/{stat_id}/custom_compliance_controls.json_api | Stats for custom compliance controls
[**show**](StatCustomComplianceControlsApi.md#show) | **GET** api/v2/stats/custom_compliance_controls/{id}.json_api | Show a single Stat Custom Compliance Control


<a name="listForStat"></a>
# **listForStat**
> PaginatedCollection listForStat(statId, page, include)

Stats for custom compliance controls

A successful call to this API returns all the stats of all the custom compliance controls for a report identified by the stat_id parameter. Said report contains all statistics for this alert triggered from signatures contained in all custom compliance controls for the selected hour.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.StatCustomComplianceControlsApi;


StatCustomComplianceControlsApi apiInstance = new StatCustomComplianceControlsApi();
Integer statId = 56; // Integer | The ID of the stat to retrieve custom compliance control stats for
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  custom_compliance_control, stat See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.listForStat(statId, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatCustomComplianceControlsApi#listForStat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statId** | **Integer**| The ID of the stat to retrieve custom compliance control stats for |
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  custom_compliance_control, stat See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> StatCustomComplianceControl show(id, include)

Show a single Stat Custom Compliance Control



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.StatCustomComplianceControlsApi;


StatCustomComplianceControlsApi apiInstance = new StatCustomComplianceControlsApi();
Integer id = 56; // Integer | Stat Custom Compliance Control ID
String include = "include_example"; // String | Related objects that can be included in the response:  custom_compliance_control, stat See Including Objects for more information.
try {
    StatCustomComplianceControl result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatCustomComplianceControlsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Stat Custom Compliance Control ID |
 **include** | **String**| Related objects that can be included in the response:  custom_compliance_control, stat See Including Objects for more information. | [optional]

### Return type

[**StatCustomComplianceControl**](StatCustomComplianceControl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

