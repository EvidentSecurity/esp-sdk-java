# AuditLogExportApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**requestFile**](AuditLogExportApi.md#requestFile) | **POST** api/v2/audit_logs/export/files.json_api | Export an Audit Log File
[**showFileDetails**](AuditLogExportApi.md#showFileDetails) | **GET** api/v2/audit_logs/export/files/{id}.json_api | Show a single Audit Log File


<a name="requestFile"></a>
# **requestFile**
> AuditLogFile requestFile(include)

Export an Audit Log File

An email will be sent to the user(having organization level access) requesting creation once the file is ready for download. The file will have all audit logs for the organization in CSV format.  The URL and filename in the response will be blank on create but will be present in the response on the show endpoint once the export has been generated.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.AuditLogExportApi;


AuditLogExportApi apiInstance = new AuditLogExportApi();
String include = "include_example"; // String | Related objects that can be included in the response:  organization, user See Including Objects for more information.
try {
    AuditLogFile result = apiInstance.requestFile(include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogExportApi#requestFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include** | **String**| Related objects that can be included in the response:  organization, user See Including Objects for more information. | [optional]

### Return type

[**AuditLogFile**](AuditLogFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="showFileDetails"></a>
# **showFileDetails**
> AuditLogFile showFileDetails(id, include)

Show a single Audit Log File

The URL returned will expire and will no longer work after the expiration

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.AuditLogExportApi;


AuditLogExportApi apiInstance = new AuditLogExportApi();
Integer id = 56; // Integer | Audit Log File ID
String include = "include_example"; // String | Related objects that can be included in the response:  organization, user See Including Objects for more information.
try {
    AuditLogFile result = apiInstance.showFileDetails(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditLogExportApi#showFileDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Audit Log File ID |
 **include** | **String**| Related objects that can be included in the response:  organization, user See Including Objects for more information. | [optional]

### Return type

[**AuditLogFile**](AuditLogFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

