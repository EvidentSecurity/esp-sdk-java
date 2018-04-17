# UserAttributionsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addChannel**](UserAttributionsApi.md#addChannel) | **POST** api/v2/external_accounts/{external_account_id}/user_attribution/channel.json_api | Create a User Attribution Channel for an external account
[**removeChannel**](UserAttributionsApi.md#removeChannel) | **DELETE** api/v2/external_accounts/{external_account_id}/user_attribution/channel.json_api | Remove the User Attribution Channel for an external account
[**showChannel**](UserAttributionsApi.md#showChannel) | **GET** api/v2/external_accounts/{external_account_id}/user_attribution/channel.json_api | Show the User Attribution Channel of an external account
[**update**](UserAttributionsApi.md#update) | **PATCH** api/v2/external_accounts/{external_account_id}/user_attribution.json_api | Update the user attributions on an external account


<a name="addChannel"></a>
# **addChannel**
> ExternalAccountUserAttributionChannel addChannel(externalAccountId, include)

Create a User Attribution Channel for an external account

URL will only be returned in this response and will not be accessible again.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.UserAttributionsApi;


UserAttributionsApi apiInstance = new UserAttributionsApi();
Integer externalAccountId = 56; // Integer | The ID of the external account to create a User Attribution Channel for
String include = "include_example"; // String | Related objects that can be included in the response:   See Including Objects for more information.
try {
    ExternalAccountUserAttributionChannel result = apiInstance.addChannel(externalAccountId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAttributionsApi#addChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account to create a User Attribution Channel for |
 **include** | **String**| Related objects that can be included in the response:   See Including Objects for more information. | [optional]

### Return type

[**ExternalAccountUserAttributionChannel**](ExternalAccountUserAttributionChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="removeChannel"></a>
# **removeChannel**
> Meta removeChannel(externalAccountId)

Remove the User Attribution Channel for an external account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.UserAttributionsApi;


UserAttributionsApi apiInstance = new UserAttributionsApi();
Integer externalAccountId = 56; // Integer | The ID of the external account to remove the User Attribution Channel from
try {
    Meta result = apiInstance.removeChannel(externalAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAttributionsApi#removeChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account to remove the User Attribution Channel from |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="showChannel"></a>
# **showChannel**
> ExternalAccountUserAttributionChannel showChannel(externalAccountId, include)

Show the User Attribution Channel of an external account

The channel url will not be returned.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.UserAttributionsApi;


UserAttributionsApi apiInstance = new UserAttributionsApi();
Integer externalAccountId = 56; // Integer | The ID of the external account to show the user attribution channel for
String include = "include_example"; // String | Related objects that can be included in the response:   See Including Objects for more information.
try {
    ExternalAccountUserAttributionChannel result = apiInstance.showChannel(externalAccountId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAttributionsApi#showChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account to show the user attribution channel for |
 **include** | **String**| Related objects that can be included in the response:   See Including Objects for more information. | [optional]

### Return type

[**ExternalAccountUserAttributionChannel**](ExternalAccountUserAttributionChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> ExternalAccount update(externalAccountId, cloudtrailName, include)

Update the user attributions on an external account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.UserAttributionsApi;


UserAttributionsApi apiInstance = new UserAttributionsApi();
Integer externalAccountId = 56; // Integer | The ID of the external account to update the user attributions of
String cloudtrailName = "cloudtrailName_example"; // String | The name of the cloudetrail associated with the user attribution.
String include = "include_example"; // String | Related objects that can be included in the response:  organization, sub_organization, team, scan_intervals, disabled_signatures, suppressions, azure_group, credentials See Including Objects for more information.
try {
    ExternalAccount result = apiInstance.update(externalAccountId, cloudtrailName, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAttributionsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account to update the user attributions of |
 **cloudtrailName** | **String**| The name of the cloudetrail associated with the user attribution. | [optional]
 **include** | **String**| Related objects that can be included in the response:  organization, sub_organization, team, scan_intervals, disabled_signatures, suppressions, azure_group, credentials See Including Objects for more information. | [optional]

### Return type

[**ExternalAccount**](ExternalAccount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

