
# ComplianceStandard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**name** | **String** | Name |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**description** | **String** | The description for this Compliance Standard |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**maxAccounts** | **Integer** | The max number of external accounts allowed for the organization.  This is only returned by the organizations/:organization_id/compliance_standards endpoint. |  [optional]
**complianceDomains** | [**List&lt;ComplianceDomain&gt;**](ComplianceDomain.md) | Associated Compliance Domains |  [optional]
**complianceDomainIds** | **List&lt;Integer&gt;** | Associated Compliance Domains IDs |  [optional]
**complianceControls** | [**List&lt;ComplianceControl&gt;**](ComplianceControl.md) | Associated Compliance Controls |  [optional]
**complianceControlIds** | **List&lt;Integer&gt;** | Associated Compliance Controls IDs |  [optional]



