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
import io.evident.models.ComplianceControl;
import io.evident.models.Stat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A(n) StatComplianceControl object
 */
@ApiModel(description = "A(n) StatComplianceControl object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T15:00:39.690-05:00")
public class StatComplianceControl {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("pass")
  private Integer pass = null;

  @SerializedName("fail")
  private Integer fail = null;

  @SerializedName("compliance_control")
  private ComplianceControl complianceControl = null;

  @SerializedName("compliance_control_id")
  private Integer complianceControlId = null;

  @SerializedName("stat")
  private Stat stat = null;

  @SerializedName("stat_id")
  private Integer statId = null;

  public StatComplianceControl id(Integer id) {
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

  public StatComplianceControl pass(Integer pass) {
    this.pass = pass;
    return this;
  }

   /**
   * The number of alerts with a status of \"pass\" associated with this compliance control
   * @return pass
  **/
  @ApiModelProperty(example = "null", value = "The number of alerts with a status of \"pass\" associated with this compliance control")
  public Integer getPass() {
    return pass;
  }

  public void setPass(Integer pass) {
    this.pass = pass;
  }

  public StatComplianceControl fail(Integer fail) {
    this.fail = fail;
    return this;
  }

   /**
   * The number of alerts with a status of \"fail\" associated with this compliance control
   * @return fail
  **/
  @ApiModelProperty(example = "null", value = "The number of alerts with a status of \"fail\" associated with this compliance control")
  public Integer getFail() {
    return fail;
  }

  public void setFail(Integer fail) {
    this.fail = fail;
  }

  public StatComplianceControl complianceControl(ComplianceControl complianceControl) {
    this.complianceControl = complianceControl;
    return this;
  }

   /**
   * Associated Compliance Control
   * @return complianceControl
  **/
  @ApiModelProperty(example = "null", value = "Associated Compliance Control")
  public ComplianceControl getComplianceControl() {
    return complianceControl;
  }

  public void setComplianceControl(ComplianceControl complianceControl) {
    this.complianceControl = complianceControl;
  }

  public StatComplianceControl complianceControlId(Integer complianceControlId) {
    this.complianceControlId = complianceControlId;
    return this;
  }

   /**
   * Associated Compliance Control ID
   * @return complianceControlId
  **/
  @ApiModelProperty(example = "null", value = "Associated Compliance Control ID")
  public Integer getComplianceControlId() {
    return complianceControlId;
  }

  public void setComplianceControlId(Integer complianceControlId) {
    this.complianceControlId = complianceControlId;
  }

  public StatComplianceControl stat(Stat stat) {
    this.stat = stat;
    return this;
  }

   /**
   * Associated Stat
   * @return stat
  **/
  @ApiModelProperty(example = "null", value = "Associated Stat")
  public Stat getStat() {
    return stat;
  }

  public void setStat(Stat stat) {
    this.stat = stat;
  }

  public StatComplianceControl statId(Integer statId) {
    this.statId = statId;
    return this;
  }

   /**
   * Associated Stat ID
   * @return statId
  **/
  @ApiModelProperty(example = "null", value = "Associated Stat ID")
  public Integer getStatId() {
    return statId;
  }

  public void setStatId(Integer statId) {
    this.statId = statId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatComplianceControl statComplianceControl = (StatComplianceControl) o;
    return Objects.equals(this.id, statComplianceControl.id) &&
        Objects.equals(this.pass, statComplianceControl.pass) &&
        Objects.equals(this.fail, statComplianceControl.fail) &&
        Objects.equals(this.complianceControl, statComplianceControl.complianceControl) &&
        Objects.equals(this.complianceControlId, statComplianceControl.complianceControlId) &&
        Objects.equals(this.stat, statComplianceControl.stat) &&
        Objects.equals(this.statId, statComplianceControl.statId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pass, fail, complianceControl, complianceControlId, stat, statId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatComplianceControl {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
    sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
    sb.append("    complianceControl: ").append(toIndentedString(complianceControl)).append("\n");
    sb.append("    complianceControlId: ").append(toIndentedString(complianceControlId)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
    sb.append("    statId: ").append(toIndentedString(statId)).append("\n");
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

