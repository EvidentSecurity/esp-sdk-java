# CustomComplianceStandardsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CustomComplianceStandardsApi.md#create) | **POST** api/v2/custom_compliance_standards.json_api | Create a(n) Custom Compliance Standard
[**delete**](CustomComplianceStandardsApi.md#delete) | **DELETE** api/v2/custom_compliance_standards/{id}.json_api | Delete a(n) Custom Compliance Standard
[**show**](CustomComplianceStandardsApi.md#show) | **GET** api/v2/custom_compliance_standards/{id}.json_api | Show a single Custom Compliance Standard
[**update**](CustomComplianceStandardsApi.md#update) | **PATCH** api/v2/custom_compliance_standards/{id}.json_api | Update a(n) Custom Compliance Standard


<a name="create"></a>
# **create**
> CustomComplianceStandard create(name, description, include)

Create a(n) Custom Compliance Standard



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceStandardsApi;


CustomComplianceStandardsApi apiInstance = new CustomComplianceStandardsApi();
String name = "name_example"; // String | Name
String description = "description_example"; // String | The description for this Compliance Standard
String include = "include_example"; // String | Related objects that can be included in the response:  custom_compliance_domains, custom_compliance_controls See Including Objects for more information.
try {
    CustomComplianceStandard result = apiInstance.create(name, description, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceStandardsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name |
 **description** | **String**| The description for this Compliance Standard |
 **include** | **String**| Related objects that can be included in the response:  custom_compliance_domains, custom_compliance_controls See Including Objects for more information. | [optional]

### Return type

[**CustomComplianceStandard**](CustomComplianceStandard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="delete"></a>
# **delete**
> Meta delete(id)

Delete a(n) Custom Compliance Standard



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceStandardsApi;


CustomComplianceStandardsApi apiInstance = new CustomComplianceStandardsApi();
Integer id = 56; // Integer |  ID
try {
    Meta result = apiInstance.delete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceStandardsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  ID |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> CustomComplianceStandard show(id, include)

Show a single Custom Compliance Standard



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceStandardsApi;


CustomComplianceStandardsApi apiInstance = new CustomComplianceStandardsApi();
Integer id = 56; // Integer | Custom Compliance Standard ID
String include = "include_example"; // String | Related objects that can be included in the response:  custom_compliance_domains, custom_compliance_controls See Including Objects for more information.
try {
    CustomComplianceStandard result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceStandardsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Custom Compliance Standard ID |
 **include** | **String**| Related objects that can be included in the response:  custom_compliance_domains, custom_compliance_controls See Including Objects for more information. | [optional]

### Return type

[**CustomComplianceStandard**](CustomComplianceStandard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> CustomComplianceStandard update(id, name, description, include)

Update a(n) Custom Compliance Standard



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceStandardsApi;


CustomComplianceStandardsApi apiInstance = new CustomComplianceStandardsApi();
Integer id = 56; // Integer | Custom Compliance Standard ID
String name = "name_example"; // String | Name
String description = "description_example"; // String | The description for this Compliance Standard
String include = "include_example"; // String | Related objects that can be included in the response:  custom_compliance_domains, custom_compliance_controls See Including Objects for more information.
try {
    CustomComplianceStandard result = apiInstance.update(id, name, description, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceStandardsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Custom Compliance Standard ID |
 **name** | **String**| Name | [optional]
 **description** | **String**| The description for this Compliance Standard | [optional]
 **include** | **String**| Related objects that can be included in the response:  custom_compliance_domains, custom_compliance_controls See Including Objects for more information. | [optional]

### Return type

[**CustomComplianceStandard**](CustomComplianceStandard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

