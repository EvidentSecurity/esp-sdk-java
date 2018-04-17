# CustomSignaturesApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CustomSignaturesApi.md#create) | **POST** api/v2/custom_signatures.json_api | Create a(n) Custom Signature
[**delete**](CustomSignaturesApi.md#delete) | **DELETE** api/v2/custom_signatures/{id}.json_api | Delete a(n) Custom Signature
[**list**](CustomSignaturesApi.md#list) | **PUT** api/v2/custom_signatures.json_api | Get a list of Custom Signatures
[**show**](CustomSignaturesApi.md#show) | **GET** api/v2/custom_signatures/{id}.json_api | Show a single Custom Signature
[**update**](CustomSignaturesApi.md#update) | **PATCH** api/v2/custom_signatures/{id}.json_api | Update a(n) Custom Signature


<a name="create"></a>
# **create**
> CustomSignature create(identifier, name, riskLevel, externalAccountIds, description, resolution, include)

Create a(n) Custom Signature



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignaturesApi;


CustomSignaturesApi apiInstance = new CustomSignaturesApi();
String identifier = "identifier_example"; // String | The identifier to use for the custom signature. Common format is AWS:- such as AWS:IAM-001
String name = "name_example"; // String | The name of the custom signature
String riskLevel = "riskLevel_example"; // String | The risk-level of the problem identified by the custom signature. Valid values are low, medium, high
List<Integer> externalAccountIds = Arrays.asList(56); // List<Integer> | The external account IDs this custom signature should run for. If no accounts are selected the custom signature will not be run.
String description = "description_example"; // String | The description of the custom signature that is displayed on alerts
String resolution = "resolution_example"; // String | Details for how to resolve this custom signature that is displayed on alerts
String include = "include_example"; // String | Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions See Including Objects for more information.
try {
    CustomSignature result = apiInstance.create(identifier, name, riskLevel, externalAccountIds, description, resolution, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignaturesApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The identifier to use for the custom signature. Common format is AWS:- such as AWS:IAM-001 |
 **name** | **String**| The name of the custom signature |
 **riskLevel** | **String**| The risk-level of the problem identified by the custom signature. Valid values are low, medium, high | [enum: low, medium, high]
 **externalAccountIds** | [**List&lt;Integer&gt;**](Integer.md)| The external account IDs this custom signature should run for. If no accounts are selected the custom signature will not be run. |
 **description** | **String**| The description of the custom signature that is displayed on alerts | [optional]
 **resolution** | **String**| Details for how to resolve this custom signature that is displayed on alerts | [optional]
 **include** | **String**| Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions See Including Objects for more information. | [optional]

### Return type

[**CustomSignature**](CustomSignature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="delete"></a>
# **delete**
> Meta delete(id)

Delete a(n) Custom Signature



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignaturesApi;


CustomSignaturesApi apiInstance = new CustomSignaturesApi();
Integer id = 56; // Integer |  ID
try {
    Meta result = apiInstance.delete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignaturesApi#delete");
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
> PaginatedCollection list(filter, page, include)

Get a list of Custom Signatures



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignaturesApi;


CustomSignaturesApi apiInstance = new CustomSignaturesApi();
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, risk_level, service_id, name, identifier] Matching Searchable Attributes: [name, identifier]  Sortable Attributes: [name, updated_at, created_at, id] Searchable Associations: [organization, teams, definitions, integrations, suppressions] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.list(filter, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignaturesApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, risk_level, service_id, name, identifier] Matching Searchable Attributes: [name, identifier]  Sortable Attributes: [name, updated_at, created_at, id] Searchable Associations: [organization, teams, definitions, integrations, suppressions] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> CustomSignature show(id, include)

Show a single Custom Signature



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignaturesApi;


CustomSignaturesApi apiInstance = new CustomSignaturesApi();
Integer id = 56; // Integer | Custom Signature ID
String include = "include_example"; // String | Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions See Including Objects for more information.
try {
    CustomSignature result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignaturesApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Custom Signature ID |
 **include** | **String**| Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions See Including Objects for more information. | [optional]

### Return type

[**CustomSignature**](CustomSignature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> CustomSignature update(id, description, identifier, name, resolution, riskLevel, externalAccountIds, include)

Update a(n) Custom Signature



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignaturesApi;


CustomSignaturesApi apiInstance = new CustomSignaturesApi();
Integer id = 56; // Integer | Custom Signature ID
String description = "description_example"; // String | The description of the custom signature that is displayed on alerts
String identifier = "identifier_example"; // String | The identifier to use for the custom signature. Common format is AWS:- such as AWS:IAM-001
String name = "name_example"; // String | The name of the custom signature
String resolution = "resolution_example"; // String | Details for how to resolve this custom signature that is displayed on alerts
String riskLevel = "riskLevel_example"; // String | The risk-level of the problem identified by the custom signature. Valid values are low, medium, high
List<Integer> externalAccountIds = Arrays.asList(56); // List<Integer> | The external account IDs this custom signature should run for. If no accounts are selected the custom signature will not be run.
String include = "include_example"; // String | Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions See Including Objects for more information.
try {
    CustomSignature result = apiInstance.update(id, description, identifier, name, resolution, riskLevel, externalAccountIds, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignaturesApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Custom Signature ID |
 **description** | **String**| The description of the custom signature that is displayed on alerts | [optional]
 **identifier** | **String**| The identifier to use for the custom signature. Common format is AWS:- such as AWS:IAM-001 | [optional]
 **name** | **String**| The name of the custom signature | [optional]
 **resolution** | **String**| Details for how to resolve this custom signature that is displayed on alerts | [optional]
 **riskLevel** | **String**| The risk-level of the problem identified by the custom signature. Valid values are low, medium, high | [optional] [enum: low, medium, high]
 **externalAccountIds** | [**List&lt;Integer&gt;**](Integer.md)| The external account IDs this custom signature should run for. If no accounts are selected the custom signature will not be run. | [optional]
 **include** | **String**| Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions See Including Objects for more information. | [optional]

### Return type

[**CustomSignature**](CustomSignature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

