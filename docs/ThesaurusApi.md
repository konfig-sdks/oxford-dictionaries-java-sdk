# ThesaurusApi

All URIs are relative to *https://od-api-demo.oxforddictionaries.com:443/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAntonyms**](ThesaurusApi.md#getAntonyms) | **GET** /entries/{source_lang}/{word_id}/antonyms | Retrieve words that mean the opposite |
| [**getSimilarWords**](ThesaurusApi.md#getSimilarWords) | **GET** /entries/{source_lang}/{word_id}/synonyms | Retrieve words that are similar |
| [**getSynonymsAntonyms**](ThesaurusApi.md#getSynonymsAntonyms) | **GET** /entries/{source_lang}/{word_id}/synonyms;antonyms | Retrieve synonyms and antonyms for a given word |


<a name="getAntonyms"></a>
# **getAntonyms**
> Thesaurus getAntonyms(sourceLang, wordId).execute();

Retrieve words that mean the opposite

 Retrieve words that are opposite in meaning to the input word ([antonym](documentation/glossary?term&#x3D;thesaurus)).    &lt;div id&#x3D;\&quot;antonyms\&quot;&gt;&lt;/div&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThesaurusApi;
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
    String sourceLang = "en"; // IANA language code
    String wordId = "ace"; // An Entry identifier. Case-sensitive.
    try {
      Thesaurus result = client
              .thesaurus
              .getAntonyms(sourceLang, wordId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThesaurusApi#getAntonyms");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Thesaurus> response = client
              .thesaurus
              .getAntonyms(sourceLang, wordId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThesaurusApi#getAntonyms");
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
| **sourceLang** | **String**| IANA language code | [enum: en] |
| **wordId** | **String**| An Entry identifier. Case-sensitive. | [default to ace] |

### Return type

[**Thesaurus**](Thesaurus.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **404** | No entry is found matching supplied id and source_lang or filters are not recognized  |  -  |
| **500** | Internal Error. An error occurred while processing the data.  |  -  |

<a name="getSimilarWords"></a>
# **getSimilarWords**
> Thesaurus getSimilarWords(sourceLang, wordId).execute();

Retrieve words that are similar

 Use this to retrieve words that are similar in meaning to the input word ([synonym](documentation/glossary?term&#x3D;synonym)).    &lt;div id&#x3D;\&quot;synonyms\&quot;&gt;&lt;/div&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThesaurusApi;
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
    String sourceLang = "en"; // IANA language code
    String wordId = "ace"; // An Entry identifier. Case-sensitive.
    try {
      Thesaurus result = client
              .thesaurus
              .getSimilarWords(sourceLang, wordId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThesaurusApi#getSimilarWords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Thesaurus> response = client
              .thesaurus
              .getSimilarWords(sourceLang, wordId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThesaurusApi#getSimilarWords");
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
| **sourceLang** | **String**| IANA language code | [enum: en] |
| **wordId** | **String**| An Entry identifier. Case-sensitive. | [default to ace] |

### Return type

[**Thesaurus**](Thesaurus.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **404** | No entry is found matching supplied id and source_lang or filters are not recognized  |  -  |
| **500** | Internal Error. An error occurred while processing the data.  |  -  |

<a name="getSynonymsAntonyms"></a>
# **getSynonymsAntonyms**
> Thesaurus getSynonymsAntonyms(sourceLang, wordId).execute();

Retrieve synonyms and antonyms for a given word

 Retrieve available [synonyms](documentation/glossary?term&#x3D;thesaurus) and [antonyms](documentation/glossary?term&#x3D;thesaurus) for a given word and language.     &lt;div id&#x3D;\&quot;synonyms_and_antonyms\&quot;&gt;&lt;/div&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ThesaurusApi;
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
    String sourceLang = "en"; // IANA language code
    String wordId = "ace"; // An Entry identifier. Case-sensitive.
    try {
      Thesaurus result = client
              .thesaurus
              .getSynonymsAntonyms(sourceLang, wordId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThesaurusApi#getSynonymsAntonyms");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Thesaurus> response = client
              .thesaurus
              .getSynonymsAntonyms(sourceLang, wordId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ThesaurusApi#getSynonymsAntonyms");
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
| **sourceLang** | **String**| IANA language code | [enum: en] |
| **wordId** | **String**| An Entry identifier. Case-sensitive. | [default to ace] |

### Return type

[**Thesaurus**](Thesaurus.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **404** | No entry is found matching supplied id and source_lang or filters are not recognized  |  -  |
| **500** | Internal Error. An error occurred while processing the data.  |  -  |

