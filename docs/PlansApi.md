# PlansApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list**](PlansApi.md#list) | **GET** api/v2/plans.json_api | Get a list of Plans
[**show**](PlansApi.md#show) | **GET** api/v2/plans/{id}.json_api | Show a single Plan


<a name="list"></a>
# **list**
> PaginatedCollection list(page, include)

Get a list of Plans



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.PlansApi;


PlansApi apiInstance = new PlansApi();
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:   See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.list(page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:   See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> Plan show(id, include)

Show a single Plan



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.PlansApi;


PlansApi apiInstance = new PlansApi();
Integer id = 56; // Integer | Plan ID
String include = "include_example"; // String | Related objects that can be included in the response:   See Including Objects for more information.
try {
    Plan result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlansApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Plan ID |
 **include** | **String**| Related objects that can be included in the response:   See Including Objects for more information. | [optional]

### Return type

[**Plan**](Plan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

