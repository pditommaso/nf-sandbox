package io.swagger.model;

import io.swagger.model.Ga4ghWesLog;
import io.swagger.model.Ga4ghWesParameter;
import io.swagger.model.Ga4ghWesState;
import io.swagger.model.Ga4ghWesWorkflowRequest;
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

public class Ga4ghWesWorkflowLog  {
  
  @ApiModelProperty(value = "")
  private String workflowId = null;

  @ApiModelProperty(value = "")
  private Ga4ghWesWorkflowRequest request = null;

  @ApiModelProperty(value = "")
  private Ga4ghWesState state = null;

  @ApiModelProperty(value = "")
  private Ga4ghWesLog workflowLog = null;

  @ApiModelProperty(value = "")
  private List<Ga4ghWesLog> taskLogs = null;

  @ApiModelProperty(value = "")
  private List<Ga4ghWesParameter> outputs = null;
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

  public Ga4ghWesWorkflowLog workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

 /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  public Ga4ghWesWorkflowRequest getRequest() {
    return request;
  }

  public void setRequest(Ga4ghWesWorkflowRequest request) {
    this.request = request;
  }

  public Ga4ghWesWorkflowLog request(Ga4ghWesWorkflowRequest request) {
    this.request = request;
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

  public Ga4ghWesWorkflowLog state(Ga4ghWesState state) {
    this.state = state;
    return this;
  }

 /**
   * Get workflowLog
   * @return workflowLog
  **/
  @JsonProperty("workflow_log")
  public Ga4ghWesLog getWorkflowLog() {
    return workflowLog;
  }

  public void setWorkflowLog(Ga4ghWesLog workflowLog) {
    this.workflowLog = workflowLog;
  }

  public Ga4ghWesWorkflowLog workflowLog(Ga4ghWesLog workflowLog) {
    this.workflowLog = workflowLog;
    return this;
  }

 /**
   * Get taskLogs
   * @return taskLogs
  **/
  @JsonProperty("task_logs")
  public List<Ga4ghWesLog> getTaskLogs() {
    return taskLogs;
  }

  public void setTaskLogs(List<Ga4ghWesLog> taskLogs) {
    this.taskLogs = taskLogs;
  }

  public Ga4ghWesWorkflowLog taskLogs(List<Ga4ghWesLog> taskLogs) {
    this.taskLogs = taskLogs;
    return this;
  }

  public Ga4ghWesWorkflowLog addTaskLogsItem(Ga4ghWesLog taskLogsItem) {
    this.taskLogs.add(taskLogsItem);
    return this;
  }

 /**
   * Get outputs
   * @return outputs
  **/
  @JsonProperty("outputs")
  public List<Ga4ghWesParameter> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<Ga4ghWesParameter> outputs) {
    this.outputs = outputs;
  }

  public Ga4ghWesWorkflowLog outputs(List<Ga4ghWesParameter> outputs) {
    this.outputs = outputs;
    return this;
  }

  public Ga4ghWesWorkflowLog addOutputsItem(Ga4ghWesParameter outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ga4ghWesWorkflowLog {\n");
    
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    workflowLog: ").append(toIndentedString(workflowLog)).append("\n");
    sb.append("    taskLogs: ").append(toIndentedString(taskLogs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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

