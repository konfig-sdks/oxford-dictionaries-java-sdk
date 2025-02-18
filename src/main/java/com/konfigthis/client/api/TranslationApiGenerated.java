/*
 * Oxford Dictionaries
 * Oxford Dictionaries, part of the Oxford Language Division, is a leading authority on the English language. It offers a wide range of language resources, including dictionaries, thesauruses, grammar guides, and language learning tools. Oxford Dictionaries provides accurate and up-to-date definitions, word origins, and usage examples to support language comprehension and communication.
 *
 * The version of the OpenAPI document: 1.11.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.RetrieveEntry;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TranslationApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TranslationApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public TranslationApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getAppId() == null) {
            throw new IllegalArgumentException("\"app_id\" is required but no API key was provided. Please set \"app_id\" with ApiClient#setAppId(String).");
        }
        if (apiClient.getAppKey() == null) {
            throw new IllegalArgumentException("\"app_key\" is required but no API key was provided. Please set \"app_key\" with ApiClient#setAppKey(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getWordTranslationCall(String sourceTranslationLanguage, String wordId, String targetTranslationLanguage, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/entries/{source_translation_language}/{word_id}/translations={target_translation_language}"
            .replace("{" + "source_translation_language" + "}", localVarApiClient.escapeString(sourceTranslationLanguage.toString()))
            .replace("{" + "word_id" + "}", localVarApiClient.escapeString(wordId.toString()))
            .replace("{" + "target_translation_language" + "}", localVarApiClient.escapeString(targetTranslationLanguage.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "appId", "appKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getWordTranslationValidateBeforeCall(String sourceTranslationLanguage, String wordId, String targetTranslationLanguage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'sourceTranslationLanguage' is set
        if (sourceTranslationLanguage == null) {
            throw new ApiException("Missing the required parameter 'sourceTranslationLanguage' when calling getWordTranslation(Async)");
        }

        // verify the required parameter 'wordId' is set
        if (wordId == null) {
            throw new ApiException("Missing the required parameter 'wordId' when calling getWordTranslation(Async)");
        }

        // verify the required parameter 'targetTranslationLanguage' is set
        if (targetTranslationLanguage == null) {
            throw new ApiException("Missing the required parameter 'targetTranslationLanguage' when calling getWordTranslation(Async)");
        }

        return getWordTranslationCall(sourceTranslationLanguage, wordId, targetTranslationLanguage, _callback);

    }


    private ApiResponse<RetrieveEntry> getWordTranslationWithHttpInfo(String sourceTranslationLanguage, String wordId, String targetTranslationLanguage) throws ApiException {
        okhttp3.Call localVarCall = getWordTranslationValidateBeforeCall(sourceTranslationLanguage, wordId, targetTranslationLanguage, null);
        Type localVarReturnType = new TypeToken<RetrieveEntry>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getWordTranslationAsync(String sourceTranslationLanguage, String wordId, String targetTranslationLanguage, final ApiCallback<RetrieveEntry> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWordTranslationValidateBeforeCall(sourceTranslationLanguage, wordId, targetTranslationLanguage, _callback);
        Type localVarReturnType = new TypeToken<RetrieveEntry>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetWordTranslationRequestBuilder {
        private final String sourceTranslationLanguage;
        private final String wordId;
        private final String targetTranslationLanguage;

        private GetWordTranslationRequestBuilder(String sourceTranslationLanguage, String wordId, String targetTranslationLanguage) {
            this.sourceTranslationLanguage = sourceTranslationLanguage;
            this.wordId = wordId;
            this.targetTranslationLanguage = targetTranslationLanguage;
        }

        /**
         * Build call for getWordTranslation
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. In case word doesn&#39;t have a direct translation a response would be definitions. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> any of target languages is unknown </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> no entry is found matching supplied source_lang and id and/or that entry has no senses with translations in the target language(s).   </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Error. An error occurred while processing the data.  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getWordTranslationCall(sourceTranslationLanguage, wordId, targetTranslationLanguage, _callback);
        }


        /**
         * Execute getWordTranslation request
         * @return RetrieveEntry
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. In case word doesn&#39;t have a direct translation a response would be definitions. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> any of target languages is unknown </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> no entry is found matching supplied source_lang and id and/or that entry has no senses with translations in the target language(s).   </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Error. An error occurred while processing the data.  </td><td>  -  </td></tr>
         </table>
         */
        public RetrieveEntry execute() throws ApiException {
            ApiResponse<RetrieveEntry> localVarResp = getWordTranslationWithHttpInfo(sourceTranslationLanguage, wordId, targetTranslationLanguage);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getWordTranslation request with HTTP info returned
         * @return ApiResponse&lt;RetrieveEntry&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. In case word doesn&#39;t have a direct translation a response would be definitions. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> any of target languages is unknown </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> no entry is found matching supplied source_lang and id and/or that entry has no senses with translations in the target language(s).   </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Error. An error occurred while processing the data.  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<RetrieveEntry> executeWithHttpInfo() throws ApiException {
            return getWordTranslationWithHttpInfo(sourceTranslationLanguage, wordId, targetTranslationLanguage);
        }

        /**
         * Execute getWordTranslation request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. In case word doesn&#39;t have a direct translation a response would be definitions. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> any of target languages is unknown </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> no entry is found matching supplied source_lang and id and/or that entry has no senses with translations in the target language(s).   </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Error. An error occurred while processing the data.  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<RetrieveEntry> _callback) throws ApiException {
            return getWordTranslationAsync(sourceTranslationLanguage, wordId, targetTranslationLanguage, _callback);
        }
    }

    /**
     * Retrieve translation for a given word
     *  Use this to return translations for a given word. In the event that a word in the dataset does not have a direct translation, the response will be a [definition](documentation/glossary?term&#x3D;entry) in the target language.    &lt;div id&#x3D;\&quot;translation\&quot;&gt;&lt;/div&gt; 
     * @param sourceTranslationLanguage IANA language code (required)
     * @param wordId The source word (required)
     * @param targetTranslationLanguage IANA language code (required)
     * @return GetWordTranslationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response. In case word doesn&#39;t have a direct translation a response would be definitions. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> any of target languages is unknown </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> no entry is found matching supplied source_lang and id and/or that entry has no senses with translations in the target language(s).   </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error. An error occurred while processing the data.  </td><td>  -  </td></tr>
     </table>
     */
    public GetWordTranslationRequestBuilder getWordTranslation(String sourceTranslationLanguage, String wordId, String targetTranslationLanguage) throws IllegalArgumentException {
        if (sourceTranslationLanguage == null) throw new IllegalArgumentException("\"sourceTranslationLanguage\" is required but got null");
            

        if (wordId == null) throw new IllegalArgumentException("\"wordId\" is required but got null");
            

        if (targetTranslationLanguage == null) throw new IllegalArgumentException("\"targetTranslationLanguage\" is required but got null");
            

        return new GetWordTranslationRequestBuilder(sourceTranslationLanguage, wordId, targetTranslationLanguage);
    }
}
