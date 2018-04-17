
# Attribution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**eventId** | **Integer** | GUID to uniquely identify each event |  [optional]
**eventName** | **String** | The requested action, which is one of the actions listed in the API Reference for the service |  [optional]
**eventTime** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the event occurred |  [optional]
**rawEvent** | **Object** | The event as it is sent in |  [optional]
**user** | **String** | The user associated with the event |  [optional]
**ipAddress** | **String** | The apparent IP address that the request was made from for the given event |  [optional]
**scopeName** | **String** | The agent through which the request was made, such as the AWS Management Console or an AWS SDK |  [optional]
**alert** | [**Alert**](Alert.md) | Associated Alert |  [optional]
**alertId** | **Integer** | Associated Alert ID |  [optional]



