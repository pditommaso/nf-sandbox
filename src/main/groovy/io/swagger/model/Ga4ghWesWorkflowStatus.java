package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Ga4ghWesWorkflowStatus  {
  
  @ApiModelProperty(value = "")
  private String workflowId = null;

  @ApiModelProperty(value = "")
  private Ga4ghWesState state = null;
 /**
   * Get workflowId
   * @return workflowId
  **/
  @JsonProperty("workflow_id")
  public String getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }

  public Ga4ghWesWorkflowStatus workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  public Ga4ghWesState getState() {
    return state;
  }

  public void setState(Ga4ghWesState state) {
    this.state = state;
  }

  public Ga4ghWesWorkflowStatus state(Ga4ghWesState state) {
    this.state = state;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ga4ghWesWorkflowStatus {\n");
    
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

