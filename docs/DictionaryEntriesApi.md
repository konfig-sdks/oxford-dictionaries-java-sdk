# DictionaryEntriesApi

All URIs are relative to *https://od-api-demo.oxforddictionaries.com:443/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applyFilters**](DictionaryEntriesApi.md#applyFilters) | **GET** /entries/{source_lang}/{word_id}/{filters} | Apply filters to response |
| [**getInformation**](DictionaryEntriesApi.md#getInformation) | **GET** /entries/{source_lang}/{word_id} | Retrieve dictionary information for a given word |
| [**specifyDictionaryRegion**](DictionaryEntriesApi.md#specifyDictionaryRegion) | **GET** /entries/{source_lang}/{word_id}/regions&#x3D;{region} | Specify GB or US dictionary for English entry search |


<a name="applyFilters"></a>
# **applyFilters**
> RetrieveEntry applyFilters(sourceLang, wordId, filters).execute();

Apply filters to response

 Use filters to limit the [entry](documentation/glossary?term&#x3D;entry) information that is returned. For example, you may only require definitions and not everything else, or just [pronunciations](documentation/glossary?term&#x3D;pronunciation). The full list of filters can be retrieved from the filters Utility endpoint. You can also specify values within the filter using &#39;&#x3D;&#39;. For example &#39;grammaticalFeatures&#x3D;singular&#39;. Filters can also be combined using a semicolon.    &lt;div id&#x3D;\&quot;dictionary_entries_filters\&quot;&gt;&lt;/div&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DictionaryEntriesApi;
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
    List<String> filters = Arrays.asList(); // Separate filtering conditions using a semicolon. Conditions take values grammaticalFeatures and/or lexicalCategory and are case-sensitive. To list multiple values in single condition divide them with comma.
    try {
      RetrieveEntry result = client
              .dictionaryEntries
              .applyFilters(sourceLang, wordId, filters)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryEntriesApi#applyFilters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RetrieveEntry> response = client
              .dictionaryEntries
              .applyFilters(sourceLang, wordId, filters)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryEntriesApi#applyFilters");
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
| **sourceLang** | **String**| IANA language code | [enum: en, es, lv, hi, sw, ta, gu, fr] |
| **wordId** | **String**| An Entry identifier. Case-sensitive. | [default to ace] |
| **filters** | [**List&lt;String&gt;**](String.md)| Separate filtering conditions using a semicolon. Conditions take values grammaticalFeatures and/or lexicalCategory and are case-sensitive. To list multiple values in single condition divide them with comma. | |

### Return type

[**RetrieveEntry**](RetrieveEntry.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **404** | no entry is found matching supplied source_lang and id and/or that entry has no senses with translations in the target language.   |  -  |
| **500** | Internal Error. An error occurred while processing the data.  |  -  |

<a name="getInformation"></a>
# **getInformation**
> RetrieveEntry getInformation(sourceLang, wordId).execute();

Retrieve dictionary information for a given word

 Use this to retrieve definitions, [pronunciations](documentation/glossary?term&#x3D;pronunciation), example sentences, [grammatical information](documentation/glossary?term&#x3D;grammaticalfeatures) and [word origins](documentation/glossary?term&#x3D;etymology). It only works for dictionary [headwords](documentation/glossary?term&#x3D;headword), so you may need to use the [Lemmatron](documentation/glossary?term&#x3D;lemma) first if your input is likely to be an [inflected](documentation/glossary?term&#x3D;inflection) form (e.g., &#39;swimming&#39;). This would return the linked [headword](documentation/glossary?term&#x3D;headword) (e.g., &#39;swim&#39;) which you can then use in the Entries endpoint. Unless specified using a region filter, the default lookup will be the Oxford Dictionary of English (GB).    &lt;div id&#x3D;\&quot;dictionary_entries\&quot;&gt;&lt;/div&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DictionaryEntriesApi;
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
      RetrieveEntry result = client
              .dictionaryEntries
              .getInformation(sourceLang, wordId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryEntriesApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RetrieveEntry> response = client
              .dictionaryEntries
              .getInformation(sourceLang, wordId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryEntriesApi#getInformation");
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
| **sourceLang** | **String**| IANA language code | [enum: en, es, lv, hi, sw, ta, gu, fr] |
| **wordId** | **String**| An Entry identifier. Case-sensitive. | [default to ace] |

### Return type

[**RetrieveEntry**](RetrieveEntry.md)

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

<a name="specifyDictionaryRegion"></a>
# **specifyDictionaryRegion**
> RetrieveEntry specifyDictionaryRegion(sourceLang, wordId, region).execute();

Specify GB or US dictionary for English entry search

 USe this filter to restrict the lookup to either our Oxford Dictionary of English (GB) or New Oxford American Dictionary (US). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DictionaryEntriesApi;
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
    String region = "gb"; // Region filter parameter. gb = Oxford Dictionary of English. us = New Oxford American Dictionary.
    try {
      RetrieveEntry result = client
              .dictionaryEntries
              .specifyDictionaryRegion(sourceLang, wordId, region)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryEntriesApi#specifyDictionaryRegion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RetrieveEntry> response = client
              .dictionaryEntries
              .specifyDictionaryRegion(sourceLang, wordId, region)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DictionaryEntriesApi#specifyDictionaryRegion");
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
| **region** | **String**| Region filter parameter. gb &#x3D; Oxford Dictionary of English. us &#x3D; New Oxford American Dictionary. | [enum: gb, us] |

### Return type

[**RetrieveEntry**](RetrieveEntry.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **404** | no entry is found matching supplied source_lang and id and/or that entry has no senses with translations in the target language.   |  -  |
| **500** | Internal Error. An error occurred while processing the data.  |  -  |

