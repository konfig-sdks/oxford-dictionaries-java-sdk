

# Sense

A lexical sense represents the lexical meaning of a lexical entry when interpreted as referring to the corresponding ontology element

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**crossReferenceMarkers** | **List&lt;String&gt;** |  |  [optional] |
|**crossReferences** | [**List&lt;CrossReferencesListInner&gt;**](CrossReferencesListInner.md) | A reference to another word that is closely related, might provide additional information about the subject, has a variant spelling or is an abbreviated form of it. |  [optional] |
|**definitions** | **List&lt;String&gt;** |  |  [optional] |
|**domains** | **List&lt;String&gt;** |  |  [optional] |
|**examples** | [**List&lt;ExamplesListInner&gt;**](ExamplesListInner.md) | A list of written or spoken rendering of examples of use of a word or text |  [optional] |
|**id** | **String** | The id of the sense that is required for the delete procedure |  [optional] |
|**notes** | [**List&lt;CategorizedTextListInner&gt;**](CategorizedTextListInner.md) | various types of notes that appear |  [optional] |
|**pronunciations** | [**List&lt;PronunciationsListInner&gt;**](PronunciationsListInner.md) | A list of possible pronunciations of a word |  [optional] |
|**regions** | **List&lt;String&gt;** |  |  [optional] |
|**registers** | **List&lt;String&gt;** |  |  [optional] |
|**shortDefinitions** | **List&lt;String&gt;** |  |  [optional] |
|**subsenses** | [**List&lt;Sense&gt;**](Sense.md) | Ordered list of subsenses of a sense |  [optional] |
|**thesaurusLinks** | [**List&lt;ThesaurusLink&gt;**](ThesaurusLink.md) | Ordered list of links to the Thesaurus Dictionary |  [optional] |
|**translations** | [**List&lt;TranslationsListInner&gt;**](TranslationsListInner.md) | A list of written or spoken rendering of the meaning of a word or text in another language(s) |  [optional] |
|**variantForms** | [**List&lt;VariantFormsListInner&gt;**](VariantFormsListInner.md) | Various words that are used interchangeably depending on the context, e.g &#39;aluminium&#39; and &#39;aluminum&#39; |  [optional] |



