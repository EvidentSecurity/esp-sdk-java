# IntegrationsWebhookApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](IntegrationsWebhookApi.md#create) | **POST** api/v2/integrations/webhook.json_api | Create a Webhook Integration
[**show**](IntegrationsWebhookApi.md#show) | **GET** api/v2/integrations/{integration_id}/webhook.json_api | Show a single Webhook Integration
[**update**](IntegrationsWebhookApi.md#update) | **PATCH** api/v2/integrations/{integration_id}/webhook.json_api | Update a Webhook Integration


<a name="create"></a>
# **create**
> IntegrationWebhook create(externalAccountIds, name, throttleRate, url, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, sendUpdates, sendWhenSuppressed, signatureIds, statuses)

Create a Webhook Integration



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsWebhookApi;


IntegrationsWebhookApi apiInstance = new IntegrationsWebhookApi();
List<Integer> externalAccountIds = Arrays.asList(56); // List<Integer> | External accounts for integration
String name = "name_example"; // String | Name of the integration
Integer throttleRate = 56; // Integer | The maximum number of alerts that may be sent through the integration every minute.
String url = "url_example"; // String | The URL endpoint for the webhook
String include = "include_example"; // String | Related objects that can be included in the response:  integration See Including Objects for more information.
Boolean allHighRisk = true; // Boolean | Send all high risk alerts
Boolean allLowRisk = true; // Boolean | Send all low risk alerts
Boolean allMediumRisk = true; // Boolean | Send all medium risk alerts
List<Integer> customSignatureIds = Arrays.asList(56); // List<Integer> | Custom signatures for integration
Boolean sendUpdates = true; // Boolean | This feature enables the integration to send alerts when they are updated. When disabled, alerts will only be sent when they are initially created. When enabled, alerts will additionally be sent when a change is made such as the alert ending. An alert may end for multiple reasons.
Boolean sendWhenSuppressed = true; // Boolean | Send notifications for suppressed alerts
List<Integer> signatureIds = Arrays.asList(56); // List<Integer> | Signatures for integration
List<String> statuses = Arrays.asList("statuses_example"); // List<String> | Only send alerts that have the status in this list. Valid values are fail, warn, error, pass, info
try {
    IntegrationWebhook result = apiInstance.create(externalAccountIds, name, throttleRate, url, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, sendUpdates, sendWhenSuppressed, signatureIds, statuses);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsWebhookApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountIds** | [**List&lt;Integer&gt;**](Integer.md)| External accounts for integration |
 **name** | **String**| Name of the integration |
 **throttleRate** | **Integer**| The maximum number of alerts that may be sent through the integration every minute. |
 **url** | **String**| The URL endpoint for the webhook |
 **include** | **String**| Related objects that can be included in the response:  integration See Including Objects for more information. | [optional]
 **allHighRisk** | **Boolean**| Send all high risk alerts | [optional]
 **allLowRisk** | **Boolean**| Send all low risk alerts | [optional]
 **allMediumRisk** | **Boolean**| Send all medium risk alerts | [optional]
 **customSignatureIds** | [**List&lt;Integer&gt;**](Integer.md)| Custom signatures for integration | [optional]
 **sendUpdates** | **Boolean**| This feature enables the integration to send alerts when they are updated. When disabled, alerts will only be sent when they are initially created. When enabled, alerts will additionally be sent when a change is made such as the alert ending. An alert may end for multiple reasons. | [optional]
 **sendWhenSuppressed** | **Boolean**| Send notifications for suppressed alerts | [optional]
 **signatureIds** | [**List&lt;Integer&gt;**](Integer.md)| Signatures for integration | [optional]
 **statuses** | [**List&lt;String&gt;**](String.md)| Only send alerts that have the status in this list. Valid values are fail, warn, error, pass, info | [optional]

### Return type

[**IntegrationWebhook**](IntegrationWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> IntegrationWebhook show(integrationId, include)

Show a single Webhook Integration



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsWebhookApi;


IntegrationsWebhookApi apiInstance = new IntegrationsWebhookApi();
Integer integrationId = 56; // Integer | The ID of the integration
String include = "include_example"; // String | Related objects that can be included in the response:  integration See Including Objects for more information.
try {
    IntegrationWebhook result = apiInstance.show(integrationId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsWebhookApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **Integer**| The ID of the integration |
 **include** | **String**| Related objects that can be included in the response:  integration See Including Objects for more information. | [optional]

### Return type

[**IntegrationWebhook**](IntegrationWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> IntegrationWebhook update(integrationId, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, externalAccountIds, name, sendUpdates, sendWhenSuppressed, signatureIds, statuses, throttleRate, url)

Update a Webhook Integration



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsWebhookApi;


IntegrationsWebhookApi apiInstance = new IntegrationsWebhookApi();
Integer integrationId = 56; // Integer | The ID of the integration
String include = "include_example"; // String | Related objects that can be included in the response:  integration See Including Objects for more information.
Boolean allHighRisk = true; // Boolean | Send all high risk alerts
Boolean allLowRisk = true; // Boolean | Send all low risk alerts
Boolean allMediumRisk = true; // Boolean | Send all medium risk alerts
List<Integer> customSignatureIds = Arrays.asList(56); // List<Integer> | Custom signatures for integration
List<Integer> externalAccountIds = Arrays.asList(56); // List<Integer> | External accounts for integration
String name = "name_example"; // String | Name of the integration
Boolean sendUpdates = true; // Boolean | This feature enables the integration to send alerts when they are updated. When disabled, alerts will only be sent when they are initially created. When enabled, alerts will additionally be sent when a change is made such as the alert ending. An alert may end for multiple reasons.
Boolean sendWhenSuppressed = true; // Boolean | Send notifications for suppressed alerts
List<Integer> signatureIds = Arrays.asList(56); // List<Integer> | Signatures for integration
List<String> statuses = Arrays.asList("statuses_example"); // List<String> | Only send alerts that have the status in this list. Valid values are fail, warn, error, pass, info
Integer throttleRate = 56; // Integer | The maximum number of alerts that may be sent through the integration every minute.
String url = "url_example"; // String | The URL endpoint for the webhook
try {
    IntegrationWebhook result = apiInstance.update(integrationId, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, externalAccountIds, name, sendUpdates, sendWhenSuppressed, signatureIds, statuses, throttleRate, url);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsWebhookApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **Integer**| The ID of the integration |
 **include** | **String**| Related objects that can be included in the response:  integration See Including Objects for more information. | [optional]
 **allHighRisk** | **Boolean**| Send all high risk alerts | [optional]
 **allLowRisk** | **Boolean**| Send all low risk alerts | [optional]
 **allMediumRisk** | **Boolean**| Send all medium risk alerts | [optional]
 **customSignatureIds** | [**List&lt;Integer&gt;**](Integer.md)| Custom signatures for integration | [optional]
 **externalAccountIds** | [**List&lt;Integer&gt;**](Integer.md)| External accounts for integration | [optional]
 **name** | **String**| Name of the integration | [optional]
 **sendUpdates** | **Boolean**| This feature enables the integration to send alerts when they are updated. When disabled, alerts will only be sent when they are initially created. When enabled, alerts will additionally be sent when a change is made such as the alert ending. An alert may end for multiple reasons. | [optional]
 **sendWhenSuppressed** | **Boolean**| Send notifications for suppressed alerts | [optional]
 **signatureIds** | [**List&lt;Integer&gt;**](Integer.md)| Signatures for integration | [optional]
 **statuses** | [**List&lt;String&gt;**](String.md)| Only send alerts that have the status in this list. Valid values are fail, warn, error, pass, info | [optional]
 **throttleRate** | **Integer**| The maximum number of alerts that may be sent through the integration every minute. | [optional]
 **url** | **String**| The URL endpoint for the webhook | [optional]

### Return type

[**IntegrationWebhook**](IntegrationWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

