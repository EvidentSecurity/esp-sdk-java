
# CustomComplianceStandard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**organizationId** | **Integer** | The ID of the organization this custom compliance standard belongs to |  [optional]
**name** | **String** | Name |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**description** | **String** | The description for this Compliance Standard |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**maxAccounts** | **Integer** | The maximum number of external accounts that can be added to the custom compliance standard |  [optional]
**maxDomains** | **Integer** | The maximum number of custom compliance domains that can be added to the custom compliance standard |  [optional]
**maxControls** | **Integer** | The maximum number of custom compliance controls that can be added to the custom compliance standard |  [optional]
**customComplianceDomains** | [**List&lt;CustomComplianceDomain&gt;**](CustomComplianceDomain.md) | Associated Custom Compliance Domains |  [optional]
**customComplianceDomainIds** | **List&lt;Integer&gt;** | Associated Custom Compliance Domains IDs |  [optional]
**customComplianceControls** | [**List&lt;CustomComplianceControl&gt;**](CustomComplianceControl.md) | Associated Custom Compliance Controls |  [optional]
**customComplianceControlIds** | **List&lt;Integer&gt;** | Associated Custom Compliance Controls IDs |  [optional]



