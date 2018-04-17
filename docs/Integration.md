
# Integration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**state** | **String** | The state the integration is in. Valid values are setup, active, error, disabled |  [optional]
**statuses** | **List&lt;String&gt;** | Only send alerts that have the status in this list. Valid values are fail, warn, error, pass, info |  [optional]
**name** | **String** | Name of the integration |  [optional]
**allHighRisk** | **Boolean** | Send all high risk alerts |  [optional]
**allMediumRisk** | **Boolean** | Send all medium risk alerts |  [optional]
**allLowRisk** | **Boolean** | Send all low risk alerts |  [optional]
**sendUpdates** | **Boolean** | This feature enables the integration to send alerts when they are updated. When disabled, alerts will only be sent when they are initially created. When enabled, alerts will additionally be sent when a change is made such as the alert ending. An alert may end for multiple reasons. |  [optional]
**errorMessages** | **List&lt;String&gt;** | Array of error messages |  [optional]
**lastThrottledAt** | [**DateTime**](DateTime.md) | The time at which this integration was last throttled. |  [optional]
**sendWhenSuppressed** | **Boolean** | Send notifications for suppressed alerts |  [optional]
**organization** | [**Organization**](Organization.md) | Associated Organization |  [optional]
**organizationId** | **Integer** | Associated Organization ID |  [optional]
**creator** | [**User**](User.md) | Associated Creator |  [optional]
**creatorId** | **Integer** | Associated Creator ID |  [optional]
**service** | [**Service**](Service.md) | Associated Service |  [optional]
**serviceId** | **Integer** | Associated Service ID |  [optional]
**externalAccounts** | [**List&lt;ExternalAccount&gt;**](ExternalAccount.md) | Associated External Accounts |  [optional]
**externalAccountIds** | **List&lt;Integer&gt;** | Associated External Accounts IDs |  [optional]
**signatures** | [**List&lt;Signature&gt;**](Signature.md) | Associated Signatures |  [optional]
**signatureIds** | **List&lt;Integer&gt;** | Associated Signatures IDs |  [optional]
**customSignatures** | [**List&lt;CustomSignature&gt;**](CustomSignature.md) | Associated Custom Signatures |  [optional]
**customSignatureIds** | **List&lt;Integer&gt;** | Associated Custom Signatures IDs |  [optional]



