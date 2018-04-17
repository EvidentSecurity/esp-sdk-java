/*
 * ESP Documentation
 * The Evident Security Platform API (version 2.0) is designed to allow users granular control over their Amazon Web Service security experience by allowing them to review alerts, monitor signatures, and create custom signatures.
 *
 * OpenAPI spec version: v2_sdk
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.evident.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.evident.models.CustomSignature;
import io.evident.models.CustomSignatureResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * A(n) CustomSignatureDefinition object
 */
@ApiModel(description = "A(n) CustomSignatureDefinition object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T15:00:39.690-05:00")
public class CustomSignatureDefinition {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("version_number")
  private Integer versionNumber = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("custom_signature")
  private CustomSignature customSignature = null;

  @SerializedName("custom_signature_id")
  private Integer customSignatureId = null;

  @SerializedName("results")
  private List<CustomSignatureResult> results = new ArrayList<CustomSignatureResult>();

  @SerializedName("result_ids")
  private List<Integer> resultIds = new ArrayList<Integer>();

  public CustomSignatureDefinition id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Unique ID
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Unique ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CustomSignatureDefinition code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The code for this definition
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "The code for this definition")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CustomSignatureDefinition updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the resource was updated
   * @return updatedAt
  **/
  @ApiModelProperty(example = "null", value = "ISO 8601 timestamp when the resource was updated")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CustomSignatureDefinition createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the resource was created
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "ISO 8601 timestamp when the resource was created")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CustomSignatureDefinition versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * Version of definition
   * @return versionNumber
  **/
  @ApiModelProperty(example = "null", value = "Version of definition")
  public Integer getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }

  public CustomSignatureDefinition language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language of the definition. Valid values are ruby, javascript
   * @return language
  **/
  @ApiModelProperty(example = "null", value = "The language of the definition. Valid values are ruby, javascript")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public CustomSignatureDefinition status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the definition. Valid values are editable, validating, active, archived, disabled
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Status of the definition. Valid values are editable, validating, active, archived, disabled")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CustomSignatureDefinition customSignature(CustomSignature customSignature) {
    this.customSignature = customSignature;
    return this;
  }

   /**
   * Associated Custom Signature
   * @return customSignature
  **/
  @ApiModelProperty(example = "null", value = "Associated Custom Signature")
  public CustomSignature getCustomSignature() {
    return customSignature;
  }

  public void setCustomSignature(CustomSignature customSignature) {
    this.customSignature = customSignature;
  }

  public CustomSignatureDefinition customSignatureId(Integer customSignatureId) {
    this.customSignatureId = customSignatureId;
    return this;
  }

   /**
   * Associated Custom Signature ID
   * @return customSignatureId
  **/
  @ApiModelProperty(example = "null", value = "Associated Custom Signature ID")
  public Integer getCustomSignatureId() {
    return customSignatureId;
  }

  public void setCustomSignatureId(Integer customSignatureId) {
    this.customSignatureId = customSignatureId;
  }

  public CustomSignatureDefinition results(List<CustomSignatureResult> results) {
    this.results = results;
    return this;
  }

  public CustomSignatureDefinition addResultsItem(CustomSignatureResult resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Associated Results
   * @return results
  **/
  @ApiModelProperty(example = "null", value = "Associated Results")
  public List<CustomSignatureResult> getResults() {
    return results;
  }

  public void setResults(List<CustomSignatureResult> results) {
    this.results = results;
  }

  public CustomSignatureDefinition resultIds(List<Integer> resultIds) {
    this.resultIds = resultIds;
    return this;
  }

  public CustomSignatureDefinition addResultIdsItem(Integer resultIdsItem) {
    this.resultIds.add(resultIdsItem);
    return this;
  }

   /**
   * Associated Results IDs
   * @return resultIds
  **/
  @ApiModelProperty(example = "null", value = "Associated Results IDs")
  public List<Integer> getResultIds() {
    return resultIds;
  }

  public void setResultIds(List<Integer> resultIds) {
    this.resultIds = resultIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomSignatureDefinition customSignatureDefinition = (CustomSignatureDefinition) o;
    return Objects.equals(this.id, customSignatureDefinition.id) &&
        Objects.equals(this.code, customSignatureDefinition.code) &&
        Objects.equals(this.updatedAt, customSignatureDefinition.updatedAt) &&
        Objects.equals(this.createdAt, customSignatureDefinition.createdAt) &&
        Objects.equals(this.versionNumber, customSignatureDefinition.versionNumber) &&
        Objects.equals(this.language, customSignatureDefinition.language) &&
        Objects.equals(this.status, customSignatureDefinition.status) &&
        Objects.equals(this.customSignature, customSignatureDefinition.customSignature) &&
        Objects.equals(this.customSignatureId, customSignatureDefinition.customSignatureId) &&
        Objects.equals(this.results, customSignatureDefinition.results) &&
        Objects.equals(this.resultIds, customSignatureDefinition.resultIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, updatedAt, createdAt, versionNumber, language, status, customSignature, customSignatureId, results, resultIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomSignatureDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customSignature: ").append(toIndentedString(customSignature)).append("\n");
    sb.append("    customSignatureId: ").append(toIndentedString(customSignatureId)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    resultIds: ").append(toIndentedString(resultIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
