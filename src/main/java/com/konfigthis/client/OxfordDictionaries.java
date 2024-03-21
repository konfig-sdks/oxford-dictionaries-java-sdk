package com.konfigthis.client;

import com.konfigthis.client.api.DictionaryEntriesApi;
import com.konfigthis.client.api.LemmatronApi;
import com.konfigthis.client.api.LexiStatsApi;
import com.konfigthis.client.api.SearchApi;
import com.konfigthis.client.api.TheSentenceDictionaryApi;
import com.konfigthis.client.api.ThesaurusApi;
import com.konfigthis.client.api.TranslationApi;
import com.konfigthis.client.api.UtilityApi;
import com.konfigthis.client.api.WordlistApi;

public class OxfordDictionaries {
    private ApiClient apiClient;
    public final DictionaryEntriesApi dictionaryEntries;
    public final LemmatronApi lemmatron;
    public final LexiStatsApi lexiStats;
    public final SearchApi search;
    public final TheSentenceDictionaryApi theSentenceDictionary;
    public final ThesaurusApi thesaurus;
    public final TranslationApi translation;
    public final UtilityApi utility;
    public final WordlistApi wordlist;

    public OxfordDictionaries() {
        this(null);
    }

    public OxfordDictionaries(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.dictionaryEntries = new DictionaryEntriesApi(this.apiClient);
        this.lemmatron = new LemmatronApi(this.apiClient);
        this.lexiStats = new LexiStatsApi(this.apiClient);
        this.search = new SearchApi(this.apiClient);
        this.theSentenceDictionary = new TheSentenceDictionaryApi(this.apiClient);
        this.thesaurus = new ThesaurusApi(this.apiClient);
        this.translation = new TranslationApi(this.apiClient);
        this.utility = new UtilityApi(this.apiClient);
        this.wordlist = new WordlistApi(this.apiClient);
    }

}
