# OrganizationsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list**](OrganizationsApi.md#list) | **PUT** api/v2/organizations.json_api | Get a list of Organizations
[**listComplianceStandards**](OrganizationsApi.md#listComplianceStandards) | **GET** api/v2/organizations/{organization_id}/compliance_standards.json_api | Get a list of compliance standards for an organization
[**show**](OrganizationsApi.md#show) | **GET** api/v2/organizations/{id}.json_api | Show a single Organization
[**update**](OrganizationsApi.md#update) | **PATCH** api/v2/organizations/{id}.json_api | Update a(n) Organization


<a name="list"></a>
# **list**
> PaginatedCollection list(include, filter, page)

Get a list of Organizations



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
String include = "include_example"; // String | Related objects that can be included in the response:  subscription, custom_signatures, external_accounts, sub_organizations, teams, users, compliance_standards, integrations See Including Objects for more information.
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, name] Matching Searchable Attribute: [name]  Sortable Attributes: [name, updated_at, created_at, id] 
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.list(include, filter, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include** | **String**| Related objects that can be included in the response:  subscription, custom_signatures, external_accounts, sub_organizations, teams, users, compliance_standards, integrations See Including Objects for more information. | [optional]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, name] Matching Searchable Attribute: [name]  Sortable Attributes: [name, updated_at, created_at, id]  | [optional]
 **page** | **String**| Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="listComplianceStandards"></a>
# **listComplianceStandards**
> PaginatedCollection listComplianceStandards(organizationId, include, page)

Get a list of compliance standards for an organization



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Integer organizationId = 56; // Integer | The ID of the organization this compliance standard belongs to
String include = "include_example"; // String | Related objects that can be included in the response:  compliance_domains, compliance_controls See Including Objects for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.listComplianceStandards(organizationId, include, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#listComplianceStandards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Integer**| The ID of the organization this compliance standard belongs to |
 **include** | **String**| Related objects that can be included in the response:  compliance_domains, compliance_controls See Including Objects for more information. | [optional]
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
> Organization show(id, include)

Show a single Organization



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Integer id = 56; // Integer | Organization ID
String include = "include_example"; // String | Related objects that can be included in the response:  subscription, custom_signatures, external_accounts, sub_organizations, teams, users, compliance_standards, integrations See Including Objects for more information.
try {
    Organization result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Organization ID |
 **include** | **String**| Related objects that can be included in the response:  subscription, custom_signatures, external_accounts, sub_organizations, teams, users, compliance_standards, integrations See Including Objects for more information. | [optional]

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> Organization update(id, include, name, requireMfa)

Update a(n) Organization



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.OrganizationsApi;


OrganizationsApi apiInstance = new OrganizationsApi();
Integer id = 56; // Integer | Organization ID
String include = "include_example"; // String | Related objects that can be included in the response:  subscription, custom_signatures, external_accounts, sub_organizations, teams, users, compliance_standards, integrations See Including Objects for more information.
String name = "name_example"; // String | Name of the organization
Boolean requireMfa = true; // Boolean | Whether or not users for this organization are required to enable Multi Factor Authentication
try {
    Organization result = apiInstance.update(id, include, name, requireMfa);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Organization ID |
 **include** | **String**| Related objects that can be included in the response:  subscription, custom_signatures, external_accounts, sub_organizations, teams, users, compliance_standards, integrations See Including Objects for more information. | [optional]
 **name** | **String**| Name of the organization | [optional]
 **requireMfa** | **Boolean**| Whether or not users for this organization are required to enable Multi Factor Authentication | [optional]

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

