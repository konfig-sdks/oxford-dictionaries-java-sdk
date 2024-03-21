<div align="left">

[![Visit Oxford dictionaries](./header.png)](https://developer.oxforddictionaries.com)

# [Oxford dictionaries](https://developer.oxforddictionaries.com)

Oxford Dictionaries, part of the Oxford Language Division, is a leading authority on the English language. It offers a wide range of language resources, including dictionaries, thesauruses, grammar guides, and language learning tools. Oxford Dictionaries provides accurate and up-to-date definitions, word origins, and usage examples to support language comprehension and communication.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Oxford%20Dictionaries&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>oxford-dictionaries-java-sdk</artifactId>
  <version>1.11.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:oxford-dictionaries-java-sdk:1.11.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/oxford-dictionaries-java-sdk-1.11.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://od-api-demo.oxforddictionaries.com:443/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DictionaryEntriesApi* | [**applyFilters**](docs/DictionaryEntriesApi.md#applyFilters) | **GET** /entries/{source_lang}/{word_id}/{filters} | Apply filters to response
*DictionaryEntriesApi* | [**getInformation**](docs/DictionaryEntriesApi.md#getInformation) | **GET** /entries/{source_lang}/{word_id} | Retrieve dictionary information for a given word
*DictionaryEntriesApi* | [**specifyDictionaryRegion**](docs/DictionaryEntriesApi.md#specifyDictionaryRegion) | **GET** /entries/{source_lang}/{word_id}/regions&#x3D;{region} | Specify GB or US dictionary for English entry search
*LemmatronApi* | [**checkAndRetrieveRootForm**](docs/LemmatronApi.md#checkAndRetrieveRootForm) | **GET** /inflections/{source_lang}/{word_id}/{filters} | Check a word exists in the dictionary and retrieve its root form
*LexiStatsApi* | [**getNgramFrequencies**](docs/LexiStatsApi.md#getNgramFrequencies) | **GET** /stats/frequency/ngrams/{source_lang}/{corpus}/{ngram-size} | Retrieve the frequency of ngrams (1-4) derived from a corpus
*LexiStatsApi* | [**getWordFrequencies**](docs/LexiStatsApi.md#getWordFrequencies) | **GET** /stats/frequency/words/{source_lang} | Retrieve a list of frequencies of a word/words derived from a corpus.
*LexiStatsApi* | [**getWordFrequency**](docs/LexiStatsApi.md#getWordFrequency) | **GET** /stats/frequency/word/{source_lang} | Retrieve the frequency of a word derived from a corpus.
*SearchApi* | [**getMatches**](docs/SearchApi.md#getMatches) | **GET** /search/{source_lang} | Retrieve possible matches to input
*SearchApi* | [**possibleTranslations**](docs/SearchApi.md#possibleTranslations) | **GET** /search/{source_search_language}/translations&#x3D;{target_search_language} | Retrieve possible translation matches to input
*TheSentenceDictionaryApi* | [**getCorpusSentences**](docs/TheSentenceDictionaryApi.md#getCorpusSentences) | **GET** /entries/{source_language}/{word_id}/sentences | Retrieve corpus sentences for a given word
*ThesaurusApi* | [**getAntonyms**](docs/ThesaurusApi.md#getAntonyms) | **GET** /entries/{source_lang}/{word_id}/antonyms | Retrieve words that mean the opposite
*ThesaurusApi* | [**getSimilarWords**](docs/ThesaurusApi.md#getSimilarWords) | **GET** /entries/{source_lang}/{word_id}/synonyms | Retrieve words that are similar
*ThesaurusApi* | [**getSynonymsAntonyms**](docs/ThesaurusApi.md#getSynonymsAntonyms) | **GET** /entries/{source_lang}/{word_id}/synonyms;antonyms | Retrieve synonyms and antonyms for a given word
*TranslationApi* | [**getWordTranslation**](docs/TranslationApi.md#getWordTranslation) | **GET** /entries/{source_translation_language}/{word_id}/translations&#x3D;{target_translation_language} | Retrieve translation for a given word
*UtilityApi* | [**getGrammaticalFeatures**](docs/UtilityApi.md#getGrammaticalFeatures) | **GET** /grammaticalFeatures/{source_language} | Lists available grammatical features in a dataset
*UtilityApi* | [**getLexicalCategories**](docs/UtilityApi.md#getLexicalCategories) | **GET** /lexicalcategories/{language} | Lists available lexical categories in a dataset
*UtilityApi* | [**listAvailableDomains**](docs/UtilityApi.md#listAvailableDomains) | **GET** /domains/{source_domains_language}/{target_domains_language} | Lists available domains in a bilingual dataset
*UtilityApi* | [**listAvailableFilters**](docs/UtilityApi.md#listAvailableFilters) | **GET** /filters | Lists available filters
*UtilityApi* | [**listAvailableLanguages**](docs/UtilityApi.md#listAvailableLanguages) | **GET** /languages | Lists available dictionaries
*UtilityApi* | [**listBilingualRegisters**](docs/UtilityApi.md#listBilingualRegisters) | **GET** /registers/{source_register_language}/{target_register_language} | Lists available registers in a bilingual dataset
*UtilityApi* | [**listEndpointFilters**](docs/UtilityApi.md#listEndpointFilters) | **GET** /filters/{endpoint} | Lists available filters for specific endpoint
*UtilityApi* | [**listMonolingualDomains**](docs/UtilityApi.md#listMonolingualDomains) | **GET** /domains/{source_language} | Lists available domains in a monolingual dataset
*UtilityApi* | [**listMonolingualRegions**](docs/UtilityApi.md#listMonolingualRegions) | **GET** /regions/{source_language} | Lists available regions in a monolingual dataset
*UtilityApi* | [**listMonolingualRegisters**](docs/UtilityApi.md#listMonolingualRegisters) | **GET** /registers/{source_language} | Lists available registers in a  monolingual dataset
*WordlistApi* | [**getAdvancedWords**](docs/WordlistApi.md#getAdvancedWords) | **GET** /wordlist/{source_lang}/{filters_advanced} | Retrieve list of words for category with advanced options
*WordlistApi* | [**getCategoryWords**](docs/WordlistApi.md#getCategoryWords) | **GET** /wordlist/{source_lang}/{filters_basic} | Retrieve a list of words in a category


## Documentation for Models

 - [ArrayOfRelatedEntriesInner](docs/ArrayOfRelatedEntriesInner.md)
 - [CategorizedTextListInner](docs/CategorizedTextListInner.md)
 - [CrossReferencesListInner](docs/CrossReferencesListInner.md)
 - [Entry](docs/Entry.md)
 - [ExamplesListInner](docs/ExamplesListInner.md)
 - [Filters](docs/Filters.md)
 - [FiltersResults](docs/FiltersResults.md)
 - [GrammaticalFeaturesListInner](docs/GrammaticalFeaturesListInner.md)
 - [HeadwordEntry](docs/HeadwordEntry.md)
 - [HeadwordLemmatron](docs/HeadwordLemmatron.md)
 - [HeadwordThesaurus](docs/HeadwordThesaurus.md)
 - [InflectionsListInner](docs/InflectionsListInner.md)
 - [Languages](docs/Languages.md)
 - [LanguagesResultsInner](docs/LanguagesResultsInner.md)
 - [LanguagesResultsInnerSourceLanguage](docs/LanguagesResultsInnerSourceLanguage.md)
 - [LanguagesResultsInnerTargetLanguage](docs/LanguagesResultsInnerTargetLanguage.md)
 - [Lemmatron](docs/Lemmatron.md)
 - [LemmatronLexicalEntry](docs/LemmatronLexicalEntry.md)
 - [LexicalEntry](docs/LexicalEntry.md)
 - [NgramsResult](docs/NgramsResult.md)
 - [NgramsResultResultsInner](docs/NgramsResultResultsInner.md)
 - [PronunciationsListInner](docs/PronunciationsListInner.md)
 - [Regions](docs/Regions.md)
 - [RetrieveEntry](docs/RetrieveEntry.md)
 - [Sense](docs/Sense.md)
 - [SentencesEntry](docs/SentencesEntry.md)
 - [SentencesLexicalEntry](docs/SentencesLexicalEntry.md)
 - [SentencesResults](docs/SentencesResults.md)
 - [StatsWordResult](docs/StatsWordResult.md)
 - [StatsWordResultList](docs/StatsWordResultList.md)
 - [StatsWordResultListResultsInner](docs/StatsWordResultListResultsInner.md)
 - [StatsWordResultResult](docs/StatsWordResultResult.md)
 - [SynonymsAntonymsInner](docs/SynonymsAntonymsInner.md)
 - [Thesaurus](docs/Thesaurus.md)
 - [ThesaurusEntry](docs/ThesaurusEntry.md)
 - [ThesaurusLexicalEntry](docs/ThesaurusLexicalEntry.md)
 - [ThesaurusLink](docs/ThesaurusLink.md)
 - [ThesaurusSense](docs/ThesaurusSense.md)
 - [TranslationsListInner](docs/TranslationsListInner.md)
 - [UtilityLabels](docs/UtilityLabels.md)
 - [UtilityLabelsResultsValue](docs/UtilityLabelsResultsValue.md)
 - [VariantFormsListInner](docs/VariantFormsListInner.md)
 - [Wordlist](docs/Wordlist.md)
 - [WordlistResultsInner](docs/WordlistResultsInner.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
