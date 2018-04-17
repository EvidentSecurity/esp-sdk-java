# ContactRequestsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ContactRequestsApi.md#create) | **POST** api/v2/contact_requests.json_api | Create a(n) Contact Request


<a name="create"></a>
# **create**
> ContactRequest create(title, description, requestType, include)

Create a(n) Contact Request



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ContactRequestsApi;


ContactRequestsApi apiInstance = new ContactRequestsApi();
String title = "title_example"; // String | Subject of your message
String description = "description_example"; // String | Body of your message
String requestType = "requestType_example"; // String | Type of contact request. Valid values are support, feature
String include = "include_example"; // String | Related objects that can be included in the response:  user See Including Objects for more information.
try {
    ContactRequest result = apiInstance.create(title, description, requestType, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactRequestsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **String**| Subject of your message |
 **description** | **String**| Body of your message |
 **requestType** | **String**| Type of contact request. Valid values are support, feature | [enum: support, feature]
 **include** | **String**| Related objects that can be included in the response:  user See Including Objects for more information. | [optional]

### Return type

[**ContactRequest**](ContactRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

