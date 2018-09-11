# IntegrationsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](IntegrationsApi.md#delete) | **DELETE** api/v2/integrations/{id}.json_api | Delete a(n) Integration
[**disable**](IntegrationsApi.md#disable) | **PATCH** api/v2/integrations/{id}/disable.json_api | Disable a single Integration
[**list**](IntegrationsApi.md#list) | **PUT** api/v2/integrations.json_api | Get a list of Integrations
[**show**](IntegrationsApi.md#show) | **GET** api/v2/integrations/{id}.json_api | Show a single Integration
[**testNotify**](IntegrationsApi.md#testNotify) | **POST** api/v2/integrations/{id}/test_notify.json_api | Test an Integration


<a name="delete"></a>
# **delete**
> Meta delete(id)

Delete a(n) Integration

Use this endpoint to destory any type of Integration.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsApi;


IntegrationsApi apiInstance = new IntegrationsApi();
Integer id = 56; // Integer | Integration ID
try {
    Meta result = apiInstance.delete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Integration ID |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="disable"></a>
# **disable**
> Meta disable(id)

Disable a single Integration

This will disable any type of Integration

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsApi;


IntegrationsApi apiInstance = new IntegrationsApi();
Integer id = 56; // Integer | Integration ID
try {
    Meta result = apiInstance.disable(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#disable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Integration ID |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="list"></a>
# **list**
> PaginatedCollection list(include, filter, page)

Get a list of Integrations

This will return a list of every type of Integration.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsApi;


IntegrationsApi apiInstance = new IntegrationsApi();
String include = "include_example"; // String | Related objects that can be included in the response:  organization, creator, external_accounts, signatures, custom_signatures See Including Objects for more information.
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, organization_id, name, service_type] Matching Searchable Attributes: [name, service_type]   Searchable Associations: [teams, signatures, custom_signatures] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.list(include, filter, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include** | **String**| Related objects that can be included in the response:  organization, creator, external_accounts, signatures, custom_signatures See Including Objects for more information. | [optional]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, organization_id, name, service_type] Matching Searchable Attributes: [name, service_type]   Searchable Associations: [teams, signatures, custom_signatures] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
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
> Integration show(id, include)

Show a single Integration

This will return any type of Integration.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsApi;


IntegrationsApi apiInstance = new IntegrationsApi();
Integer id = 56; // Integer | Integration ID
String include = "include_example"; // String | Related objects that can be included in the response:  organization, creator, external_accounts, signatures, custom_signatures See Including Objects for more information.
try {
    Integration result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Integration ID |
 **include** | **String**| Related objects that can be included in the response:  organization, creator, external_accounts, signatures, custom_signatures See Including Objects for more information. | [optional]

### Return type

[**Integration**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="testNotify"></a>
# **testNotify**
> Meta testNotify(id)

Test an Integration

This will test any type of Integration.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsApi;


IntegrationsApi apiInstance = new IntegrationsApi();
Integer id = 56; // Integer | Integration ID
try {
    Meta result = apiInstance.testNotify(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#testNotify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Integration ID |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

