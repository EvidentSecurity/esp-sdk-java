
# CustomSignature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**description** | **String** | The description of the custom signature that is displayed on alerts |  [optional]
**identifier** | **String** | The identifier to use for the custom signature. Common format is AWS:- such as AWS:IAM-001 |  [optional]
**name** | **String** | The name of the custom signature |  [optional]
**resolution** | **String** | Details for how to resolve this custom signature that is displayed on alerts |  [optional]
**riskLevel** | **String** | The risk-level of the problem identified by the custom signature. Valid values are low, medium, high |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**organization** | [**Organization**](Organization.md) | Associated Organization |  [optional]
**organizationId** | **Integer** | Associated Organization ID |  [optional]
**externalAccounts** | [**List&lt;ExternalAccount&gt;**](ExternalAccount.md) | Associated External Accounts |  [optional]
**externalAccountIds** | **List&lt;Integer&gt;** | Associated External Accounts IDs |  [optional]
**definitions** | [**List&lt;CustomSignatureDefinition&gt;**](CustomSignatureDefinition.md) | Associated Definitions |  [optional]
**definitionIds** | **List&lt;Integer&gt;** | Associated Definitions IDs |  [optional]
**suppressions** | [**List&lt;Suppression&gt;**](Suppression.md) | Associated Suppressions |  [optional]
**suppressionIds** | **List&lt;Integer&gt;** | Associated Suppressions IDs |  [optional]



