# ComplianceDomainsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list**](ComplianceDomainsApi.md#list) | **PUT** api/v2/compliance_domains.json_api | Get a list of Compliance Domains
[**show**](ComplianceDomainsApi.md#show) | **GET** api/v2/compliance_domains/{id}.json_api | Show a single Compliance Domain


<a name="list"></a>
# **list**
> PaginatedCollection list(include, filter, page)

Get a list of Compliance Domains



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ComplianceDomainsApi;


ComplianceDomainsApi apiInstance = new ComplianceDomainsApi();
String include = "include_example"; // String | Related objects that can be included in the response:  compliance_standard, compliance_controls See Including Objects for more information.
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, position, identifier, name] Matching Searchable Attributes: [identifier, name]  Sortable Attributes: [id, identifier, name, position] Searchable Association: [compliance_standard] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.list(include, filter, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplianceDomainsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include** | **String**| Related objects that can be included in the response:  compliance_standard, compliance_controls See Including Objects for more information. | [optional]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, position, identifier, name] Matching Searchable Attributes: [identifier, name]  Sortable Attributes: [id, identifier, name, position] Searchable Association: [compliance_standard] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
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
> ComplianceDomain show(id, include)

Show a single Compliance Domain



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ComplianceDomainsApi;


ComplianceDomainsApi apiInstance = new ComplianceDomainsApi();
Integer id = 56; // Integer | Compliance Domain ID
String include = "include_example"; // String | Related objects that can be included in the response:  compliance_standard, compliance_controls See Including Objects for more information.
try {
    ComplianceDomain result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplianceDomainsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Compliance Domain ID |
 **include** | **String**| Related objects that can be included in the response:  compliance_standard, compliance_controls See Including Objects for more information. | [optional]

### Return type

[**ComplianceDomain**](ComplianceDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

