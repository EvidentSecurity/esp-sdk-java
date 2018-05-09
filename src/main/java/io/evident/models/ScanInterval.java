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
import io.evident.models.ExternalAccount;
import io.evident.models.Service;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * A(n) ScanInterval object
 */
@ApiModel(description = "A(n) ScanInterval object")

public class ScanInterval {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("interval")
  private Integer interval = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("external_account")
  private ExternalAccount externalAccount = null;

  @SerializedName("external_account_id")
  private Integer externalAccountId = null;

  @SerializedName("service")
  private Service service = null;

  @SerializedName("service_id")
  private Integer serviceId = null;

  public ScanInterval id(Integer id) {
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

  public ScanInterval interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * The interval, in minutes, this service will be scanned
   * @return interval
  **/
  @ApiModelProperty(example = "null", value = "The interval, in minutes, this service will be scanned")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public ScanInterval createdAt(DateTime createdAt) {
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

  public ScanInterval updatedAt(DateTime updatedAt) {
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

  public ScanInterval externalAccount(ExternalAccount externalAccount) {
    this.externalAccount = externalAccount;
    return this;
  }

   /**
   * Associated External Account
   * @return externalAccount
  **/
  @ApiModelProperty(example = "null", value = "Associated External Account")
  public ExternalAccount getExternalAccount() {
    return externalAccount;
  }

  public void setExternalAccount(ExternalAccount externalAccount) {
    this.externalAccount = externalAccount;
  }

  public ScanInterval externalAccountId(Integer externalAccountId) {
    this.externalAccountId = externalAccountId;
    return this;
  }

   /**
   * Associated External Account ID
   * @return externalAccountId
  **/
  @ApiModelProperty(example = "null", value = "Associated External Account ID")
  public Integer getExternalAccountId() {
    return externalAccountId;
  }

  public void setExternalAccountId(Integer externalAccountId) {
    this.externalAccountId = externalAccountId;
  }

  public ScanInterval service(Service service) {
    this.service = service;
    return this;
  }

   /**
   * Associated Service
   * @return service
  **/
  @ApiModelProperty(example = "null", value = "Associated Service")
  public Service getService() {
    return service;
  }

  public void setService(Service service) {
    this.service = service;
  }

  public ScanInterval serviceId(Integer serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Associated Service ID
   * @return serviceId
  **/
  @ApiModelProperty(example = "null", value = "Associated Service ID")
  public Integer getServiceId() {
    return serviceId;
  }

  public void setServiceId(Integer serviceId) {
    this.serviceId = serviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScanInterval scanInterval = (ScanInterval) o;
    return Objects.equals(this.id, scanInterval.id) &&
        Objects.equals(this.interval, scanInterval.interval) &&
        Objects.equals(this.createdAt, scanInterval.createdAt) &&
        Objects.equals(this.updatedAt, scanInterval.updatedAt) &&
        Objects.equals(this.externalAccount, scanInterval.externalAccount) &&
        Objects.equals(this.externalAccountId, scanInterval.externalAccountId) &&
        Objects.equals(this.service, scanInterval.service) &&
        Objects.equals(this.serviceId, scanInterval.serviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, interval, createdAt, updatedAt, externalAccount, externalAccountId, service, serviceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScanInterval {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    externalAccount: ").append(toIndentedString(externalAccount)).append("\n");
    sb.append("    externalAccountId: ").append(toIndentedString(externalAccountId)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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

