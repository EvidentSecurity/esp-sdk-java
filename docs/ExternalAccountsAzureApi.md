# ExternalAccountsAzureApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ExternalAccountsAzureApi.md#create) | **POST** api/v2/external_accounts/azure.json_api | Create an Azure External Account
[**resetUrl**](ExternalAccountsAzureApi.md#resetUrl) | **PATCH** api/v2/external_accounts/{external_account_id}/azure/log_url.json_api | Reset Log URL for an Azure External Account
[**show**](ExternalAccountsAzureApi.md#show) | **GET** api/v2/external_accounts/{external_account_id}/azure.json_api | Show an Azure External Account
[**update**](ExternalAccountsAzureApi.md#update) | **PATCH** api/v2/external_accounts/{external_account_id}/azure.json_api | Update an Azure External Account


<a name="create"></a>
# **create**
> ExternalAccountAzure create(appKey, clientId, name, subscriptionId, teamId, tenantId)

Create an Azure External Account

The channel_url will only be returned in this response and will not be accessible again. The related external_account object will be returned with the response.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsAzureApi;


ExternalAccountsAzureApi apiInstance = new ExternalAccountsAzureApi();
String appKey = "appKey_example"; // String | Azure app key
String clientId = "clientId_example"; // String | Azure client ID
String name = "name_example"; // String | Name
String subscriptionId = "subscriptionId_example"; // String | Azure subscription ID
Integer teamId = 56; // Integer | The ID of the team the external account belongs to
String tenantId = "tenantId_example"; // String | Azure tenant ID
try {
    ExternalAccountAzure result = apiInstance.create(appKey, clientId, name, subscriptionId, teamId, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsAzureApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appKey** | **String**| Azure app key |
 **clientId** | **String**| Azure client ID |
 **name** | **String**| Name |
 **subscriptionId** | **String**| Azure subscription ID |
 **teamId** | **Integer**| The ID of the team the external account belongs to |
 **tenantId** | **String**| Azure tenant ID |

### Return type

[**ExternalAccountAzure**](ExternalAccountAzure.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="resetUrl"></a>
# **resetUrl**
> ExternalAccountAzure resetUrl(externalAccountId)

Reset Log URL for an Azure External Account

This endpoint invalidates the previous URL and generates a new one. The channel_url will only be returned in this response and will not be accessible again. The related external_account object will be returned with the response.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsAzureApi;


ExternalAccountsAzureApi apiInstance = new ExternalAccountsAzureApi();
Integer externalAccountId = 56; // Integer | The ID of the external account to reset an Azure log URL for
try {
    ExternalAccountAzure result = apiInstance.resetUrl(externalAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsAzureApi#resetUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account to reset an Azure log URL for |

### Return type

[**ExternalAccountAzure**](ExternalAccountAzure.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> ExternalAccountAzure show(externalAccountId, include)

Show an Azure External Account



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsAzureApi;


ExternalAccountsAzureApi apiInstance = new ExternalAccountsAzureApi();
Integer externalAccountId = 56; // Integer | The ID of the external account to show an Azure credential for
String include = "include_example"; // String | Related objects that can be included in the response:  external_account See Including Objects for more information.
try {
    ExternalAccountAzure result = apiInstance.show(externalAccountId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsAzureApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account to show an Azure credential for |
 **include** | **String**| Related objects that can be included in the response:  external_account See Including Objects for more information. | [optional]

### Return type

[**ExternalAccountAzure**](ExternalAccountAzure.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> ExternalAccountAzure update(externalAccountId, appKey, clientId, name, subscriptionId, teamId, tenantId)

Update an Azure External Account

 The related external_account object will be returned with the response.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.ExternalAccountsAzureApi;


ExternalAccountsAzureApi apiInstance = new ExternalAccountsAzureApi();
Integer externalAccountId = 56; // Integer | The ID of the external account to update an Azure credential for
String appKey = "appKey_example"; // String | Azure app key
String clientId = "clientId_example"; // String | Azure client ID
String name = "name_example"; // String | Name
String subscriptionId = "subscriptionId_example"; // String | Azure subscription ID
Integer teamId = 56; // Integer | The ID of the team the external account belongs to
String tenantId = "tenantId_example"; // String | Azure tenant ID
try {
    ExternalAccountAzure result = apiInstance.update(externalAccountId, appKey, clientId, name, subscriptionId, teamId, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalAccountsAzureApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountId** | **Integer**| The ID of the external account to update an Azure credential for |
 **appKey** | **String**| Azure app key | [optional]
 **clientId** | **String**| Azure client ID | [optional]
 **name** | **String**| Name | [optional]
 **subscriptionId** | **String**| Azure subscription ID | [optional]
 **teamId** | **Integer**| The ID of the team the external account belongs to | [optional]
 **tenantId** | **String**| Azure tenant ID | [optional]

### Return type

[**ExternalAccountAzure**](ExternalAccountAzure.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

