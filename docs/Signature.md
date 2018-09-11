
# Signature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**copyable** | **Boolean** | Indicates if this signature is able to be copied or not |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**description** | **String** | The description of the signature |  [optional]
**identifier** | **String** | The identifier of the signature |  [optional]
**name** | **String** | The name of the signature |  [optional]
**resolution** | **String** | Details for how to resolve this signature |  [optional]
**riskLevel** | **String** | The risk-level of the problem identified by the signature. Valid values are low, medium, high |  [optional]
**supportsUserAttribution** | **Boolean** | Indicates if this signature supports user attribution or not |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**customRiskLevel** | **String** | The custom risk-level of the problem identified by the signature for this external_account. Valid values are low, medium, high |  [optional]
**service** | [**Service**](Service.md) | Associated Service |  [optional]
**serviceId** | **Integer** | Associated Service ID |  [optional]
**disabledExternalAccounts** | [**List&lt;ExternalAccount&gt;**](ExternalAccount.md) | Associated Disabled External Accounts |  [optional]
**suppressions** | [**List&lt;Suppression&gt;**](Suppression.md) | Associated Suppressions |  [optional]
**suppressionIds** | **List&lt;Integer&gt;** | Associated Suppressions IDs |  [optional]



