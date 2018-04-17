# IntegrationsHipchatApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](IntegrationsHipchatApi.md#create) | **POST** api/v2/integrations/hipchat.json_api | Create a Hipchat Integration
[**show**](IntegrationsHipchatApi.md#show) | **GET** api/v2/integrations/{integration_id}/hipchat.json_api | Show a single Hipchat Integration
[**update**](IntegrationsHipchatApi.md#update) | **PATCH** api/v2/integrations/{integration_id}/hipchat.json_api | Update a Hipchat Integration


<a name="create"></a>
# **create**
> IntegrationHipchat create(token, room, name, externalAccountIds, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, customSignatureIds, include)

Create a Hipchat Integration



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsHipchatApi;


IntegrationsHipchatApi apiInstance = new IntegrationsHipchatApi();
String token = "token_example"; // String | The Hipchat token
String room = "room_example"; // String | The Hipchat room
String name = "name_example"; // String | Name of the integration
List<Integer> externalAccountIds = Arrays.asList(56); // List<Integer> | External accounts for integration
Boolean allHighRisk = true; // Boolean | Send all high risk alerts
Boolean allMediumRisk = true; // Boolean | Send all medium risk alerts
Boolean allLowRisk = true; // Boolean | Send all low risk alerts
Boolean sendUpdates = true; // Boolean | This feature enables the integration to send alerts when they are updated. When disabled, alerts will only be sent when they are initially created. When enabled, alerts will additionally be sent when a change is made such as the alert ending. An alert may end for multiple reasons.
Boolean sendWhenSuppressed = true; // Boolean | Send notifications for suppressed alerts
List<Integer> signatureIds = Arrays.asList(56); // List<Integer> | Signatures for integration
List<String> statuses = Arrays.asList("statuses_example"); // List<String> | Only send alerts that have the status in this list. Valid values are fail, warn, error, pass, info
List<Integer> customSignatureIds = Arrays.asList(56); // List<Integer> | Custom signatures for integration
String include = "include_example"; // String | Related objects that can be included in the response:  integration See Including Objects for more information.
try {
    IntegrationHipchat result = apiInstance.create(token, room, name, externalAccountIds, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, customSignatureIds, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsHipchatApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| The Hipchat token |
 **room** | **String**| The Hipchat room |
 **name** | **String**| Name of the integration |
 **externalAccountIds** | [**List&lt;Integer&gt;**](Integer.md)| External accounts for integration |
 **allHighRisk** | **Boolean**| Send all high risk alerts | [optional]
 **allMediumRisk** | **Boolean**| Send all medium risk alerts | [optional]
 **allLowRisk** | **Boolean**| Send all low risk alerts | [optional]
 **sendUpdates** | **Boolean**| This feature enables the integration to send alerts when they are updated. When disabled, alerts will only be sent when they are initially created. When enabled, alerts will additionally be sent when a change is made such as the alert ending. An alert may end for multiple reasons. | [optional]
 **sendWhenSuppressed** | **Boolean**| Send notifications for suppressed alerts | [optional]
 **signatureIds** | [**List&lt;Integer&gt;**](Integer.md)| Signatures for integration | [optional]
 **statuses** | [**List&lt;String&gt;**](String.md)| Only send alerts that have the status in this list. Valid values are fail, warn, error, pass, info | [optional]
 **customSignatureIds** | [**List&lt;Integer&gt;**](Integer.md)| Custom signatures for integration | [optional]
 **include** | **String**| Related objects that can be included in the response:  integration See Including Objects for more information. | [optional]

### Return type

[**IntegrationHipchat**](IntegrationHipchat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> IntegrationHipchat show(integrationId, include)

Show a single Hipchat Integration



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsHipchatApi;


IntegrationsHipchatApi apiInstance = new IntegrationsHipchatApi();
Integer integrationId = 56; // Integer | The ID of the integration
String include = "include_example"; // String | Related objects that can be included in the response:  integration See Including Objects for more information.
try {
    IntegrationHipchat result = apiInstance.show(integrationId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsHipchatApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **Integer**| The ID of the integration |
 **include** | **String**| Related objects that can be included in the response:  integration See Including Objects for more information. | [optional]

### Return type

[**IntegrationHipchat**](IntegrationHipchat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> IntegrationHipchat update(integrationId, token, room, name, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, externalAccountIds, customSignatureIds, include)

Update a Hipchat Integration



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsHipchatApi;


IntegrationsHipchatApi apiInstance = new IntegrationsHipchatApi();
Integer integrationId = 56; // Integer | The ID of the integration
String token = "token_example"; // String | The Hipchat token
String room = "room_example"; // String | The Hipchat room
String name = "name_example"; // String | Name of the integration
Boolean allHighRisk = true; // Boolean | Send all high risk alerts
Boolean allMediumRisk = true; // Boolean | Send all medium risk alerts
Boolean allLowRisk = true; // Boolean | Send all low risk alerts
Boolean sendUpdates = true; // Boolean | This feature enables the integration to send alerts when they are updated. When disabled, alerts will only be sent when they are initially created. When enabled, alerts will additionally be sent when a change is made such as the alert ending. An alert may end for multiple reasons.
Boolean sendWhenSuppressed = true; // Boolean | Send notifications for suppressed alerts
List<Integer> signatureIds = Arrays.asList(56); // List<Integer> | Signatures for integration
List<String> statuses = Arrays.asList("statuses_example"); // List<String> | Only send alerts that have the status in this list. Valid values are fail, warn, error, pass, info
List<Integer> externalAccountIds = Arrays.asList(56); // List<Integer> | External accounts for integration
List<Integer> customSignatureIds = Arrays.asList(56); // List<Integer> | Custom signatures for integration
String include = "include_example"; // String | Related objects that can be included in the response:  integration See Including Objects for more information.
try {
    IntegrationHipchat result = apiInstance.update(integrationId, token, room, name, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, externalAccountIds, customSignatureIds, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsHipchatApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **Integer**| The ID of the integration |
 **token** | **String**| The Hipchat token | [optional]
 **room** | **String**| The Hipchat room | [optional]
 **name** | **String**| Name of the integration | [optional]
 **allHighRisk** | **Boolean**| Send all high risk alerts | [optional]
 **allMediumRisk** | **Boolean**| Send all medium risk alerts | [optional]
 **allLowRisk** | **Boolean**| Send all low risk alerts | [optional]
 **sendUpdates** | **Boolean**| This feature enables the integration to send alerts when they are updated. When disabled, alerts will only be sent when they are initially created. When enabled, alerts will additionally be sent when a change is made such as the alert ending. An alert may end for multiple reasons. | [optional]
 **sendWhenSuppressed** | **Boolean**| Send notifications for suppressed alerts | [optional]
 **signatureIds** | [**List&lt;Integer&gt;**](Integer.md)| Signatures for integration | [optional]
 **statuses** | [**List&lt;String&gt;**](String.md)| Only send alerts that have the status in this list. Valid values are fail, warn, error, pass, info | [optional]
 **externalAccountIds** | [**List&lt;Integer&gt;**](Integer.md)| External accounts for integration | [optional]
 **customSignatureIds** | [**List&lt;Integer&gt;**](Integer.md)| Custom signatures for integration | [optional]
 **include** | **String**| Related objects that can be included in the response:  integration See Including Objects for more information. | [optional]

### Return type

[**IntegrationHipchat**](IntegrationHipchat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

