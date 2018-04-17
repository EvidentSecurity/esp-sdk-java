
# CustomComplianceDomain

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**identifier** | **String** | The identifier of this custom domain |  [optional]
**name** | **String** | Name |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**position** | **Integer** | The position of this custom domain within the custom standard |  [optional]
**customComplianceStandard** | [**CustomComplianceStandard**](CustomComplianceStandard.md) | Associated Custom Compliance Standard |  [optional]
**customComplianceStandardId** | **Integer** | Associated Custom Compliance Standard ID |  [optional]
**customComplianceControls** | [**List&lt;CustomComplianceControl&gt;**](CustomComplianceControl.md) | Associated Custom Compliance Controls |  [optional]
**customComplianceControlIds** | **List&lt;Integer&gt;** | Associated Custom Compliance Controls IDs |  [optional]



