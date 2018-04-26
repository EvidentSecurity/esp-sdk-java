# AzureGroupsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addExternalAccount**](AzureGroupsApi.md#addExternalAccount) | **POST** api/v2/azure_groups/{azure_group_id}/memberships.json_api | Add an External Account to an Azure Group
[**create**](AzureGroupsApi.md#create) | **POST** api/v2/azure_groups.json_api | Create a(n) Azure Group
[**delete**](AzureGroupsApi.md#delete) | **DELETE** api/v2/azure_groups/{id}.json_api | Delete a(n) Azure Group
[**list**](AzureGroupsApi.md#list) | **PUT** api/v2/azure_groups.json_api | Get a list of Azure Groups
[**removeExternalAccount**](AzureGroupsApi.md#removeExternalAccount) | **DELETE** api/v2/azure_groups/{azure_group_id}/memberships/{external_account_id}.json_api | Remove an External Account from an Azure Group
[**show**](AzureGroupsApi.md#show) | **GET** api/v2/azure_groups/{id}.json_api | Show a single Azure Group
[**update**](AzureGroupsApi.md#update) | **PATCH** api/v2/azure_groups/{id}.json_api | Update a(n) Azure Group


<a name="addExternalAccount"></a>
# **addExternalAccount**
> ExternalAccount addExternalAccount(azureGroupId, externalAccountId, include)

Add an External Account to an Azure Group



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.AzureGroupsApi;


AzureGroupsApi apiInstance = new AzureGroupsApi();
Integer azureGroupId = 56; // Integer | The ID of the Azure group associated with this memberhsip
Integer externalAccountId = 56; // Integer | The ID of the External Account associated with this memberhsip
String include = "include_example"; // String | Related objects that can be included in the response:  organization, sub_organization, team, scan_intervals, disabled_signatures, suppressions, azure_group, credentials See Including Objects for more information.
try {
    ExternalAccount result = apiInstance.addExternalAccount(azureGroupId, externalAccountId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureGroupsApi#addExternalAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **azureGroupId** | **Integer**| The ID of the Azure group associated with this memberhsip |
 **externalAccountId** | **Integer**| The ID of the External Account associated with this memberhsip |
 **include** | **String**| Related objects that can be included in the response:  organization, sub_organization, team, scan_intervals, disabled_signatures, suppressions, azure_group, credentials See Including Objects for more information. | [optional]

### Return type

[**ExternalAccount**](ExternalAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="create"></a>
# **create**
> AzureGroup create(name, include)

Create a(n) Azure Group

The URL will only be returned once when the group is first created

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.AzureGroupsApi;


AzureGroupsApi apiInstance = new AzureGroupsApi();
String name = "name_example"; // String | Name
String include = "include_example"; // String | Related objects that can be included in the response:  organization, external_accounts See Including Objects for more information.
try {
    AzureGroup result = apiInstance.create(name, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureGroupsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name |
 **include** | **String**| Related objects that can be included in the response:  organization, external_accounts See Including Objects for more information. | [optional]

### Return type

[**AzureGroup**](AzureGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="delete"></a>
# **delete**
> Meta delete(id)

Delete a(n) Azure Group



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.AzureGroupsApi;


AzureGroupsApi apiInstance = new AzureGroupsApi();
Integer id = 56; // Integer | Azure Group ID
try {
    Meta result = apiInstance.delete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureGroupsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Azure Group ID |

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

Get a list of Azure Groups



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.AzureGroupsApi;


AzureGroupsApi apiInstance = new AzureGroupsApi();
String include = "include_example"; // String | Related objects that can be included in the response:  organization, external_accounts See Including Objects for more information.
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, name] Matching Searchable Attribute: [name]  Sortable Attributes: [id, name] Searchable Associations: [organization, external_accounts] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.list(include, filter, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureGroupsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include** | **String**| Related objects that can be included in the response:  organization, external_accounts See Including Objects for more information. | [optional]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, name] Matching Searchable Attribute: [name]  Sortable Attributes: [id, name] Searchable Associations: [organization, external_accounts] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="removeExternalAccount"></a>
# **removeExternalAccount**
> Meta removeExternalAccount(azureGroupId, externalAccountId)

Remove an External Account from an Azure Group



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.AzureGroupsApi;


AzureGroupsApi apiInstance = new AzureGroupsApi();
Integer azureGroupId = 56; // Integer | The ID of the Azure group associated with this memberhsip
Integer externalAccountId = 56; // Integer | The ID of the External Account associated with this memberhsip
try {
    Meta result = apiInstance.removeExternalAccount(azureGroupId, externalAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureGroupsApi#removeExternalAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **azureGroupId** | **Integer**| The ID of the Azure group associated with this memberhsip |
 **externalAccountId** | **Integer**| The ID of the External Account associated with this memberhsip |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> AzureGroup show(id, include)

Show a single Azure Group



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.AzureGroupsApi;


AzureGroupsApi apiInstance = new AzureGroupsApi();
Integer id = 56; // Integer | Azure Group ID
String include = "include_example"; // String | Related objects that can be included in the response:  organization, external_accounts See Including Objects for more information.
try {
    AzureGroup result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureGroupsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Azure Group ID |
 **include** | **String**| Related objects that can be included in the response:  organization, external_accounts See Including Objects for more information. | [optional]

### Return type

[**AzureGroup**](AzureGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> AzureGroup update(id, include, name)

Update a(n) Azure Group



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.AzureGroupsApi;


AzureGroupsApi apiInstance = new AzureGroupsApi();
Integer id = 56; // Integer | Azure Group ID
String include = "include_example"; // String | Related objects that can be included in the response:  organization, external_accounts See Including Objects for more information.
String name = "name_example"; // String | Name
try {
    AzureGroup result = apiInstance.update(id, include, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureGroupsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Azure Group ID |
 **include** | **String**| Related objects that can be included in the response:  organization, external_accounts See Including Objects for more information. | [optional]
 **name** | **String**| Name | [optional]

### Return type

[**AzureGroup**](AzureGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

