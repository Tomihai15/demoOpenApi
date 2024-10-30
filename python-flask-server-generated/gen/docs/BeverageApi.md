# BeverageApi

All URIs are relative to *https://api.beverage-ecommerce.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBeverage**](BeverageApi.md#createBeverage) | **POST** /beverages | Create a new beverage
[**deleteBeverage**](BeverageApi.md#deleteBeverage) | **DELETE** /beverages/{id} | Delete a beverage
[**getBeverageById**](BeverageApi.md#getBeverageById) | **GET** /beverages/{id} | Retrieve a beverage by ID
[**getBeverages**](BeverageApi.md#getBeverages) | **GET** /beverages | Retrieve all beverages
[**replaceBeverage**](BeverageApi.md#replaceBeverage) | **PUT** /beverages/{id} | Update a beverage
[**updateBeverage**](BeverageApi.md#updateBeverage) | **PATCH** /beverages/{id} | Partially update a beverage


<a name="createBeverage"></a>
# **createBeverage**
> createBeverage(beveragesBody)

Create a new beverage

Creates a new beverage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeverageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BeverageApi apiInstance = new BeverageApi(defaultClient);
    BeveragesBody beveragesBody = new BeveragesBody(); // BeveragesBody | 
    try {
      apiInstance.createBeverage(beveragesBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeverageApi#createBeverage");
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
 **beveragesBody** | [**BeveragesBody**](BeveragesBody.md)|  |

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
**201** | Beverage created successfully. |  * Location - URL to the newly created container type. <br>  |
**400** | Invalid request. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |

<a name="deleteBeverage"></a>
# **deleteBeverage**
> deleteBeverage(id)

Delete a beverage

Deletes a beverage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeverageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BeverageApi apiInstance = new BeverageApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the beverage.
    try {
      apiInstance.deleteBeverage(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeverageApi#deleteBeverage");
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
 **id** | [**UUID**](.md)| Unique identifier for the beverage. |

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
**204** | Beverage deleted successfully. |  -  |
**401** | Authentication failed. |  -  |
**404** | Resource not found. |  -  |

<a name="getBeverageById"></a>
# **getBeverageById**
> Beverage getBeverageById(id)

Retrieve a beverage by ID

Retrieves details of a specific beverage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeverageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BeverageApi apiInstance = new BeverageApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the beverage.
    try {
      Beverage result = apiInstance.getBeverageById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeverageApi#getBeverageById");
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
 **id** | [**UUID**](.md)| Unique identifier for the beverage. |

### Return type

[**Beverage**](Beverage.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Beverage details. |  -  |
**401** | Authentication failed. |  -  |
**404** | Resource not found. |  -  |

<a name="getBeverages"></a>
# **getBeverages**
> InlineResponse200 getBeverages(page, perPage)

Retrieve all beverages

Retrieves a list of all beverages.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeverageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BeverageApi apiInstance = new BeverageApi(defaultClient);
    Integer page = 1; // Integer | Page number.
    Integer perPage = 10; // Integer | Number of items per page.
    try {
      InlineResponse200 result = apiInstance.getBeverages(page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeverageApi#getBeverages");
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
 **page** | **Integer**| Page number. | [optional] [default to 1]
 **perPage** | **Integer**| Number of items per page. | [optional] [default to 10]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of beverages. |  -  |
**204** | No beverages found. |  -  |
**401** | Authentication failed. |  -  |

<a name="replaceBeverage"></a>
# **replaceBeverage**
> replaceBeverage(id, beveragesIdBody)

Update a beverage

Create or Replace an existing beverage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeverageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BeverageApi apiInstance = new BeverageApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the beverage.
    BeveragesIdBody beveragesIdBody = new BeveragesIdBody(); // BeveragesIdBody | 
    try {
      apiInstance.replaceBeverage(id, beveragesIdBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeverageApi#replaceBeverage");
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
 **id** | [**UUID**](.md)| Unique identifier for the beverage. |
 **beveragesIdBody** | [**BeveragesIdBody**](BeveragesIdBody.md)|  |

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
**200** | Beverage updated successfully. |  -  |
**201** | Beverage created successfully. |  * Location - URL to the newly created container type. <br>  |
**400** | Invalid request. |  -  |
**401** | Authentication failed. |  -  |
**404** | Resource not found. |  -  |

<a name="updateBeverage"></a>
# **updateBeverage**
> updateBeverage(id, beveragesIdBody1)

Partially update a beverage

Update an existing beverage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeverageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BeverageApi apiInstance = new BeverageApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the beverage.
    BeveragesIdBody1 beveragesIdBody1 = new BeveragesIdBody1(); // BeveragesIdBody1 | 
    try {
      apiInstance.updateBeverage(id, beveragesIdBody1);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeverageApi#updateBeverage");
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
 **id** | [**UUID**](.md)| Unique identifier for the beverage. |
 **beveragesIdBody1** | [**BeveragesIdBody1**](BeveragesIdBody1.md)|  |

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
**200** | Beverage updated successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Authentication failed. |  -  |
**404** | Resource not found. |  -  |

