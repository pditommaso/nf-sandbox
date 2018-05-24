package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.Ga4ghWesWorkflowTypeVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * .
 **/
@ApiModel(description=".")
public class Ga4ghWesServiceInfo  {
  
  @ApiModelProperty(value = "")
  private Map<String, Ga4ghWesWorkflowTypeVersion> workflowTypeVersions = null;

  @ApiModelProperty(value = "")
  private List<String> supportedWesVersions = null;

  @ApiModelProperty(value = "The filesystem protocols supported by this service, currently these may include common protocols such as 'http', 'https', 'sftp', 's3', 'gs', 'file', 'synapse', or others as supported by this service.")
 /**
   * The filesystem protocols supported by this service, currently these may include common protocols such as 'http', 'https', 'sftp', 's3', 'gs', 'file', 'synapse', or others as supported by this service.  
  **/
  private List<String> supportedFilesystemProtocols = null;

  @ApiModelProperty(value = "")
  private Map<String, String> engineVersions = null;

  @ApiModelProperty(value = "The system statistics, key is the statistic, value is the count of workflows in that state. See the State enum for the possible keys.")
 /**
   * The system statistics, key is the statistic, value is the count of workflows in that state. See the State enum for the possible keys.  
  **/
  private Map<String, Long> systemStateCounts = null;

  @ApiModelProperty(value = "")
  private Map<String, String> keyValues = null;
 /**
   * Get workflowTypeVersions
   * @return workflowTypeVersions
  **/
  @JsonProperty("workflow_type_versions")
  public Map<String, Ga4ghWesWorkflowTypeVersion> getWorkflowTypeVersions() {
    return workflowTypeVersions;
  }

  public void setWorkflowTypeVersions(Map<String, Ga4ghWesWorkflowTypeVersion> workflowTypeVersions) {
    this.workflowTypeVersions = workflowTypeVersions;
  }

  public Ga4ghWesServiceInfo workflowTypeVersions(Map<String, Ga4ghWesWorkflowTypeVersion> workflowTypeVersions) {
    this.workflowTypeVersions = workflowTypeVersions;
    return this;
  }

  public Ga4ghWesServiceInfo putWorkflowTypeVersionsItem(String key, Ga4ghWesWorkflowTypeVersion workflowTypeVersionsItem) {
    this.workflowTypeVersions.put(key, workflowTypeVersionsItem);
    return this;
  }

 /**
   * Get supportedWesVersions
   * @return supportedWesVersions
  **/
  @JsonProperty("supported_wes_versions")
  public List<String> getSupportedWesVersions() {
    return supportedWesVersions;
  }

  public void setSupportedWesVersions(List<String> supportedWesVersions) {
    this.supportedWesVersions = supportedWesVersions;
  }

  public Ga4ghWesServiceInfo supportedWesVersions(List<String> supportedWesVersions) {
    this.supportedWesVersions = supportedWesVersions;
    return this;
  }

  public Ga4ghWesServiceInfo addSupportedWesVersionsItem(String supportedWesVersionsItem) {
    this.supportedWesVersions.add(supportedWesVersionsItem);
    return this;
  }

 /**
   * The filesystem protocols supported by this service, currently these may include common protocols such as &#39;http&#39;, &#39;https&#39;, &#39;sftp&#39;, &#39;s3&#39;, &#39;gs&#39;, &#39;file&#39;, &#39;synapse&#39;, or others as supported by this service.
   * @return supportedFilesystemProtocols
  **/
  @JsonProperty("supported_filesystem_protocols")
  public List<String> getSupportedFilesystemProtocols() {
    return supportedFilesystemProtocols;
  }

  public void setSupportedFilesystemProtocols(List<String> supportedFilesystemProtocols) {
    this.supportedFilesystemProtocols = supportedFilesystemProtocols;
  }

  public Ga4ghWesServiceInfo supportedFilesystemProtocols(List<String> supportedFilesystemProtocols) {
    this.supportedFilesystemProtocols = supportedFilesystemProtocols;
    return this;
  }

  public Ga4ghWesServiceInfo addSupportedFilesystemProtocolsItem(String supportedFilesystemProtocolsItem) {
    this.supportedFilesystemProtocols.add(supportedFilesystemProtocolsItem);
    return this;
  }

 /**
   * Get engineVersions
   * @return engineVersions
  **/
  @JsonProperty("engine_versions")
  public Map<String, String> getEngineVersions() {
    return engineVersions;
  }

  public void setEngineVersions(Map<String, String> engineVersions) {
    this.engineVersions = engineVersions;
  }

  public Ga4ghWesServiceInfo engineVersions(Map<String, String> engineVersions) {
    this.engineVersions = engineVersions;
    return this;
  }

  public Ga4ghWesServiceInfo putEngineVersionsItem(String key, String engineVersionsItem) {
    this.engineVersions.put(key, engineVersionsItem);
    return this;
  }

 /**
   * The system statistics, key is the statistic, value is the count of workflows in that state. See the State enum for the possible keys.
   * @return systemStateCounts
  **/
  @JsonProperty("system_state_counts")
  public Map<String, Long> getSystemStateCounts() {
    return systemStateCounts;
  }

  public void setSystemStateCounts(Map<String, Long> systemStateCounts) {
    this.systemStateCounts = systemStateCounts;
  }

  public Ga4ghWesServiceInfo systemStateCounts(Map<String, Long> systemStateCounts) {
    this.systemStateCounts = systemStateCounts;
    return this;
  }

  public Ga4ghWesServiceInfo putSystemStateCountsItem(String key, Long systemStateCountsItem) {
    this.systemStateCounts.put(key, systemStateCountsItem);
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

  public Ga4ghWesServiceInfo keyValues(Map<String, String> keyValues) {
    this.keyValues = keyValues;
    return this;
  }

  public Ga4ghWesServiceInfo putKeyValuesItem(String key, String keyValuesItem) {
    this.keyValues.put(key, keyValuesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ga4ghWesServiceInfo {\n");
    
    sb.append("    workflowTypeVersions: ").append(toIndentedString(workflowTypeVersions)).append("\n");
    sb.append("    supportedWesVersions: ").append(toIndentedString(supportedWesVersions)).append("\n");
    sb.append("    supportedFilesystemProtocols: ").append(toIndentedString(supportedFilesystemProtocols)).append("\n");
    sb.append("    engineVersions: ").append(toIndentedString(engineVersions)).append("\n");
    sb.append("    systemStateCounts: ").append(toIndentedString(systemStateCounts)).append("\n");
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

