# IntegrationsJiraApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](IntegrationsJiraApi.md#create) | **POST** api/v2/integrations/jira.json_api | Create a JIRA Integration
[**show**](IntegrationsJiraApi.md#show) | **GET** api/v2/integrations/{integration_id}/jira.json_api | Show a single Jira Integration
[**update**](IntegrationsJiraApi.md#update) | **PATCH** api/v2/integrations/{integration_id}/jira.json_api | Update a JIRA Integration


<a name="create"></a>
# **create**
> IntegrationJira create(url, projectKey, issueType, username, password, name, externalAccountIds, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, customSignatureIds, include)

Create a JIRA Integration



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsJiraApi;


IntegrationsJiraApi apiInstance = new IntegrationsJiraApi();
String url = "url_example"; // String | The host and port portion of the Jira REST API URL
String projectKey = "projectKey_example"; // String | The designated Key for your Jira project
String issueType = "issueType_example"; // String | The Issue Type for ESP Alerts
String username = "username_example"; // String | A username to access the Jira project
String password = "password_example"; // String | A password to access the JIRA project
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
    IntegrationJira result = apiInstance.create(url, projectKey, issueType, username, password, name, externalAccountIds, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, customSignatureIds, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsJiraApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**| The host and port portion of the Jira REST API URL |
 **projectKey** | **String**| The designated Key for your Jira project |
 **issueType** | **String**| The Issue Type for ESP Alerts |
 **username** | **String**| A username to access the Jira project |
 **password** | **String**| A password to access the JIRA project |
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

[**IntegrationJira**](IntegrationJira.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> IntegrationJira show(integrationId, include)

Show a single Jira Integration

Password is not returned.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsJiraApi;


IntegrationsJiraApi apiInstance = new IntegrationsJiraApi();
Integer integrationId = 56; // Integer | The ID of the integration
String include = "include_example"; // String | Related objects that can be included in the response:  integration See Including Objects for more information.
try {
    IntegrationJira result = apiInstance.show(integrationId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsJiraApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **Integer**| The ID of the integration |
 **include** | **String**| Related objects that can be included in the response:  integration See Including Objects for more information. | [optional]

### Return type

[**IntegrationJira**](IntegrationJira.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> IntegrationJira update(integrationId, url, projectKey, issueType, username, password, name, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, externalAccountIds, customSignatureIds, include)

Update a JIRA Integration



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsJiraApi;


IntegrationsJiraApi apiInstance = new IntegrationsJiraApi();
Integer integrationId = 56; // Integer | The ID of the integration
String url = "url_example"; // String | The host and port portion of the Jira REST API URL
String projectKey = "projectKey_example"; // String | The designated Key for your Jira project
String issueType = "issueType_example"; // String | The Issue Type for ESP Alerts
String username = "username_example"; // String | A username to access the Jira project
String password = "password_example"; // String | A password to access the JIRA project
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
    IntegrationJira result = apiInstance.update(integrationId, url, projectKey, issueType, username, password, name, allHighRisk, allMediumRisk, allLowRisk, sendUpdates, sendWhenSuppressed, signatureIds, statuses, externalAccountIds, customSignatureIds, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsJiraApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **Integer**| The ID of the integration |
 **url** | **String**| The host and port portion of the Jira REST API URL | [optional]
 **projectKey** | **String**| The designated Key for your Jira project | [optional]
 **issueType** | **String**| The Issue Type for ESP Alerts | [optional]
 **username** | **String**| A username to access the Jira project | [optional]
 **password** | **String**| A password to access the JIRA project | [optional]
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

[**IntegrationJira**](IntegrationJira.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

