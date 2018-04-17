# TeamsApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](TeamsApi.md#create) | **POST** api/v2/teams.json_api | Create a(n) Team
[**delete**](TeamsApi.md#delete) | **DELETE** api/v2/teams/{id}.json_api | Delete a(n) Team
[**list**](TeamsApi.md#list) | **PUT** api/v2/teams.json_api | Get a list of Teams
[**show**](TeamsApi.md#show) | **GET** api/v2/teams/{id}.json_api | Show a single Team
[**update**](TeamsApi.md#update) | **PATCH** api/v2/teams/{id}.json_api | Update a(n) Team


<a name="create"></a>
# **create**
> Team create(name, subOrganizationId, include)

Create a(n) Team



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
String name = "name_example"; // String | Name of the team
Integer subOrganizationId = 56; // Integer | The ID of the sub organization to attach this team to
String include = "include_example"; // String | Related objects that can be included in the response:  custom_signatures, external_accounts, organization, sub_organization See Including Objects for more information.
try {
    Team result = apiInstance.create(name, subOrganizationId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the team |
 **subOrganizationId** | **Integer**| The ID of the sub organization to attach this team to |
 **include** | **String**| Related objects that can be included in the response:  custom_signatures, external_accounts, organization, sub_organization See Including Objects for more information. | [optional]

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="delete"></a>
# **delete**
> Meta delete(id)

Delete a(n) Team



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
Integer id = 56; // Integer |  ID
try {
    Meta result = apiInstance.delete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#delete");
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

Get a list of Teams



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, name] Matching Searchable Attribute: [name]  Sortable Attributes: [name, updated_at, created_at, id] Searchable Associations: [organization, sub_organization, custom_signatures, integrations] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  custom_signatures, external_accounts, organization, sub_organization See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.list(filter, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, name] Matching Searchable Attribute: [name]  Sortable Attributes: [name, updated_at, created_at, id] Searchable Associations: [organization, sub_organization, custom_signatures, integrations] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  custom_signatures, external_accounts, organization, sub_organization See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> Team show(id, include)

Show a single Team



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
Integer id = 56; // Integer | Team ID
String include = "include_example"; // String | Related objects that can be included in the response:  custom_signatures, external_accounts, organization, sub_organization See Including Objects for more information.
try {
    Team result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Team ID |
 **include** | **String**| Related objects that can be included in the response:  custom_signatures, external_accounts, organization, sub_organization See Including Objects for more information. | [optional]

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> Team update(id, name, include)

Update a(n) Team



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.TeamsApi;


TeamsApi apiInstance = new TeamsApi();
Integer id = 56; // Integer | Team ID
String name = "name_example"; // String | Name of the team
String include = "include_example"; // String | Related objects that can be included in the response:  custom_signatures, external_accounts, organization, sub_organization See Including Objects for more information.
try {
    Team result = apiInstance.update(id, name, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Team ID |
 **name** | **String**| Name of the team | [optional]
 **include** | **String**| Related objects that can be included in the response:  custom_signatures, external_accounts, organization, sub_organization See Including Objects for more information. | [optional]

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

