# BrandApi

All URIs are relative to *https://api.beverage-ecommerce.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBrand**](BrandApi.md#createBrand) | **POST** /brands | Create a new brand
[**deleteBrand**](BrandApi.md#deleteBrand) | **DELETE** /brands/{id} | Delete a brand
[**getBrandById**](BrandApi.md#getBrandById) | **GET** /brands/{id} | Retrieve a brand by ID
[**getBrands**](BrandApi.md#getBrands) | **GET** /brands | Retrieve all brand
[**replaceBrand**](BrandApi.md#replaceBrand) | **PUT** /brands/{id} | Update a brand
[**updateBrand**](BrandApi.md#updateBrand) | **PATCH** /brands/{id} | Partially update a brand


<a name="createBrand"></a>
# **createBrand**
> createBrand(brandsBody)

Create a new brand

Creates a new brand.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BrandApi apiInstance = new BrandApi(defaultClient);
    BrandsBody brandsBody = new BrandsBody(); // BrandsBody | 
    try {
      apiInstance.createBrand(brandsBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#createBrand");
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
 **brandsBody** | [**BrandsBody**](BrandsBody.md)|  |

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
**201** | Brand created successfully. |  * Location - URL to the newly created container type. <br>  |
**400** | Invalid request. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |

<a name="deleteBrand"></a>
# **deleteBrand**
> deleteBrand(id)

Delete a brand

Deletes a brand.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BrandApi apiInstance = new BrandApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the brand.
    try {
      apiInstance.deleteBrand(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#deleteBrand");
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
 **id** | [**UUID**](.md)| Unique identifier for the brand. |

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
**204** | Brand deleted successfully. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |
**404** | Resource not found. |  -  |

<a name="getBrandById"></a>
# **getBrandById**
> Brand getBrandById(id)

Retrieve a brand by ID

Retrieves details of a specific brand.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BrandApi apiInstance = new BrandApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the brand.
    try {
      Brand result = apiInstance.getBrandById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getBrandById");
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
 **id** | [**UUID**](.md)| Unique identifier for the brand. |

### Return type

[**Brand**](Brand.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Brand details. |  -  |
**401** | Authentication failed. |  -  |
**404** | Resource not found. |  -  |

<a name="getBrands"></a>
# **getBrands**
> List&lt;Brand&gt; getBrands(page, perPage)

Retrieve all brand

Retrieves a list of all brands.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BrandApi apiInstance = new BrandApi(defaultClient);
    Integer page = 1; // Integer | Page number.
    Integer perPage = 10; // Integer | Number of items per page.
    try {
      List<Brand> result = apiInstance.getBrands(page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#getBrands");
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

[**List&lt;Brand&gt;**](Brand.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of brands. |  -  |
**401** | Authentication failed. |  -  |

<a name="replaceBrand"></a>
# **replaceBrand**
> replaceBrand(id, brandsIdBody)

Update a brand

Create or replace an existing brand.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BrandApi apiInstance = new BrandApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the brand.
    BrandsIdBody brandsIdBody = new BrandsIdBody(); // BrandsIdBody | 
    try {
      apiInstance.replaceBrand(id, brandsIdBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#replaceBrand");
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
 **id** | [**UUID**](.md)| Unique identifier for the brand. |
 **brandsIdBody** | [**BrandsIdBody**](BrandsIdBody.md)|  |

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
**200** | Brand updated successfully. |  -  |
**201** | Brand created successfully. |  * Location - URL to the newly created container type. <br>  |
**400** | Invalid request. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |
**404** | Resource not found. |  -  |

<a name="updateBrand"></a>
# **updateBrand**
> updateBrand(id, brandsIdBody1)

Partially update a brand

Update an existing brand.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BrandApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    BrandApi apiInstance = new BrandApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the brand.
    BrandsIdBody1 brandsIdBody1 = new BrandsIdBody1(); // BrandsIdBody1 | 
    try {
      apiInstance.updateBrand(id, brandsIdBody1);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrandApi#updateBrand");
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
 **id** | [**UUID**](.md)| Unique identifier for the brand. |
 **brandsIdBody1** | [**BrandsIdBody1**](BrandsIdBody1.md)|  |

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
**200** | Brand updated successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |
**404** | Resource not found. |  -  |

