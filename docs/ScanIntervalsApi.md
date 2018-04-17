# ScanIntervalsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ScanIntervalsApi.md#create) | **POST** api/v2/scan_intervals.json_api | Create a(n) Scan Interval
[**delete**](ScanIntervalsApi.md#delete) | **DELETE** api/v2/scan_intervals/{id}.json_api | Delete a(n) Scan Interval
[**listForExternalAccount**](ScanIntervalsApi.md#listForExternalAccount) | **GET** api/v2/external_accounts/{external_account_id}/scan_intervals.json_api | Get a list of Scan Intervals
[**show**](ScanIntervalsApi.md#show) | **GET** api/v2/scan_intervals/{id}.json_api | Show a single Scan Interval
[**update**](ScanIntervalsApi.md#update) | **PATCH** api/v2/scan_intervals/{id}.json_api | Update a(n) Scan Interval


<a name="create"></a>
# **create**
> ScanInterval create(externalAccountId, interval, serviceId, include)

Create a(n) Scan Interval



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ScanIntervalsApi;


ScanIntervalsApi apiInstance = new ScanIntervalsApi();
Integer externalAccountId = 56; // Integer | The ID of the external account this scan interval is for
Integer interval = 56; // Integer | The interval, in minutes, this service will be scanned
Integer serviceId = 56; // Integer | The service ID for the scan interval
String include = "include_example"; // String | Related objects that can be included in the response:  external_account, service See Including Objects for more information.
try {
    ScanInterval result = apiInstance.create(externalAccountId, interval, serviceId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanIntervalsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account this scan interval is for |
 **interval** | **Integer**| The interval, in minutes, this service will be scanned |
 **serviceId** | **Integer**| The service ID for the scan interval |
 **include** | **String**| Related objects that can be included in the response:  external_account, service See Including Objects for more information. | [optional]

### Return type

[**ScanInterval**](ScanInterval.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="delete"></a>
# **delete**
> Meta delete(id)

Delete a(n) Scan Interval



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ScanIntervalsApi;


ScanIntervalsApi apiInstance = new ScanIntervalsApi();
Integer id = 56; // Integer |  ID
try {
    Meta result = apiInstance.delete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanIntervalsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  ID |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="listForExternalAccount"></a>
# **listForExternalAccount**
> PaginatedCollection listForExternalAccount(externalAccountId, page, include)

Get a list of Scan Intervals



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ScanIntervalsApi;


ScanIntervalsApi apiInstance = new ScanIntervalsApi();
Integer externalAccountId = 56; // Integer | The ID of the external account to retrieve
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  external_account, service See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.listForExternalAccount(externalAccountId, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanIntervalsApi#listForExternalAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account to retrieve |
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  external_account, service See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> ScanInterval show(id, include)

Show a single Scan Interval



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ScanIntervalsApi;


ScanIntervalsApi apiInstance = new ScanIntervalsApi();
Integer id = 56; // Integer | Scan Interval ID
String include = "include_example"; // String | Related objects that can be included in the response:  external_account, service See Including Objects for more information.
try {
    ScanInterval result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanIntervalsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Scan Interval ID |
 **include** | **String**| Related objects that can be included in the response:  external_account, service See Including Objects for more information. | [optional]

### Return type

[**ScanInterval**](ScanInterval.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> ScanInterval update(id, externalAccountId, interval, serviceId, include)

Update a(n) Scan Interval



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ScanIntervalsApi;


ScanIntervalsApi apiInstance = new ScanIntervalsApi();
Integer id = 56; // Integer | Scan Interval ID
Integer externalAccountId = 56; // Integer | The ID of the external account this scan interval is for
Integer interval = 56; // Integer | The interval, in minutes, this service will be scanned
Integer serviceId = 56; // Integer | The service ID for the scan interval
String include = "include_example"; // String | Related objects that can be included in the response:  external_account, service See Including Objects for more information.
try {
    ScanInterval result = apiInstance.update(id, externalAccountId, interval, serviceId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScanIntervalsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Scan Interval ID |
 **externalAccountId** | **Integer**| The ID of the external account this scan interval is for | [optional]
 **interval** | **Integer**| The interval, in minutes, this service will be scanned | [optional]
 **serviceId** | **Integer**| The service ID for the scan interval | [optional]
 **include** | **String**| Related objects that can be included in the response:  external_account, service See Including Objects for more information. | [optional]

### Return type

[**ScanInterval**](ScanInterval.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

