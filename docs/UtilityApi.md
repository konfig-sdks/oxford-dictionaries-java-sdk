# UtilityApi

All URIs are relative to *https://od-api-demo.oxforddictionaries.com:443/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGrammaticalFeatures**](UtilityApi.md#getGrammaticalFeatures) | **GET** /grammaticalFeatures/{source_language} | Lists available grammatical features in a dataset |
| [**getLexicalCategories**](UtilityApi.md#getLexicalCategories) | **GET** /lexicalcategories/{language} | Lists available lexical categories in a dataset |
| [**listAvailableDomains**](UtilityApi.md#listAvailableDomains) | **GET** /domains/{source_domains_language}/{target_domains_language} | Lists available domains in a bilingual dataset |
| [**listAvailableFilters**](UtilityApi.md#listAvailableFilters) | **GET** /filters | Lists available filters |
| [**listAvailableLanguages**](UtilityApi.md#listAvailableLanguages) | **GET** /languages | Lists available dictionaries |
| [**listBilingualRegisters**](UtilityApi.md#listBilingualRegisters) | **GET** /registers/{source_register_language}/{target_register_language} | Lists available registers in a bilingual dataset |
| [**listEndpointFilters**](UtilityApi.md#listEndpointFilters) | **GET** /filters/{endpoint} | Lists available filters for specific endpoint |
| [**listMonolingualDomains**](UtilityApi.md#listMonolingualDomains) | **GET** /domains/{source_language} | Lists available domains in a monolingual dataset |
| [**listMonolingualRegions**](UtilityApi.md#listMonolingualRegions) | **GET** /regions/{source_language} | Lists available regions in a monolingual dataset |
| [**listMonolingualRegisters**](UtilityApi.md#listMonolingualRegisters) | **GET** /registers/{source_language} | Lists available registers in a  monolingual dataset |


<a name="getGrammaticalFeatures"></a>
# **getGrammaticalFeatures**
> UtilityLabels getGrammaticalFeatures(sourceLanguage).execute();

Lists available grammatical features in a dataset

Returns a list of the available [grammatical features](documentation/glossary?term&#x3D;grammaticalfeatures) for a given language dataset. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UtilityApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://od-api-demo.oxforddictionaries.com:443/api/v1";
    
    configuration.appId  = "YOUR API KEY";
    
    configuration.appKey  = "YOUR API KEY";
    OxfordDictionaries client = new OxfordDictionaries(configuration);
    String sourceLanguage = "en"; // IANA language code. If provided output will be filtered by sourceLanguage.
    try {
      UtilityLabels result = client
              .utility
              .getGrammaticalFeatures(sourceLanguage)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#getGrammaticalFeatures");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UtilityLabels> response = client
              .utility
              .getGrammaticalFeatures(sourceLanguage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#getGrammaticalFeatures");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceLanguage** | **String**| IANA language code. If provided output will be filtered by sourceLanguage. | [enum: en, es, lv, nso, zu, ms, tn, ur, hi, sw, de, pt, ta, gu] |

### Return type

[**UtilityLabels**](UtilityLabels.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **404** | Unknown source_language. |  -  |

<a name="getLexicalCategories"></a>
# **getLexicalCategories**
> UtilityLabels getLexicalCategories(language).execute();

Lists available lexical categories in a dataset

Returns a list of available [lexical categories](documentation/glossary?term&#x3D;lexicalcategory) for a given language dataset. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UtilityApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://od-api-demo.oxforddictionaries.com:443/api/v1";
    
    configuration.appId  = "YOUR API KEY";
    
    configuration.appKey  = "YOUR API KEY";
    OxfordDictionaries client = new OxfordDictionaries(configuration);
    String language = "es"; // IANA language code
    try {
      UtilityLabels result = client
              .utility
              .getLexicalCategories(language)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#getLexicalCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UtilityLabels> response = client
              .utility
              .getLexicalCategories(language)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#getLexicalCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **language** | **String**| IANA language code | [enum: es, en, lv, nso, zu, ms, id, tn, ur, hi, sw, ro, de, pt, ta, gu] |

### Return type

[**UtilityLabels**](UtilityLabels.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **404** | Unknown language. |  -  |
| **500** | Internal Error. An error occurred while processing the data. |  -  |

<a name="listAvailableDomains"></a>
# **listAvailableDomains**
> UtilityLabels listAvailableDomains(sourceDomainsLanguage, targetDomainsLanguage).execute();

Lists available domains in a bilingual dataset

Returns a list of the available [domains](documentation/glossary?term&#x3D;domain) for a given bilingual language dataset. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UtilityApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://od-api-demo.oxforddictionaries.com:443/api/v1";
    
    configuration.appId  = "YOUR API KEY";
    
    configuration.appKey  = "YOUR API KEY";
    OxfordDictionaries client = new OxfordDictionaries(configuration);
    String sourceDomainsLanguage = "en"; // IANA language code
    String targetDomainsLanguage = "es"; // IANA language code
    try {
      UtilityLabels result = client
              .utility
              .listAvailableDomains(sourceDomainsLanguage, targetDomainsLanguage)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listAvailableDomains");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UtilityLabels> response = client
              .utility
              .listAvailableDomains(sourceDomainsLanguage, targetDomainsLanguage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listAvailableDomains");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceDomainsLanguage** | **String**| IANA language code | [enum: en, es, nso, zu, ur, de, pt] |
| **targetDomainsLanguage** | **String**| IANA language code | [enum: es, nso, zu, ms, id, tn, ro, de, pt] |

### Return type

[**UtilityLabels**](UtilityLabels.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **400** | source_language and target_language are same. |  -  |
| **404** | Unknown source_language and/or target_language. |  -  |

<a name="listAvailableFilters"></a>
# **listAvailableFilters**
> Filters listAvailableFilters().execute();

Lists available filters

Returns a list of all the valid filters to construct API calls. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UtilityApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://od-api-demo.oxforddictionaries.com:443/api/v1";
    
    configuration.appId  = "YOUR API KEY";
    
    configuration.appKey  = "YOUR API KEY";
    OxfordDictionaries client = new OxfordDictionaries(configuration);
    try {
      Filters result = client
              .utility
              .listAvailableFilters()
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listAvailableFilters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Filters> response = client
              .utility
              .listAvailableFilters()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listAvailableFilters");
      System.err.println("Status code: " + e.getStatusCode());
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

[**Filters**](Filters.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **500** | Internal Error. An error occurred while processing the data. |  -  |

<a name="listAvailableLanguages"></a>
# **listAvailableLanguages**
> Languages listAvailableLanguages().sourceLanguage(sourceLanguage).targetLanguage(targetLanguage).execute();

Lists available dictionaries

Returns a list of monolingual and bilingual language datasets available in the API 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UtilityApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://od-api-demo.oxforddictionaries.com:443/api/v1";
    
    configuration.appId  = "YOUR API KEY";
    
    configuration.appKey  = "YOUR API KEY";
    OxfordDictionaries client = new OxfordDictionaries(configuration);
    String sourceLanguage = "es"; // IANA language code. If provided output will be filtered by sourceLanguage.
    String targetLanguage = "es"; // IANA language code. If provided output will be filtered by sourceLanguage.
    try {
      Languages result = client
              .utility
              .listAvailableLanguages()
              .sourceLanguage(sourceLanguage)
              .targetLanguage(targetLanguage)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listAvailableLanguages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Languages> response = client
              .utility
              .listAvailableLanguages()
              .sourceLanguage(sourceLanguage)
              .targetLanguage(targetLanguage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listAvailableLanguages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceLanguage** | **String**| IANA language code. If provided output will be filtered by sourceLanguage. | [optional] [enum: es, en, lv, nso, zu, ms, id, tn, ur, hi, sw, ro, de, pt, ta, gu] |
| **targetLanguage** | **String**| IANA language code. If provided output will be filtered by sourceLanguage. | [optional] [enum: es, en, lv, nso, zu, ms, id, tn, ur, hi, sw, ro] |

### Return type

[**Languages**](Languages.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **404** | Unknown sourceLanguage and/or targetLanguage. |  -  |
| **500** | Internal Error. An error occurred while processing the data. |  -  |

<a name="listBilingualRegisters"></a>
# **listBilingualRegisters**
> UtilityLabels listBilingualRegisters(sourceRegisterLanguage, targetRegisterLanguage).execute();

Lists available registers in a bilingual dataset

Returns a list of the available [registers](documentation/glossary?term&#x3D;registers) for a given bilingual language dataset. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UtilityApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://od-api-demo.oxforddictionaries.com:443/api/v1";
    
    configuration.appId  = "YOUR API KEY";
    
    configuration.appKey  = "YOUR API KEY";
    OxfordDictionaries client = new OxfordDictionaries(configuration);
    String sourceRegisterLanguage = "en"; // IANA language code
    String targetRegisterLanguage = "es"; // IANA language code
    try {
      UtilityLabels result = client
              .utility
              .listBilingualRegisters(sourceRegisterLanguage, targetRegisterLanguage)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listBilingualRegisters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UtilityLabels> response = client
              .utility
              .listBilingualRegisters(sourceRegisterLanguage, targetRegisterLanguage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listBilingualRegisters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceRegisterLanguage** | **String**| IANA language code | [enum: en, es, ms, id, ur, de, pt] |
| **targetRegisterLanguage** | **String**| IANA language code | [enum: es, en, nso, zu, ms, id, tn, ro, de, pt] |

### Return type

[**UtilityLabels**](UtilityLabels.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **400** | source_language and target_language are same. |  -  |
| **404** | Unknown source_language and/or target_language. |  -  |
| **500** | Internal Error. An error occurred while processing the data. |  -  |

<a name="listEndpointFilters"></a>
# **listEndpointFilters**
> Filters listEndpointFilters(endpoint).execute();

Lists available filters for specific endpoint

Returns a list of all the valid filters for a given endpoint to construct API calls. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UtilityApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://od-api-demo.oxforddictionaries.com:443/api/v1";
    
    configuration.appId  = "YOUR API KEY";
    
    configuration.appKey  = "YOUR API KEY";
    OxfordDictionaries client = new OxfordDictionaries(configuration);
    String endpoint = "entries"; // Name of the endpoint.
    try {
      Filters result = client
              .utility
              .listEndpointFilters(endpoint)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listEndpointFilters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Filters> response = client
              .utility
              .listEndpointFilters(endpoint)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listEndpointFilters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpoint** | **String**| Name of the endpoint. | [enum: entries, inflections, translations] |

### Return type

[**Filters**](Filters.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **404** | Unknown endpoint. |  -  |
| **500** | Internal Error. An error occurred while processing the data. |  -  |

<a name="listMonolingualDomains"></a>
# **listMonolingualDomains**
> UtilityLabels listMonolingualDomains(sourceLanguage).execute();

Lists available domains in a monolingual dataset

Returns a list of the available [domains](documentation/glossary?term&#x3D;domain) for a given monolingual language dataset. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UtilityApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://od-api-demo.oxforddictionaries.com:443/api/v1";
    
    configuration.appId  = "YOUR API KEY";
    
    configuration.appKey  = "YOUR API KEY";
    OxfordDictionaries client = new OxfordDictionaries(configuration);
    String sourceLanguage = "en"; // IANA language code
    try {
      UtilityLabels result = client
              .utility
              .listMonolingualDomains(sourceLanguage)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listMonolingualDomains");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UtilityLabels> response = client
              .utility
              .listMonolingualDomains(sourceLanguage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listMonolingualDomains");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceLanguage** | **String**| IANA language code | [enum: en, es, nso, zu, hi, sw, ur, de, pt, ta, gu] |

### Return type

[**UtilityLabels**](UtilityLabels.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **404** | Unknown source_language. |  -  |

<a name="listMonolingualRegions"></a>
# **listMonolingualRegions**
> Regions listMonolingualRegions(sourceLanguage).execute();

Lists available regions in a monolingual dataset

Returns a list of the available [regions](documentation/glossary?term&#x3D;regions) for a given monolingual language dataset. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UtilityApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://od-api-demo.oxforddictionaries.com:443/api/v1";
    
    configuration.appId  = "YOUR API KEY";
    
    configuration.appKey  = "YOUR API KEY";
    OxfordDictionaries client = new OxfordDictionaries(configuration);
    String sourceLanguage = "en"; // IANA language code
    try {
      Regions result = client
              .utility
              .listMonolingualRegions(sourceLanguage)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listMonolingualRegions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Regions> response = client
              .utility
              .listMonolingualRegions(sourceLanguage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listMonolingualRegions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceLanguage** | **String**| IANA language code | [enum: en] |

### Return type

[**Regions**](Regions.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **404** | Unknown source_language. |  -  |

<a name="listMonolingualRegisters"></a>
# **listMonolingualRegisters**
> UtilityLabels listMonolingualRegisters(sourceLanguage).execute();

Lists available registers in a  monolingual dataset

Returns a list of the available [registers](documentation/glossary?term&#x3D;registers) for a given monolingual language dataset. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UtilityApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://od-api-demo.oxforddictionaries.com:443/api/v1";
    
    configuration.appId  = "YOUR API KEY";
    
    configuration.appKey  = "YOUR API KEY";
    OxfordDictionaries client = new OxfordDictionaries(configuration);
    String sourceLanguage = "en"; // IANA language code
    try {
      UtilityLabels result = client
              .utility
              .listMonolingualRegisters(sourceLanguage)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listMonolingualRegisters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UtilityLabels> response = client
              .utility
              .listMonolingualRegisters(sourceLanguage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilityApi#listMonolingualRegisters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceLanguage** | **String**| IANA language code | [enum: en, es, hi, id, lv, ms, sw, ur, de, pt, ta, gu] |

### Return type

[**UtilityLabels**](UtilityLabels.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **404** | Unknown source_language. |  -  |
| **500** | Internal Error. An error occurred while processing the data. |  -  |

