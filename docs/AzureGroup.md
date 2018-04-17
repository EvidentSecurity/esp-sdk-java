
# AzureGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**name** | **String** | Name |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**url** | **String** | Logging URL for this Azure Group.  It is only returned when first created. |  [optional]
**organization** | [**Organization**](Organization.md) | Associated Organization |  [optional]
**organizationId** | **Integer** | Associated Organization ID |  [optional]
**externalAccounts** | [**List&lt;ExternalAccount&gt;**](ExternalAccount.md) | Associated External Accounts |  [optional]
**externalAccountIds** | **List&lt;Integer&gt;** | Associated External Accounts IDs |  [optional]



