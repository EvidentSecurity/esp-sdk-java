# StatsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**forReport**](StatsApi.md#forReport) | **GET** api/v2/reports/{report_id}/stats.json_api | Stats for a report
[**latestForTeams**](StatsApi.md#latestForTeams) | **PUT** api/v2/stats/latest_for_teams.json_api | Stats for teams
[**show**](StatsApi.md#show) | **GET** api/v2/stats/{id}.json_api | Show a single Stat


<a name="forReport"></a>
# **forReport**
> Stat forReport(reportId, include)

Stats for a report

A successful call to this API returns all the stats of all the alerts for a report identified by the report_id parameter. Said report contains all statistics for this alert triggered from signatures contained in all regions for the selected hour.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.StatsApi;


StatsApi apiInstance = new StatsApi();
Integer reportId = 56; // Integer | The ID of the report to retrieve stats for
String include = "include_example"; // String | Related objects that can be included in the response:  report, regions, services, signatures, custom_signatures, custom_compliance_controls, compliance_controls See Including Objects for more information.
try {
    Stat result = apiInstance.forReport(reportId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsApi#forReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **Integer**| The ID of the report to retrieve stats for |
 **include** | **String**| Related objects that can be included in the response:  report, regions, services, signatures, custom_signatures, custom_compliance_controls, compliance_controls See Including Objects for more information. | [optional]

### Return type

[**Stat**](Stat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="latestForTeams"></a>
# **latestForTeams**
> PaginatedCollection latestForTeams(filter, page, include)

Stats for teams

A successful call to this API returns all the stats for the most recent report of each team accessible by the given API key

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.StatsApi;


StatsApi apiInstance = new StatsApi();
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.      Searchable Association: [report] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  report, regions, services, signatures, custom_signatures, custom_compliance_controls, compliance_controls See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.latestForTeams(filter, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsApi#latestForTeams");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.      Searchable Association: [report] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  report, regions, services, signatures, custom_signatures, custom_compliance_controls, compliance_controls See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> Stat show(id, include)

Show a single Stat



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.StatsApi;


StatsApi apiInstance = new StatsApi();
Integer id = 56; // Integer | Stat ID
String include = "include_example"; // String | Related objects that can be included in the response:  report, regions, services, signatures, custom_signatures, custom_compliance_controls, compliance_controls See Including Objects for more information.
try {
    Stat result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Stat ID |
 **include** | **String**| Related objects that can be included in the response:  report, regions, services, signatures, custom_signatures, custom_compliance_controls, compliance_controls See Including Objects for more information. | [optional]

### Return type

[**Stat**](Stat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

