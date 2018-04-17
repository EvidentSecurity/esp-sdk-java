
# ComplianceDomain

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**identifier** | **String** | The identifier of this domain |  [optional]
**name** | **String** | Name |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**position** | **Integer** | The position of this domain within the Standard |  [optional]
**complianceStandard** | [**ComplianceStandard**](ComplianceStandard.md) | Associated Compliance Standard |  [optional]
**complianceStandardId** | **Integer** | Associated Compliance Standard ID |  [optional]
**complianceControls** | [**List&lt;ComplianceControl&gt;**](ComplianceControl.md) | Associated Compliance Controls |  [optional]
**complianceControlIds** | **List&lt;Integer&gt;** | Associated Compliance Controls IDs |  [optional]



