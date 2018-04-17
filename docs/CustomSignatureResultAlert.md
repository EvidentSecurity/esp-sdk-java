
# CustomSignatureResultAlert

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**status** | **String** | Status of the alert. Valid values are fail, warn, error, pass, info |  [optional]
**resource** | **String** | Resource identifier in Amazon |  [optional]
**metadata** | **Object** | Metadata associated with the result |  [optional]
**tags** | **List&lt;Object&gt;** | Tags associated with the result |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**externalAccount** | [**ExternalAccount**](ExternalAccount.md) | Associated External Account |  [optional]
**externalAccountId** | **Integer** | Associated External Account ID |  [optional]
**region** | [**Region**](Region.md) | Associated Region |  [optional]
**regionId** | **Integer** | Associated Region ID |  [optional]
**customSignature** | [**CustomSignature**](CustomSignature.md) | Associated Custom Signature |  [optional]
**customSignatureId** | **Integer** | Associated Custom Signature ID |  [optional]



