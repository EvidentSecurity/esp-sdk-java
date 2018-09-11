
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**email** | **String** | The email of the user |  [optional]
**timeZone** | **String** | The time zone of the user. See Time Zones for a list of valid time zones |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**firstName** | **String** | The first name of the user |  [optional]
**lastName** | **String** | The last name of the user |  [optional]
**phone** | **String** | The phone number of the user |  [optional]
**mfaEnabled** | **Boolean** | Specifies whether Multi Factor Authentication is enabled or not |  [optional]
**disableDailyEmails** | **Boolean** | Specifies whether the daily emails should be turned off or not |  [optional]
**locked** | **Boolean** | Specifies whether the user account is locked from accessing ESP |  [optional]
**lockedAt** | [**DateTime**](DateTime.md) | The time the user account was locked |  [optional]
**accessLevel** | **String** | The level of access this user has. Team access has access to items belonging only to that team. Sub Organization access has access to items belonging only to all teams under that sub organization. Organization access has access to all sub organizations and teams under that organization. Valid values are organization_level, sub_organization_level, team_level |  [optional]
**organization** | [**Organization**](Organization.md) | Associated Organization |  [optional]
**organizationId** | **Integer** | Associated Organization ID |  [optional]
**subOrganizations** | [**List&lt;SubOrganization&gt;**](SubOrganization.md) | Associated Sub Organizations |  [optional]
**subOrganizationIds** | **List&lt;Integer&gt;** | Associated Sub Organizations IDs |  [optional]
**teams** | [**List&lt;Team&gt;**](Team.md) | Associated Teams |  [optional]
**teamIds** | **List&lt;Integer&gt;** | Associated Teams IDs |  [optional]
**role** | [**Role**](Role.md) | Associated Role |  [optional]
**roleId** | **Integer** | Associated Role ID |  [optional]



