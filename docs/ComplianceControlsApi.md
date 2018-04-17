# ComplianceControlsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list**](ComplianceControlsApi.md#list) | **PUT** api/v2/compliance_controls.json_api | Get a list of Compliance Controls
[**listSignatures**](ComplianceControlsApi.md#listSignatures) | **GET** api/v2/compliance_controls/{compliance_control_id}/signatures.json_api | Get a list of Signatures for a Compliance Control
[**show**](ComplianceControlsApi.md#show) | **GET** api/v2/compliance_controls/{id}.json_api | Show a single Compliance Control


<a name="list"></a>
# **list**
> PaginatedCollection list(filter, page, include)

Get a list of Compliance Controls



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ComplianceControlsApi;


ComplianceControlsApi apiInstance = new ComplianceControlsApi();
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, identifier, name] Matching Searchable Attributes: [identifier, name]  Sortable Attributes: [id, identifier, name, position] Searchable Associations: [compliance_standard, compliance_domain] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  compliance_standard, compliance_domain, signatures See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.list(filter, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplianceControlsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, identifier, name] Matching Searchable Attributes: [identifier, name]  Sortable Attributes: [id, identifier, name, position] Searchable Associations: [compliance_standard, compliance_domain] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  compliance_standard, compliance_domain, signatures See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="listSignatures"></a>
# **listSignatures**
> PaginatedCollection listSignatures(complianceControlId, page, include)

Get a list of Signatures for a Compliance Control

The compliance standard must be paid for to view signatures for a control on that standard.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ComplianceControlsApi;


ComplianceControlsApi apiInstance = new ComplianceControlsApi();
Integer complianceControlId = 56; // Integer | The ID of the Compliance Control this signature belongs to
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  service, suppressions See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.listSignatures(complianceControlId, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplianceControlsApi#listSignatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceControlId** | **Integer**| The ID of the Compliance Control this signature belongs to |
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  service, suppressions See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> ComplianceControl show(id, include)

Show a single Compliance Control



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ComplianceControlsApi;


ComplianceControlsApi apiInstance = new ComplianceControlsApi();
Integer id = 56; // Integer | Compliance Control ID
String include = "include_example"; // String | Related objects that can be included in the response:  compliance_standard, compliance_domain, signatures See Including Objects for more information.
try {
    ComplianceControl result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplianceControlsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Compliance Control ID |
 **include** | **String**| Related objects that can be included in the response:  compliance_standard, compliance_domain, signatures See Including Objects for more information. | [optional]

### Return type

[**ComplianceControl**](ComplianceControl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

