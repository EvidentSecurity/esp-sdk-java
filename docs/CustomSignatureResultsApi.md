# CustomSignatureResultsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CustomSignatureResultsApi.md#create) | **POST** api/v2/custom_signature_results.json_api | Create a(n) Custom Signature Result
[**list**](CustomSignatureResultsApi.md#list) | **PUT** api/v2/custom_signature_results.json_api | Get a list of Custom Signature Results
[**listAlerts**](CustomSignatureResultsApi.md#listAlerts) | **GET** api/v2/custom_signature_results/{custom_signature_result_id}/alerts.json_api | Returns the Alerts for a given Custom Signature Result
[**show**](CustomSignatureResultsApi.md#show) | **GET** api/v2/custom_signature_results/{id}.json_api | Show a single Custom Signature Result


<a name="create"></a>
# **create**
> CustomSignatureResult create(code, customSignatureDefinitionId, externalAccountId, language, regionId, region, include)

Create a(n) Custom Signature Result



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignatureResultsApi;


CustomSignatureResultsApi apiInstance = new CustomSignatureResultsApi();
String code = "code_example"; // String | The code for this definition
Integer customSignatureDefinitionId = 56; // Integer | ID of the custom signature definition this result belongs to
Integer externalAccountId = 56; // Integer | ID of the external account the code should run for
String language = "language_example"; // String | The language of the definition. Valid values are ruby, javascript
Integer regionId = 56; // Integer | ID of the region the code should run for.  Required if region is not supplied.
String region = "region_example"; // String | Code of the region the result code should run for. Ex: us-east-1. This can be sent instead of region_id
String include = "include_example"; // String | Related objects that can be included in the response:  external_account, region, definition See Including Objects for more information.
try {
    CustomSignatureResult result = apiInstance.create(code, customSignatureDefinitionId, externalAccountId, language, regionId, region, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignatureResultsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| The code for this definition |
 **customSignatureDefinitionId** | **Integer**| ID of the custom signature definition this result belongs to |
 **externalAccountId** | **Integer**| ID of the external account the code should run for |
 **language** | **String**| The language of the definition. Valid values are ruby, javascript | [enum: ruby, javascript]
 **regionId** | **Integer**| ID of the region the code should run for.  Required if region is not supplied. | [optional]
 **region** | **String**| Code of the region the result code should run for. Ex: us-east-1. This can be sent instead of region_id | [optional]
 **include** | **String**| Related objects that can be included in the response:  external_account, region, definition See Including Objects for more information. | [optional]

### Return type

[**CustomSignatureResult**](CustomSignatureResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="list"></a>
# **list**
> PaginatedCollection list(filter, page, include)

Get a list of Custom Signature Results



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignatureResultsApi;


CustomSignatureResultsApi apiInstance = new CustomSignatureResultsApi();
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, language, status]   Sortable Attribute: [id] Searchable Associations: [definition, region, external_account] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  external_account, region, definition See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.list(filter, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignatureResultsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, language, status]   Sortable Attribute: [id] Searchable Associations: [definition, region, external_account] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  external_account, region, definition See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="listAlerts"></a>
# **listAlerts**
> PaginatedCollection listAlerts(customSignatureResultId, page, include)

Returns the Alerts for a given Custom Signature Result

This format is slightly different than the standard alert format. A successful call to this API returns a list of alerts for the custom signature result identified by the custom_signature_result_id parameter.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignatureResultsApi;


CustomSignatureResultsApi apiInstance = new CustomSignatureResultsApi();
Integer customSignatureResultId = 56; // Integer | Custom Signature Result ID
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  external_account, region, custom_signature See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.listAlerts(customSignatureResultId, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignatureResultsApi#listAlerts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customSignatureResultId** | **Integer**| Custom Signature Result ID |
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  external_account, region, custom_signature See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> CustomSignatureResult show(id, include)

Show a single Custom Signature Result



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignatureResultsApi;


CustomSignatureResultsApi apiInstance = new CustomSignatureResultsApi();
Integer id = 56; // Integer | Custom Signature Result ID
String include = "include_example"; // String | Related objects that can be included in the response:  external_account, region, definition See Including Objects for more information.
try {
    CustomSignatureResult result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignatureResultsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Custom Signature Result ID |
 **include** | **String**| Related objects that can be included in the response:  external_account, region, definition See Including Objects for more information. | [optional]

### Return type

[**CustomSignatureResult**](CustomSignatureResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

