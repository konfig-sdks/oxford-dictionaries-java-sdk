# SearchApi

All URIs are relative to *https://od-api-demo.oxforddictionaries.com:443/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMatches**](SearchApi.md#getMatches) | **GET** /search/{source_lang} | Retrieve possible matches to input |
| [**possibleTranslations**](SearchApi.md#possibleTranslations) | **GET** /search/{source_search_language}/translations&#x3D;{target_search_language} | Retrieve possible translation matches to input |


<a name="getMatches"></a>
# **getMatches**
> Wordlist getMatches(sourceLang).q(q).prefix(prefix).regions(regions).limit(limit).offset(offset).execute();

Retrieve possible matches to input

 Use this to retrieve possible [headword](documentation/glossary?term&#x3D;headword) matches for a given string of text. The results are culculated using headword matching, fuzzy matching, and [lemmatization](documentation/glossary?term&#x3D;lemma)     &lt;div id&#x3D;\&quot;search\&quot;&gt;&lt;/div&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchApi;
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
    String q = "eye"; // Search string
    Boolean prefix = false; // Set prefix to true if you'd like to get results only starting with search string.
    String regions = "regions_example"; // If searching in English, filter words with specific region(s) either 'us' or 'gb'.
    String limit = "limit_example"; // Limit the number of results per response. Default and maximum limit is 5000.
    String offset = "offset_example"; // Offset the start number of the result.
    try {
      Wordlist result = client
              .search
              .getMatches(sourceLang)
              .q(q)
              .prefix(prefix)
              .regions(regions)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#getMatches");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Wordlist> response = client
              .search
              .getMatches(sourceLang)
              .q(q)
              .prefix(prefix)
              .regions(regions)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#getMatches");
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
| **sourceLang** | **String**| IANA language code | [enum: en, es, hi, lv, sw, ta, gu] |
| **q** | **String**| Search string | [optional] [default to eye] |
| **prefix** | **Boolean**| Set prefix to true if you&#39;d like to get results only starting with search string. | [optional] [default to false] [enum: false, true] |
| **regions** | **String**| If searching in English, filter words with specific region(s) either &#39;us&#39; or &#39;gb&#39;. | [optional] |
| **limit** | **String**| Limit the number of results per response. Default and maximum limit is 5000. | [optional] |
| **offset** | **String**| Offset the start number of the result. | [optional] |

### Return type

[**Wordlist**](Wordlist.md)

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

<a name="possibleTranslations"></a>
# **possibleTranslations**
> Wordlist possibleTranslations(sourceSearchLanguage, targetSearchLanguage).q(q).prefix(prefix).regions(regions).limit(limit).offset(offset).execute();

Retrieve possible translation matches to input

 Use this to find matches in our translation dictionaries.    &lt;div id&#x3D;\&quot;search_translation\&quot;&gt;&lt;/div&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchApi;
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
    String sourceSearchLanguage = "en"; // IANA language code
    String targetSearchLanguage = "es"; // IANA language code
    String q = "eye"; // Search string.
    Boolean prefix = false; // Set prefix to true if you'd like to get results only starting with search string.
    String regions = "regions_example"; // Filter words with specific region(s) E.g., regions=us. For now gb, us are available for en language.
    String limit = "limit_example"; // Limit the number of results per response. Default and maximum limit is 5000.
    String offset = "offset_example"; // Offset the start number of the result.
    try {
      Wordlist result = client
              .search
              .possibleTranslations(sourceSearchLanguage, targetSearchLanguage)
              .q(q)
              .prefix(prefix)
              .regions(regions)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#possibleTranslations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Wordlist> response = client
              .search
              .possibleTranslations(sourceSearchLanguage, targetSearchLanguage)
              .q(q)
              .prefix(prefix)
              .regions(regions)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#possibleTranslations");
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
| **sourceSearchLanguage** | **String**| IANA language code | [enum: en, es, nso, zu, ms, id, tn, ur, de, pt] |
| **targetSearchLanguage** | **String**| IANA language code | [enum: es, nso, zu, ms, id, tn, ro, de, pt] |
| **q** | **String**| Search string. | [optional] [default to eye] |
| **prefix** | **Boolean**| Set prefix to true if you&#39;d like to get results only starting with search string. | [optional] [default to false] [enum: false, true] |
| **regions** | **String**| Filter words with specific region(s) E.g., regions&#x3D;us. For now gb, us are available for en language. | [optional] |
| **limit** | **String**| Limit the number of results per response. Default and maximum limit is 5000. | [optional] |
| **offset** | **String**| Offset the start number of the result. | [optional] |

### Return type

[**Wordlist**](Wordlist.md)

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

