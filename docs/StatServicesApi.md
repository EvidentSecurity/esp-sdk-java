# StatServicesApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listForStat**](StatServicesApi.md#listForStat) | **GET** api/v2/stats/{stat_id}/services.json_api | Get a list of statistics for services
[**show**](StatServicesApi.md#show) | **GET** api/v2/stats/services/{id}.json_api | Show a single Stat Service


<a name="listForStat"></a>
# **listForStat**
> PaginatedCollection listForStat(statId, include, filter, page)

Get a list of statistics for services

A successful call to this API returns all the statistics of all the services for a report identified by the stat_id parameter. Said report contains all statistics for this alert triggered from services contained in all services for the selected hour.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.StatServicesApi;


StatServicesApi apiInstance = new StatServicesApi();
Integer statId = 56; // Integer | The ID of the stat to retrieve service statistics for
String include = "include_example"; // String | Related objects that can be included in the response:  service, stat See Including Objects for more information.
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [stat_id, type_id]    
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.listForStat(statId, include, filter, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatServicesApi#listForStat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statId** | **Integer**| The ID of the stat to retrieve service statistics for |
 **include** | **String**| Related objects that can be included in the response:  service, stat See Including Objects for more information. | [optional]
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
> StatService show(id, include)

Show a single Stat Service



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.StatServicesApi;


StatServicesApi apiInstance = new StatServicesApi();
Integer id = 56; // Integer | Stat Service ID
String include = "include_example"; // String | Related objects that can be included in the response:  service, stat See Including Objects for more information.
try {
    StatService result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatServicesApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Stat Service ID |
 **include** | **String**| Related objects that can be included in the response:  service, stat See Including Objects for more information. | [optional]

### Return type

[**StatService**](StatService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

