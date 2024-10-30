# IngredientApi

All URIs are relative to *https://api.beverage-ecommerce.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIngredient**](IngredientApi.md#createIngredient) | **POST** /ingredients | Create a new ingredient
[**deleteIngredient**](IngredientApi.md#deleteIngredient) | **DELETE** /ingredients/{id} | Delete an ingredient
[**getIngredientById**](IngredientApi.md#getIngredientById) | **GET** /ingredients/{id} | Retrieve an ingredient by ID
[**getIngredients**](IngredientApi.md#getIngredients) | **GET** /ingredients | Retrieve all ingredients
[**replaceIngredient**](IngredientApi.md#replaceIngredient) | **PUT** /ingredients/{id} | Update an ingredient
[**updateIngredient**](IngredientApi.md#updateIngredient) | **PATCH** /ingredients/{id} | Update an ingredient


<a name="createIngredient"></a>
# **createIngredient**
> createIngredient(ingredientsBody)

Create a new ingredient

Creates a new ingredient.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IngredientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    IngredientApi apiInstance = new IngredientApi(defaultClient);
    IngredientsBody ingredientsBody = new IngredientsBody(); // IngredientsBody | 
    try {
      apiInstance.createIngredient(ingredientsBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling IngredientApi#createIngredient");
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
 **ingredientsBody** | [**IngredientsBody**](IngredientsBody.md)|  |

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
**201** | Ingredient created successfully. |  * Location - URL to the newly created container type. <br>  |
**400** | Invalid request. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |

<a name="deleteIngredient"></a>
# **deleteIngredient**
> deleteIngredient(id)

Delete an ingredient

Deletes an ingredient.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IngredientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    IngredientApi apiInstance = new IngredientApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the ingredient.
    try {
      apiInstance.deleteIngredient(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling IngredientApi#deleteIngredient");
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
 **id** | [**UUID**](.md)| Unique identifier for the ingredient. |

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
**204** | Ingredient deleted successfully. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |
**404** | Resource not found. |  -  |

<a name="getIngredientById"></a>
# **getIngredientById**
> Ingredient getIngredientById(id)

Retrieve an ingredient by ID

Retrieves details of a specific ingredient.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IngredientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    IngredientApi apiInstance = new IngredientApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the ingredient.
    try {
      Ingredient result = apiInstance.getIngredientById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IngredientApi#getIngredientById");
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
 **id** | [**UUID**](.md)| Unique identifier for the ingredient. |

### Return type

[**Ingredient**](Ingredient.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ingredient details. |  -  |
**401** | Authentication failed. |  -  |
**404** | Resource not found. |  -  |

<a name="getIngredients"></a>
# **getIngredients**
> List&lt;Ingredient&gt; getIngredients()

Retrieve all ingredients

Retrieves a list of all ingredients.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IngredientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    IngredientApi apiInstance = new IngredientApi(defaultClient);
    try {
      List<Ingredient> result = apiInstance.getIngredients();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IngredientApi#getIngredients");
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

[**List&lt;Ingredient&gt;**](Ingredient.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of ingredients. |  -  |
**401** | Authentication failed. |  -  |

<a name="replaceIngredient"></a>
# **replaceIngredient**
> replaceIngredient(id, ingredientsIdBody)

Update an ingredient

Create or Replace an existing ingredient.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IngredientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    IngredientApi apiInstance = new IngredientApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the ingredient.
    IngredientsIdBody ingredientsIdBody = new IngredientsIdBody(); // IngredientsIdBody | 
    try {
      apiInstance.replaceIngredient(id, ingredientsIdBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling IngredientApi#replaceIngredient");
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
 **id** | [**UUID**](.md)| Unique identifier for the ingredient. |
 **ingredientsIdBody** | [**IngredientsIdBody**](IngredientsIdBody.md)|  |

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
**200** | Ingredient updated successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |
**404** | Resource not found. |  -  |

<a name="updateIngredient"></a>
# **updateIngredient**
> updateIngredient(id, ingredientsIdBody1)

Update an ingredient

Updates an existing ingredient.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IngredientApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    IngredientApi apiInstance = new IngredientApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the ingredient.
    IngredientsIdBody1 ingredientsIdBody1 = new IngredientsIdBody1(); // IngredientsIdBody1 | 
    try {
      apiInstance.updateIngredient(id, ingredientsIdBody1);
    } catch (ApiException e) {
      System.err.println("Exception when calling IngredientApi#updateIngredient");
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
 **id** | [**UUID**](.md)| Unique identifier for the ingredient. |
 **ingredientsIdBody1** | [**IngredientsIdBody1**](IngredientsIdBody1.md)|  |

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
**200** | Ingredient updated successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |
**404** | Resource not found. |  -  |

