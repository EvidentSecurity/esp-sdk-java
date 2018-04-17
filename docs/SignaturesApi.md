# SignaturesApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list**](SignaturesApi.md#list) | **PUT** api/v2/signatures.json_api | Get a list of Signatures
[**listDisabledExternalAccounts**](SignaturesApi.md#listDisabledExternalAccounts) | **GET** api/v2/signatures/{signature_id}/disabled_external_accounts.json_api | Get a list of disabled External Accounts for a signature
[**listWithCustomRiskLevelForExternalAccount**](SignaturesApi.md#listWithCustomRiskLevelForExternalAccount) | **PUT** api/v2/external_accounts/{external_account_id}/signature_custom_risk_levels.json_api | Get A list of Signatures with default and custom risk levels for an External Account
[**removeCustomRiskLevelForExternalAccount**](SignaturesApi.md#removeCustomRiskLevelForExternalAccount) | **DELETE** api/v2/external_accounts/{external_account_id}/signature_custom_risk_levels/{signature_id}.json_api | Remove a custom risk level to a Signature for an External Account
[**setCustomRiskLevelForExternalAccount**](SignaturesApi.md#setCustomRiskLevelForExternalAccount) | **POST** api/v2/external_accounts/{external_account_id}/signature_custom_risk_levels.json_api | Add a custom risk level to a Signature for an External Account
[**show**](SignaturesApi.md#show) | **GET** api/v2/signatures/{id}.json_api | Show a single Signature
[**updateCustomRiskLevelForExternalAccount**](SignaturesApi.md#updateCustomRiskLevelForExternalAccount) | **PATCH** api/v2/external_accounts/{external_account_id}/signature_custom_risk_levels/{signature_id}.json_api | Update a Signature&#39;s custom risk level for an External Account


<a name="list"></a>
# **list**
> PaginatedCollection list(filter, page, include)

Get a list of Signatures



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SignaturesApi;


SignaturesApi apiInstance = new SignaturesApi();
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, risk_level, service_id, disabled, supports_user_attribution, name, identifier, description, resolution] Matching Searchable Attributes: [name, identifier, description, resolution] Limited Searchable Attribute: [service_provider_eq] Sortable Attributes: [name, identifier, updated_at, created_at, id] Searchable Associations: [signature_copy, disabled_external_accounts, integrations, suppressions] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  service, suppressions See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.list(filter, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignaturesApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, risk_level, service_id, disabled, supports_user_attribution, name, identifier, description, resolution] Matching Searchable Attributes: [name, identifier, description, resolution] Limited Searchable Attribute: [service_provider_eq] Sortable Attributes: [name, identifier, updated_at, created_at, id] Searchable Associations: [signature_copy, disabled_external_accounts, integrations, suppressions] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  service, suppressions See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="listDisabledExternalAccounts"></a>
# **listDisabledExternalAccounts**
> PaginatedCollection listDisabledExternalAccounts(filter, page, include)

Get a list of disabled External Accounts for a signature



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SignaturesApi;


SignaturesApi apiInstance = new SignaturesApi();
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, nickname, name] Matching Searchable Attributes: [nickname, name] Limited Searchable Attributes: [account_eq, arn_eq, provider_eq, subscription_id_eq] Sortable Attributes: [name, updated_at, created_at, id] Searchable Associations: [organization, sub_organization, team, compliance_standards, azure_group, disabled_signatures, suppressions] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  organization, sub_organization, team, scan_intervals, disabled_signatures, suppressions, azure_group, credentials See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.listDisabledExternalAccounts(filter, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignaturesApi#listDisabledExternalAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, nickname, name] Matching Searchable Attributes: [nickname, name] Limited Searchable Attributes: [account_eq, arn_eq, provider_eq, subscription_id_eq] Sortable Attributes: [name, updated_at, created_at, id] Searchable Associations: [organization, sub_organization, team, compliance_standards, azure_group, disabled_signatures, suppressions] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  organization, sub_organization, team, scan_intervals, disabled_signatures, suppressions, azure_group, credentials See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="listWithCustomRiskLevelForExternalAccount"></a>
# **listWithCustomRiskLevelForExternalAccount**
> PaginatedCollection listWithCustomRiskLevelForExternalAccount(externalAccountId, page, include, filter)

Get A list of Signatures with default and custom risk levels for an External Account

Return only signatures that have a custom risk level set by searching with &#x60;filter:{custom_risk_level_present: 1}&#x60;

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SignaturesApi;


SignaturesApi apiInstance = new SignaturesApi();
Integer externalAccountId = 56; // Integer | The ID of the external account to retrieve
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  service, suppressions See Including Objects for more information.
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, risk_level, service_id, disabled, supports_user_attribution, name, identifier, description, resolution] Matching Searchable Attributes: [name, identifier, description, resolution] Limited Searchable Attributes: [custom_risk_level_present, service_provider_eq] Sortable Attributes: [name, identifier, updated_at, created_at, id] Searchable Associations: [signature_copy, disabled_external_accounts, integrations, suppressions] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
try {
    PaginatedCollection result = apiInstance.listWithCustomRiskLevelForExternalAccount(externalAccountId, page, include, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignaturesApi#listWithCustomRiskLevelForExternalAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account to retrieve |
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  service, suppressions See Including Objects for more information. | [optional]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, risk_level, service_id, disabled, supports_user_attribution, name, identifier, description, resolution] Matching Searchable Attributes: [name, identifier, description, resolution] Limited Searchable Attributes: [custom_risk_level_present, service_provider_eq] Sortable Attributes: [name, identifier, updated_at, created_at, id] Searchable Associations: [signature_copy, disabled_external_accounts, integrations, suppressions] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="removeCustomRiskLevelForExternalAccount"></a>
# **removeCustomRiskLevelForExternalAccount**
> Meta removeCustomRiskLevelForExternalAccount(externalAccountId, signatureId)

Remove a custom risk level to a Signature for an External Account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SignaturesApi;


SignaturesApi apiInstance = new SignaturesApi();
Integer externalAccountId = 56; // Integer | The ID of the external account this signature custom risk level is for
Integer signatureId = 56; // Integer | The signature ID this signature custom risk level is for
try {
    Meta result = apiInstance.removeCustomRiskLevelForExternalAccount(externalAccountId, signatureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignaturesApi#removeCustomRiskLevelForExternalAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account this signature custom risk level is for |
 **signatureId** | **Integer**| The signature ID this signature custom risk level is for |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="setCustomRiskLevelForExternalAccount"></a>
# **setCustomRiskLevelForExternalAccount**
> Signature setCustomRiskLevelForExternalAccount(externalAccountId, signatureId, riskLevel, include)

Add a custom risk level to a Signature for an External Account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SignaturesApi;


SignaturesApi apiInstance = new SignaturesApi();
Integer externalAccountId = 56; // Integer | The ID of the external account this signature custom risk level is for
Integer signatureId = 56; // Integer | The signature ID this signature custom risk level is for
String riskLevel = "riskLevel_example"; // String | The custom risk-level of the problem identified by the signature for this external_account. Valid values are low, medium, high
String include = "include_example"; // String | Related objects that can be included in the response:  service, suppressions See Including Objects for more information.
try {
    Signature result = apiInstance.setCustomRiskLevelForExternalAccount(externalAccountId, signatureId, riskLevel, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignaturesApi#setCustomRiskLevelForExternalAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account this signature custom risk level is for |
 **signatureId** | **Integer**| The signature ID this signature custom risk level is for |
 **riskLevel** | **String**| The custom risk-level of the problem identified by the signature for this external_account. Valid values are low, medium, high | [enum: low, medium, high]
 **include** | **String**| Related objects that can be included in the response:  service, suppressions See Including Objects for more information. | [optional]

### Return type

[**Signature**](Signature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> Signature show(id, include)

Show a single Signature



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SignaturesApi;


SignaturesApi apiInstance = new SignaturesApi();
Integer id = 56; // Integer | Signature ID
String include = "include_example"; // String | Related objects that can be included in the response:  service, suppressions See Including Objects for more information.
try {
    Signature result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignaturesApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Signature ID |
 **include** | **String**| Related objects that can be included in the response:  service, suppressions See Including Objects for more information. | [optional]

### Return type

[**Signature**](Signature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="updateCustomRiskLevelForExternalAccount"></a>
# **updateCustomRiskLevelForExternalAccount**
> Signature updateCustomRiskLevelForExternalAccount(externalAccountId, signatureId, riskLevel, include)

Update a Signature&#39;s custom risk level for an External Account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SignaturesApi;


SignaturesApi apiInstance = new SignaturesApi();
Integer externalAccountId = 56; // Integer | The ID of the external account this signature custom risk level is for
Integer signatureId = 56; // Integer | The signature ID this signature custom risk level is for
String riskLevel = "riskLevel_example"; // String | The custom risk-level of the problem identified by the signature for this external_account. Valid values are low, medium, high
String include = "include_example"; // String | Related objects that can be included in the response:  service, suppressions See Including Objects for more information.
try {
    Signature result = apiInstance.updateCustomRiskLevelForExternalAccount(externalAccountId, signatureId, riskLevel, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SignaturesApi#updateCustomRiskLevelForExternalAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account this signature custom risk level is for |
 **signatureId** | **Integer**| The signature ID this signature custom risk level is for |
 **riskLevel** | **String**| The custom risk-level of the problem identified by the signature for this external_account. Valid values are low, medium, high | [optional] [enum: low, medium, high]
 **include** | **String**| Related objects that can be included in the response:  service, suppressions See Including Objects for more information. | [optional]

### Return type

[**Signature**](Signature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

