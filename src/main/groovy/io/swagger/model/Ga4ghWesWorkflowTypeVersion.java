package io.swagger.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

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

