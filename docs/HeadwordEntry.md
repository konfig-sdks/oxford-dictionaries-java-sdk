

# HeadwordEntry

Description of a word

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier of a word |  |
|**language** | **String** | IANA language code |  |
|**lexicalEntries** | [**List&lt;LexicalEntry&gt;**](LexicalEntry.md) | A grouping of various senses in a specific language, and a lexical category that relates to a word |  |
|**pronunciations** | [**List&lt;PronunciationsListInner&gt;**](PronunciationsListInner.md) | A list of possible pronunciations of a word |  [optional] |
|**type** | **String** | The json object type. Could be &#39;headword&#39;, &#39;inflection&#39; or &#39;phrase&#39; |  [optional] |
|**word** | **String** | A given written or spoken realisation of a an entry, lowercased. |  |



