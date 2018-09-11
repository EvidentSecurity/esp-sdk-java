# SuppressionsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SuppressionsApi.md#create) | **POST** api/v2/suppressions.json_api | Create a suppression
[**createFromAlert**](SuppressionsApi.md#createFromAlert) | **POST** api/v2/suppressions/alerts.json_api | Creates a suppression from an alert
[**deactivate**](SuppressionsApi.md#deactivate) | **PATCH** api/v2/suppressions/{id}/deactivate.json_api | Deactivate a suppression
[**list**](SuppressionsApi.md#list) | **PUT** api/v2/suppressions.json_api | Get a list of Suppressions
[**show**](SuppressionsApi.md#show) | **GET** api/v2/suppressions/{id}.json_api | Show a single Suppression
[**update**](SuppressionsApi.md#update) | **PATCH** api/v2/suppressions/{id}.json_api | Update a(n) Suppression


<a name="create"></a>
# **create**
> Suppression create(externalAccountIds, reason, regions, include, customSignatureIds, includeNewAccounts, resource, signatureIds)

Create a suppression



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SuppressionsApi;


SuppressionsApi apiInstance = new SuppressionsApi();
List<Integer> externalAccountIds = Arrays.asList(56); // List<Integer> | IDs of external accounts to be suppressed
String reason = "reason_example"; // String | The reason for the suppresion
List<String> regions = Arrays.asList("regions_example"); // List<String> | Codes of regions to be suppressed
String include = "include_example"; // String | Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information.
List<Integer> customSignatureIds = Arrays.asList(56); // List<Integer> | IDs of custom signatures to be suppressed
Boolean includeNewAccounts = true; // Boolean | When enabled, automatically adds new accounts to this suppression. This field can only be set by an organization level user.
String resource = "resource_example"; // String | The resource string this suppression will suppress alerts for
List<Integer> signatureIds = Arrays.asList(56); // List<Integer> | IDs of signatures to be suppressed
try {
    Suppression result = apiInstance.create(externalAccountIds, reason, regions, include, customSignatureIds, includeNewAccounts, resource, signatureIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuppressionsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountIds** | [**List&lt;Integer&gt;**](Integer.md)| IDs of external accounts to be suppressed |
 **reason** | **String**| The reason for the suppresion |
 **regions** | [**List&lt;String&gt;**](String.md)| Codes of regions to be suppressed |
 **include** | **String**| Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information. | [optional]
 **customSignatureIds** | [**List&lt;Integer&gt;**](Integer.md)| IDs of custom signatures to be suppressed | [optional]
 **includeNewAccounts** | **Boolean**| When enabled, automatically adds new accounts to this suppression. This field can only be set by an organization level user. | [optional]
 **resource** | **String**| The resource string this suppression will suppress alerts for | [optional]
 **signatureIds** | [**List&lt;Integer&gt;**](Integer.md)| IDs of signatures to be suppressed | [optional]

### Return type

[**Suppression**](Suppression.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="createFromAlert"></a>
# **createFromAlert**
> Suppression createFromAlert(alertId, reason, include)

Creates a suppression from an alert

A successful call to this API creates a new suppression based on the supplied alert_id. The body of the request must contain a json api compliant hash of the suppression reason and an alert id.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SuppressionsApi;


SuppressionsApi apiInstance = new SuppressionsApi();
Integer alertId = 56; // Integer | The ID for the alert you want to create a suppression for
String reason = "reason_example"; // String | The reason for creating the suppression
String include = "include_example"; // String | Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information.
try {
    Suppression result = apiInstance.createFromAlert(alertId, reason, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuppressionsApi#createFromAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **Integer**| The ID for the alert you want to create a suppression for |
 **reason** | **String**| The reason for creating the suppression |
 **include** | **String**| Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information. | [optional]

### Return type

[**Suppression**](Suppression.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="deactivate"></a>
# **deactivate**
> Suppression deactivate(id, include)

Deactivate a suppression



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SuppressionsApi;


SuppressionsApi apiInstance = new SuppressionsApi();
Integer id = 56; // Integer | Suppression ID
String include = "include_example"; // String | Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information.
try {
    Suppression result = apiInstance.deactivate(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuppressionsApi#deactivate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Suppression ID |
 **include** | **String**| Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information. | [optional]

### Return type

[**Suppression**](Suppression.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="list"></a>
# **list**
> PaginatedCollection list(include, filter, page)

Get a list of Suppressions



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SuppressionsApi;


SuppressionsApi apiInstance = new SuppressionsApi();
String include = "include_example"; // String | Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information.
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, aasm_state, status, suppression_type, resource, reason] Matching Searchable Attributes: [resource, reason]  Sortable Attributes: [updated_at, created_at, id, status] Searchable Associations: [regions, external_accounts, created_by, user, signatures, custom_signatures] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.list(include, filter, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuppressionsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include** | **String**| Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information. | [optional]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, aasm_state, status, suppression_type, resource, reason] Matching Searchable Attributes: [resource, reason]  Sortable Attributes: [updated_at, created_at, id, status] Searchable Associations: [regions, external_accounts, created_by, user, signatures, custom_signatures] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
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
> Suppression show(id, include)

Show a single Suppression



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SuppressionsApi;


SuppressionsApi apiInstance = new SuppressionsApi();
Integer id = 56; // Integer | Suppression ID
String include = "include_example"; // String | Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information.
try {
    Suppression result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuppressionsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Suppression ID |
 **include** | **String**| Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information. | [optional]

### Return type

[**Suppression**](Suppression.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> Suppression update(id, include, customSignatureIds, externalAccountIds, includeNewAccounts, reason, regions, resource, signatureIds)

Update a(n) Suppression



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SuppressionsApi;


SuppressionsApi apiInstance = new SuppressionsApi();
Integer id = 56; // Integer | Suppression ID
String include = "include_example"; // String | Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information.
List<Integer> customSignatureIds = Arrays.asList(56); // List<Integer> | IDs of custom signatures to be suppressed
List<Integer> externalAccountIds = Arrays.asList(56); // List<Integer> | IDs of external accounts to be suppressed
Boolean includeNewAccounts = true; // Boolean | When enabled, automatically adds new accounts to this suppression. This field can only be set by an organization level user.
String reason = "reason_example"; // String | The reason for the suppresion
List<String> regions = Arrays.asList("regions_example"); // List<String> | Codes of regions to be suppressed
String resource = "resource_example"; // String | The resource string this suppression will suppress alerts for
List<Integer> signatureIds = Arrays.asList(56); // List<Integer> | IDs of signatures to be suppressed
try {
    Suppression result = apiInstance.update(id, include, customSignatureIds, externalAccountIds, includeNewAccounts, reason, regions, resource, signatureIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuppressionsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Suppression ID |
 **include** | **String**| Related objects that can be included in the response:  organization, created_by, regions, external_accounts, signatures, custom_signatures See Including Objects for more information. | [optional]
 **customSignatureIds** | [**List&lt;Integer&gt;**](Integer.md)| IDs of custom signatures to be suppressed | [optional]
 **externalAccountIds** | [**List&lt;Integer&gt;**](Integer.md)| IDs of external accounts to be suppressed | [optional]
 **includeNewAccounts** | **Boolean**| When enabled, automatically adds new accounts to this suppression. This field can only be set by an organization level user. | [optional]
 **reason** | **String**| The reason for the suppresion | [optional]
 **regions** | [**List&lt;String&gt;**](String.md)| Codes of regions to be suppressed | [optional]
 **resource** | **String**| The resource string this suppression will suppress alerts for | [optional]
 **signatureIds** | [**List&lt;Integer&gt;**](Integer.md)| IDs of signatures to be suppressed | [optional]

### Return type

[**Suppression**](Suppression.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

