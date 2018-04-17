# ReportsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ReportsApi.md#create) | **POST** api/v2/reports.json_api | Create a(n) Report
[**list**](ReportsApi.md#list) | **PUT** api/v2/reports.json_api | Get a list of Reports
[**show**](ReportsApi.md#show) | **GET** api/v2/reports/{id}.json_api | Show a single Report


<a name="create"></a>
# **create**
> Report create(teamId, include)

Create a(n) Report



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
Integer teamId = 56; // Integer | The ID of the team to create a report for
String include = "include_example"; // String | Related objects that can be included in the response:  organization, sub_organization, team, external_account, stat See Including Objects for more information.
try {
    Report result = apiInstance.create(teamId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **Integer**| The ID of the team to create a report for |
 **include** | **String**| Related objects that can be included in the response:  organization, sub_organization, team, external_account, stat See Including Objects for more information. | [optional]

### Return type

[**Report**](Report.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="list"></a>
# **list**
> PaginatedCollection list(filter, page, include)

Get a list of Reports



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, created_at]  Limited Searchable Attributes: [external_account_arn_eq, external_account_provider_eq] Sortable Attributes: [created_at, id] Searchable Associations: [organization, sub_organization, team, external_account] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  organization, sub_organization, team, external_account, stat See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.list(filter, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, created_at]  Limited Searchable Attributes: [external_account_arn_eq, external_account_provider_eq] Sortable Attributes: [created_at, id] Searchable Associations: [organization, sub_organization, team, external_account] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  organization, sub_organization, team, external_account, stat See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> Report show(id, include)

Show a single Report



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ReportsApi;


ReportsApi apiInstance = new ReportsApi();
Integer id = 56; // Integer | Report ID
String include = "include_example"; // String | Related objects that can be included in the response:  organization, sub_organization, team, external_account, stat See Including Objects for more information.
try {
    Report result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Report ID |
 **include** | **String**| Related objects that can be included in the response:  organization, sub_organization, team, external_account, stat See Including Objects for more information. | [optional]

### Return type

[**Report**](Report.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

