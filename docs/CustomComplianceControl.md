
# CustomComplianceControl

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**name** | **String** | Name |  [optional]
**identifier** | **String** | The identifier of this custom control |  [optional]
**description** | **String** | The description for this custom control |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**position** | **Integer** | The position of this custom control within the custom domain |  [optional]
**customComplianceStandard** | [**CustomComplianceStandard**](CustomComplianceStandard.md) | Associated Custom Compliance Standard |  [optional]
**customComplianceStandardId** | **Integer** | Associated Custom Compliance Standard ID |  [optional]
**customComplianceDomain** | [**CustomComplianceDomain**](CustomComplianceDomain.md) | Associated Custom Compliance Domain |  [optional]
**customComplianceDomainId** | **Integer** | Associated Custom Compliance Domain ID |  [optional]
**signatures** | [**List&lt;Signature&gt;**](Signature.md) | Associated Signatures |  [optional]
**signatureIds** | **List&lt;Integer&gt;** | Associated Signatures IDs |  [optional]
**customSignatures** | [**List&lt;CustomSignature&gt;**](CustomSignature.md) | Associated Custom Signatures |  [optional]
**customSignatureIds** | **List&lt;Integer&gt;** | Associated Custom Signatures IDs |  [optional]



