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


import com.konfigthis.client.model.Lemmatron;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class LemmatronApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LemmatronApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public LemmatronApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call checkAndRetrieveRootFormCall(String sourceLang, List<String> filters, String wordId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/inflections/{source_lang}/{word_id}/{filters}"
            .replace("{" + "source_lang" + "}", localVarApiClient.escapeString(sourceLang.toString()))
            .replace("{" + "filters" + "}", localVarApiClient.escapeString(localVarApiClient.collectionPathParameterToString("csv", filters)))
            .replace("{" + "word_id" + "}", localVarApiClient.escapeString(wordId.toString()));

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
    private okhttp3.Call checkAndRetrieveRootFormValidateBeforeCall(String sourceLang, List<String> filters, String wordId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'sourceLang' is set
        if (sourceLang == null) {
            throw new ApiException("Missing the required parameter 'sourceLang' when calling checkAndRetrieveRootForm(Async)");
        }

        // verify the required parameter 'filters' is set
        if (filters == null) {
            throw new ApiException("Missing the required parameter 'filters' when calling checkAndRetrieveRootForm(Async)");
        }

        // verify the required parameter 'wordId' is set
        if (wordId == null) {
            throw new ApiException("Missing the required parameter 'wordId' when calling checkAndRetrieveRootForm(Async)");
        }

        return checkAndRetrieveRootFormCall(sourceLang, filters, wordId, _callback);

    }


    private ApiResponse<Lemmatron> checkAndRetrieveRootFormWithHttpInfo(String sourceLang, List<String> filters, String wordId) throws ApiException {
        okhttp3.Call localVarCall = checkAndRetrieveRootFormValidateBeforeCall(sourceLang, filters, wordId, null);
        Type localVarReturnType = new TypeToken<Lemmatron>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call checkAndRetrieveRootFormAsync(String sourceLang, List<String> filters, String wordId, final ApiCallback<Lemmatron> _callback) throws ApiException {

        okhttp3.Call localVarCall = checkAndRetrieveRootFormValidateBeforeCall(sourceLang, filters, wordId, _callback);
        Type localVarReturnType = new TypeToken<Lemmatron>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CheckAndRetrieveRootFormRequestBuilder {
        private final String sourceLang;
        private final List<String> filters;
        private final String wordId;

        private CheckAndRetrieveRootFormRequestBuilder(String sourceLang, List<String> filters, String wordId) {
            this.sourceLang = sourceLang;
            this.filters = filters;
            this.wordId = wordId;
        }

        /**
         * Build call for checkAndRetrieveRootForm
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Error. An error occurred while processing the data.  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return checkAndRetrieveRootFormCall(sourceLang, filters, wordId, _callback);
        }


        /**
         * Execute checkAndRetrieveRootForm request
         * @return Lemmatron
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Error. An error occurred while processing the data.  </td><td>  -  </td></tr>
         </table>
         */
        public Lemmatron execute() throws ApiException {
            ApiResponse<Lemmatron> localVarResp = checkAndRetrieveRootFormWithHttpInfo(sourceLang, filters, wordId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute checkAndRetrieveRootForm request with HTTP info returned
         * @return ApiResponse&lt;Lemmatron&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Error. An error occurred while processing the data.  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Lemmatron> executeWithHttpInfo() throws ApiException {
            return checkAndRetrieveRootFormWithHttpInfo(sourceLang, filters, wordId);
        }

        /**
         * Execute checkAndRetrieveRootForm request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Error. An error occurred while processing the data.  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Lemmatron> _callback) throws ApiException {
            return checkAndRetrieveRootFormAsync(sourceLang, filters, wordId, _callback);
        }
    }

    /**
     * Check a word exists in the dictionary and retrieve its root form
     *  Use this to check if a word exists in the dictionary, or what &#39;root&#39; form it links to (e.g., swimming &gt; swim). The response tells you the possible [lemmas](documentation/glossary?term&#x3D;lemma) for a given [inflected](documentation/glossary?term&#x3D;inflection) word. This can then be combined with other endpoints to retrieve more information.    &lt;div id&#x3D;\&quot;lemmatron\&quot;&gt;&lt;/div&gt; 
     * @param sourceLang IANA language code (required)
     * @param filters Separate filtering conditions using a semicolon. Conditions take values grammaticalFeatures and/or lexicalCategory and are case-sensitive. To list multiple values in single condition divide them with comma. (required)
     * @param wordId The input word (required)
     * @return CheckAndRetrieveRootFormRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Error. An error occurred while processing the data.  </td><td>  -  </td></tr>
     </table>
     */
    public CheckAndRetrieveRootFormRequestBuilder checkAndRetrieveRootForm(String sourceLang, List<String> filters, String wordId) throws IllegalArgumentException {
        if (sourceLang == null) throw new IllegalArgumentException("\"sourceLang\" is required but got null");
            

        if (filters == null) throw new IllegalArgumentException("\"filters\" is required but got null");
        if (wordId == null) throw new IllegalArgumentException("\"wordId\" is required but got null");
            

        return new CheckAndRetrieveRootFormRequestBuilder(sourceLang, filters, wordId);
    }
}
