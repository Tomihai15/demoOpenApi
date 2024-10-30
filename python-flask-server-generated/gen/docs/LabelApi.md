# LabelApi

All URIs are relative to *https://api.beverage-ecommerce.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLabel**](LabelApi.md#createLabel) | **POST** /beverages/{id}/labels | Create a new label
[**deleteLabel**](LabelApi.md#deleteLabel) | **DELETE** /beverages/{beverageId}/labels/{id} | Delete a label
[**getLabelById**](LabelApi.md#getLabelById) | **GET** /beverages/{beverageId}/labels/{id} | Retrieve a label by ID and beverage ID
[**getLabels**](LabelApi.md#getLabels) | **GET** /beverages/{id}/labels | Retrieve all labels
[**replaceLabel**](LabelApi.md#replaceLabel) | **PUT** /beverages/{beverageId}/labels/{id} | Update a label
[**updateLabel**](LabelApi.md#updateLabel) | **PATCH** /beverages/{beverageId}/labels/{id} | Partially update a label


<a name="createLabel"></a>
# **createLabel**
> createLabel(id, idLabelsBody)

Create a new label

Creates a new label.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LabelApi apiInstance = new LabelApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the beverages.
    IdLabelsBody idLabelsBody = new IdLabelsBody(); // IdLabelsBody | 
    try {
      apiInstance.createLabel(id, idLabelsBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#createLabel");
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
 **id** | [**UUID**](.md)| Unique identifier for the beverages. |
 **idLabelsBody** | [**IdLabelsBody**](IdLabelsBody.md)|  |

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
**201** | Label created successfully. |  * Location - URL to the newly created container type. <br>  |
**400** | Invalid request. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |
**404** | Resource not found. |  -  |

<a name="deleteLabel"></a>
# **deleteLabel**
> deleteLabel(beverageId, id)

Delete a label

Deletes a label.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LabelApi apiInstance = new LabelApi(defaultClient);
    UUID beverageId = new UUID(); // UUID | Unique identifier for the beverage.
    UUID id = new UUID(); // UUID | Unique identifier for the label.
    try {
      apiInstance.deleteLabel(beverageId, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#deleteLabel");
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
 **beverageId** | [**UUID**](.md)| Unique identifier for the beverage. |
 **id** | [**UUID**](.md)| Unique identifier for the label. |

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
**204** | Label deleted successfully. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |
**404** | Resource not found. |  -  |

<a name="getLabelById"></a>
# **getLabelById**
> Label getLabelById(beverageId, id)

Retrieve a label by ID and beverage ID

Retrieves details of a specific label.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LabelApi apiInstance = new LabelApi(defaultClient);
    UUID beverageId = new UUID(); // UUID | Unique identifier for the beverage.
    UUID id = new UUID(); // UUID | Unique identifier for the label.
    try {
      Label result = apiInstance.getLabelById(beverageId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#getLabelById");
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
 **beverageId** | [**UUID**](.md)| Unique identifier for the beverage. |
 **id** | [**UUID**](.md)| Unique identifier for the label. |

### Return type

[**Label**](Label.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Label details. |  -  |
**401** | Authentication failed. |  -  |
**404** | Resource not found. |  -  |

<a name="getLabels"></a>
# **getLabels**
> List&lt;Label&gt; getLabels(id)

Retrieve all labels

Retrieves a list of all labels.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LabelApi apiInstance = new LabelApi(defaultClient);
    UUID id = new UUID(); // UUID | Unique identifier for the beverages.
    try {
      List<Label> result = apiInstance.getLabels(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#getLabels");
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
 **id** | [**UUID**](.md)| Unique identifier for the beverages. |

### Return type

[**List&lt;Label&gt;**](Label.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of labels. |  -  |
**401** | Authentication failed. |  -  |
**404** | Resource not found. |  -  |

<a name="replaceLabel"></a>
# **replaceLabel**
> replaceLabel(beverageId, id, labelsIdBody)

Update a label

Create or Replace an existing label.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LabelApi apiInstance = new LabelApi(defaultClient);
    UUID beverageId = new UUID(); // UUID | Unique identifier for the beverage.
    UUID id = new UUID(); // UUID | Unique identifier for the label.
    LabelsIdBody labelsIdBody = new LabelsIdBody(); // LabelsIdBody | 
    try {
      apiInstance.replaceLabel(beverageId, id, labelsIdBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#replaceLabel");
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
 **beverageId** | [**UUID**](.md)| Unique identifier for the beverage. |
 **id** | [**UUID**](.md)| Unique identifier for the label. |
 **labelsIdBody** | [**LabelsIdBody**](LabelsIdBody.md)|  |

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
**200** | Label updated successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |
**404** | Resource not found. |  -  |

<a name="updateLabel"></a>
# **updateLabel**
> updateLabel(beverageId, id, labelsIdBody1)

Partially update a label

Update existing label.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LabelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.beverage-ecommerce.com/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    LabelApi apiInstance = new LabelApi(defaultClient);
    UUID beverageId = new UUID(); // UUID | Unique identifier for the beverage.
    UUID id = new UUID(); // UUID | Unique identifier for the label.
    LabelsIdBody1 labelsIdBody1 = new LabelsIdBody1(); // LabelsIdBody1 | 
    try {
      apiInstance.updateLabel(beverageId, id, labelsIdBody1);
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#updateLabel");
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
 **beverageId** | [**UUID**](.md)| Unique identifier for the beverage. |
 **id** | [**UUID**](.md)| Unique identifier for the label. |
 **labelsIdBody1** | [**LabelsIdBody1**](LabelsIdBody1.md)|  |

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
**200** | Label updated successfully. |  -  |
**400** | Invalid request. |  -  |
**401** | Authentication failed. |  -  |
**403** | Access forbidden. |  -  |
**404** | Resource not found. |  -  |

