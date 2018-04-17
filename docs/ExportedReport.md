
# ExportedReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**userId** | **Integer** | Associated User ID |  [optional]
**reportIds** | **List&lt;Integer&gt;** | An array of report IDs to export alerts for |  [optional]
**format** | **String** | The file format of the export. Valid values are csv, json, pdf |  [optional]
**url** | **String** | A temporary URL where the file can be accessed |  [optional]
**fileName** | **String** | The name of the file |  [optional]
**filter** | **Object** | Params used to filter the alerts that will be exported |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**user** | [**User**](User.md) | Associated User |  [optional]



