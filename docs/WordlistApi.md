# WordlistApi

All URIs are relative to *https://od-api-demo.oxforddictionaries.com:443/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAdvancedWords**](WordlistApi.md#getAdvancedWords) | **GET** /wordlist/{source_lang}/{filters_advanced} | Retrieve list of words for category with advanced options |
| [**getCategoryWords**](WordlistApi.md#getCategoryWords) | **GET** /wordlist/{source_lang}/{filters_basic} | Retrieve a list of words in a category |


<a name="getAdvancedWords"></a>
# **getAdvancedWords**
> Wordlist getAdvancedWords(sourceLang, filtersAdvanced).exclude(exclude).excludeSenses(excludeSenses).excludePrimeSenses(excludePrimeSenses).wordLength(wordLength).prefix(prefix).exact(exact).limit(limit).offset(offset).execute();

Retrieve list of words for category with advanced options

Use this to apply more complex filters to the [list of words](documentation/glossary?term&#x3D;wordlist). For example, you may only want to filter out words for which all [senses](documentation/glossary?term&#x3D;sense) match the filter, or only its &#39;prime sense&#39;. You can also filter by word length or match by substring (prefix).     &lt;div id&#x3D;\&quot;wordlist_advanced\&quot;&gt;&lt;/div&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WordlistApi;
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
    String filtersAdvanced = "lexicalCategory=Noun;domains=sport"; // Semicolon separated list of wordlist parameters, presented as value pairs: LexicalCategory, domains, regions, registers. Parameters can take comma separated list of values. E.g., lexicalCategory=noun,adjective;domains=sport. Number of values limited to 5.
    String exclude = "exclude_example"; // Semicolon separated list of parameters-value pairs (same as filters). Excludes headwords that have any senses in specified exclusion attributes (lexical categories, domains, etc.) from results.
    String excludeSenses = "excludeSenses_example"; // Semicolon separated list of parameters-value pairs (same as filters). Excludes only those senses of a particular headword that match specified exclusion attributes (lexical categories, domains, etc.) from results but includes the headword if it has other permitted senses.
    String excludePrimeSenses = "excludePrimeSenses_example"; // Semicolon separated list of parameters-value pairs (same as filters). Excludes a headword only if the primary sense matches the specified exclusion attributes (registers, domains only).
    String wordLength = ">5,<10"; // Parameter to speficy the minimum (>), exact or maximum (<) length of the words required. E.g., >5 - more than 5 chars; <4 - less than 4 chars; >5<10 - from 5 to 10 chars; 3 - exactly 3 chars.
    String prefix = "goal"; // Filter words that start with prefix parameter
    Boolean exact = false; // If exact=true wordlist returns a list of entries that exactly matches the search string. Otherwise wordlist lists entries that start with prefix string.
    String limit = "limit_example"; // Limit the number of results per response. Default and maximum limit is 5000.
    String offset = "offset_example"; // Offset the start number of the result.
    try {
      Wordlist result = client
              .wordlist
              .getAdvancedWords(sourceLang, filtersAdvanced)
              .exclude(exclude)
              .excludeSenses(excludeSenses)
              .excludePrimeSenses(excludePrimeSenses)
              .wordLength(wordLength)
              .prefix(prefix)
              .exact(exact)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling WordlistApi#getAdvancedWords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Wordlist> response = client
              .wordlist
              .getAdvancedWords(sourceLang, filtersAdvanced)
              .exclude(exclude)
              .excludeSenses(excludeSenses)
              .excludePrimeSenses(excludePrimeSenses)
              .wordLength(wordLength)
              .prefix(prefix)
              .exact(exact)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WordlistApi#getAdvancedWords");
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
| **filtersAdvanced** | **String**| Semicolon separated list of wordlist parameters, presented as value pairs: LexicalCategory, domains, regions, registers. Parameters can take comma separated list of values. E.g., lexicalCategory&#x3D;noun,adjective;domains&#x3D;sport. Number of values limited to 5. | [default to lexicalCategory&#x3D;Noun;domains&#x3D;sport] |
| **exclude** | **String**| Semicolon separated list of parameters-value pairs (same as filters). Excludes headwords that have any senses in specified exclusion attributes (lexical categories, domains, etc.) from results. | [optional] |
| **excludeSenses** | **String**| Semicolon separated list of parameters-value pairs (same as filters). Excludes only those senses of a particular headword that match specified exclusion attributes (lexical categories, domains, etc.) from results but includes the headword if it has other permitted senses. | [optional] |
| **excludePrimeSenses** | **String**| Semicolon separated list of parameters-value pairs (same as filters). Excludes a headword only if the primary sense matches the specified exclusion attributes (registers, domains only). | [optional] |
| **wordLength** | **String**| Parameter to speficy the minimum (&gt;), exact or maximum (&lt;) length of the words required. E.g., &gt;5 - more than 5 chars; &lt;4 - less than 4 chars; &gt;5&lt;10 - from 5 to 10 chars; 3 - exactly 3 chars. | [optional] [default to &gt;5,&lt;10] |
| **prefix** | **String**| Filter words that start with prefix parameter | [optional] [default to goal] |
| **exact** | **Boolean**| If exact&#x3D;true wordlist returns a list of entries that exactly matches the search string. Otherwise wordlist lists entries that start with prefix string. | [optional] [default to false] [enum: false, true] |
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
| **400** | disjoint sets of word_length values (eg &lt;3&gt;10); filter has no values; total number of filters &gt; 20; filters and excludes values can not be the same; source_lang and translations can not be same; word_length conflicts with prefix length. |  -  |
| **404** | No entries is found matching supplied filters or lang or filters is not recognized.  |  -  |
| **500** | Internal Error. An error occurred while processing the data.  |  -  |

<a name="getCategoryWords"></a>
# **getCategoryWords**
> Wordlist getCategoryWords(sourceLang, filtersBasic).limit(limit).offset(offset).execute();

Retrieve a list of words in a category

 Use this to retrieve a [list of words](documentation/glossary?term&#x3D;wordlist) for particular [domain](documentation/glossary?term&#x3D;domain), [lexical category](documentation/glossary?term&#x3D;lexicalcategory), [register](documentation/glossary?term&#x3D;registers) and/or [region](documentation/glossary?term&#x3D;regions). View the full list of possible filters using the filters Utility endpoint.  The response only includes [headwords](documentation/glossary?term&#x3D;headword), not all their possible [inflections](documentation/glossary?term&#x3D;inflection). If you require a full [wordlist](documentation/glossary?term&#x3D;wordlist) including [inflected forms](documentation/glossary?term&#x3D;inflection), contact us and we can help.    &lt;div id&#x3D;\&quot;wordlist\&quot;&gt;&lt;/div&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WordlistApi;
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
    String filtersBasic = "registers=Rare;domains=Art"; // Semicolon separated list of wordlist parameters, presented as value pairs: LexicalCategory, domains, regions, registers. Parameters can take comma separated list of values. E.g., lexicalCategory=noun,adjective;domains=sport. Number of values limited to 5.
    String limit = "limit_example"; // Limit the number of results per response. Default and maximum limit is 5000.
    String offset = "offset_example"; // Offset the start number of the result
    try {
      Wordlist result = client
              .wordlist
              .getCategoryWords(sourceLang, filtersBasic)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling WordlistApi#getCategoryWords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Wordlist> response = client
              .wordlist
              .getCategoryWords(sourceLang, filtersBasic)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WordlistApi#getCategoryWords");
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
| **filtersBasic** | **String**| Semicolon separated list of wordlist parameters, presented as value pairs: LexicalCategory, domains, regions, registers. Parameters can take comma separated list of values. E.g., lexicalCategory&#x3D;noun,adjective;domains&#x3D;sport. Number of values limited to 5. | [default to registers&#x3D;Rare;domains&#x3D;Art] |
| **limit** | **String**| Limit the number of results per response. Default and maximum limit is 5000. | [optional] |
| **offset** | **String**| Offset the start number of the result | [optional] |

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
| **400** | filter has no values; total number of filters &gt; 20. |  -  |
| **404** | No entries is found matching supplied filters or lang or filters is not recognized.  |  -  |
| **500** | Internal Error. An error occurred while processing the data.  |  -  |

