# CustomComplianceControlsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCustomSignature**](CustomComplianceControlsApi.md#addCustomSignature) | **POST** api/v2/custom_compliance_controls/{custom_compliance_control_id}/custom_signatures.json_api | Add a Custom Signature to a Custom Compliance Control
[**addSignature**](CustomComplianceControlsApi.md#addSignature) | **POST** api/v2/custom_compliance_controls/{custom_compliance_control_id}/signatures.json_api | Add a Signature to a Custom Compliance Control
[**create**](CustomComplianceControlsApi.md#create) | **POST** api/v2/custom_compliance_controls.json_api | Create a(n) Custom Compliance Control
[**delete**](CustomComplianceControlsApi.md#delete) | **DELETE** api/v2/custom_compliance_controls/{id}.json_api | Delete a(n) Custom Compliance Control
[**listCustomSignatures**](CustomComplianceControlsApi.md#listCustomSignatures) | **GET** api/v2/custom_compliance_controls/{custom_compliance_control_id}/custom_signatures.json_api | Get a list of Custom Signatures for a Custom Compliance Control
[**listSignatures**](CustomComplianceControlsApi.md#listSignatures) | **GET** api/v2/custom_compliance_controls/{custom_compliance_control_id}/signatures.json_api | Get a list of Signatures for a Custom Compliance Control
[**removeCustomSignature**](CustomComplianceControlsApi.md#removeCustomSignature) | **DELETE** api/v2/custom_compliance_controls/{custom_compliance_control_id}/custom_signatures/{custom_signature_id}.json_api | Remove a Custom Signature from a Custom Compliance Control
[**removeSignature**](CustomComplianceControlsApi.md#removeSignature) | **DELETE** api/v2/custom_compliance_controls/{custom_compliance_control_id}/signatures/{signature_id}.json_api | Remove a Signature from a Custom Compliance Control
[**show**](CustomComplianceControlsApi.md#show) | **GET** api/v2/custom_compliance_controls/{id}.json_api | Show a single Custom Compliance Control
[**update**](CustomComplianceControlsApi.md#update) | **PATCH** api/v2/custom_compliance_controls/{id}.json_api | Update a(n) Custom Compliance Control


<a name="addCustomSignature"></a>
# **addCustomSignature**
> CustomSignature addCustomSignature(customComplianceControlId, customSignatureId, include)

Add a Custom Signature to a Custom Compliance Control



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceControlsApi;


CustomComplianceControlsApi apiInstance = new CustomComplianceControlsApi();
Integer customComplianceControlId = 56; // Integer | The ID of the Custom Compliance Control this custom signature belongs to
Integer customSignatureId = 56; // Integer | The ID of the custom signature that belongs to this custom control
String include = "include_example"; // String | Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions, service See Including Objects for more information.
try {
    CustomSignature result = apiInstance.addCustomSignature(customComplianceControlId, customSignatureId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceControlsApi#addCustomSignature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customComplianceControlId** | **Integer**| The ID of the Custom Compliance Control this custom signature belongs to |
 **customSignatureId** | **Integer**| The ID of the custom signature that belongs to this custom control |
 **include** | **String**| Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions, service See Including Objects for more information. | [optional]

### Return type

[**CustomSignature**](CustomSignature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="addSignature"></a>
# **addSignature**
> Signature addSignature(customComplianceControlId, signatureId, include)

Add a Signature to a Custom Compliance Control



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceControlsApi;


CustomComplianceControlsApi apiInstance = new CustomComplianceControlsApi();
Integer customComplianceControlId = 56; // Integer | The ID of the Custom Compliance Control this signature belongs to
Integer signatureId = 56; // Integer | The ID of the signature that belongs to this custom control
String include = "include_example"; // String | Related objects that can be included in the response:  service, suppressions See Including Objects for more information.
try {
    Signature result = apiInstance.addSignature(customComplianceControlId, signatureId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceControlsApi#addSignature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customComplianceControlId** | **Integer**| The ID of the Custom Compliance Control this signature belongs to |
 **signatureId** | **Integer**| The ID of the signature that belongs to this custom control |
 **include** | **String**| Related objects that can be included in the response:  service, suppressions See Including Objects for more information. | [optional]

### Return type

[**Signature**](Signature.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="create"></a>
# **create**
> CustomComplianceControl create(customComplianceDomainId, identifier, name, include, customSignatureIds, description, position, signatureIds)

Create a(n) Custom Compliance Control



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceControlsApi;


CustomComplianceControlsApi apiInstance = new CustomComplianceControlsApi();
Integer customComplianceDomainId = 56; // Integer | The ID of the Custom Compliance Domain this custom control belongs to
String identifier = "identifier_example"; // String | The identifier of this custom control
String name = "name_example"; // String | Name
String include = "include_example"; // String | Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_domain, signatures, custom_signatures See Including Objects for more information.
List<Integer> customSignatureIds = Arrays.asList(56); // List<Integer> | An array of custom signatures identified by custom_signature_id that belong to this custom control
String description = "description_example"; // String | The description for this custom control
Integer position = 56; // Integer | The position of this custom control within the custom domain
List<Integer> signatureIds = Arrays.asList(56); // List<Integer> | An array of signatures identified by signature_id that belong to this custom control
try {
    CustomComplianceControl result = apiInstance.create(customComplianceDomainId, identifier, name, include, customSignatureIds, description, position, signatureIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceControlsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customComplianceDomainId** | **Integer**| The ID of the Custom Compliance Domain this custom control belongs to |
 **identifier** | **String**| The identifier of this custom control |
 **name** | **String**| Name |
 **include** | **String**| Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_domain, signatures, custom_signatures See Including Objects for more information. | [optional]
 **customSignatureIds** | [**List&lt;Integer&gt;**](Integer.md)| An array of custom signatures identified by custom_signature_id that belong to this custom control | [optional]
 **description** | **String**| The description for this custom control | [optional]
 **position** | **Integer**| The position of this custom control within the custom domain | [optional]
 **signatureIds** | [**List&lt;Integer&gt;**](Integer.md)| An array of signatures identified by signature_id that belong to this custom control | [optional]

### Return type

[**CustomComplianceControl**](CustomComplianceControl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="delete"></a>
# **delete**
> Meta delete(id)

Delete a(n) Custom Compliance Control



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceControlsApi;


CustomComplianceControlsApi apiInstance = new CustomComplianceControlsApi();
Integer id = 56; // Integer | Custom Compliance Control ID
try {
    Meta result = apiInstance.delete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceControlsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Custom Compliance Control ID |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="listCustomSignatures"></a>
# **listCustomSignatures**
> PaginatedCollection listCustomSignatures(customComplianceControlId, include, page)

Get a list of Custom Signatures for a Custom Compliance Control



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceControlsApi;


CustomComplianceControlsApi apiInstance = new CustomComplianceControlsApi();
Integer customComplianceControlId = 56; // Integer | The ID of the Custom Compliance Control this custom signature belongs to
String include = "include_example"; // String | Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions, service See Including Objects for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.listCustomSignatures(customComplianceControlId, include, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceControlsApi#listCustomSignatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customComplianceControlId** | **Integer**| The ID of the Custom Compliance Control this custom signature belongs to |
 **include** | **String**| Related objects that can be included in the response:  organization, teams, external_accounts, definitions, suppressions, service See Including Objects for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="listSignatures"></a>
# **listSignatures**
> PaginatedCollection listSignatures(customComplianceControlId, include, page)

Get a list of Signatures for a Custom Compliance Control



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceControlsApi;


CustomComplianceControlsApi apiInstance = new CustomComplianceControlsApi();
Integer customComplianceControlId = 56; // Integer | The ID of the Custom Compliance Control this signature belongs to
String include = "include_example"; // String | Related objects that can be included in the response:  service, suppressions See Including Objects for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page.
try {
    PaginatedCollection result = apiInstance.listSignatures(customComplianceControlId, include, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceControlsApi#listSignatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customComplianceControlId** | **Integer**| The ID of the Custom Compliance Control this signature belongs to |
 **include** | **String**| Related objects that can be included in the response:  service, suppressions See Including Objects for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  Number is the page number of the collection to return, size is the number of items to return per page. | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="removeCustomSignature"></a>
# **removeCustomSignature**
> Meta removeCustomSignature(customComplianceControlId, customSignatureId)

Remove a Custom Signature from a Custom Compliance Control



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceControlsApi;


CustomComplianceControlsApi apiInstance = new CustomComplianceControlsApi();
Integer customComplianceControlId = 56; // Integer | The ID of the Custom Compliance Control this custom signature belongs to
Integer customSignatureId = 56; // Integer | The ID of the custom signature that belongs to this custom control
try {
    Meta result = apiInstance.removeCustomSignature(customComplianceControlId, customSignatureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceControlsApi#removeCustomSignature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customComplianceControlId** | **Integer**| The ID of the Custom Compliance Control this custom signature belongs to |
 **customSignatureId** | **Integer**| The ID of the custom signature that belongs to this custom control |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="removeSignature"></a>
# **removeSignature**
> Meta removeSignature(customComplianceControlId, signatureId)

Remove a Signature from a Custom Compliance Control



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceControlsApi;


CustomComplianceControlsApi apiInstance = new CustomComplianceControlsApi();
Integer customComplianceControlId = 56; // Integer | The ID of the Custom Compliance Control this signature belongs to
Integer signatureId = 56; // Integer | The ID of the signature that belongs to this custom control
try {
    Meta result = apiInstance.removeSignature(customComplianceControlId, signatureId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceControlsApi#removeSignature");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customComplianceControlId** | **Integer**| The ID of the Custom Compliance Control this signature belongs to |
 **signatureId** | **Integer**| The ID of the signature that belongs to this custom control |

### Return type

[**Meta**](Meta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> CustomComplianceControl show(id, include)

Show a single Custom Compliance Control



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceControlsApi;


CustomComplianceControlsApi apiInstance = new CustomComplianceControlsApi();
Integer id = 56; // Integer | Custom Compliance Control ID
String include = "include_example"; // String | Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_domain, signatures, custom_signatures See Including Objects for more information.
try {
    CustomComplianceControl result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceControlsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Custom Compliance Control ID |
 **include** | **String**| Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_domain, signatures, custom_signatures See Including Objects for more information. | [optional]

### Return type

[**CustomComplianceControl**](CustomComplianceControl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> CustomComplianceControl update(id, include, customComplianceDomainId, customSignatureIds, description, identifier, name, position, signatureIds)

Update a(n) Custom Compliance Control



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.CustomComplianceControlsApi;


CustomComplianceControlsApi apiInstance = new CustomComplianceControlsApi();
Integer id = 56; // Integer | Custom Compliance Control ID
String include = "include_example"; // String | Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_domain, signatures, custom_signatures See Including Objects for more information.
Integer customComplianceDomainId = 56; // Integer | The ID of the Custom Compliance Domain this custom control belongs to
List<Integer> customSignatureIds = Arrays.asList(56); // List<Integer> | An array of custom signatures identified by custom_signature_id that belong to this custom control
String description = "description_example"; // String | The description for this custom control
String identifier = "identifier_example"; // String | The identifier of this custom control
String name = "name_example"; // String | Name
Integer position = 56; // Integer | The position of this custom control within the custom domain
List<Integer> signatureIds = Arrays.asList(56); // List<Integer> | An array of signatures identified by signature_id that belong to this custom control
try {
    CustomComplianceControl result = apiInstance.update(id, include, customComplianceDomainId, customSignatureIds, description, identifier, name, position, signatureIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomComplianceControlsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Custom Compliance Control ID |
 **include** | **String**| Related objects that can be included in the response:  custom_compliance_standard, custom_compliance_domain, signatures, custom_signatures See Including Objects for more information. | [optional]
 **customComplianceDomainId** | **Integer**| The ID of the Custom Compliance Domain this custom control belongs to | [optional]
 **customSignatureIds** | [**List&lt;Integer&gt;**](Integer.md)| An array of custom signatures identified by custom_signature_id that belong to this custom control | [optional]
 **description** | **String**| The description for this custom control | [optional]
 **identifier** | **String**| The identifier of this custom control | [optional]
 **name** | **String**| Name | [optional]
 **position** | **Integer**| The position of this custom control within the custom domain | [optional]
 **signatureIds** | [**List&lt;Integer&gt;**](Integer.md)| An array of signatures identified by signature_id that belong to this custom control | [optional]

### Return type

[**CustomComplianceControl**](CustomComplianceControl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

