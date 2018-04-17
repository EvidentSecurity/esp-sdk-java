
# ComplianceControl

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**name** | **String** | Name |  [optional]
**identifier** | **String** | The identifier of this control |  [optional]
**description** | **String** | The description for this control |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**position** | **Integer** | The position of this control within the Domain |  [optional]
**complianceStandard** | [**ComplianceStandard**](ComplianceStandard.md) | Associated Compliance Standard |  [optional]
**complianceStandardId** | **Integer** | Associated Compliance Standard ID |  [optional]
**complianceDomain** | [**ComplianceDomain**](ComplianceDomain.md) | Associated Compliance Domain |  [optional]
**complianceDomainId** | **Integer** | Associated Compliance Domain ID |  [optional]
**signatures** | [**List&lt;Signature&gt;**](Signature.md) | Associated Signatures |  [optional]
**signatureIds** | **List&lt;Integer&gt;** | Associated Signatures IDs |  [optional]



