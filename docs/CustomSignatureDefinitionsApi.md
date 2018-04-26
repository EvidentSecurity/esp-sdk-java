# CustomSignatureDefinitionsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activate**](CustomSignatureDefinitionsApi.md#activate) | **PATCH** api/v2/custom_signature_definitions/{custom_signature_definition_id}/activate.json_api | Activate a Custom Signature Definition
[**archive**](CustomSignatureDefinitionsApi.md#archive) | **PATCH** api/v2/custom_signature_definitions/{custom_signature_definition_id}/archive.json_api | Archive a Custom Signature Definition
[**create**](CustomSignatureDefinitionsApi.md#create) | **POST** api/v2/custom_signature_definitions.json_api | Create a(n) Custom Signature Definition
[**delete**](CustomSignatureDefinitionsApi.md#delete) | **DELETE** api/v2/custom_signature_definitions/{id}.json_api | Delete a(n) Custom Signature Definition
[**list**](CustomSignatureDefinitionsApi.md#list) | **PUT** api/v2/custom_signature_definitions.json_api | Get a list of Custom Signature Definitions
[**show**](CustomSignatureDefinitionsApi.md#show) | **GET** api/v2/custom_signature_definitions/{id}.json_api | Show a single Custom Signature Definition
[**update**](CustomSignatureDefinitionsApi.md#update) | **PATCH** api/v2/custom_signature_definitions/{id}.json_api | Update a(n) Custom Signature Definition


<a name="activate"></a>
# **activate**
> CustomSignatureDefinition activate(customSignatureDefinitionId, include)

Activate a Custom Signature Definition

A successful call to this API marks the definition for activation.  The definition will go into the &#39;validating&#39; state and will be tested before activating. The definition must have a status of editable to be activated.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignatureDefinitionsApi;


CustomSignatureDefinitionsApi apiInstance = new CustomSignatureDefinitionsApi();
Integer customSignatureDefinitionId = 56; // Integer | ID of Custom Signature Definition
String include = "include_example"; // String | Related objects that can be included in the response:  custom_signature, results See Including Objects for more information.
try {
    CustomSignatureDefinition result = apiInstance.activate(customSignatureDefinitionId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignatureDefinitionsApi#activate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customSignatureDefinitionId** | **Integer**| ID of Custom Signature Definition |
 **include** | **String**| Related objects that can be included in the response:  custom_signature, results See Including Objects for more information. | [optional]

### Return type

[**CustomSignatureDefinition**](CustomSignatureDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="archive"></a>
# **archive**
> CustomSignatureDefinition archive(customSignatureDefinitionId, include)

Archive a Custom Signature Definition

A successful call to this API archives and returns a specific custom signature definition identified by the id parameter. The definition must have a status of active to be archived.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignatureDefinitionsApi;


CustomSignatureDefinitionsApi apiInstance = new CustomSignatureDefinitionsApi();
Integer customSignatureDefinitionId = 56; // Integer | ID of Custom Signature Definition
String include = "include_example"; // String | Related objects that can be included in the response:  custom_signature, results See Including Objects for more information.
try {
    CustomSignatureDefinition result = apiInstance.archive(customSignatureDefinitionId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignatureDefinitionsApi#archive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customSignatureDefinitionId** | **Integer**| ID of Custom Signature Definition |
 **include** | **String**| Related objects that can be included in the response:  custom_signature, results See Including Objects for more information. | [optional]

### Return type

[**CustomSignatureDefinition**](CustomSignatureDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="create"></a>
# **create**
> CustomSignatureDefinition create(customSignatureId, include)

Create a(n) Custom Signature Definition



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignatureDefinitionsApi;


CustomSignatureDefinitionsApi apiInstance = new CustomSignatureDefinitionsApi();
Integer customSignatureId = 56; // Integer | ID of the custom signature this definition belongs to
String include = "include_example"; // String | Related objects that can be included in the response:  custom_signature, results See Including Objects for more information.
try {
    CustomSignatureDefinition result = apiInstance.create(customSignatureId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignatureDefinitionsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customSignatureId** | **Integer**| ID of the custom signature this definition belongs to |
 **include** | **String**| Related objects that can be included in the response:  custom_signature, results See Including Objects for more information. | [optional]

### Return type

[**CustomSignatureDefinition**](CustomSignatureDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="delete"></a>
# **delete**
> Meta delete(id)

Delete a(n) Custom Signature Definition



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignatureDefinitionsApi;


CustomSignatureDefinitionsApi apiInstance = new CustomSignatureDefinitionsApi();
Integer id = 56; // Integer | Custom Signature Definition ID
try {
    Meta result = apiInstance.delete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignatureDefinitionsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Custom Signature Definition ID |

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

Get a list of Custom Signature Definitions



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignatureDefinitionsApi;


CustomSignatureDefinitionsApi apiInstance = new CustomSignatureDefinitionsApi();
String include = "include_example"; // String | Related objects that can be included in the response:  custom_signature, results See Including Objects for more information.
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, language, status, version_number]    Searchable Association: [custom_signature] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.list(include, filter, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignatureDefinitionsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include** | **String**| Related objects that can be included in the response:  custom_signature, results See Including Objects for more information. | [optional]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, language, status, version_number]    Searchable Association: [custom_signature] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
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
> CustomSignatureDefinition show(id, include)

Show a single Custom Signature Definition



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignatureDefinitionsApi;


CustomSignatureDefinitionsApi apiInstance = new CustomSignatureDefinitionsApi();
Integer id = 56; // Integer | Custom Signature Definition ID
String include = "include_example"; // String | Related objects that can be included in the response:  custom_signature, results See Including Objects for more information.
try {
    CustomSignatureDefinition result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignatureDefinitionsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Custom Signature Definition ID |
 **include** | **String**| Related objects that can be included in the response:  custom_signature, results See Including Objects for more information. | [optional]

### Return type

[**CustomSignatureDefinition**](CustomSignatureDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> CustomSignatureDefinition update(id, include, code, language)

Update a(n) Custom Signature Definition



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignatureDefinitionsApi;


CustomSignatureDefinitionsApi apiInstance = new CustomSignatureDefinitionsApi();
Integer id = 56; // Integer | Custom Signature Definition ID
String include = "include_example"; // String | Related objects that can be included in the response:  custom_signature, results See Including Objects for more information.
String code = "code_example"; // String | The code for this definition
String language = "language_example"; // String | The language of the definition. Valid values are ruby, javascript
try {
    CustomSignatureDefinition result = apiInstance.update(id, include, code, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignatureDefinitionsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Custom Signature Definition ID |
 **include** | **String**| Related objects that can be included in the response:  custom_signature, results See Including Objects for more information. | [optional]
 **code** | **String**| The code for this definition | [optional]
 **language** | **String**| The language of the definition. Valid values are ruby, javascript | [optional] [enum: ruby, javascript]

### Return type

[**CustomSignatureDefinition**](CustomSignatureDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

