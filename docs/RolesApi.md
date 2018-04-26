# RolesApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list**](RolesApi.md#list) | **GET** api/v2/roles.json_api | Get a list of Roles
[**show**](RolesApi.md#show) | **GET** api/v2/roles/{id}.json_api | Show a single Role


<a name="list"></a>
# **list**
> PaginatedCollection list(page)

Get a list of Roles



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.RolesApi;


RolesApi apiInstance = new RolesApi();
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.list(page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> Role show(id)

Show a single Role



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.RolesApi;


RolesApi apiInstance = new RolesApi();
Integer id = 56; // Integer | Role ID
try {
    Role result = apiInstance.show(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RolesApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Role ID |

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

