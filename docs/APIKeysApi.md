# APIKeysApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](APIKeysApi.md#create) | **POST** api/v2/api_keys.json_api | Create a(n) API Key
[**delete**](APIKeysApi.md#delete) | **DELETE** api/v2/api_keys/{id}.json_api | Delete a(n) API Key
[**list**](APIKeysApi.md#list) | **GET** api/v2/api_keys.json_api | Get a list of API Keys
[**show**](APIKeysApi.md#show) | **GET** api/v2/api_keys/{id}.json_api | Show a single API Key
[**update**](APIKeysApi.md#update) | **PATCH** api/v2/api_keys/{id}.json_api | Update a(n) API Key


<a name="create"></a>
# **create**
> APIKey create(name, include)

Create a(n) API Key

The secret key will only be returned once when the key is first created

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.APIKeysApi;


APIKeysApi apiInstance = new APIKeysApi();
String name = "name_example"; // String | The name of the API Key
String include = "include_example"; // String | Related objects that can be included in the response:  user See Including Objects for more information.
try {
    APIKey result = apiInstance.create(name, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIKeysApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the API Key | [optional]
 **include** | **String**| Related objects that can be included in the response:  user See Including Objects for more information. | [optional]

### Return type

[**APIKey**](APIKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="delete"></a>
# **delete**
> Meta delete(id)

Delete a(n) API Key



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.APIKeysApi;


APIKeysApi apiInstance = new APIKeysApi();
Integer id = 56; // Integer |  ID
try {
    Meta result = apiInstance.delete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIKeysApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  ID |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="list"></a>
# **list**
> PaginatedCollection list(page, include)

Get a list of API Keys



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.APIKeysApi;


APIKeysApi apiInstance = new APIKeysApi();
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  user See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.list(page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIKeysApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  user See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> APIKey show(id, include)

Show a single API Key



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.APIKeysApi;


APIKeysApi apiInstance = new APIKeysApi();
Integer id = 56; // Integer | API Key ID
String include = "include_example"; // String | Related objects that can be included in the response:  user See Including Objects for more information.
try {
    APIKey result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIKeysApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| API Key ID |
 **include** | **String**| Related objects that can be included in the response:  user See Including Objects for more information. | [optional]

### Return type

[**APIKey**](APIKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> APIKey update(id, name, include)

Update a(n) API Key



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.APIKeysApi;


APIKeysApi apiInstance = new APIKeysApi();
Integer id = 56; // Integer | API Key ID
String name = "name_example"; // String | The name of the API Key
String include = "include_example"; // String | Related objects that can be included in the response:  user See Including Objects for more information.
try {
    APIKey result = apiInstance.update(id, name, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIKeysApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| API Key ID |
 **name** | **String**| The name of the API Key | [optional]
 **include** | **String**| Related objects that can be included in the response:  user See Including Objects for more information. | [optional]

### Return type

[**APIKey**](APIKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

