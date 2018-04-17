
# Alert

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**status** | **String** | Status of the alert. Valid values are fail, warn, error, pass, info |  [optional]
**riskLevel** | **String** | The risk-level of the problem identified by the signature or custom signature. Valid values are low, medium, high |  [optional]
**resource** | **String** | Resource identifier in Amazon |  [optional]
**endedReason** | **String** | The reason this alert ended. Valid values are from_api, new_alert, from_scan, not_present_after_scan, signature_deleted, custom_signature_deleted, suppression_created, suppression_deactivated, custom_risk_level_created, custom_risk_level_deleted |  [optional]
**replacedById** | **Integer** | The ID of the alert that replaced this alert |  [optional]
**replacedByStatus** | **String** | The status of the alert that replaced this alert |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**startedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the alert started being active |  [optional]
**endedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the alert stopped being active |  [optional]
**externalAccount** | [**ExternalAccount**](ExternalAccount.md) | Associated External Account |  [optional]
**externalAccountId** | **Integer** | Associated External Account ID |  [optional]
**region** | [**Region**](Region.md) | Associated Region |  [optional]
**regionId** | **Integer** | Associated Region ID |  [optional]
**signature** | [**Signature**](Signature.md) | Associated Signature |  [optional]
**signatureId** | **Integer** | Associated Signature ID |  [optional]
**customSignature** | [**CustomSignature**](CustomSignature.md) | Associated Custom Signature |  [optional]
**customSignatureId** | **Integer** | Associated Custom Signature ID |  [optional]
**suppression** | [**Suppression**](Suppression.md) | Associated Suppression |  [optional]
**suppressionId** | **Integer** | Associated Suppression ID |  [optional]
**metadata** | [**Metadata**](Metadata.md) | Associated Metadata |  [optional]
**metadataId** | **Integer** | Associated Metadata ID |  [optional]
**attribution** | [**Attribution**](Attribution.md) | Associated Attribution |  [optional]
**attributionId** | **Integer** | Associated Attribution ID |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | Associated Tags |  [optional]
**tagIds** | **List&lt;Integer&gt;** | Associated Tags IDs |  [optional]
**complianceControls** | [**List&lt;ComplianceControl&gt;**](ComplianceControl.md) | Associated Compliance Controls |  [optional]
**complianceControlIds** | **List&lt;Integer&gt;** | Associated Compliance Controls IDs |  [optional]
**customComplianceControls** | [**List&lt;CustomComplianceControl&gt;**](CustomComplianceControl.md) | Associated Custom Compliance Controls |  [optional]
**customComplianceControlIds** | **List&lt;Integer&gt;** | Associated Custom Compliance Controls IDs |  [optional]



