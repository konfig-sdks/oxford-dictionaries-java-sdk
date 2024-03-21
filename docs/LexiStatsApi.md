# LexiStatsApi

All URIs are relative to *https://od-api-demo.oxforddictionaries.com:443/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNgramFrequencies**](LexiStatsApi.md#getNgramFrequencies) | **GET** /stats/frequency/ngrams/{source_lang}/{corpus}/{ngram-size} | Retrieve the frequency of ngrams (1-4) derived from a corpus |
| [**getWordFrequencies**](LexiStatsApi.md#getWordFrequencies) | **GET** /stats/frequency/words/{source_lang} | Retrieve a list of frequencies of a word/words derived from a corpus. |
| [**getWordFrequency**](LexiStatsApi.md#getWordFrequency) | **GET** /stats/frequency/word/{source_lang} | Retrieve the frequency of a word derived from a corpus. |


<a name="getNgramFrequencies"></a>
# **getNgramFrequencies**
> NgramsResult getNgramFrequencies(sourceLang, corpus, ngramSize).tokens(tokens).contains(contains).punctuation(punctuation).format(format).minFrequency(minFrequency).maxFrequency(maxFrequency).minDocumentFrequency(minDocumentFrequency).maxDocumentFrequency(maxDocumentFrequency).collate(collate).sort(sort).offset(offset).limit(limit).execute();

Retrieve the frequency of ngrams (1-4) derived from a corpus

This endpoint returns frequencies of ngrams of size 1-4. That is the number of times a word (ngram size &#x3D; 1) or words (ngram size &gt; 1) appear in the corpus. Ngrams are case sensitive (\&quot;I AM\&quot; and \&quot;I am\&quot; will have different frequency) and frequencies are calculated per word (true case) so \&quot;the book\&quot; and \&quot;the books\&quot; are two different ngrams. The results can be filtered based on query parameters. &lt;br&gt; &lt;br&gt; Parameters can be provided in PATH, GET or POST (form or json). The parameters in PATH are overridden by parameters in GET, POST and json (in that order). In PATH, individual options are separated by semicolon and values are separated by commas (where multiple values can be used). &lt;br&gt; &lt;br&gt; Example for bigrams (ngram of size 2): * PATH: /tokens&#x3D;a word,another word * GET: /?tokens&#x3D;a word&amp;tokens&#x3D;another word * POST (json):    &#x60;&#x60;&#x60;javascript     {         \&quot;tokens\&quot;: [\&quot;a word\&quot;, \&quot;another word\&quot;]     }   &#x60;&#x60;&#x60;  Either \&quot;tokens\&quot; or \&quot;contains\&quot; has to be provided. &lt;br&gt; &lt;br&gt; Some queries with \&quot;contains\&quot; or \&quot;sort\&quot; can exceed the 30s timeout, in which case the API will return an error message with status code 503. You mitigate this by providing additional restrictions such as \&quot;minFrequency\&quot; and \&quot;maxFrequency\&quot;. &lt;br&gt; &lt;br&gt; You can use the parameters \&quot;offset\&quot; and \&quot;limit\&quot; to paginate through large result sets. For convenience, the HTTP header \&quot;Link\&quot; is set on the response to provide links to \&quot;first\&quot;, \&quot;self\&quot;, \&quot;next\&quot;, \&quot;prev\&quot; and \&quot;last\&quot; pages of results (depending on the context). For example, if the result set contains 50 results and the parameter \&quot;limit\&quot; is set to 25, the Links header will contain an URL for the first 25 results and the next 25 results. &lt;br&gt; &lt;br&gt; Some libraries such as python&#39;s &#x60;requests&#x60; can parse the header automatically and offer a convenient way of iterating through the results. For example: &#x60;&#x60;&#x60;python def get_all_results(url):     while url:         r &#x3D; requests.get(url)         r.raise_for_status()         for item in r.json()[&#39;results&#39;]:           yield item         url &#x3D; r.links.get(&#39;next&#39;, {}).get(&#39;url&#39;) &#x60;&#x60;&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LexiStatsApi;
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
    String corpus = "nmc"; // For corpora other than 'nmc' (New Monitor Corpus) please contact api@oxforddictionaries.com
    String ngramSize = "2"; // the size of ngrams requested (1-4)
    String tokens = "a word"; // List of tokens to filter. The tokens are separated by spaces, the list items are separated by comma (e.g., for bigrams (n=2) tokens=this is,this was, this will)
    String contains = "contains_example"; // Find ngrams containing the given token(s). Use comma or space as token separators; the order of tokens is irrelevant.
    String punctuation = "punctuation_example"; // Flag specifying whether to lookup ngrams that include punctuation or not (possible values are \"true\" and \"false\"; default is \"false\")
    String format = "oup"; // Option specifying whether tokens should be returned as a single string (option \"google\") or as a list of strings (option \"oup\")
    Long minFrequency = 56L; // Restrict the query to entries with frequency of at least `minFrequency`
    Long maxFrequency = 56L; // Restrict the query to entries with frequency of at most `maxFrequency`
    Long minDocumentFrequency = 56L; // Restrict the query to entries that appear in at least `minDocumentFrequency` documents
    Long maxDocumentFrequency = 56L; // Restrict the query to entries that appera in at most `maxDocumentFrequency` documents
    String collate = "collate_example"; // collate the results by wordform, trueCase, lemma, lexicalCategory. Multiple values can be separated by commas (e.g., collate=trueCase,lemma,lexicalCategory).
    String sort = "sort_example"; // sort the resulting list by wordform, trueCase, lemma, lexicalCategory, frequency, normalizedFrequency. Descending order is achieved by prepending the value with the minus sign ('-'). Multiple values can be separated by commas (e.g., sort=lexicalCategory,-frequency)
    Long offset = 0L; // pagination - results offset
    Long limit = 100L; // pagination - results limit
    try {
      NgramsResult result = client
              .lexiStats
              .getNgramFrequencies(sourceLang, corpus, ngramSize)
              .tokens(tokens)
              .contains(contains)
              .punctuation(punctuation)
              .format(format)
              .minFrequency(minFrequency)
              .maxFrequency(maxFrequency)
              .minDocumentFrequency(minDocumentFrequency)
              .maxDocumentFrequency(maxDocumentFrequency)
              .collate(collate)
              .sort(sort)
              .offset(offset)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling LexiStatsApi#getNgramFrequencies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NgramsResult> response = client
              .lexiStats
              .getNgramFrequencies(sourceLang, corpus, ngramSize)
              .tokens(tokens)
              .contains(contains)
              .punctuation(punctuation)
              .format(format)
              .minFrequency(minFrequency)
              .maxFrequency(maxFrequency)
              .minDocumentFrequency(minDocumentFrequency)
              .maxDocumentFrequency(maxDocumentFrequency)
              .collate(collate)
              .sort(sort)
              .offset(offset)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LexiStatsApi#getNgramFrequencies");
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
| **sourceLang** | **String**| IANA language code | [default to en] |
| **corpus** | **String**| For corpora other than &#39;nmc&#39; (New Monitor Corpus) please contact api@oxforddictionaries.com | [default to nmc] |
| **ngramSize** | **String**| the size of ngrams requested (1-4) | [default to 2] |
| **tokens** | **String**| List of tokens to filter. The tokens are separated by spaces, the list items are separated by comma (e.g., for bigrams (n&#x3D;2) tokens&#x3D;this is,this was, this will) | [optional] [default to a word] |
| **contains** | **String**| Find ngrams containing the given token(s). Use comma or space as token separators; the order of tokens is irrelevant. | [optional] |
| **punctuation** | **String**| Flag specifying whether to lookup ngrams that include punctuation or not (possible values are \&quot;true\&quot; and \&quot;false\&quot;; default is \&quot;false\&quot;) | [optional] |
| **format** | **String**| Option specifying whether tokens should be returned as a single string (option \&quot;google\&quot;) or as a list of strings (option \&quot;oup\&quot;) | [optional] [default to oup] |
| **minFrequency** | **Long**| Restrict the query to entries with frequency of at least &#x60;minFrequency&#x60; | [optional] |
| **maxFrequency** | **Long**| Restrict the query to entries with frequency of at most &#x60;maxFrequency&#x60; | [optional] |
| **minDocumentFrequency** | **Long**| Restrict the query to entries that appear in at least &#x60;minDocumentFrequency&#x60; documents | [optional] |
| **maxDocumentFrequency** | **Long**| Restrict the query to entries that appera in at most &#x60;maxDocumentFrequency&#x60; documents | [optional] |
| **collate** | **String**| collate the results by wordform, trueCase, lemma, lexicalCategory. Multiple values can be separated by commas (e.g., collate&#x3D;trueCase,lemma,lexicalCategory). | [optional] |
| **sort** | **String**| sort the resulting list by wordform, trueCase, lemma, lexicalCategory, frequency, normalizedFrequency. Descending order is achieved by prepending the value with the minus sign (&#39;-&#39;). Multiple values can be separated by commas (e.g., sort&#x3D;lexicalCategory,-frequency) | [optional] |
| **offset** | **Long**| pagination - results offset | [optional] [default to 0] |
| **limit** | **Long**| pagination - results limit | [optional] [default to 100] |

### Return type

[**NgramsResult**](NgramsResult.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **400** | Invalid option name...  |  -  |
| **404** | language is not in...  |  -  |
| **500** | Internal Error. An error occurred while processing the data.  |  -  |

<a name="getWordFrequencies"></a>
# **getWordFrequencies**
> StatsWordResultList getWordFrequencies(sourceLang).corpus(corpus).wordform(wordform).trueCase(trueCase).lemma(lemma).lexicalCategory(lexicalCategory).grammaticalFeatures(grammaticalFeatures).sort(sort).collate(collate).minFrequency(minFrequency).maxFrequency(maxFrequency).minNormalizedFrequency(minNormalizedFrequency).maxNormalizedFrequency(maxNormalizedFrequency).offset(offset).limit(limit).execute();

Retrieve a list of frequencies of a word/words derived from a corpus.

This endpoint provides a list of frequencies for a given word or words. Unlike the /word/ endpoint, the results are split into the smallest units. &lt;br&gt; &lt;br&gt; To exclude a specific value, prepend it with the minus sign (&#39;-&#39;). For example, to get frequencies of the lemma &#39;happy&#39; but exclude superlative forms (i.e., happiest) you could use options &#39;lemma&#x3D;happy;grammaticalFeatures&#x3D;-degreeType:superlative&#39;. &lt;br&gt; &lt;br&gt; Parameters can be provided in PATH, GET or POST (form or json). The parameters in PATH are overridden by parameters in GET, POST and json (in that order). In PATH, individual options are separated by semicolon and values are separated by commas (where multiple values can be used). &lt;br&gt; &lt;br&gt; The parameters wordform/trueCase/lemma/lexicalCategory also exist in a plural form, taking a lists of items. Examples: * PATH: /wordforms&#x3D;happy,happier,happiest * GET: /?wordforms&#x3D;happy&amp;wordforms&#x3D;happier&amp;wordforms&#x3D;happiest * POST (json): &#x60;&#x60;&#x60;javascript   {     \&quot;wordforms\&quot;: [\&quot;happy\&quot;, \&quot;happier\&quot;, \&quot;happiest\&quot;]   } &#x60;&#x60;&#x60; A mor complex example of retrieving frequencies of multiple lemmas: &#x60;&#x60;&#x60;   {       \&quot;lemmas\&quot;: [\&quot;happy\&quot;, \&quot;content\&quot;, \&quot;cheerful\&quot;, \&quot;cheery\&quot;, \&quot;merry\&quot;, \&quot;joyful\&quot;, \&quot;ecstatic\&quot;],       \&quot;grammaticalFeatures\&quot;: {           \&quot;adjectiveFunctionType\&quot;: \&quot;predicative\&quot;       },       \&quot;lexicalCategory\&quot;: \&quot;adjective\&quot;,       \&quot;sort\&quot;: [\&quot;lemma\&quot;, \&quot;-frequency\&quot;]   } &#x60;&#x60;&#x60; Some queries with \&quot;collate\&quot; or \&quot;sort\&quot; can exceed the 30s timeout, in which case the API will return an error message with status code 503. You mitigate this by providing additional restrictions such as \&quot;minFrequency\&quot; and \&quot;maxFrequency\&quot;. &lt;br&gt; &lt;br&gt; You can use the parameters \&quot;offset\&quot; and \&quot;limit\&quot; to paginate through large result sets. For convenience, the HTTP header \&quot;Link\&quot; is set on the response to provide links to \&quot;first\&quot;, \&quot;self\&quot;, \&quot;next\&quot;, \&quot;prev\&quot; and \&quot;last\&quot; pages of results (depending on the context). For example, if the result set contains 50 results and the parameter \&quot;limit\&quot; is set to 25, the Links header will contain an URL for the first 25 results and the next 25 results. &lt;br&gt; &lt;br&gt; Some libraries such as python&#39;s &#x60;requests&#x60; can parse the header automatically and offer a convenient way of iterating through the results. For example: &#x60;&#x60;&#x60;python def get_all_results(url):     while url:         r &#x3D; requests.get(url)         r.raise_for_status()         for item in r.json()[&#39;results&#39;]:           yield item         url &#x3D; r.links.get(&#39;next&#39;, {}).get(&#39;url&#39;) &#x60;&#x60;&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LexiStatsApi;
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
    String corpus = "nmc"; // For corpora other than 'nmc' (New Monitor Corpus) please contact api@oxforddictionaries.com
    String wordform = "wordform_example"; // The written form of the word to look up (preserving case e.g., Book vs book)
    String trueCase = "trueCase_example"; // The written form of the word to look up with normalised case (Books --> books)
    String lemma = "test"; // The lemma of the word to look up (e.g., Book, booked, books all have the lemma \"book\")
    String lexicalCategory = "lexicalCategory_example"; // The lexical category of the word(s) to look up (e.g., adjective or noun)
    String grammaticalFeatures = "grammaticalFeatures_example"; // The grammatical features of the word(s) to look up entered as a list of k:v (e.g., degree_type:comparative)
    String sort = "sort_example"; // sort the resulting list by wordform, trueCase, lemma, lexicalCategory, frequency, normalizedFrequency. Descending order is achieved by prepending the value with the minus sign ('-'). Multiple values can be separated by commas (e.g., sort=lexicalCategory,-frequency)
    String collate = "collate_example"; // collate the results by wordform, trueCase, lemma, lexicalCategory. Multiple values can be separated by commas (e.g., collate=trueCase,lemma,lexicalCategory).
    Long minFrequency = 56L; // Restrict the query to entries with frequency of at least `minFrequency`
    Long maxFrequency = 56L; // Restrict the query to entries with frequency of at most `maxFrequency`
    Float minNormalizedFrequency = 3.4F; // Restrict the query to entries with frequency of at least `minNormalizedFrequency`
    Float maxNormalizedFrequency = 3.4F; // Restrict the query to entries with frequency of at most `maxNormalizedFrequency`
    Long offset = 0L; // pagination - results offset
    Long limit = 100L; // pagination - results limit
    try {
      StatsWordResultList result = client
              .lexiStats
              .getWordFrequencies(sourceLang)
              .corpus(corpus)
              .wordform(wordform)
              .trueCase(trueCase)
              .lemma(lemma)
              .lexicalCategory(lexicalCategory)
              .grammaticalFeatures(grammaticalFeatures)
              .sort(sort)
              .collate(collate)
              .minFrequency(minFrequency)
              .maxFrequency(maxFrequency)
              .minNormalizedFrequency(minNormalizedFrequency)
              .maxNormalizedFrequency(maxNormalizedFrequency)
              .offset(offset)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling LexiStatsApi#getWordFrequencies");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StatsWordResultList> response = client
              .lexiStats
              .getWordFrequencies(sourceLang)
              .corpus(corpus)
              .wordform(wordform)
              .trueCase(trueCase)
              .lemma(lemma)
              .lexicalCategory(lexicalCategory)
              .grammaticalFeatures(grammaticalFeatures)
              .sort(sort)
              .collate(collate)
              .minFrequency(minFrequency)
              .maxFrequency(maxFrequency)
              .minNormalizedFrequency(minNormalizedFrequency)
              .maxNormalizedFrequency(maxNormalizedFrequency)
              .offset(offset)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LexiStatsApi#getWordFrequencies");
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
| **sourceLang** | **String**| IANA language code | [default to en] |
| **corpus** | **String**| For corpora other than &#39;nmc&#39; (New Monitor Corpus) please contact api@oxforddictionaries.com | [optional] [default to nmc] |
| **wordform** | **String**| The written form of the word to look up (preserving case e.g., Book vs book) | [optional] |
| **trueCase** | **String**| The written form of the word to look up with normalised case (Books --&gt; books) | [optional] |
| **lemma** | **String**| The lemma of the word to look up (e.g., Book, booked, books all have the lemma \&quot;book\&quot;) | [optional] [default to test] |
| **lexicalCategory** | **String**| The lexical category of the word(s) to look up (e.g., adjective or noun) | [optional] |
| **grammaticalFeatures** | **String**| The grammatical features of the word(s) to look up entered as a list of k:v (e.g., degree_type:comparative) | [optional] |
| **sort** | **String**| sort the resulting list by wordform, trueCase, lemma, lexicalCategory, frequency, normalizedFrequency. Descending order is achieved by prepending the value with the minus sign (&#39;-&#39;). Multiple values can be separated by commas (e.g., sort&#x3D;lexicalCategory,-frequency) | [optional] |
| **collate** | **String**| collate the results by wordform, trueCase, lemma, lexicalCategory. Multiple values can be separated by commas (e.g., collate&#x3D;trueCase,lemma,lexicalCategory). | [optional] |
| **minFrequency** | **Long**| Restrict the query to entries with frequency of at least &#x60;minFrequency&#x60; | [optional] |
| **maxFrequency** | **Long**| Restrict the query to entries with frequency of at most &#x60;maxFrequency&#x60; | [optional] |
| **minNormalizedFrequency** | **Float**| Restrict the query to entries with frequency of at least &#x60;minNormalizedFrequency&#x60; | [optional] |
| **maxNormalizedFrequency** | **Float**| Restrict the query to entries with frequency of at most &#x60;maxNormalizedFrequency&#x60; | [optional] |
| **offset** | **Long**| pagination - results offset | [optional] [default to 0] |
| **limit** | **Long**| pagination - results limit | [optional] [default to 100] |

### Return type

[**StatsWordResultList**](StatsWordResultList.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **400** | Invalid option name...; Option ... must have a value.; The option &#39;minFrequency&#39; has to have an non-negative integer parameter.; The option &#39;maxFrequency&#39; has to have an non-negative integer parameter.; The option &#39;limit&#39; has to have an non-negative integer parameter.; The option &#39;offset&#39; has to have an non-negative integer parameter. |  -  |
| **404** | language is not in...  |  -  |
| **500** | Internal Error. An error occurred while processing the data.  |  -  |

<a name="getWordFrequency"></a>
# **getWordFrequency**
> StatsWordResult getWordFrequency(sourceLang).corpus(corpus).wordform(wordform).trueCase(trueCase).lemma(lemma).lexicalCategory(lexicalCategory).execute();

Retrieve the frequency of a word derived from a corpus.

This endpoint provides the frequency of a given word. When multiple database records match the query parameters, the returned frequency is the sum of the individual frequencies. For example, if the query parameters are lemma&#x3D;test, the returned frequency will include the verb \&quot;test\&quot;, the noun \&quot;test\&quot; and the adjective \&quot;test\&quot; in all forms (Test, tested, testing, etc.) &lt;br&gt; &lt;br&gt; If you are interested in the frequency of the word \&quot;test\&quot; but want to exclude other forms (e.g., tested) use the option trueCase&#x3D;test. Normally, the word \&quot;test\&quot; will be spelt with a capital letter at the beginning of a sentence. The option trueCase will ignore this and it will count \&quot;Test\&quot; and \&quot;test\&quot; as the same token. If you are interested in frequencies of \&quot;Test\&quot; and \&quot;test\&quot;, use the option wordform&#x3D;test or wordform&#x3D;Test. Note that trueCase is not just a lower case of the word as some words are genuinely spelt with a capital letter such as the word \&quot;press\&quot; in Oxford University Press. &lt;br&gt; &lt;br&gt; Parameters can be provided in PATH, GET or POST (form or json). The parameters in PATH are overriden by parameters in GET, POST and json (in that order). In PATH, individual options are separated by semicolon and values are separated by commas (where multiple values can be used). Examples: * PATH: /lemma&#x3D;test;lexicalCategory&#x3D;noun * GET: /?lemma&#x3D;test&amp;lexicalCategory&#x3D;noun * POST (json):    &#x60;&#x60;&#x60;javascript     {       \&quot;lemma\&quot;: \&quot;test\&quot;,       \&quot;lexicalCategory\&quot;: \&quot;noun\&quot;     }   &#x60;&#x60;&#x60;  &lt;br&gt; One of the options wordform/trueCase/lemma/lexicalCategory has to be provided. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.OxfordDictionaries;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LexiStatsApi;
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
    String corpus = "nmc"; // For corpora other than 'nmc' (New Monitor Corpus) please contact api@oxforddictionaries.com
    String wordform = "wordform_example"; // The written form of the word to look up (preserving case e.g., Books vs books)
    String trueCase = "trueCase_example"; // The written form of the word to look up with normalised case (Books --> books)
    String lemma = "test"; // The lemma of the word to look up (e.g., Book, booked, books all have the lemma \"book\")
    String lexicalCategory = "lexicalCategory_example"; // The lexical category of the word(s) to look up (e.g., noun or verb)
    try {
      StatsWordResult result = client
              .lexiStats
              .getWordFrequency(sourceLang)
              .corpus(corpus)
              .wordform(wordform)
              .trueCase(trueCase)
              .lemma(lemma)
              .lexicalCategory(lexicalCategory)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetadata());
      System.out.println(result.getResult());
    } catch (ApiException e) {
      System.err.println("Exception when calling LexiStatsApi#getWordFrequency");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StatsWordResult> response = client
              .lexiStats
              .getWordFrequency(sourceLang)
              .corpus(corpus)
              .wordform(wordform)
              .trueCase(trueCase)
              .lemma(lemma)
              .lexicalCategory(lexicalCategory)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LexiStatsApi#getWordFrequency");
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
| **sourceLang** | **String**| IANA language code | [default to en] |
| **corpus** | **String**| For corpora other than &#39;nmc&#39; (New Monitor Corpus) please contact api@oxforddictionaries.com | [optional] [default to nmc] |
| **wordform** | **String**| The written form of the word to look up (preserving case e.g., Books vs books) | [optional] |
| **trueCase** | **String**| The written form of the word to look up with normalised case (Books --&gt; books) | [optional] |
| **lemma** | **String**| The lemma of the word to look up (e.g., Book, booked, books all have the lemma \&quot;book\&quot;) | [optional] [default to test] |
| **lexicalCategory** | **String**| The lexical category of the word(s) to look up (e.g., noun or verb) | [optional] |

### Return type

[**StatsWordResult**](StatsWordResult.md)

### Authorization

[appId](../README.md#appId), [appKey](../README.md#appKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  -  |
| **400** | You need to specify at least one option. Try one of &#39;wordform, lemma, trueCase, lexicalCategory&#39;.  |  -  |
| **404** | language is not in...  |  -  |
| **500** | Internal Error. An error occurred while processing the data.  |  -  |

