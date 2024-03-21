# TranslationApi

All URIs are relative to *https://od-api-demo.oxforddictionaries.com:443/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getWordTranslation**](TranslationApi.md#getWordTranslation) | **GET** /entries/{source_translation_language}/{word_id}/translations&#x3D;{target_translation_language} | Retrieve translation for a given word |


<a name="getWordTranslation"></a>
# **getWordTranslation**
> RetrieveEntry getWordTranslation(sourceTranslationLanguage, wordId, targetTranslationLanguage).execute();

Retrieve translation for a given word

 Use this to return translations for a given word. In the event that a word in the dataset does not have a direct translation, the response will be a [definition](documentation/glossary?term&#x3D;entry) in the target language.    &lt;div id&#x3D;\&quot;translation\&quot;&gt;&lt;/div&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TranslationApi;
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
    String sourceTranslationLanguage = "en"; // IANA language code
    String wordId = "change"; // The source word
    String targetTranslationLanguage = "es"; // IANA language code
    try {
      RetrieveEntry result = client
              .translation
              .getWordTranslation(sourceTranslationLanguage, wordId, targetTranslationLanguage)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#getWordTranslation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RetrieveEntry> response = client
              .translation
              .getWordTranslation(sourceTranslationLanguage, wordId, targetTranslationLanguage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationApi#getWordTranslation");
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
| **sourceTranslationLanguage** | **String**| IANA language code | [enum: en, es, nso, zu, ms, id, tn, ur, de, pt] |
| **wordId** | **String**| The source word | [default to change] |
| **targetTranslationLanguage** | **String**| IANA language code | [enum: es, nso, zu, ms, id, tn, ro, de, pt] |

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
| **200** | Successful response. In case word doesn&#39;t have a direct translation a response would be definitions. |  -  |
| **400** | any of target languages is unknown |  -  |
| **404** | no entry is found matching supplied source_lang and id and/or that entry has no senses with translations in the target language(s).   |  -  |
| **500** | Internal Error. An error occurred while processing the data.  |  -  |

