# UsersApi

All URIs are relative to *http://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](UsersApi.md#create) | **POST** api/v2/users.json_api | Create a(n) User
[**delete**](UsersApi.md#delete) | **DELETE** api/v2/users/{id}.json_api | Delete a(n) User
[**list**](UsersApi.md#list) | **PUT** api/v2/users.json_api | Get a list of Users
[**show**](UsersApi.md#show) | **GET** api/v2/users/{id}.json_api | Show a single User
[**update**](UsersApi.md#update) | **PATCH** api/v2/users/{id}.json_api | Update a(n) User


<a name="create"></a>
# **create**
> User create(firstName, lastName, email, roleId, subOrganizationIds, teamIds, disableDailyEmails, phone, timeZone, include)

Create a(n) User



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String firstName = "firstName_example"; // String | The first name of the user
String lastName = "lastName_example"; // String | The last name of the user
String email = "email_example"; // String | The email of the user
Integer roleId = 56; // Integer | The ID of the role of the user
List<Integer> subOrganizationIds = Arrays.asList(56); // List<Integer> | A list of sub organization IDs that the user should have access to
List<Integer> teamIds = Arrays.asList(56); // List<Integer> | A list of team IDs that the user should have access to
Boolean disableDailyEmails = true; // Boolean | Specifies whether the daily emails should be turned off or not
String phone = "phone_example"; // String | The phone number of the user
String timeZone = "timeZone_example"; // String | The time zone of the user. See Time Zones for a list of valid time zones
String include = "include_example"; // String | Related objects that can be included in the response:  organization, sub_organizations, teams, role See Including Objects for more information.
try {
    User result = apiInstance.create(firstName, lastName, email, roleId, subOrganizationIds, teamIds, disableDailyEmails, phone, timeZone, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**| The first name of the user |
 **lastName** | **String**| The last name of the user |
 **email** | **String**| The email of the user |
 **roleId** | **Integer**| The ID of the role of the user | [optional]
 **subOrganizationIds** | [**List&lt;Integer&gt;**](Integer.md)| A list of sub organization IDs that the user should have access to | [optional]
 **teamIds** | [**List&lt;Integer&gt;**](Integer.md)| A list of team IDs that the user should have access to | [optional]
 **disableDailyEmails** | **Boolean**| Specifies whether the daily emails should be turned off or not | [optional]
 **phone** | **String**| The phone number of the user | [optional]
 **timeZone** | **String**| The time zone of the user. See Time Zones for a list of valid time zones | [optional]
 **include** | **String**| Related objects that can be included in the response:  organization, sub_organizations, teams, role See Including Objects for more information. | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="delete"></a>
# **delete**
> Meta delete(id, currentPassword)

Delete a(n) User

The users current password is required when deleting yourself.

### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Integer id = 56; // Integer |  ID
String currentPassword = "currentPassword_example"; // String | The user's currently stored password
try {
    Meta result = apiInstance.delete(id, currentPassword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  ID |
 **currentPassword** | **String**| The user&#39;s currently stored password | [optional]

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

Get a list of Users



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Map<String, String> filter = new HashMap(); // Map<String, String> | Filter Params for Searching.  Equality Searchable Attributes: [id, email] Matching Searchable Attribute: [email]  Sortable Attributes: [email, current_sign_in_at, updated_at, created_at, id] Searchable Associations: [role, organization, sub_organizations, teams] See Searching Lists for more information. See the filter parameter of the association's list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information.
String page = "{:number=>1,+:size=>20}"; // String | Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page
String include = "include_example"; // String | Related objects that can be included in the response:  organization, sub_organizations, teams, role See Including Objects for more information.
try {
    PaginatedCollection result = apiInstance.list(filter, page, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#list");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | [**Map&lt;String, String&gt;**](String.md)| Filter Params for Searching.  Equality Searchable Attributes: [id, email] Matching Searchable Attribute: [email]  Sortable Attributes: [email, current_sign_in_at, updated_at, created_at, id] Searchable Associations: [role, organization, sub_organizations, teams] See Searching Lists for more information. See the filter parameter of the association&#39;s list action to see what attributes are searchable on each association. See Conditions on Relationships in Searching Lists for more information. | [optional]
 **page** | **String**| Page Number and Page Size.  number is the page number of the collection to return, size is the number of items to return per page | [optional] [default to {:number&#x3D;&gt;1,+:size&#x3D;&gt;20}]
 **include** | **String**| Related objects that can be included in the response:  organization, sub_organizations, teams, role See Including Objects for more information. | [optional]

### Return type

[**PaginatedCollection**](PaginatedCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="show"></a>
# **show**
> User show(id, include)

Show a single User



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Integer id = 56; // Integer | User ID
String include = "include_example"; // String | Related objects that can be included in the response:  organization, sub_organizations, teams, role See Including Objects for more information.
try {
    User result = apiInstance.show(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#show");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| User ID |
 **include** | **String**| Related objects that can be included in the response:  organization, sub_organizations, teams, role See Including Objects for more information. | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

<a name="update"></a>
# **update**
> User update(id, firstName, lastName, email, roleId, subOrganizationIds, teamIds, disableDailyEmails, phone, timeZone, include)

Update a(n) User



### Example
```java
// Import classes:
//import io.evident.EspSdk.ApiException;
//import io.evident.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Integer id = 56; // Integer | User ID
String firstName = "firstName_example"; // String | The first name of the user
String lastName = "lastName_example"; // String | The last name of the user
String email = "email_example"; // String | The email of the user
Integer roleId = 56; // Integer | The ID of the role of the user
List<Integer> subOrganizationIds = Arrays.asList(56); // List<Integer> | A list of sub organization IDs that the user should have access to
List<Integer> teamIds = Arrays.asList(56); // List<Integer> | A list of team IDs that the user should have access to
Boolean disableDailyEmails = true; // Boolean | Specifies whether the daily emails should be turned off or not
String phone = "phone_example"; // String | The phone number of the user
String timeZone = "timeZone_example"; // String | The time zone of the user. See Time Zones for a list of valid time zones
String include = "include_example"; // String | Related objects that can be included in the response:  organization, sub_organizations, teams, role See Including Objects for more information.
try {
    User result = apiInstance.update(id, firstName, lastName, email, roleId, subOrganizationIds, teamIds, disableDailyEmails, phone, timeZone, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| User ID |
 **firstName** | **String**| The first name of the user | [optional]
 **lastName** | **String**| The last name of the user | [optional]
 **email** | **String**| The email of the user | [optional]
 **roleId** | **Integer**| The ID of the role of the user | [optional]
 **subOrganizationIds** | [**List&lt;Integer&gt;**](Integer.md)| A list of sub organization IDs that the user should have access to | [optional]
 **teamIds** | [**List&lt;Integer&gt;**](Integer.md)| A list of team IDs that the user should have access to | [optional]
 **disableDailyEmails** | **Boolean**| Specifies whether the daily emails should be turned off or not | [optional]
 **phone** | **String**| The phone number of the user | [optional]
 **timeZone** | **String**| The time zone of the user. See Time Zones for a list of valid time zones | [optional]
 **include** | **String**| Related objects that can be included in the response:  organization, sub_organizations, teams, role See Including Objects for more information. | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

