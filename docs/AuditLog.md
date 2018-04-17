
# AuditLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**itemType** | **String** | Item that was changed |  [optional]
**itemId** | **Integer** | ID of the item that was changed |  [optional]
**action** | **String** | Action attempted on the item |  [optional]
**successful** | **Boolean** | Shows if the action was successful |  [optional]
**accessDenied** | **Boolean** | Shows if access was denied |  [optional]
**userIp** | **String** | The IP of the user attempting the action |  [optional]
**userEmail** | **String** | The email of the user attempting the action |  [optional]
**platform** | **String** | The platform the user attempted the action from |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**organization** | [**Organization**](Organization.md) | Associated Organization |  [optional]
**organizationId** | **Integer** | Associated Organization ID |  [optional]
**user** | [**User**](User.md) | Associated User |  [optional]
**userId** | **Integer** | Associated User ID |  [optional]



