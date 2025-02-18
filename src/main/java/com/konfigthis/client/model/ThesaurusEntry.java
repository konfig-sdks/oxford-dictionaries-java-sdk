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
import com.konfigthis.client.model.ThesaurusSense;
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
 * ThesaurusEntry
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ThesaurusEntry {
  public static final String SERIALIZED_NAME_HOMOGRAPH_NUMBER = "homographNumber";
  @SerializedName(SERIALIZED_NAME_HOMOGRAPH_NUMBER)
  private String homographNumber;

  public static final String SERIALIZED_NAME_SENSES = "senses";
  @SerializedName(SERIALIZED_NAME_SENSES)
  private List<ThesaurusSense> senses = null;

  public static final String SERIALIZED_NAME_VARIANT_FORMS = "variantForms";
  @SerializedName(SERIALIZED_NAME_VARIANT_FORMS)
  private List<VariantFormsListInner> variantForms = null;

  public ThesaurusEntry() {
  }

  public ThesaurusEntry homographNumber(String homographNumber) {
    
    
    
    
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


  public ThesaurusEntry senses(List<ThesaurusSense> senses) {
    
    
    
    
    this.senses = senses;
    return this;
  }

  public ThesaurusEntry addSensesItem(ThesaurusSense sensesItem) {
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

  public List<ThesaurusSense> getSenses() {
    return senses;
  }


  public void setSenses(List<ThesaurusSense> senses) {
    
    
    
    this.senses = senses;
  }


  public ThesaurusEntry variantForms(List<VariantFormsListInner> variantForms) {
    
    
    
    
    this.variantForms = variantForms;
    return this;
  }

  public ThesaurusEntry addVariantFormsItem(VariantFormsListInner variantFormsItem) {
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
   * @return the ThesaurusEntry instance itself
   */
  public ThesaurusEntry putAdditionalProperty(String key, Object value) {
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
    ThesaurusEntry thesaurusEntry = (ThesaurusEntry) o;
    return Objects.equals(this.homographNumber, thesaurusEntry.homographNumber) &&
        Objects.equals(this.senses, thesaurusEntry.senses) &&
        Objects.equals(this.variantForms, thesaurusEntry.variantForms)&&
        Objects.equals(this.additionalProperties, thesaurusEntry.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homographNumber, senses, variantForms, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThesaurusEntry {\n");
    sb.append("    homographNumber: ").append(toIndentedString(homographNumber)).append("\n");
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
    openapiFields.add("homographNumber");
    openapiFields.add("senses");
    openapiFields.add("variantForms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThesaurusEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ThesaurusEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThesaurusEntry is not found in the empty JSON string", ThesaurusEntry.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("homographNumber") != null && !jsonObj.get("homographNumber").isJsonNull()) && !jsonObj.get("homographNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `homographNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("homographNumber").toString()));
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
            ThesaurusSense.validateJsonObject(jsonArraysenses.get(i).getAsJsonObject());
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
       if (!ThesaurusEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThesaurusEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThesaurusEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThesaurusEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<ThesaurusEntry>() {
           @Override
           public void write(JsonWriter out, ThesaurusEntry value) throws IOException {
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
           public ThesaurusEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ThesaurusEntry instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ThesaurusEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThesaurusEntry
  * @throws IOException if the JSON string is invalid with respect to ThesaurusEntry
  */
  public static ThesaurusEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThesaurusEntry.class);
  }

 /**
  * Convert an instance of ThesaurusEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

