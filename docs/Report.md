
# Report

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**status** | **String** | Status of the report. Valid values are queued, processing, partial, complete, failed |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**organization** | [**Organization**](Organization.md) | Associated Organization |  [optional]
**organizationId** | **Integer** | Associated Organization ID |  [optional]
**subOrganization** | [**SubOrganization**](SubOrganization.md) | Associated Sub Organization |  [optional]
**subOrganizationId** | **Integer** | Associated Sub Organization ID |  [optional]
**team** | [**Team**](Team.md) | Associated Team |  [optional]
**teamId** | **Integer** | Associated Team ID |  [optional]
**externalAccount** | [**ExternalAccount**](ExternalAccount.md) | Associated External Account |  [optional]
**externalAccountId** | **Integer** | Associated External Account ID |  [optional]
**alerts** | [**List&lt;Alert&gt;**](Alert.md) | Associated Alerts |  [optional]
**alertIds** | **List&lt;Integer&gt;** | Associated Alerts IDs |  [optional]
**stat** | [**Stat**](Stat.md) | Associated Stat |  [optional]
**statId** | **Integer** | Associated Stat ID |  [optional]



