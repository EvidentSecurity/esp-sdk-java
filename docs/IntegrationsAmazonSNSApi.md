# IntegrationsAmazonSNSApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](IntegrationsAmazonSNSApi.md#create) | **POST** api/v2/integrations/amazon_sns.json_api | Create an Amazon SNS Integration
[**show**](IntegrationsAmazonSNSApi.md#show) | **GET** api/v2/integrations/{integration_id}/amazon_sns.json_api | Show a single Amazon SNS Integration
[**update**](IntegrationsAmazonSNSApi.md#update) | **PATCH** api/v2/integrations/{integration_id}/amazon_sns.json_api | Update an Amazon SNS Integration


<a name="create"></a>
# **create**
> IntegrationAmazonSns create(arn, externalId, topic, name, externalAccountIds, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, customSignatureIds, include)

Create an Amazon SNS Integration



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsAmazonSNSApi;


IntegrationsAmazonSNSApi apiInstance = new IntegrationsAmazonSNSApi();
String arn = "arn_example"; // String | The role arn for accessing the SNS topic
String externalId = "externalId_example"; // String | The external ID for the IAM role
String topic = "topic_example"; // String | The SNS topic arn
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
String include = "include_example"; // String | Related objects that can be included in the response:  region, integration See Including Objects for more information.
try {
    IntegrationAmazonSns result = apiInstance.create(arn, externalId, topic, name, externalAccountIds, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, customSignatureIds, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsAmazonSNSApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **arn** | **String**| The role arn for accessing the SNS topic |
 **externalId** | **String**| The external ID for the IAM role |
 **topic** | **String**| The SNS topic arn |
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
 **include** | **String**| Related objects that can be included in the response:  region, integration See Including Objects for more information. | [optional]

### Return type

[**IntegrationAmazonSns**](IntegrationAmazonSns.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> IntegrationAmazonSns show(integrationId, include)

Show a single Amazon SNS Integration



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsAmazonSNSApi;


IntegrationsAmazonSNSApi apiInstance = new IntegrationsAmazonSNSApi();
Integer integrationId = 56; // Integer | The ID of the integration
String include = "include_example"; // String | Related objects that can be included in the response:  region, integration See Including Objects for more information.
try {
    IntegrationAmazonSns result = apiInstance.show(integrationId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsAmazonSNSApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **Integer**| The ID of the integration |
 **include** | **String**| Related objects that can be included in the response:  region, integration See Including Objects for more information. | [optional]

### Return type

[**IntegrationAmazonSns**](IntegrationAmazonSns.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> IntegrationAmazonSns update(integrationId, arn, externalId, topic, name, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, externalAccountIds, customSignatureIds, include)

Update an Amazon SNS Integration



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsAmazonSNSApi;


IntegrationsAmazonSNSApi apiInstance = new IntegrationsAmazonSNSApi();
Integer integrationId = 56; // Integer | The ID of the integration
String arn = "arn_example"; // String | The role arn for accessing the SNS topic
String externalId = "externalId_example"; // String | The external ID for the IAM role
String topic = "topic_example"; // String | The SNS topic arn
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
String include = "include_example"; // String | Related objects that can be included in the response:  region, integration See Including Objects for more information.
try {
    IntegrationAmazonSns result = apiInstance.update(integrationId, arn, externalId, topic, name, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, externalAccountIds, customSignatureIds, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsAmazonSNSApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **Integer**| The ID of the integration |
 **arn** | **String**| The role arn for accessing the SNS topic | [optional]
 **externalId** | **String**| The external ID for the IAM role | [optional]
 **topic** | **String**| The SNS topic arn | [optional]
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
 **include** | **String**| Related objects that can be included in the response:  region, integration See Including Objects for more information. | [optional]

### Return type

[**IntegrationAmazonSns**](IntegrationAmazonSns.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

