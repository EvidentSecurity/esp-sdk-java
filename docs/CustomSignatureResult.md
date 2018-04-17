
# CustomSignatureResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**code** | **String** | The code used for this result |  [optional]
**language** | **String** | The language of the code. Valid values are ruby, javascript |  [optional]
**status** | **String** | Status of the result. Valid values are running, failed, complete |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**errorMessages** | **List&lt;String&gt;** | Error messages that occurred while running the code |  [optional]
**externalAccount** | [**ExternalAccount**](ExternalAccount.md) | Associated External Account |  [optional]
**externalAccountId** | **Integer** | Associated External Account ID |  [optional]
**region** | [**Region**](Region.md) | Associated Region |  [optional]
**regionId** | **Integer** | Associated Region ID |  [optional]
**definition** | [**CustomSignatureDefinition**](CustomSignatureDefinition.md) | Associated Definition |  [optional]
**definitionId** | **Integer** | Associated Definition ID |  [optional]
**alerts** | [**List&lt;Alert&gt;**](Alert.md) | Associated Alerts |  [optional]
**alertIds** | **List&lt;Integer&gt;** | Associated Alerts IDs |  [optional]



