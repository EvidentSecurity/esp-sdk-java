# ScheduledExportsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateExport**](ScheduledExportsApi.md#activateExport) | **PATCH** api/v2/scheduled_exports/{scheduled_export_id}/activate.json_api | Update a(n) Scheduled Export
[**create**](ScheduledExportsApi.md#create) | **POST** api/v2/scheduled_exports.json_api | Create a(n) Scheduled Export
[**delete**](ScheduledExportsApi.md#delete) | **DELETE** api/v2/scheduled_exports/{id}.json_api | Delete a(n) Scheduled Export
[**disableExport**](ScheduledExportsApi.md#disableExport) | **PATCH** api/v2/scheduled_exports/{scheduled_export_id}/disable.json_api | Update a(n) Scheduled Export
[**list**](ScheduledExportsApi.md#list) | **PUT** api/v2/scheduled_exports.json_api | Get a list of Scheduled Exports
[**show**](ScheduledExportsApi.md#show) | **GET** api/v2/scheduled_exports/{id}.json_api | Show a single Scheduled Export
[**showFileDetails**](ScheduledExportsApi.md#showFileDetails) | **GET** api/v2/reports/scheduled_export/files/{uuid}.json_api | Show a single Scheduled Export Result
[**unsubscribeExport**](ScheduledExportsApi.md#unsubscribeExport) | **PATCH** api/v2/scheduled_exports/{uuid}/unsubscribe.json_api | Update a(n) Scheduled Export
[**update**](ScheduledExportsApi.md#update) | **PATCH** api/v2/scheduled_exports/{id}.json_api | Update a(n) Scheduled Export


<a name="activateExport"></a>
# **activateExport**
> ScheduledExport activateExport(scheduledExportId, include)

Update a(n) Scheduled Export



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ScheduledExportsApi;


ScheduledExportsApi apiInstance = new ScheduledExportsApi();
Integer scheduledExportId = 56; // Integer | The id of the scheduled export to be activated
String include = "include_example"; // String | Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information.
try {
    ScheduledExport result = apiInstance.activateExport(scheduledExportId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledExportsApi#activateExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduledExportId** | **Integer**| The id of the scheduled export to be activated |
 **include** | **String**| Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information. | [optional]

### Return type

[**ScheduledExport**](ScheduledExport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="create"></a>
# **create**
> ScheduledExport create(externalAccountIds, frequency, hour, timeZone, include, day, filter, name, recipients)

Create a(n) Scheduled Export



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ScheduledExportsApi;


ScheduledExportsApi apiInstance = new ScheduledExportsApi();
List<Integer> externalAccountIds = Arrays.asList(56); // List<Integer> | The ids of the external accounts the report will be exported for
String frequency = "frequency_example"; // String | Frequency of the export. Valid values are weekly, daily, monthly
Integer hour = 56; // Integer | Hour of the day to perform the export. Valid values are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23
String timeZone = "timeZone_example"; // String | Time zone to use when calculating hour and day
String include = "include_example"; // String | Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information.
String day = "day_example"; // String | Day of the week or day of the month to perform the export.  Allowed Values: Daily: nil - Weekly: sunday, monday, tuesday, wednesday, thursday, friday, or saturday - Monthly: 1 to 31. Valid values are sunday, monday, tuesday, wednesday, thursday, friday, saturday, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31
Map<String, String> filter = new HashMap(); // Map<String, String> | Params used to filter the alerts that will be exported
String name = "name_example"; // String | A name that describes the export
List<String> recipients = Arrays.asList("recipients_example"); // List<String> | Email addresses the export will be sent to
try {
    ScheduledExport result = apiInstance.create(externalAccountIds, frequency, hour, timeZone, include, day, filter, name, recipients);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledExportsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountIds** | [**List&lt;Integer&gt;**](Integer.md)| The ids of the external accounts the report will be exported for |
 **frequency** | **String**| Frequency of the export. Valid values are weekly, daily, monthly | [enum: weekly, daily, monthly]
 **hour** | **Integer**| Hour of the day to perform the export. Valid values are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 |
 **timeZone** | **String**| Time zone to use when calculating hour and day |
 **include** | **String**| Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information. | [optional]
 **day** | **String**| Day of the week or day of the month to perform the export.  Allowed Values: Daily: nil - Weekly: sunday, monday, tuesday, wednesday, thursday, friday, or saturday - Monthly: 1 to 31. Valid values are sunday, monday, tuesday, wednesday, thursday, friday, saturday, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 | [optional] [enum: sunday, monday, tuesday, wednesday, thursday, friday, saturday, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Params used to filter the alerts that will be exported | [optional]
 **name** | **String**| A name that describes the export | [optional]
 **recipients** | [**List&lt;String&gt;**](String.md)| Email addresses the export will be sent to | [optional]

### Return type

[**ScheduledExport**](ScheduledExport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="delete"></a>
# **delete**
> Meta delete(id)

Delete a(n) Scheduled Export



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ScheduledExportsApi;


ScheduledExportsApi apiInstance = new ScheduledExportsApi();
Integer id = 56; // Integer | Scheduled Export ID
try {
    Meta result = apiInstance.delete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledExportsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Scheduled Export ID |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="disableExport"></a>
# **disableExport**
> ScheduledExport disableExport(scheduledExportId, include)

Update a(n) Scheduled Export



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ScheduledExportsApi;


ScheduledExportsApi apiInstance = new ScheduledExportsApi();
Integer scheduledExportId = 56; // Integer | The id of the scheduled export to be disabled
String include = "include_example"; // String | Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information.
try {
    ScheduledExport result = apiInstance.disableExport(scheduledExportId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledExportsApi#disableExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduledExportId** | **Integer**| The id of the scheduled export to be disabled |
 **include** | **String**| Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information. | [optional]

### Return type

[**ScheduledExport**](ScheduledExport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="list"></a>
# **list**
> PaginatedCollection list(include, filter, page)

Get a list of Scheduled Exports



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ScheduledExportsApi;


ScheduledExportsApi apiInstance = new ScheduledExportsApi();
String include = "include_example"; // String | Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information.
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, hour, day, status, recipients, time_zone, name] Matching Searchable Attributes: [recipients, time_zone, name] Limited Searchable Attribute: [frequency_eq] Sortable Attributes: [updated_at, created_at, id, name] Searchable Associations: [creator, external_accounts] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.list(include, filter, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledExportsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include** | **String**| Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information. | [optional]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, hour, day, status, recipients, time_zone, name] Matching Searchable Attributes: [recipients, time_zone, name] Limited Searchable Attribute: [frequency_eq] Sortable Attributes: [updated_at, created_at, id, name] Searchable Associations: [creator, external_accounts] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
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
> ScheduledExport show(id, include)

Show a single Scheduled Export



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ScheduledExportsApi;


ScheduledExportsApi apiInstance = new ScheduledExportsApi();
Integer id = 56; // Integer | Scheduled Export ID
String include = "include_example"; // String | Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information.
try {
    ScheduledExport result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledExportsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Scheduled Export ID |
 **include** | **String**| Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information. | [optional]

### Return type

[**ScheduledExport**](ScheduledExport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="showFileDetails"></a>
# **showFileDetails**
> ScheduledExportResult showFileDetails(uuid, include)

Show a single Scheduled Export Result

The URL provided is temporary and will expire shortly after the request. To download the exported file you will need to follow the URL provided.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ScheduledExportsApi;


ScheduledExportsApi apiInstance = new ScheduledExportsApi();
String uuid = "uuid_example"; // String | The uuid to access the result
String include = "include_example"; // String | Related objects that can be included in the response:  scheduled_export See Including Objects for more information.
try {
    ScheduledExportResult result = apiInstance.showFileDetails(uuid, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledExportsApi#showFileDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid to access the result |
 **include** | **String**| Related objects that can be included in the response:  scheduled_export See Including Objects for more information. | [optional]

### Return type

[**ScheduledExportResult**](ScheduledExportResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="unsubscribeExport"></a>
# **unsubscribeExport**
> ScheduledExport unsubscribeExport(uuid, email, include)

Update a(n) Scheduled Export



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ScheduledExportsApi;


ScheduledExportsApi apiInstance = new ScheduledExportsApi();
String uuid = "uuid_example"; // String | The uuid of the export to unsubscribe
String email = "email_example"; // String | The email to unsubscribe. Nested under: \"data\": { \"meta\": { \"email\": ... } }
String include = "include_example"; // String | Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information.
try {
    ScheduledExport result = apiInstance.unsubscribeExport(uuid, email, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledExportsApi#unsubscribeExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the export to unsubscribe |
 **email** | **String**| The email to unsubscribe. Nested under: \&quot;data\&quot;: { \&quot;meta\&quot;: { \&quot;email\&quot;: ... } } |
 **include** | **String**| Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information. | [optional]

### Return type

[**ScheduledExport**](ScheduledExport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> ScheduledExport update(id, include, day, externalAccountIds, filter, hour, name, recipients, timeZone)

Update a(n) Scheduled Export



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ScheduledExportsApi;


ScheduledExportsApi apiInstance = new ScheduledExportsApi();
Integer id = 56; // Integer | Scheduled Export ID
String include = "include_example"; // String | Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information.
String day = "day_example"; // String | Day of the week or day of the month to perform the export.  Allowed Values: Daily: nil - Weekly: sunday, monday, tuesday, wednesday, thursday, friday, or saturday - Monthly: 1 to 31. Valid values are sunday, monday, tuesday, wednesday, thursday, friday, saturday, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31
List<Integer> externalAccountIds = Arrays.asList(56); // List<Integer> | The ids of the external accounts the report will be exported for
Map<String, String> filter = new HashMap(); // Map<String, String> | Params used to filter the alerts that will be exported
Integer hour = 56; // Integer | Hour of the day to perform the export. Valid values are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23
String name = "name_example"; // String | A name that describes the export
List<String> recipients = Arrays.asList("recipients_example"); // List<String> | Email addresses the export will be sent to
String timeZone = "timeZone_example"; // String | Time zone to use when calculating hour and day
try {
    ScheduledExport result = apiInstance.update(id, include, day, externalAccountIds, filter, hour, name, recipients, timeZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledExportsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Scheduled Export ID |
 **include** | **String**| Related objects that can be included in the response:  external_accounts, creator See Including Objects for more information. | [optional]
 **day** | **String**| Day of the week or day of the month to perform the export.  Allowed Values: Daily: nil - Weekly: sunday, monday, tuesday, wednesday, thursday, friday, or saturday - Monthly: 1 to 31. Valid values are sunday, monday, tuesday, wednesday, thursday, friday, saturday, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 | [optional] [enum: sunday, monday, tuesday, wednesday, thursday, friday, saturday, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31]
 **externalAccountIds** | [**List&lt;Integer&gt;**](Integer.md)| The ids of the external accounts the report will be exported for | [optional]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Params used to filter the alerts that will be exported | [optional]
 **hour** | **Integer**| Hour of the day to perform the export. Valid values are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 | [optional]
 **name** | **String**| A name that describes the export | [optional]
 **recipients** | [**List&lt;String&gt;**](String.md)| Email addresses the export will be sent to | [optional]
 **timeZone** | **String**| Time zone to use when calculating hour and day | [optional]

### Return type

[**ScheduledExport**](ScheduledExport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

