# TagsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listForAlert**](TagsApi.md#listForAlert) | **GET** api/v2/alerts/{alert_id}/tags.json_api | Get a list of Tags
[**show**](TagsApi.md#show) | **GET** api/v2/tags/{id}.json_api | Show a single Tag


<a name="listForAlert"></a>
# **listForAlert**
> PaginatedCollection listForAlert(alertId, page)

Get a list of Tags



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.TagsApi;


TagsApi apiInstance = new TagsApi();
Integer alertId = 56; // Integer | The ID of the alert to list tags for
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.listForAlert(alertId, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#listForAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **Integer**| The ID of the alert to list tags for |
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
> Tag show(id)

Show a single Tag



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.TagsApi;


TagsApi apiInstance = new TagsApi();
Integer id = 56; // Integer | Tag ID
try {
    Tag result = apiInstance.show(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Tag ID |

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

