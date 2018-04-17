
# CustomSignatureDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**code** | **String** | The code for this definition |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**versionNumber** | **Integer** | Version of definition |  [optional]
**language** | **String** | The language of the definition. Valid values are ruby, javascript |  [optional]
**status** | **String** | Status of the definition. Valid values are editable, validating, active, archived, disabled |  [optional]
**customSignature** | [**CustomSignature**](CustomSignature.md) | Associated Custom Signature |  [optional]
**customSignatureId** | **Integer** | Associated Custom Signature ID |  [optional]
**results** | [**List&lt;CustomSignatureResult&gt;**](CustomSignatureResult.md) | Associated Results |  [optional]
**resultIds** | **List&lt;Integer&gt;** | Associated Results IDs |  [optional]



