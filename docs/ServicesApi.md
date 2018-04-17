# ServicesApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list**](ServicesApi.md#list) | **PUT** api/v2/services.json_api | Get a list of Services
[**show**](ServicesApi.md#show) | **GET** api/v2/services/{id}.json_api | Show a single Service


<a name="list"></a>
# **list**
> PaginatedCollection list(filter, page, include)

Get a list of Services



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ServicesApi;


ServicesApi apiInstance = new ServicesApi();
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, name, policy_name] Matching Searchable Attributes: [name, policy_name] Limited Searchable Attribute: [provider_eq]  
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:   See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.list(filter, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, name, policy_name] Matching Searchable Attributes: [name, policy_name] Limited Searchable Attribute: [provider_eq]   | [optional]
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
> Service show(id, include)

Show a single Service



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ServicesApi;


ServicesApi apiInstance = new ServicesApi();
Integer id = 56; // Integer | Service ID
String include = "include_example"; // String | Related objects that can be included in the response:   See Including Objects for more information.
try {
    Service result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Service ID |
 **include** | **String**| Related objects that can be included in the response:   See Including Objects for more information. | [optional]

### Return type

[**Service**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

