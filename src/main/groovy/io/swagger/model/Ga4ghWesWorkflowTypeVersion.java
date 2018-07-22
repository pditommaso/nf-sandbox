package io.swagger.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Ga4ghWesWorkflowTypeVersion  {
  
  @ApiModelProperty(value = "")
  private List<String> workflowTypeVersion = null;
 /**
   * Get workflowTypeVersion
   * @return workflowTypeVersion
  **/
  @JsonProperty("workflow_type_version")
  public List<String> getWorkflowTypeVersion() {
    return workflowTypeVersion;
  }

  public void setWorkflowTypeVersion(List<String> workflowTypeVersion) {
    this.workflowTypeVersion = workflowTypeVersion;
  }

  public Ga4ghWesWorkflowTypeVersion workflowTypeVersion(List<String> workflowTypeVersion) {
    this.workflowTypeVersion = workflowTypeVersion;
    return this;
  }

  public Ga4ghWesWorkflowTypeVersion addWorkflowTypeVersionItem(String workflowTypeVersionItem) {
    this.workflowTypeVersion.add(workflowTypeVersionItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ga4ghWesWorkflowTypeVersion {\n");
    
    sb.append("    workflowTypeVersion: ").append(toIndentedString(workflowTypeVersion)).append("\n");
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

