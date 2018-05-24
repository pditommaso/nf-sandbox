package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Ga4ghWesWorkflowListRequest  {
  
  @ApiModelProperty(value = "OPTIONAL Number of workflows to return at once. Defaults to 256, and max is 2048.")
 /**
   * OPTIONAL Number of workflows to return at once. Defaults to 256, and max is 2048.  
  **/
  private Long pageSize = null;

  @ApiModelProperty(value = "OPTIONAL Token to use to indicate where to start getting results. If unspecified, returns the first page of results.")
 /**
   * OPTIONAL Token to use to indicate where to start getting results. If unspecified, returns the first page of results.  
  **/
  private String pageToken = null;

  @ApiModelProperty(value = "")
  private String keyValueSearch = null;
 /**
   * OPTIONAL Number of workflows to return at once. Defaults to 256, and max is 2048.
   * @return pageSize
  **/
  @JsonProperty("page_size")
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public Ga4ghWesWorkflowListRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

 /**
   * OPTIONAL Token to use to indicate where to start getting results. If unspecified, returns the first page of results.
   * @return pageToken
  **/
  @JsonProperty("page_token")
  public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }

  public Ga4ghWesWorkflowListRequest pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

 /**
   * Get keyValueSearch
   * @return keyValueSearch
  **/
  @JsonProperty("key_value_search")
  public String getKeyValueSearch() {
    return keyValueSearch;
  }

  public void setKeyValueSearch(String keyValueSearch) {
    this.keyValueSearch = keyValueSearch;
  }

  public Ga4ghWesWorkflowListRequest keyValueSearch(String keyValueSearch) {
    this.keyValueSearch = keyValueSearch;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ga4ghWesWorkflowListRequest {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
    sb.append("    keyValueSearch: ").append(toIndentedString(keyValueSearch)).append("\n");
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

