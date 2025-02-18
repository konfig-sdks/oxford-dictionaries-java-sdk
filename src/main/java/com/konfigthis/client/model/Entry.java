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
import com.konfigthis.client.model.CategorizedTextListInner;
import com.konfigthis.client.model.GrammaticalFeaturesListInner;
import com.konfigthis.client.model.PronunciationsListInner;
import com.konfigthis.client.model.Sense;
import com.konfigthis.client.model.VariantFormsListInner;
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
 * Entry
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Entry {
  public static final String SERIALIZED_NAME_ETYMOLOGIES = "etymologies";
  @SerializedName(SERIALIZED_NAME_ETYMOLOGIES)
  private List<String> etymologies = null;

  public static final String SERIALIZED_NAME_GRAMMATICAL_FEATURES = "grammaticalFeatures";
  @SerializedName(SERIALIZED_NAME_GRAMMATICAL_FEATURES)
  private List<GrammaticalFeaturesListInner> grammaticalFeatures = null;

  public static final String SERIALIZED_NAME_HOMOGRAPH_NUMBER = "homographNumber";
  @SerializedName(SERIALIZED_NAME_HOMOGRAPH_NUMBER)
  private String homographNumber;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<CategorizedTextListInner> notes = null;

  public static final String SERIALIZED_NAME_PRONUNCIATIONS = "pronunciations";
  @SerializedName(SERIALIZED_NAME_PRONUNCIATIONS)
  private List<PronunciationsListInner> pronunciations = null;

  public static final String SERIALIZED_NAME_SENSES = "senses";
  @SerializedName(SERIALIZED_NAME_SENSES)
  private List<Sense> senses = null;

  public static final String SERIALIZED_NAME_VARIANT_FORMS = "variantForms";
  @SerializedName(SERIALIZED_NAME_VARIANT_FORMS)
  private List<VariantFormsListInner> variantForms = null;

  public Entry() {
  }

  public Entry etymologies(List<String> etymologies) {
    
    
    
    
    this.etymologies = etymologies;
    return this;
  }

  public Entry addEtymologiesItem(String etymologiesItem) {
    if (this.etymologies == null) {
      this.etymologies = new ArrayList<>();
    }
    this.etymologies.add(etymologiesItem);
    return this;
  }

   /**
   * Get etymologies
   * @return etymologies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEtymologies() {
    return etymologies;
  }


  public void setEtymologies(List<String> etymologies) {
    
    
    
    this.etymologies = etymologies;
  }


  public Entry grammaticalFeatures(List<GrammaticalFeaturesListInner> grammaticalFeatures) {
    
    
    
    
    this.grammaticalFeatures = grammaticalFeatures;
    return this;
  }

  public Entry addGrammaticalFeaturesItem(GrammaticalFeaturesListInner grammaticalFeaturesItem) {
    if (this.grammaticalFeatures == null) {
      this.grammaticalFeatures = new ArrayList<>();
    }
    this.grammaticalFeatures.add(grammaticalFeaturesItem);
    return this;
  }

   /**
   * The different forms are correlated with meanings or functions which we text as &#39;features&#39;
   * @return grammaticalFeatures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The different forms are correlated with meanings or functions which we text as 'features'")

  public List<GrammaticalFeaturesListInner> getGrammaticalFeatures() {
    return grammaticalFeatures;
  }


  public void setGrammaticalFeatures(List<GrammaticalFeaturesListInner> grammaticalFeatures) {
    
    
    
    this.grammaticalFeatures = grammaticalFeatures;
  }


  public Entry homographNumber(String homographNumber) {
    
    
    
    
    this.homographNumber = homographNumber;
    return this;
  }

   /**
   * Identifies the homograph grouping. The last two digits identify different entries of the same homograph. The first one/two digits identify the homograph number.
   * @return homographNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the homograph grouping. The last two digits identify different entries of the same homograph. The first one/two digits identify the homograph number.")

  public String getHomographNumber() {
    return homographNumber;
  }


  public void setHomographNumber(String homographNumber) {
    
    
    
    this.homographNumber = homographNumber;
  }


  public Entry notes(List<CategorizedTextListInner> notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

  public Entry addNotesItem(CategorizedTextListInner notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * various types of notes that appear
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "various types of notes that appear")

  public List<CategorizedTextListInner> getNotes() {
    return notes;
  }


  public void setNotes(List<CategorizedTextListInner> notes) {
    
    
    
    this.notes = notes;
  }


  public Entry pronunciations(List<PronunciationsListInner> pronunciations) {
    
    
    
    
    this.pronunciations = pronunciations;
    return this;
  }

  public Entry addPronunciationsItem(PronunciationsListInner pronunciationsItem) {
    if (this.pronunciations == null) {
      this.pronunciations = new ArrayList<>();
    }
    this.pronunciations.add(pronunciationsItem);
    return this;
  }

   /**
   * A list of possible pronunciations of a word
   * @return pronunciations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of possible pronunciations of a word")

  public List<PronunciationsListInner> getPronunciations() {
    return pronunciations;
  }


  public void setPronunciations(List<PronunciationsListInner> pronunciations) {
    
    
    
    this.pronunciations = pronunciations;
  }


  public Entry senses(List<Sense> senses) {
    
    
    
    
    this.senses = senses;
    return this;
  }

  public Entry addSensesItem(Sense sensesItem) {
    if (this.senses == null) {
      this.senses = new ArrayList<>();
    }
    this.senses.add(sensesItem);
    return this;
  }

   /**
   * Complete list of senses
   * @return senses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Complete list of senses")

  public List<Sense> getSenses() {
    return senses;
  }


  public void setSenses(List<Sense> senses) {
    
    
    
    this.senses = senses;
  }


  public Entry variantForms(List<VariantFormsListInner> variantForms) {
    
    
    
    
    this.variantForms = variantForms;
    return this;
  }

  public Entry addVariantFormsItem(VariantFormsListInner variantFormsItem) {
    if (this.variantForms == null) {
      this.variantForms = new ArrayList<>();
    }
    this.variantForms.add(variantFormsItem);
    return this;
  }

   /**
   * Various words that are used interchangeably depending on the context, e.g &#39;aluminium&#39; and &#39;aluminum&#39;
   * @return variantForms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Various words that are used interchangeably depending on the context, e.g 'aluminium' and 'aluminum'")

  public List<VariantFormsListInner> getVariantForms() {
    return variantForms;
  }


  public void setVariantForms(List<VariantFormsListInner> variantForms) {
    
    
    
    this.variantForms = variantForms;
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
   * @return the Entry instance itself
   */
  public Entry putAdditionalProperty(String key, Object value) {
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
    Entry entry = (Entry) o;
    return Objects.equals(this.etymologies, entry.etymologies) &&
        Objects.equals(this.grammaticalFeatures, entry.grammaticalFeatures) &&
        Objects.equals(this.homographNumber, entry.homographNumber) &&
        Objects.equals(this.notes, entry.notes) &&
        Objects.equals(this.pronunciations, entry.pronunciations) &&
        Objects.equals(this.senses, entry.senses) &&
        Objects.equals(this.variantForms, entry.variantForms)&&
        Objects.equals(this.additionalProperties, entry.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etymologies, grammaticalFeatures, homographNumber, notes, pronunciations, senses, variantForms, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entry {\n");
    sb.append("    etymologies: ").append(toIndentedString(etymologies)).append("\n");
    sb.append("    grammaticalFeatures: ").append(toIndentedString(grammaticalFeatures)).append("\n");
    sb.append("    homographNumber: ").append(toIndentedString(homographNumber)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    pronunciations: ").append(toIndentedString(pronunciations)).append("\n");
    sb.append("    senses: ").append(toIndentedString(senses)).append("\n");
    sb.append("    variantForms: ").append(toIndentedString(variantForms)).append("\n");
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
    openapiFields.add("etymologies");
    openapiFields.add("grammaticalFeatures");
    openapiFields.add("homographNumber");
    openapiFields.add("notes");
    openapiFields.add("pronunciations");
    openapiFields.add("senses");
    openapiFields.add("variantForms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Entry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Entry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Entry is not found in the empty JSON string", Entry.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("etymologies") != null && !jsonObj.get("etymologies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `etymologies` to be an array in the JSON string but got `%s`", jsonObj.get("etymologies").toString()));
      }
      if (jsonObj.get("grammaticalFeatures") != null && !jsonObj.get("grammaticalFeatures").isJsonNull()) {
        JsonArray jsonArraygrammaticalFeatures = jsonObj.getAsJsonArray("grammaticalFeatures");
        if (jsonArraygrammaticalFeatures != null) {
          // ensure the json data is an array
          if (!jsonObj.get("grammaticalFeatures").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `grammaticalFeatures` to be an array in the JSON string but got `%s`", jsonObj.get("grammaticalFeatures").toString()));
          }

          // validate the optional field `grammaticalFeatures` (array)
          for (int i = 0; i < jsonArraygrammaticalFeatures.size(); i++) {
            GrammaticalFeaturesListInner.validateJsonObject(jsonArraygrammaticalFeatures.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("homographNumber") != null && !jsonObj.get("homographNumber").isJsonNull()) && !jsonObj.get("homographNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `homographNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("homographNumber").toString()));
      }
      if (jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) {
        JsonArray jsonArraynotes = jsonObj.getAsJsonArray("notes");
        if (jsonArraynotes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notes` to be an array in the JSON string but got `%s`", jsonObj.get("notes").toString()));
          }

          // validate the optional field `notes` (array)
          for (int i = 0; i < jsonArraynotes.size(); i++) {
            CategorizedTextListInner.validateJsonObject(jsonArraynotes.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("pronunciations") != null && !jsonObj.get("pronunciations").isJsonNull()) {
        JsonArray jsonArraypronunciations = jsonObj.getAsJsonArray("pronunciations");
        if (jsonArraypronunciations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("pronunciations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `pronunciations` to be an array in the JSON string but got `%s`", jsonObj.get("pronunciations").toString()));
          }

          // validate the optional field `pronunciations` (array)
          for (int i = 0; i < jsonArraypronunciations.size(); i++) {
            PronunciationsListInner.validateJsonObject(jsonArraypronunciations.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("senses") != null && !jsonObj.get("senses").isJsonNull()) {
        JsonArray jsonArraysenses = jsonObj.getAsJsonArray("senses");
        if (jsonArraysenses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("senses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `senses` to be an array in the JSON string but got `%s`", jsonObj.get("senses").toString()));
          }

          // validate the optional field `senses` (array)
          for (int i = 0; i < jsonArraysenses.size(); i++) {
            Sense.validateJsonObject(jsonArraysenses.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("variantForms") != null && !jsonObj.get("variantForms").isJsonNull()) {
        JsonArray jsonArrayvariantForms = jsonObj.getAsJsonArray("variantForms");
        if (jsonArrayvariantForms != null) {
          // ensure the json data is an array
          if (!jsonObj.get("variantForms").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `variantForms` to be an array in the JSON string but got `%s`", jsonObj.get("variantForms").toString()));
          }

          // validate the optional field `variantForms` (array)
          for (int i = 0; i < jsonArrayvariantForms.size(); i++) {
            VariantFormsListInner.validateJsonObject(jsonArrayvariantForms.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Entry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Entry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Entry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Entry.class));

       return (TypeAdapter<T>) new TypeAdapter<Entry>() {
           @Override
           public void write(JsonWriter out, Entry value) throws IOException {
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
           public Entry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Entry instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Entry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Entry
  * @throws IOException if the JSON string is invalid with respect to Entry
  */
  public static Entry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Entry.class);
  }

 /**
  * Convert an instance of Entry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

