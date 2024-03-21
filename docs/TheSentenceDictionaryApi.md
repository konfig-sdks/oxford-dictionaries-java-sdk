# TheSentenceDictionaryApi

All URIs are relative to *https://od-api-demo.oxforddictionaries.com:443/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCorpusSentences**](TheSentenceDictionaryApi.md#getCorpusSentences) | **GET** /entries/{source_language}/{word_id}/sentences | Retrieve corpus sentences for a given word |


<a name="getCorpusSentences"></a>
# **getCorpusSentences**
> SentencesResults getCorpusSentences(sourceLanguage, wordId).execute();

Retrieve corpus sentences for a given word

 Use this to retrieve sentences extracted from  corpora which show how a word is used in the language. This is available for English and Spanish. For English, the sentences are linked to the correct [sense](documentation/glossary?term&#x3D;sense) of the word in the dictionary. In Spanish, they are linked at the [headword](documentation/glossary?term&#x3D;headword) level.   &lt;div id&#x3D;\&quot;sentences\&quot;&gt;&lt;/div&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TheSentenceDictionaryApi;
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
    String wordId = "ace"; // An Entry identifier. Case-sensitive.
    try {
      SentencesResults result = client
              .theSentenceDictionary
              .getCorpusSentences(sourceLanguage, wordId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling TheSentenceDictionaryApi#getCorpusSentences");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SentencesResults> response = client
              .theSentenceDictionary
              .getCorpusSentences(sourceLanguage, wordId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TheSentenceDictionaryApi#getCorpusSentences");
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
| **sourceLanguage** | **String**| IANA language code | [enum: en, es] |
| **wordId** | **String**| An Entry identifier. Case-sensitive. | [default to ace] |

### Return type

[**SentencesResults**](SentencesResults.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **404** | No entry is found matching supplied id and source_language  |  -  |
| **500** | Internal Error. An error occurred while processing the data.  |  -  |

