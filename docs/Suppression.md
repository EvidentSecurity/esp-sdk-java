
# Suppression

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**reason** | **String** | The reason for the suppresion |  [optional]
**resource** | **String** | The resource string this suppression will suppress alerts for |  [optional]
**status** | **String** | The status of this suppresion. Valid values are active, inactive |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**organization** | [**Organization**](Organization.md) | Associated Organization |  [optional]
**organizationId** | **Integer** | Associated Organization ID |  [optional]
**createdBy** | [**User**](User.md) | Associated Created By |  [optional]
**createdById** | **Integer** | Associated Created By ID |  [optional]
**regions** | [**List&lt;Region&gt;**](Region.md) | Associated Regions |  [optional]
**regionIds** | **List&lt;Integer&gt;** | Associated Regions IDs |  [optional]
**externalAccounts** | [**List&lt;ExternalAccount&gt;**](ExternalAccount.md) | Associated External Accounts |  [optional]
**externalAccountIds** | **List&lt;Integer&gt;** | Associated External Accounts IDs |  [optional]
**signatures** | [**List&lt;Signature&gt;**](Signature.md) | Associated Signatures |  [optional]
**signatureIds** | **List&lt;Integer&gt;** | Associated Signatures IDs |  [optional]
**customSignatures** | [**List&lt;CustomSignature&gt;**](CustomSignature.md) | Associated Custom Signatures |  [optional]
**customSignatureIds** | **List&lt;Integer&gt;** | Associated Custom Signatures IDs |  [optional]



