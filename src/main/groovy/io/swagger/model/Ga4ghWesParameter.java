package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.Ga4ghWesParameterTypes;

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
  * Parameters for workflows or tasks, these are either output parameters, files, or directories, the latter two are stagged to an object store or something similar for hand back to the caller.
 **/
@ApiModel(description="Parameters for workflows or tasks, these are either output parameters, files, or directories, the latter two are stagged to an object store or something similar for hand back to the caller.")
public class Ga4ghWesParameter  {
  
  @ApiModelProperty(value = "")
  private String name = null;

  @ApiModelProperty(value = "")
  private String value = null;

  @ApiModelProperty(value = "")
  private String location = null;

  @ApiModelProperty(value = "")
  private Ga4ghWesParameterTypes type = null;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ga4ghWesParameter name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get value
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Ga4ghWesParameter value(String value) {
    this.value = value;
    return this;
  }

 /**
   * Get location
   * @return location
  **/
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Ga4ghWesParameter location(String location) {
    this.location = location;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public Ga4ghWesParameterTypes getType() {
    return type;
  }

  public void setType(Ga4ghWesParameterTypes type) {
    this.type = type;
  }

  public Ga4ghWesParameter type(Ga4ghWesParameterTypes type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ga4ghWesParameter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

