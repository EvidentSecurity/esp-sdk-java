# StatCustomSignaturesApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listForStat**](StatCustomSignaturesApi.md#listForStat) | **GET** api/v2/stats/{stat_id}/custom_signatures.json_api | Statistics for custom signatures
[**show**](StatCustomSignaturesApi.md#show) | **GET** api/v2/stats/custom_signatures/{id}.json_api | Show a single Stat Custom Signature


<a name="listForStat"></a>
# **listForStat**
> PaginatedCollection listForStat(statId, include, filter, page)

Statistics for custom signatures

A successful call to this API returns all the statistics of all the custom signatures for a report identified by the stat_id parameter. Said report contains all statistics for this alert triggered from signatures contained in all custom_signatures for the selected hour.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.StatCustomSignaturesApi;


StatCustomSignaturesApi apiInstance = new StatCustomSignaturesApi();
Integer statId = 56; // Integer | The ID of the stat to retrieve custom signature statistics for
String include = "include_example"; // String | Related objects that can be included in the response:  custom_signature, stat See Including Objects for more information.
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [stat_id, type_id]    
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.listForStat(statId, include, filter, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatCustomSignaturesApi#listForStat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statId** | **Integer**| The ID of the stat to retrieve custom signature statistics for |
 **include** | **String**| Related objects that can be included in the response:  custom_signature, stat See Including Objects for more information. | [optional]
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [stat_id, type_id]     | [optional]
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
> StatCustomSignature show(id, include)

Show a single Stat Custom Signature



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.StatCustomSignaturesApi;


StatCustomSignaturesApi apiInstance = new StatCustomSignaturesApi();
Integer id = 56; // Integer | Stat Custom Signature ID
String include = "include_example"; // String | Related objects that can be included in the response:  custom_signature, stat See Including Objects for more information.
try {
    StatCustomSignature result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatCustomSignaturesApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Stat Custom Signature ID |
 **include** | **String**| Related objects that can be included in the response:  custom_signature, stat See Including Objects for more information. | [optional]

### Return type

[**StatCustomSignature**](StatCustomSignature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

