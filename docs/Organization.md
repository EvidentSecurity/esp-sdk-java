
# Organization

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**enableNewSignatures** | **Boolean** | Whether new signatures should be enabled for all accounts on this organization |  [optional]
**name** | **String** | Name of the organization |  [optional]
**requireMfa** | **Boolean** | Whether or not users for this organization are required to enable Multi Factor Authentication |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**subscription** | [**Subscription**](Subscription.md) | Associated Subscription |  [optional]
**subscriptionId** | **Integer** | Associated Subscription ID |  [optional]
**customSignatures** | [**List&lt;CustomSignature&gt;**](CustomSignature.md) | Associated Custom Signatures |  [optional]
**customSignatureIds** | **List&lt;Integer&gt;** | Associated Custom Signatures IDs |  [optional]
**externalAccounts** | [**List&lt;ExternalAccount&gt;**](ExternalAccount.md) | Associated External Accounts |  [optional]
**externalAccountIds** | **List&lt;Integer&gt;** | Associated External Accounts IDs |  [optional]
**subOrganizations** | [**List&lt;SubOrganization&gt;**](SubOrganization.md) | Associated Sub Organizations |  [optional]
**subOrganizationIds** | **List&lt;Integer&gt;** | Associated Sub Organizations IDs |  [optional]
**teams** | [**List&lt;Team&gt;**](Team.md) | Associated Teams |  [optional]
**teamIds** | **List&lt;Integer&gt;** | Associated Teams IDs |  [optional]
**users** | [**List&lt;User&gt;**](User.md) | Associated Users |  [optional]
**userIds** | **List&lt;Integer&gt;** | Associated Users IDs |  [optional]
**complianceStandards** | [**List&lt;ComplianceStandard&gt;**](ComplianceStandard.md) | Associated Compliance Standards |  [optional]
**complianceStandardIds** | **List&lt;Integer&gt;** | Associated Compliance Standards IDs |  [optional]
**integrations** | [**List&lt;Integration&gt;**](Integration.md) | Associated Integrations |  [optional]
**integrationIds** | **List&lt;Integer&gt;** | Associated Integrations IDs |  [optional]



