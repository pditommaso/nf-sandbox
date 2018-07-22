package io.swagger.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Ga4ghWesWorkflowListResponse  {
  
  @ApiModelProperty(value = "")
  private List<Ga4ghWesWorkflowDesc> workflows = null;

  @ApiModelProperty(value = "")
  private String nextPageToken = null;
 /**
   * Get workflows
   * @return workflows
  **/
  @JsonProperty("workflows")
  public List<Ga4ghWesWorkflowDesc> getWorkflows() {
    return workflows;
  }

  public void setWorkflows(List<Ga4ghWesWorkflowDesc> workflows) {
    this.workflows = workflows;
  }

  public Ga4ghWesWorkflowListResponse workflows(List<Ga4ghWesWorkflowDesc> workflows) {
    this.workflows = workflows;
    return this;
  }

  public Ga4ghWesWorkflowListResponse addWorkflowsItem(Ga4ghWesWorkflowDesc workflowsItem) {
    this.workflows.add(workflowsItem);
    return this;
  }

 /**
   * Get nextPageToken
   * @return nextPageToken
  **/
  @JsonProperty("next_page_token")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public Ga4ghWesWorkflowListResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ga4ghWesWorkflowListResponse {\n");
    
    sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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

