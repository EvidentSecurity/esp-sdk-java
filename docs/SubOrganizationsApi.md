# SubOrganizationsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SubOrganizationsApi.md#create) | **POST** api/v2/sub_organizations.json_api | Create a(n) Sub Organization
[**delete**](SubOrganizationsApi.md#delete) | **DELETE** api/v2/sub_organizations/{id}.json_api | Delete a(n) Sub Organization
[**list**](SubOrganizationsApi.md#list) | **PUT** api/v2/sub_organizations.json_api | Get a list of Sub Organizations
[**show**](SubOrganizationsApi.md#show) | **GET** api/v2/sub_organizations/{id}.json_api | Show a single Sub Organization
[**update**](SubOrganizationsApi.md#update) | **PATCH** api/v2/sub_organizations/{id}.json_api | Update a(n) Sub Organization


<a name="create"></a>
# **create**
> SubOrganization create(organizationId, name, include)

Create a(n) Sub Organization



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SubOrganizationsApi;


SubOrganizationsApi apiInstance = new SubOrganizationsApi();
Integer organizationId = 56; // Integer | The ID of the organization this sub organization should belong to
String name = "name_example"; // String | Name of the sub organization
String include = "include_example"; // String | Related objects that can be included in the response:  external_accounts, organization, teams See Including Objects for more information.
try {
    SubOrganization result = apiInstance.create(organizationId, name, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubOrganizationsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **Integer**| The ID of the organization this sub organization should belong to |
 **name** | **String**| Name of the sub organization |
 **include** | **String**| Related objects that can be included in the response:  external_accounts, organization, teams See Including Objects for more information. | [optional]

### Return type

[**SubOrganization**](SubOrganization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="delete"></a>
# **delete**
> Meta delete(id)

Delete a(n) Sub Organization



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SubOrganizationsApi;


SubOrganizationsApi apiInstance = new SubOrganizationsApi();
Integer id = 56; // Integer |  ID
try {
    Meta result = apiInstance.delete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubOrganizationsApi#delete");
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

<a name="list"></a>
# **list**
> PaginatedCollection list(filter, page, include)

Get a list of Sub Organizations



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SubOrganizationsApi;


SubOrganizationsApi apiInstance = new SubOrganizationsApi();
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, name] Matching Searchable Attribute: [name]  Sortable Attributes: [name, updated_at, created_at, id] Searchable Association: [organization] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  external_accounts, organization, teams See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.list(filter, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubOrganizationsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, name] Matching Searchable Attribute: [name]  Sortable Attributes: [name, updated_at, created_at, id] Searchable Association: [organization] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  external_accounts, organization, teams See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> SubOrganization show(id, include)

Show a single Sub Organization



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SubOrganizationsApi;


SubOrganizationsApi apiInstance = new SubOrganizationsApi();
Integer id = 56; // Integer | Sub Organization ID
String include = "include_example"; // String | Related objects that can be included in the response:  external_accounts, organization, teams See Including Objects for more information.
try {
    SubOrganization result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubOrganizationsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Sub Organization ID |
 **include** | **String**| Related objects that can be included in the response:  external_accounts, organization, teams See Including Objects for more information. | [optional]

### Return type

[**SubOrganization**](SubOrganization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> SubOrganization update(id, name, include)

Update a(n) Sub Organization



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.SubOrganizationsApi;


SubOrganizationsApi apiInstance = new SubOrganizationsApi();
Integer id = 56; // Integer | Sub Organization ID
String name = "name_example"; // String | Name of the sub organization
String include = "include_example"; // String | Related objects that can be included in the response:  external_accounts, organization, teams See Including Objects for more information.
try {
    SubOrganization result = apiInstance.update(id, name, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubOrganizationsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Sub Organization ID |
 **name** | **String**| Name of the sub organization | [optional]
 **include** | **String**| Related objects that can be included in the response:  external_accounts, organization, teams See Including Objects for more information. | [optional]

### Return type

[**SubOrganization**](SubOrganization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

