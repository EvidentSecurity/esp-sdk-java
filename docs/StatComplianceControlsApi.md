# StatComplianceControlsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listForStat**](StatComplianceControlsApi.md#listForStat) | **GET** api/v2/stats/{stat_id}/compliance_controls.json_api | Statistics for compliance controls
[**show**](StatComplianceControlsApi.md#show) | **GET** api/v2/stats/compliance_controls/{id}.json_api | Show a single Stat Compliance Control


<a name="listForStat"></a>
# **listForStat**
> PaginatedCollection listForStat(statId, include, filter, page)

Statistics for compliance controls

A successful call to this API returns all the statistics of all the compliance controls for a report identified by the stat_id parameter. Said report contains all statistics for this alert triggered from signatures contained in all compliance controls for the selected hour.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.StatComplianceControlsApi;


StatComplianceControlsApi apiInstance = new StatComplianceControlsApi();
Integer statId = 56; // Integer | The ID of the stat to retrieve compliance control statistics for
String include = "include_example"; // String | Related objects that can be included in the response:  compliance_control, stat See Including Objects for more information.
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [stat_id, type_id]    
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.listForStat(statId, include, filter, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatComplianceControlsApi#listForStat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statId** | **Integer**| The ID of the stat to retrieve compliance control statistics for |
 **include** | **String**| Related objects that can be included in the response:  compliance_control, stat See Including Objects for more information. | [optional]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [stat_id, type_id]     | [optional]
 **page** | **String**| Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> StatComplianceControl show(id, include)

Show a single Stat Compliance Control



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.StatComplianceControlsApi;


StatComplianceControlsApi apiInstance = new StatComplianceControlsApi();
Integer id = 56; // Integer | Stat Compliance Control ID
String include = "include_example"; // String | Related objects that can be included in the response:  compliance_control, stat See Including Objects for more information.
try {
    StatComplianceControl result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatComplianceControlsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Stat Compliance Control ID |
 **include** | **String**| Related objects that can be included in the response:  compliance_control, stat See Including Objects for more information. | [optional]

### Return type

[**StatComplianceControl**](StatComplianceControl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

