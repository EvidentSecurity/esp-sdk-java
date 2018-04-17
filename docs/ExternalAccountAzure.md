
# ExternalAccountAzure

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**subscriptionId** | **String** | Azure subscription ID |  [optional]
**clientId** | **String** | Azure client ID |  [optional]
**tenantId** | **String** | Azure tenant ID |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**lastMessageReceivedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the last event was received from Azure. This is updated hourly. |  [optional]
**appKey** | **String** | Azure app key |  [optional]
**channelUrl** | **String** | The URL for the azure account channel.  It is only returned when first created or when reset. |  [optional]
**channelActive** | **Boolean** | Returns true if the channel is active |  [optional]
**externalAccount** | [**ExternalAccount**](ExternalAccount.md) | Associated External Account |  [optional]
**externalAccountId** | **Integer** | Associated External Account ID |  [optional]



