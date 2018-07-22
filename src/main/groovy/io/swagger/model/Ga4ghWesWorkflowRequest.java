package io.swagger.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Ga4ghWesWorkflowRequest  {
  
  @ApiModelProperty(value = "")
  private String workflowDescriptor = null;

  @ApiModelProperty(value = "")
  private String workflowParams = null;

  @ApiModelProperty(value = "")
  private String workflowType = null;

  @ApiModelProperty(value = "")
  private String workflowTypeVersion = null;

  @ApiModelProperty(value = "")
  private Map<String, String> keyValues = null;
 /**
   * Get workflowDescriptor
   * @return workflowDescriptor
  **/
  @JsonProperty("workflow_descriptor")
  public String getWorkflowDescriptor() {
    return workflowDescriptor;
  }

  public void setWorkflowDescriptor(String workflowDescriptor) {
    this.workflowDescriptor = workflowDescriptor;
  }

  public Ga4ghWesWorkflowRequest workflowDescriptor(String workflowDescriptor) {
    this.workflowDescriptor = workflowDescriptor;
    return this;
  }

 /**
   * Get workflowParams
   * @return workflowParams
  **/
  @JsonProperty("workflow_params")
  public String getWorkflowParams() {
    return workflowParams;
  }

  public void setWorkflowParams(String workflowParams) {
    this.workflowParams = workflowParams;
  }

  public Ga4ghWesWorkflowRequest workflowParams(String workflowParams) {
    this.workflowParams = workflowParams;
    return this;
  }

 /**
   * Get workflowType
   * @return workflowType
  **/
  @JsonProperty("workflow_type")
  public String getWorkflowType() {
    return workflowType;
  }

  public void setWorkflowType(String workflowType) {
    this.workflowType = workflowType;
  }

  public Ga4ghWesWorkflowRequest workflowType(String workflowType) {
    this.workflowType = workflowType;
    return this;
  }

 /**
   * Get workflowTypeVersion
   * @return workflowTypeVersion
  **/
  @JsonProperty("workflow_type_version")
  public String getWorkflowTypeVersion() {
    return workflowTypeVersion;
  }

  public void setWorkflowTypeVersion(String workflowTypeVersion) {
    this.workflowTypeVersion = workflowTypeVersion;
  }

  public Ga4ghWesWorkflowRequest workflowTypeVersion(String workflowTypeVersion) {
    this.workflowTypeVersion = workflowTypeVersion;
    return this;
  }

 /**
   * Get keyValues
   * @return keyValues
  **/
  @JsonProperty("key_values")
  public Map<String, String> getKeyValues() {
    return keyValues;
  }

  public void setKeyValues(Map<String, String> keyValues) {
    this.keyValues = keyValues;
  }

  public Ga4ghWesWorkflowRequest keyValues(Map<String, String> keyValues) {
    this.keyValues = keyValues;
    return this;
  }

  public Ga4ghWesWorkflowRequest putKeyValuesItem(String key, String keyValuesItem) {
    this.keyValues.put(key, keyValuesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ga4ghWesWorkflowRequest {\n");
    
    sb.append("    workflowDescriptor: ").append(toIndentedString(workflowDescriptor)).append("\n");
    sb.append("    workflowParams: ").append(toIndentedString(workflowParams)).append("\n");
    sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
    sb.append("    workflowTypeVersion: ").append(toIndentedString(workflowTypeVersion)).append("\n");
    sb.append("    keyValues: ").append(toIndentedString(keyValues)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

