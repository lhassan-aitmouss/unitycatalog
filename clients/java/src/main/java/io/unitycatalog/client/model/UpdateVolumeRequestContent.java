/*
 * Unity Catalog API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.unitycatalog.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateVolumeRequestContent
 */
@JsonPropertyOrder({
  UpdateVolumeRequestContent.JSON_PROPERTY_COMMENT,
  UpdateVolumeRequestContent.JSON_PROPERTY_NEW_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class UpdateVolumeRequestContent {
  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public static final String JSON_PROPERTY_NEW_NAME = "new_name";
  private String newName;

  public UpdateVolumeRequestContent() { 
  }

  public UpdateVolumeRequestContent comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * The comment attached to the volume
   * @return comment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(String comment) {
    this.comment = comment;
  }


  public UpdateVolumeRequestContent newName(String newName) {
    this.newName = newName;
    return this;
  }

   /**
   * New name for the volume.
   * @return newName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEW_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewName() {
    return newName;
  }


  @JsonProperty(JSON_PROPERTY_NEW_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewName(String newName) {
    this.newName = newName;
  }


  /**
   * Return true if this UpdateVolumeRequestContent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVolumeRequestContent updateVolumeRequestContent = (UpdateVolumeRequestContent) o;
    return Objects.equals(this.comment, updateVolumeRequestContent.comment) &&
        Objects.equals(this.newName, updateVolumeRequestContent.newName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, newName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVolumeRequestContent {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `comment` to the URL query string
    if (getComment() != null) {
      joiner.add(String.format("%scomment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComment()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `new_name` to the URL query string
    if (getNewName() != null) {
      joiner.add(String.format("%snew_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNewName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
