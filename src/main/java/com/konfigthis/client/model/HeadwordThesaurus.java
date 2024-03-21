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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.ThesaurusLexicalEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * description of thesaurus information of a word
 */
@ApiModel(description = "description of thesaurus information of a word")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class HeadwordThesaurus {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_LEXICAL_ENTRIES = "lexicalEntries";
  @SerializedName(SERIALIZED_NAME_LEXICAL_ENTRIES)
  private List<ThesaurusLexicalEntry> lexicalEntries = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_WORD = "word";
  @SerializedName(SERIALIZED_NAME_WORD)
  private String word;

  public HeadwordThesaurus() {
  }

  public HeadwordThesaurus id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The identifier of a word
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier of a word")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public HeadwordThesaurus language(String language) {
    
    
    
    
    this.language = language;
    return this;
  }

   /**
   * IANA language code
   * @return language
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "IANA language code")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    
    
    
    this.language = language;
  }


  public HeadwordThesaurus lexicalEntries(List<ThesaurusLexicalEntry> lexicalEntries) {
    
    
    
    
    this.lexicalEntries = lexicalEntries;
    return this;
  }

  public HeadwordThesaurus addLexicalEntriesItem(ThesaurusLexicalEntry lexicalEntriesItem) {
    this.lexicalEntries.add(lexicalEntriesItem);
    return this;
  }

   /**
   * A grouping of various senses in a specific language, and a lexical category that relates to a word
   * @return lexicalEntries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A grouping of various senses in a specific language, and a lexical category that relates to a word")

  public List<ThesaurusLexicalEntry> getLexicalEntries() {
    return lexicalEntries;
  }


  public void setLexicalEntries(List<ThesaurusLexicalEntry> lexicalEntries) {
    
    
    
    this.lexicalEntries = lexicalEntries;
  }


  public HeadwordThesaurus type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The json object type. Could be &#39;headword&#39;, &#39;inflection&#39; or &#39;phrase&#39;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The json object type. Could be 'headword', 'inflection' or 'phrase'")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public HeadwordThesaurus word(String word) {
    
    
    
    
    this.word = word;
    return this;
  }

   /**
   * A given written or spoken realisation of a an entry, lowercased.
   * @return word
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A given written or spoken realisation of a an entry, lowercased.")

  public String getWord() {
    return word;
  }


  public void setWord(String word) {
    
    
    
    this.word = word;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the HeadwordThesaurus instance itself
   */
  public HeadwordThesaurus putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeadwordThesaurus headwordThesaurus = (HeadwordThesaurus) o;
    return Objects.equals(this.id, headwordThesaurus.id) &&
        Objects.equals(this.language, headwordThesaurus.language) &&
        Objects.equals(this.lexicalEntries, headwordThesaurus.lexicalEntries) &&
        Objects.equals(this.type, headwordThesaurus.type) &&
        Objects.equals(this.word, headwordThesaurus.word)&&
        Objects.equals(this.additionalProperties, headwordThesaurus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, language, lexicalEntries, type, word, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeadwordThesaurus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lexicalEntries: ").append(toIndentedString(lexicalEntries)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("language");
    openapiFields.add("lexicalEntries");
    openapiFields.add("type");
    openapiFields.add("word");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("language");
    openapiRequiredFields.add("lexicalEntries");
    openapiRequiredFields.add("word");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HeadwordThesaurus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HeadwordThesaurus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HeadwordThesaurus is not found in the empty JSON string", HeadwordThesaurus.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HeadwordThesaurus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("lexicalEntries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `lexicalEntries` to be an array in the JSON string but got `%s`", jsonObj.get("lexicalEntries").toString()));
      }

      JsonArray jsonArraylexicalEntries = jsonObj.getAsJsonArray("lexicalEntries");
      // validate the required field `lexicalEntries` (array)
      for (int i = 0; i < jsonArraylexicalEntries.size(); i++) {
        ThesaurusLexicalEntry.validateJsonObject(jsonArraylexicalEntries.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("word").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `word` to be a primitive type in the JSON string but got `%s`", jsonObj.get("word").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HeadwordThesaurus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HeadwordThesaurus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HeadwordThesaurus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HeadwordThesaurus.class));

       return (TypeAdapter<T>) new TypeAdapter<HeadwordThesaurus>() {
           @Override
           public void write(JsonWriter out, HeadwordThesaurus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public HeadwordThesaurus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             HeadwordThesaurus instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HeadwordThesaurus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HeadwordThesaurus
  * @throws IOException if the JSON string is invalid with respect to HeadwordThesaurus
  */
  public static HeadwordThesaurus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HeadwordThesaurus.class);
  }

 /**
  * Convert an instance of HeadwordThesaurus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

