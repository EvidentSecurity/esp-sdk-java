# ExternalAccountsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addComplianceStandard**](ExternalAccountsApi.md#addComplianceStandard) | **POST** api/v2/external_accounts/{external_account_id}/compliance_standards.json_api | Add a compliance standard to an external account
[**addCustomComplianceStandard**](ExternalAccountsApi.md#addCustomComplianceStandard) | **POST** api/v2/external_accounts/{external_account_id}/custom_compliance_standards.json_api | Add a custom compliance standard to an external account
[**addDisabledSignature**](ExternalAccountsApi.md#addDisabledSignature) | **POST** api/v2/external_accounts/{external_account_id}/disabled_signatures.json_api | Disable a signature for an external account
[**delete**](ExternalAccountsApi.md#delete) | **DELETE** api/v2/external_accounts/{id}.json_api | Delete a(n) External Account
[**list**](ExternalAccountsApi.md#list) | **PUT** api/v2/external_accounts.json_api | Get a list of External Accounts
[**listComplianceStandards**](ExternalAccountsApi.md#listComplianceStandards) | **GET** api/v2/external_accounts/{external_account_id}/compliance_standards.json_api | Get a list of compliance standards for an external account
[**listCustomComplianceStandards**](ExternalAccountsApi.md#listCustomComplianceStandards) | **GET** api/v2/external_accounts/{external_account_id}/custom_compliance_standards.json_api | Get a list of custom compliance standards for an external account
[**listDisabledSignatures**](ExternalAccountsApi.md#listDisabledSignatures) | **PUT** api/v2/external_accounts/{external_account_id}/disabled_signatures.json_api | Get a list all the disabled signatures for an external account
[**removeComplianceStandard**](ExternalAccountsApi.md#removeComplianceStandard) | **DELETE** api/v2/external_accounts/{external_account_id}/compliance_standards/{compliance_standard_id}.json_api | Remove a compliance standard from an external account
[**removeCustomComplianceStandard**](ExternalAccountsApi.md#removeCustomComplianceStandard) | **DELETE** api/v2/external_accounts/{external_account_id}/custom_compliance_standards/{custom_compliance_standard_id}.json_api | Remove a custom compliance standard from an external account
[**removeDisabledSignature**](ExternalAccountsApi.md#removeDisabledSignature) | **DELETE** api/v2/external_accounts/{external_account_id}/disabled_signatures/{signature_id}.json_api | Re-enable a signature for an external account
[**show**](ExternalAccountsApi.md#show) | **GET** api/v2/external_accounts/{id}.json_api | Show a single External Account


<a name="addComplianceStandard"></a>
# **addComplianceStandard**
> ComplianceStandard addComplianceStandard(externalAccountId, complianceStandardId, include)

Add a compliance standard to an external account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsApi;


ExternalAccountsApi apiInstance = new ExternalAccountsApi();
Integer externalAccountId = 56; // Integer | The ID of the external account this compliance standard belongs to
Integer complianceStandardId = 56; // Integer | The ID of the compliance standard that belongs to this external account
String include = "include_example"; // String | Related objects that can be included in the response:  compliance_domains, compliance_controls See Including Objects for more information.
try {
    ComplianceStandard result = apiInstance.addComplianceStandard(externalAccountId, complianceStandardId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsApi#addComplianceStandard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account this compliance standard belongs to |
 **complianceStandardId** | **Integer**| The ID of the compliance standard that belongs to this external account |
 **include** | **String**| Related objects that can be included in the response:  compliance_domains, compliance_controls See Including Objects for more information. | [optional]

### Return type

[**ComplianceStandard**](ComplianceStandard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="addCustomComplianceStandard"></a>
# **addCustomComplianceStandard**
> Meta addCustomComplianceStandard(externalAccountId, customComplianceStandardId)

Add a custom compliance standard to an external account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsApi;


ExternalAccountsApi apiInstance = new ExternalAccountsApi();
Integer externalAccountId = 56; // Integer | The ID of the external account this custom compliance standard belongs to
Integer customComplianceStandardId = 56; // Integer | The ID of the custom compliance standard that belongs to this external account
try {
    Meta result = apiInstance.addCustomComplianceStandard(externalAccountId, customComplianceStandardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsApi#addCustomComplianceStandard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account this custom compliance standard belongs to |
 **customComplianceStandardId** | **Integer**| The ID of the custom compliance standard that belongs to this external account |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="addDisabledSignature"></a>
# **addDisabledSignature**
> Signature addDisabledSignature(externalAccountId, signatureId, include)

Disable a signature for an external account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsApi;


ExternalAccountsApi apiInstance = new ExternalAccountsApi();
Integer externalAccountId = 56; // Integer | The ID of the external account to disable a signature on
Integer signatureId = 56; // Integer | The ID of the signature to disable
String include = "include_example"; // String | Related objects that can be included in the response:  service, suppressions See Including Objects for more information.
try {
    Signature result = apiInstance.addDisabledSignature(externalAccountId, signatureId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsApi#addDisabledSignature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account to disable a signature on |
 **signatureId** | **Integer**| The ID of the signature to disable |
 **include** | **String**| Related objects that can be included in the response:  service, suppressions See Including Objects for more information. | [optional]

### Return type

[**Signature**](Signature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="delete"></a>
# **delete**
> Meta delete(id)

Delete a(n) External Account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsApi;


ExternalAccountsApi apiInstance = new ExternalAccountsApi();
Integer id = 56; // Integer | External Account ID
try {
    Meta result = apiInstance.delete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| External Account ID |

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

Get a list of External Accounts



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsApi;


ExternalAccountsApi apiInstance = new ExternalAccountsApi();
String include = "include_example"; // String | Related objects that can be included in the response:  organization, sub_organization, team, scan_intervals, disabled_signatures, suppressions, azure_group, credentials See Including Objects for more information.
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, nickname, name] Matching Searchable Attributes: [nickname, name] Limited Searchable Attributes: [account_eq, arn_eq, provider_eq, subscription_id_eq] Sortable Attributes: [name, updated_at, created_at, id] Searchable Associations: [organization, sub_organization, team, compliance_standards, azure_group, disabled_signatures, suppressions] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.list(include, filter, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include** | **String**| Related objects that can be included in the response:  organization, sub_organization, team, scan_intervals, disabled_signatures, suppressions, azure_group, credentials See Including Objects for more information. | [optional]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, nickname, name] Matching Searchable Attributes: [nickname, name] Limited Searchable Attributes: [account_eq, arn_eq, provider_eq, subscription_id_eq] Sortable Attributes: [name, updated_at, created_at, id] Searchable Associations: [organization, sub_organization, team, compliance_standards, azure_group, disabled_signatures, suppressions] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
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
> PaginatedCollection listComplianceStandards(externalAccountId, include, page)

Get a list of compliance standards for an external account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsApi;


ExternalAccountsApi apiInstance = new ExternalAccountsApi();
Integer externalAccountId = 56; // Integer | The ID of the external account this compliance standard belongs to
String include = "include_example"; // String | Related objects that can be included in the response:  compliance_domains, compliance_controls See Including Objects for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.listComplianceStandards(externalAccountId, include, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsApi#listComplianceStandards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account this compliance standard belongs to |
 **include** | **String**| Related objects that can be included in the response:  compliance_domains, compliance_controls See Including Objects for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="listCustomComplianceStandards"></a>
# **listCustomComplianceStandards**
> PaginatedCollection listCustomComplianceStandards(externalAccountId, include, page)

Get a list of custom compliance standards for an external account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsApi;


ExternalAccountsApi apiInstance = new ExternalAccountsApi();
Integer externalAccountId = 56; // Integer | The ID of the external account this custom compliance standard belongs to
String include = "include_example"; // String | Related objects that can be included in the response:  custom_compliance_domains, custom_compliance_controls See Including Objects for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.listCustomComplianceStandards(externalAccountId, include, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsApi#listCustomComplianceStandards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account this custom compliance standard belongs to |
 **include** | **String**| Related objects that can be included in the response:  custom_compliance_domains, custom_compliance_controls See Including Objects for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="listDisabledSignatures"></a>
# **listDisabledSignatures**
> PaginatedCollection listDisabledSignatures(externalAccountId, include, filter, page)

Get a list all the disabled signatures for an external account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsApi;


ExternalAccountsApi apiInstance = new ExternalAccountsApi();
Integer externalAccountId = 56; // Integer | The ID of the external account to retrieve the disabled signatures for
String include = "include_example"; // String | Related objects that can be included in the response:  service, suppressions See Including Objects for more information.
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, risk_level, service_id, disabled, supports_user_attribution, name, identifier, description, resolution] Matching Searchable Attributes: [name, identifier, description, resolution] Limited Searchable Attribute: [service_provider_eq] Sortable Attributes: [name, identifier, updated_at, created_at, id] Searchable Associations: [signature_copy, disabled_external_accounts, integrations, suppressions] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.listDisabledSignatures(externalAccountId, include, filter, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsApi#listDisabledSignatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account to retrieve the disabled signatures for |
 **include** | **String**| Related objects that can be included in the response:  service, suppressions See Including Objects for more information. | [optional]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, risk_level, service_id, disabled, supports_user_attribution, name, identifier, description, resolution] Matching Searchable Attributes: [name, identifier, description, resolution] Limited Searchable Attribute: [service_provider_eq] Sortable Attributes: [name, identifier, updated_at, created_at, id] Searchable Associations: [signature_copy, disabled_external_accounts, integrations, suppressions] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="removeComplianceStandard"></a>
# **removeComplianceStandard**
> Meta removeComplianceStandard(externalAccountId, complianceStandardId)

Remove a compliance standard from an external account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsApi;


ExternalAccountsApi apiInstance = new ExternalAccountsApi();
Integer externalAccountId = 56; // Integer | The ID of the external account this compliance standard belongs to
Integer complianceStandardId = 56; // Integer | The ID of the compliance standard that belongs to this external account
try {
    Meta result = apiInstance.removeComplianceStandard(externalAccountId, complianceStandardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsApi#removeComplianceStandard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account this compliance standard belongs to |
 **complianceStandardId** | **Integer**| The ID of the compliance standard that belongs to this external account |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="removeCustomComplianceStandard"></a>
# **removeCustomComplianceStandard**
> Meta removeCustomComplianceStandard(externalAccountId, customComplianceStandardId)

Remove a custom compliance standard from an external account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsApi;


ExternalAccountsApi apiInstance = new ExternalAccountsApi();
Integer externalAccountId = 56; // Integer | The ID of the external account this custom compliance standard belongs to
Integer customComplianceStandardId = 56; // Integer | The ID of the custom compliance standard that belongs to this external account
try {
    Meta result = apiInstance.removeCustomComplianceStandard(externalAccountId, customComplianceStandardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsApi#removeCustomComplianceStandard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account this custom compliance standard belongs to |
 **customComplianceStandardId** | **Integer**| The ID of the custom compliance standard that belongs to this external account |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="removeDisabledSignature"></a>
# **removeDisabledSignature**
> Meta removeDisabledSignature(externalAccountId, signatureId)

Re-enable a signature for an external account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsApi;


ExternalAccountsApi apiInstance = new ExternalAccountsApi();
Integer externalAccountId = 56; // Integer | The ID of the external account to enable a signature on
Integer signatureId = 56; // Integer | The ID of the signature to enable
try {
    Meta result = apiInstance.removeDisabledSignature(externalAccountId, signatureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsApi#removeDisabledSignature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account to enable a signature on |
 **signatureId** | **Integer**| The ID of the signature to enable |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> ExternalAccount show(id, include)

Show a single External Account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsApi;


ExternalAccountsApi apiInstance = new ExternalAccountsApi();
Integer id = 56; // Integer | External Account ID
String include = "include_example"; // String | Related objects that can be included in the response:  organization, sub_organization, team, scan_intervals, disabled_signatures, suppressions, azure_group, credentials See Including Objects for more information.
try {
    ExternalAccount result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| External Account ID |
 **include** | **String**| Related objects that can be included in the response:  organization, sub_organization, team, scan_intervals, disabled_signatures, suppressions, azure_group, credentials See Including Objects for more information. | [optional]

### Return type

[**ExternalAccount**](ExternalAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

