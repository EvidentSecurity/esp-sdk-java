# AlertsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listComplianceControls**](AlertsApi.md#listComplianceControls) | **GET** api/v2/alerts/{alert_id}/compliance_controls.json_api | Get a list of Compliance Controls for an Alert
[**listCustomComplianceControls**](AlertsApi.md#listCustomComplianceControls) | **GET** api/v2/alerts/{alert_id}/custom_compliance_controls.json_api | Get a list of Custom Compliance Controls for an Alert
[**listForReport**](AlertsApi.md#listForReport) | **PUT** api/v2/reports/{report_id}/alerts.json_api | Get a list of Alerts for a Report
[**show**](AlertsApi.md#show) | **GET** api/v2/alerts/{id}.json_api | Show a single Alert


<a name="listComplianceControls"></a>
# **listComplianceControls**
> PaginatedCollection listComplianceControls(alertId, page, include)

Get a list of Compliance Controls for an Alert



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.AlertsApi;


AlertsApi apiInstance = new AlertsApi();
Integer alertId = 56; // Integer | The ID of the alert the compliance controls belong to
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  compliance_standard, compliance_domain, signatures See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.listComplianceControls(alertId, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#listComplianceControls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **Integer**| The ID of the alert the compliance controls belong to |
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  compliance_standard, compliance_domain, signatures See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="listCustomComplianceControls"></a>
# **listCustomComplianceControls**
> PaginatedCollection listCustomComplianceControls(alertId, page, include)

Get a list of Custom Compliance Controls for an Alert



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.AlertsApi;


AlertsApi apiInstance = new AlertsApi();
Integer alertId = 56; // Integer | The ID of the alert the custom compliance controls belong to
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_domain, signatures, custom_signatures See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.listCustomComplianceControls(alertId, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#listCustomComplianceControls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **Integer**| The ID of the alert the custom compliance controls belong to |
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_domain, signatures, custom_signatures See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="listForReport"></a>
# **listForReport**
> PaginatedCollection listForReport(reportId, filter, page, include)

Get a list of Alerts for a Report



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.AlertsApi;


AlertsApi apiInstance = new AlertsApi();
Integer reportId = 56; // Integer | ID of the Report to Return Alerts For
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attribute: [id]  Limited Searchable Attributes: [signature_service_id_in, signature_risk_level_in, risk_level_in, risk_level_eq, resource_or_tag_cont, suppressed, not_suppressed, signature_name_cont, signature_identifier_cont, external_account_id_in, external_account_id_eq, external_account_team_id_in, external_account_team_id_eq, region_id_in, region_id_eq, status_in, status_eq, attribution_present, cloud_trail_events_present, open_as_of, signature_id_in, signature_id_eq, external_account_provider_eq]  
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  external_account, region, signature, custom_signature, suppression, metadata, attribution, cloud_trail_events, tags, compliance_controls, custom_compliance_controls See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.listForReport(reportId, filter, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#listForReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **Integer**| ID of the Report to Return Alerts For |
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attribute: [id]  Limited Searchable Attributes: [signature_service_id_in, signature_risk_level_in, risk_level_in, risk_level_eq, resource_or_tag_cont, suppressed, not_suppressed, signature_name_cont, signature_identifier_cont, external_account_id_in, external_account_id_eq, external_account_team_id_in, external_account_team_id_eq, region_id_in, region_id_eq, status_in, status_eq, attribution_present, cloud_trail_events_present, open_as_of, signature_id_in, signature_id_eq, external_account_provider_eq]   | [optional]
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  external_account, region, signature, custom_signature, suppression, metadata, attribution, cloud_trail_events, tags, compliance_controls, custom_compliance_controls See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> Alert show(id, include)

Show a single Alert



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.AlertsApi;


AlertsApi apiInstance = new AlertsApi();
Integer id = 56; // Integer | Alert ID
String include = "include_example"; // String | Related objects that can be included in the response:  external_account, region, signature, custom_signature, suppression, metadata, attribution, cloud_trail_events, tags, compliance_controls, custom_compliance_controls See Including Objects for more information.
try {
    Alert result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Alert ID |
 **include** | **String**| Related objects that can be included in the response:  external_account, region, signature, custom_signature, suppression, metadata, attribution, cloud_trail_events, tags, compliance_controls, custom_compliance_controls See Including Objects for more information. | [optional]

### Return type

[**Alert**](Alert.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

