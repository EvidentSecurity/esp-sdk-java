# IntegrationsServiceNowApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](IntegrationsServiceNowApi.md#create) | **POST** api/v2/integrations/servicenow.json_api | Create a ServiceNow Integration
[**show**](IntegrationsServiceNowApi.md#show) | **GET** api/v2/integrations/{integration_id}/servicenow.json_api | Show a single ServiceNow Integration
[**update**](IntegrationsServiceNowApi.md#update) | **PATCH** api/v2/integrations/{integration_id}/servicenow.json_api | Update a ServiceNow Integration


<a name="create"></a>
# **create**
> IntegrationServicenow create(externalAccountIds, incidentType, instanceUrl, name, password, username, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, sendUpdates, sendWhenSuppressed, signatureIds, statuses)

Create a ServiceNow Integration



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsServiceNowApi;


IntegrationsServiceNowApi apiInstance = new IntegrationsServiceNowApi();
List<Integer> externalAccountIds = Arrays.asList(56); // List<Integer> | External accounts for integration
String incidentType = "incidentType_example"; // String | The password for accessing the ServiceNow instance. Valid values are incident, sn_si_incident
String instanceUrl = "instanceUrl_example"; // String | The URL for the ServiceNow instance
String name = "name_example"; // String | Name of the integration
String password = "password_example"; // String | A password to access the JIRA project
String username = "username_example"; // String | The username for accessing the ServiceNow instance
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
    IntegrationServicenow result = apiInstance.create(externalAccountIds, incidentType, instanceUrl, name, password, username, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, sendUpdates, sendWhenSuppressed, signatureIds, statuses);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsServiceNowApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalAccountIds** | [**List&lt;Integer&gt;**](Integer.md)| External accounts for integration |
 **incidentType** | **String**| The password for accessing the ServiceNow instance. Valid values are incident, sn_si_incident | [enum: incident, sn_si_incident]
 **instanceUrl** | **String**| The URL for the ServiceNow instance |
 **name** | **String**| Name of the integration |
 **password** | **String**| A password to access the JIRA project |
 **username** | **String**| The username for accessing the ServiceNow instance |
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

[**IntegrationServicenow**](IntegrationServicenow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> IntegrationServicenow show(integrationId, include)

Show a single ServiceNow Integration



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsServiceNowApi;


IntegrationsServiceNowApi apiInstance = new IntegrationsServiceNowApi();
Integer integrationId = 56; // Integer | The ID of the integration
String include = "include_example"; // String | Related objects that can be included in the response:  integration See Including Objects for more information.
try {
    IntegrationServicenow result = apiInstance.show(integrationId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsServiceNowApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **Integer**| The ID of the integration |
 **include** | **String**| Related objects that can be included in the response:  integration See Including Objects for more information. | [optional]

### Return type

[**IntegrationServicenow**](IntegrationServicenow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> IntegrationServicenow update(integrationId, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, externalAccountIds, incidentType, instanceUrl, name, password, sendUpdates, sendWhenSuppressed, signatureIds, statuses, username)

Update a ServiceNow Integration



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.IntegrationsServiceNowApi;


IntegrationsServiceNowApi apiInstance = new IntegrationsServiceNowApi();
Integer integrationId = 56; // Integer | The ID of the integration
String include = "include_example"; // String | Related objects that can be included in the response:  integration See Including Objects for more information.
Boolean allHighRisk = true; // Boolean | Send all high risk alerts
Boolean allLowRisk = true; // Boolean | Send all low risk alerts
Boolean allMediumRisk = true; // Boolean | Send all medium risk alerts
List<Integer> customSignatureIds = Arrays.asList(56); // List<Integer> | Custom signatures for integration
List<Integer> externalAccountIds = Arrays.asList(56); // List<Integer> | External accounts for integration
String incidentType = "incidentType_example"; // String | The password for accessing the ServiceNow instance. Valid values are incident, sn_si_incident
String instanceUrl = "instanceUrl_example"; // String | The URL for the ServiceNow instance
String name = "name_example"; // String | Name of the integration
String password = "password_example"; // String | A password to access the JIRA project
Boolean sendUpdates = true; // Boolean | This feature enables the integration to send alerts when they are updated. When disabled, alerts will only be sent when they are initially created. When enabled, alerts will additionally be sent when a change is made such as the alert ending. An alert may end for multiple reasons.
Boolean sendWhenSuppressed = true; // Boolean | Send notifications for suppressed alerts
List<Integer> signatureIds = Arrays.asList(56); // List<Integer> | Signatures for integration
List<String> statuses = Arrays.asList("statuses_example"); // List<String> | Only send alerts that have the status in this list. Valid values are fail, warn, error, pass, info
String username = "username_example"; // String | The username for accessing the ServiceNow instance
try {
    IntegrationServicenow result = apiInstance.update(integrationId, include, allHighRisk, allLowRisk, allMediumRisk, customSignatureIds, externalAccountIds, incidentType, instanceUrl, name, password, sendUpdates, sendWhenSuppressed, signatureIds, statuses, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsServiceNowApi#update");
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
 **incidentType** | **String**| The password for accessing the ServiceNow instance. Valid values are incident, sn_si_incident | [optional] [enum: incident, sn_si_incident]
 **instanceUrl** | **String**| The URL for the ServiceNow instance | [optional]
 **name** | **String**| Name of the integration | [optional]
 **password** | **String**| A password to access the JIRA project | [optional]
 **sendUpdates** | **Boolean**| This feature enables the integration to send alerts when they are updated. When disabled, alerts will only be sent when they are initially created. When enabled, alerts will additionally be sent when a change is made such as the alert ending. An alert may end for multiple reasons. | [optional]
 **sendWhenSuppressed** | **Boolean**| Send notifications for suppressed alerts | [optional]
 **signatureIds** | [**List&lt;Integer&gt;**](Integer.md)| Signatures for integration | [optional]
 **statuses** | [**List&lt;String&gt;**](String.md)| Only send alerts that have the status in this list. Valid values are fail, warn, error, pass, info | [optional]
 **username** | **String**| The username for accessing the ServiceNow instance | [optional]

### Return type

[**IntegrationServicenow**](IntegrationServicenow.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

