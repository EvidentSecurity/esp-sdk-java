# ReportExportApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**requestFile**](ReportExportApi.md#requestFile) | **POST** api/v2/reports/export/files.json_api | Export all alerts for a set of reports to a file
[**sendToIntegration**](ReportExportApi.md#sendToIntegration) | **POST** api/v2/reports/export/integrations.json_api | Export all alerts on reports to an integration
[**showFileDetails**](ReportExportApi.md#showFileDetails) | **GET** api/v2/reports/export/files/{id}.json_api | Show a single Exported Report


<a name="requestFile"></a>
# **requestFile**
> ExportedReport requestFile(reportIds, requestedFormat, include, filter)

Export all alerts for a set of reports to a file

&lt;p&gt;An email will be sent to the calling user once the file is ready for download.&lt;/p&gt; &lt;p&gt;The URL and filename attributes will be blank on create. When exporting is complete these attributes will be filled in and can be viewed using the show action.&lt;/p&gt;

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ReportExportApi;


ReportExportApi apiInstance = new ReportExportApi();
List<Integer> reportIds = Arrays.asList(56); // List<Integer> | An array of report IDs to export alerts for
String requestedFormat = "requestedFormat_example"; // String | The file format of the export. Valid values are csv, json, pdf
String include = "include_example"; // String | Related objects that can be included in the response:  user See Including Objects for more information.
Map<String, String> filter = new HashMap(); // Map<String, String> | Params used to filter the alerts that will be exported
try {
    ExportedReport result = apiInstance.requestFile(reportIds, requestedFormat, include, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportExportApi#requestFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportIds** | [**List&lt;Integer&gt;**](Integer.md)| An array of report IDs to export alerts for |
 **requestedFormat** | **String**| The file format of the export. Valid values are csv, json, pdf | [enum: csv, json, pdf]
 **include** | **String**| Related objects that can be included in the response:  user See Including Objects for more information. | [optional]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Params used to filter the alerts that will be exported | [optional]

### Return type

[**ExportedReport**](ExportedReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="sendToIntegration"></a>
# **sendToIntegration**
> Meta sendToIntegration(integrationId, reportIds, filter)

Export all alerts on reports to an integration



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ReportExportApi;


ReportExportApi apiInstance = new ReportExportApi();
Integer integrationId = 56; // Integer | The ID of the integration to send the alerts to
List<Integer> reportIds = Arrays.asList(56); // List<Integer> | An array of report IDs
Map<String, String> filter = new HashMap(); // Map<String, String> | Params used to filter the alerts that will be exported
try {
    Meta result = apiInstance.sendToIntegration(integrationId, reportIds, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportExportApi#sendToIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **Integer**| The ID of the integration to send the alerts to |
 **reportIds** | [**List&lt;Integer&gt;**](Integer.md)| An array of report IDs |
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Params used to filter the alerts that will be exported | [optional]

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="showFileDetails"></a>
# **showFileDetails**
> ExportedReport showFileDetails(id, include)

Show a single Exported Report

The URL provided is temporary and will expire shortly after the request. To download the exported file you will need to follow the URL provided.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ReportExportApi;


ReportExportApi apiInstance = new ReportExportApi();
Integer id = 56; // Integer | Exported Report ID
String include = "include_example"; // String | Related objects that can be included in the response:  user See Including Objects for more information.
try {
    ExportedReport result = apiInstance.showFileDetails(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportExportApi#showFileDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Exported Report ID |
 **include** | **String**| Related objects that can be included in the response:  user See Including Objects for more information. | [optional]

### Return type

[**ExportedReport**](ExportedReport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

