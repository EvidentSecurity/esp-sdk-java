# SubscriptionsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**show**](SubscriptionsApi.md#show) | **GET** api/v2/subscriptions/{id}.json_api | Show a single Subscription


<a name="show"></a>
# **show**
> Subscription show(id, include)

Show a single Subscription



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SubscriptionsApi;


SubscriptionsApi apiInstance = new SubscriptionsApi();
Integer id = 56; // Integer | Subscription ID
String include = "include_example"; // String | Related objects that can be included in the response:  organization, plan See Including Objects for more information.
try {
    Subscription result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Subscription ID |
 **include** | **String**| Related objects that can be included in the response:  organization, plan See Including Objects for more information. | [optional]

### Return type

[**Subscription**](Subscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

