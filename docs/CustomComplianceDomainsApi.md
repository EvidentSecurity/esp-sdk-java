# CustomComplianceDomainsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](CustomComplianceDomainsApi.md#create) | **POST** api/v2/custom_compliance_domains.json_api | Create a(n) Custom Compliance Domain
[**delete**](CustomComplianceDomainsApi.md#delete) | **DELETE** api/v2/custom_compliance_domains/{id}.json_api | Delete a(n) Custom Compliance Domain
[**show**](CustomComplianceDomainsApi.md#show) | **GET** api/v2/custom_compliance_domains/{id}.json_api | Show a single Custom Compliance Domain
[**update**](CustomComplianceDomainsApi.md#update) | **PATCH** api/v2/custom_compliance_domains/{id}.json_api | Update a(n) Custom Compliance Domain


<a name="create"></a>
# **create**
> CustomComplianceDomain create(customComplianceStandardId, identifier, name, include, position)

Create a(n) Custom Compliance Domain



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceDomainsApi;


CustomComplianceDomainsApi apiInstance = new CustomComplianceDomainsApi();
Integer customComplianceStandardId = 56; // Integer | The ID of the Custom Compliance Standard this custom domain belongs to
String identifier = "identifier_example"; // String | The identifier of this custom domain
String name = "name_example"; // String | Name
String include = "include_example"; // String | Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_controls See Including Objects for more information.
Integer position = 56; // Integer | The position of this custom domain within the custom standard
try {
    CustomComplianceDomain result = apiInstance.create(customComplianceStandardId, identifier, name, include, position);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceDomainsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customComplianceStandardId** | **Integer**| The ID of the Custom Compliance Standard this custom domain belongs to |
 **identifier** | **String**| The identifier of this custom domain |
 **name** | **String**| Name |
 **include** | **String**| Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_controls See Including Objects for more information. | [optional]
 **position** | **Integer**| The position of this custom domain within the custom standard | [optional]

### Return type

[**CustomComplianceDomain**](CustomComplianceDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="delete"></a>
# **delete**
> Meta delete(id)

Delete a(n) Custom Compliance Domain



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceDomainsApi;


CustomComplianceDomainsApi apiInstance = new CustomComplianceDomainsApi();
Integer id = 56; // Integer | Custom Compliance Domain ID
try {
    Meta result = apiInstance.delete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceDomainsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Custom Compliance Domain ID |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> CustomComplianceDomain show(id, include)

Show a single Custom Compliance Domain



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceDomainsApi;


CustomComplianceDomainsApi apiInstance = new CustomComplianceDomainsApi();
Integer id = 56; // Integer | Custom Compliance Domain ID
String include = "include_example"; // String | Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_controls See Including Objects for more information.
try {
    CustomComplianceDomain result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceDomainsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Custom Compliance Domain ID |
 **include** | **String**| Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_controls See Including Objects for more information. | [optional]

### Return type

[**CustomComplianceDomain**](CustomComplianceDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> CustomComplianceDomain update(id, include, customComplianceStandardId, identifier, name, position)

Update a(n) Custom Compliance Domain



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceDomainsApi;


CustomComplianceDomainsApi apiInstance = new CustomComplianceDomainsApi();
Integer id = 56; // Integer | Custom Compliance Domain ID
String include = "include_example"; // String | Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_controls See Including Objects for more information.
Integer customComplianceStandardId = 56; // Integer | The ID of the Custom Compliance Standard this custom domain belongs to
String identifier = "identifier_example"; // String | The identifier of this custom domain
String name = "name_example"; // String | Name
Integer position = 56; // Integer | The position of this custom domain within the custom standard
try {
    CustomComplianceDomain result = apiInstance.update(id, include, customComplianceStandardId, identifier, name, position);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceDomainsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Custom Compliance Domain ID |
 **include** | **String**| Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_controls See Including Objects for more information. | [optional]
 **customComplianceStandardId** | **Integer**| The ID of the Custom Compliance Standard this custom domain belongs to | [optional]
 **identifier** | **String**| The identifier of this custom domain | [optional]
 **name** | **String**| Name | [optional]
 **position** | **Integer**| The position of this custom domain within the custom standard | [optional]

### Return type

[**CustomComplianceDomain**](CustomComplianceDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

