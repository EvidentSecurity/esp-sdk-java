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
> CustomSignature create(externalAccountIds, identifier, name, riskLevel, include, description, includeNewAccounts, resolution, serviceId)

Create a(n) Custom Signature



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignaturesApi;


CustomSignaturesApi apiInstance = new CustomSignaturesApi();
List<Integer> externalAccountIds = Arrays.asList(56); // List<Integer> | The external account IDs this custom signature should run for. If no accounts are selected the custom signature will not be run.
String identifier = "identifier_example"; // String | The identifier to use for the custom signature. Common format is AWS:- such as AWS:IAM-001
String name = "name_example"; // String | The name of the custom signature
String riskLevel = "riskLevel_example"; // String | The risk-level of the problem identified by the custom signature. Valid values are low, medium, high
String include = "include_example"; // String | Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions, service See Including Objects for more information.
String description = "description_example"; // String | The description of the custom signature that is displayed on alerts
Boolean includeNewAccounts = true; // Boolean | When enabled, automatically adds new accounts to this signature. This field can only be set by an organization level user.
String resolution = "resolution_example"; // String | Details for how to resolve this custom signature that is displayed on alerts
Integer serviceId = 56; // Integer | The service this custom signature is for. If no service is selected it will default to Custom.
try {
    CustomSignature result = apiInstance.create(externalAccountIds, identifier, name, riskLevel, include, description, includeNewAccounts, resolution, serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignaturesApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountIds** | [**List&lt;Integer&gt;**](Integer.md)| The external account IDs this custom signature should run for. If no accounts are selected the custom signature will not be run. |
 **identifier** | **String**| The identifier to use for the custom signature. Common format is AWS:- such as AWS:IAM-001 |
 **name** | **String**| The name of the custom signature |
 **riskLevel** | **String**| The risk-level of the problem identified by the custom signature. Valid values are low, medium, high | [enum: low, medium, high]
 **include** | **String**| Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions, service See Including Objects for more information. | [optional]
 **description** | **String**| The description of the custom signature that is displayed on alerts | [optional]
 **includeNewAccounts** | **Boolean**| When enabled, automatically adds new accounts to this signature. This field can only be set by an organization level user. | [optional]
 **resolution** | **String**| Details for how to resolve this custom signature that is displayed on alerts | [optional]
 **serviceId** | **Integer**| The service this custom signature is for. If no service is selected it will default to Custom. | [optional]

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
Integer id = 56; // Integer | Custom Signature ID
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
 **id** | **Integer**| Custom Signature ID |

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

Get a list of Custom Signatures



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignaturesApi;


CustomSignaturesApi apiInstance = new CustomSignaturesApi();
String include = "include_example"; // String | Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions, service See Including Objects for more information.
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, risk_level, service_id, name, identifier] Matching Searchable Attributes: [name, identifier]  Sortable Attributes: [name, updated_at, created_at, id] Searchable Associations: [organization, teams, definitions, integrations, suppressions] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.list(include, filter, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSignaturesApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include** | **String**| Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions, service See Including Objects for more information. | [optional]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, risk_level, service_id, name, identifier] Matching Searchable Attributes: [name, identifier]  Sortable Attributes: [name, updated_at, created_at, id] Searchable Associations: [organization, teams, definitions, integrations, suppressions] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
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
> CustomSignature show(id, include)

Show a single Custom Signature



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignaturesApi;


CustomSignaturesApi apiInstance = new CustomSignaturesApi();
Integer id = 56; // Integer | Custom Signature ID
String include = "include_example"; // String | Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions, service See Including Objects for more information.
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
 **include** | **String**| Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions, service See Including Objects for more information. | [optional]

### Return type

[**CustomSignature**](CustomSignature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> CustomSignature update(id, include, description, externalAccountIds, identifier, includeNewAccounts, name, resolution, riskLevel, serviceId)

Update a(n) Custom Signature



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomSignaturesApi;


CustomSignaturesApi apiInstance = new CustomSignaturesApi();
Integer id = 56; // Integer | Custom Signature ID
String include = "include_example"; // String | Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions, service See Including Objects for more information.
String description = "description_example"; // String | The description of the custom signature that is displayed on alerts
List<Integer> externalAccountIds = Arrays.asList(56); // List<Integer> | The external account IDs this custom signature should run for. If no accounts are selected the custom signature will not be run.
String identifier = "identifier_example"; // String | The identifier to use for the custom signature. Common format is AWS:- such as AWS:IAM-001
Boolean includeNewAccounts = true; // Boolean | When enabled, automatically adds new accounts to this signature. This field can only be set by an organization level user.
String name = "name_example"; // String | The name of the custom signature
String resolution = "resolution_example"; // String | Details for how to resolve this custom signature that is displayed on alerts
String riskLevel = "riskLevel_example"; // String | The risk-level of the problem identified by the custom signature. Valid values are low, medium, high
Integer serviceId = 56; // Integer | The service this custom signature is for. If no service is selected it will default to Custom.
try {
    CustomSignature result = apiInstance.update(id, include, description, externalAccountIds, identifier, includeNewAccounts, name, resolution, riskLevel, serviceId);
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
 **include** | **String**| Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions, service See Including Objects for more information. | [optional]
 **description** | **String**| The description of the custom signature that is displayed on alerts | [optional]
 **externalAccountIds** | [**List&lt;Integer&gt;**](Integer.md)| The external account IDs this custom signature should run for. If no accounts are selected the custom signature will not be run. | [optional]
 **identifier** | **String**| The identifier to use for the custom signature. Common format is AWS:- such as AWS:IAM-001 | [optional]
 **includeNewAccounts** | **Boolean**| When enabled, automatically adds new accounts to this signature. This field can only be set by an organization level user. | [optional]
 **name** | **String**| The name of the custom signature | [optional]
 **resolution** | **String**| Details for how to resolve this custom signature that is displayed on alerts | [optional]
 **riskLevel** | **String**| The risk-level of the problem identified by the custom signature. Valid values are low, medium, high | [optional] [enum: low, medium, high]
 **serviceId** | **Integer**| The service this custom signature is for. If no service is selected it will default to Custom. | [optional]

### Return type

[**CustomSignature**](CustomSignature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

