# ComplianceStandardsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list**](ComplianceStandardsApi.md#list) | **PUT** api/v2/compliance_standards.json_api | Get a list of Compliance Standards
[**show**](ComplianceStandardsApi.md#show) | **GET** api/v2/compliance_standards/{id}.json_api | Show a single Compliance Standard


<a name="list"></a>
# **list**
> PaginatedCollection list(filter, page, include)

Get a list of Compliance Standards



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ComplianceStandardsApi;


ComplianceStandardsApi apiInstance = new ComplianceStandardsApi();
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, name] Matching Searchable Attribute: [name]  Sortable Attributes: [id, name] Searchable Associations: [compliance_controls, organizations] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  compliance_domains, compliance_controls See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.list(filter, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplianceStandardsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, name] Matching Searchable Attribute: [name]  Sortable Attributes: [id, name] Searchable Associations: [compliance_controls, organizations] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  compliance_domains, compliance_controls See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> ComplianceStandard show(id, include)

Show a single Compliance Standard



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ComplianceStandardsApi;


ComplianceStandardsApi apiInstance = new ComplianceStandardsApi();
Integer id = 56; // Integer | Compliance Standard ID
String include = "include_example"; // String | Related objects that can be included in the response:  compliance_domains, compliance_controls See Including Objects for more information.
try {
    ComplianceStandard result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComplianceStandardsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Compliance Standard ID |
 **include** | **String**| Related objects that can be included in the response:  compliance_domains, compliance_controls See Including Objects for more information. | [optional]

### Return type

[**ComplianceStandard**](ComplianceStandard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

