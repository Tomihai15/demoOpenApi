# ContainerTypeApi

All URIs are relative to *https://api.beverage-ecommerce.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContainerType**](ContainerTypeApi.md#createContainerType) | **POST** /container-types | Create a new container type
[**deleteContainerType**](ContainerTypeApi.md#deleteContainerType) | **DELETE** /container-types/{id} | Delete a container type
[**getContainerTypeById**](ContainerTypeApi.md#getContainerTypeById) | **GET** /container-types/{id} | Retrieve a container type by ID
[**getContainerTypes**](ContainerTypeApi.md#getContainerTypes) | **GET** /container-types | Retrieve all container types
[**putContainerType**](ContainerTypeApi.md#putContainerType) | **PUT** /container-types/{id} | Update a container type
[**updateContainerType**](ContainerTypeApi.md#updateContainerType) | **PATCH** /container-types/{id} | Update a container type


<a name="createContainerType"></a>
# **createContainerType**
> createContainerType(containertypesBody)

Create a new container type

Creates a new container type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContainerTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContainerTypeApi apiInstance = new ContainerTypeApi(defaultClient);
    ContainertypesBody containertypesBody = new ContainertypesBody(); // ContainertypesBody | 
    try {
      apiInstance.createContainerType(containertypesBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerTypeApi#createContainerType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containertypesBody** | [**ContainertypesBody**](ContainertypesBody.md)|  |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Container type created successfully. |  * Location - URL to the newly created container type. <br>  |
**400** | Invalid request. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |

<a name="deleteContainerType"></a>
# **deleteContainerType**
> deleteContainerType(id)

Delete a container type

Deletes a container type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContainerTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContainerTypeApi apiInstance = new ContainerTypeApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the container type.
    try {
      apiInstance.deleteContainerType(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerTypeApi#deleteContainerType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Unique identifier for the container type. |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Container type deleted successfully. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |
**404** | Resource not found. |  -  |

<a name="getContainerTypeById"></a>
# **getContainerTypeById**
> ContainerType getContainerTypeById(id)

Retrieve a container type by ID

Retrieves details of a specific container type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContainerTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContainerTypeApi apiInstance = new ContainerTypeApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the container type.
    try {
      ContainerType result = apiInstance.getContainerTypeById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerTypeApi#getContainerTypeById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Unique identifier for the container type. |

### Return type

[**ContainerType**](ContainerType.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Container type details. |  -  |
**401** | Authentication failed. |  -  |
**404** | Resource not found. |  -  |

<a name="getContainerTypes"></a>
# **getContainerTypes**
> List&lt;ContainerType&gt; getContainerTypes()

Retrieve all container types

Retrieves a list of all container types.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContainerTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContainerTypeApi apiInstance = new ContainerTypeApi(defaultClient);
    try {
      List<ContainerType> result = apiInstance.getContainerTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerTypeApi#getContainerTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ContainerType&gt;**](ContainerType.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of container types. |  -  |
**401** | Authentication failed. |  -  |

<a name="putContainerType"></a>
# **putContainerType**
> InlineResponse2001 putContainerType(id, containertypesIdBody)

Update a container type

Create or replace a container type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContainerTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContainerTypeApi apiInstance = new ContainerTypeApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the container type.
    ContainertypesIdBody containertypesIdBody = new ContainertypesIdBody(); // ContainertypesIdBody | 
    try {
      InlineResponse2001 result = apiInstance.putContainerType(id, containertypesIdBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerTypeApi#putContainerType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Unique identifier for the container type. |
 **containertypesIdBody** | [**ContainertypesIdBody**](ContainertypesIdBody.md)|  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Container type updated successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |
**404** | Resource not found. |  -  |

<a name="updateContainerType"></a>
# **updateContainerType**
> InlineResponse2001 updateContainerType(id, containertypesIdBody1)

Update a container type

Updates an existing container type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContainerTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ContainerTypeApi apiInstance = new ContainerTypeApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the container type.
    ContainertypesIdBody1 containertypesIdBody1 = new ContainertypesIdBody1(); // ContainertypesIdBody1 | 
    try {
      InlineResponse2001 result = apiInstance.updateContainerType(id, containertypesIdBody1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContainerTypeApi#updateContainerType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Unique identifier for the container type. |
 **containertypesIdBody1** | [**ContainertypesIdBody1**](ContainertypesIdBody1.md)|  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Container type updated successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |
**404** | Resource not found. |  -  |

