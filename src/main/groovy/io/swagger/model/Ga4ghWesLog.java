package io.swagger.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Ga4ghWesLog  {
  
  @ApiModelProperty(value = "")
  private String name = null;

  @ApiModelProperty(value = "")
  private List<String> cmd = null;

  @ApiModelProperty(value = "")
  private String startTime = null;

  @ApiModelProperty(value = "")
  private String endTime = null;

  @ApiModelProperty(value = "")
  private String stdout = null;

  @ApiModelProperty(value = "")
  private String stderr = null;

  @ApiModelProperty(value = "")
  private Integer exitCode = null;
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

  public Ga4ghWesLog name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get cmd
   * @return cmd
  **/
  @JsonProperty("cmd")
  public List<String> getCmd() {
    return cmd;
  }

  public void setCmd(List<String> cmd) {
    this.cmd = cmd;
  }

  public Ga4ghWesLog cmd(List<String> cmd) {
    this.cmd = cmd;
    return this;
  }

  public Ga4ghWesLog addCmdItem(String cmdItem) {
    this.cmd.add(cmdItem);
    return this;
  }

 /**
   * Get startTime
   * @return startTime
  **/
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public Ga4ghWesLog startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * Get endTime
   * @return endTime
  **/
  @JsonProperty("endTime")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public Ga4ghWesLog endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
   * Get stdout
   * @return stdout
  **/
  @JsonProperty("stdout")
  public String getStdout() {
    return stdout;
  }

  public void setStdout(String stdout) {
    this.stdout = stdout;
  }

  public Ga4ghWesLog stdout(String stdout) {
    this.stdout = stdout;
    return this;
  }

 /**
   * Get stderr
   * @return stderr
  **/
  @JsonProperty("stderr")
  public String getStderr() {
    return stderr;
  }

  public void setStderr(String stderr) {
    this.stderr = stderr;
  }

  public Ga4ghWesLog stderr(String stderr) {
    this.stderr = stderr;
    return this;
  }

 /**
   * Get exitCode
   * @return exitCode
  **/
  @JsonProperty("exitCode")
  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }

  public Ga4ghWesLog exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ga4ghWesLog {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    stdout: ").append(toIndentedString(stdout)).append("\n");
    sb.append("    stderr: ").append(toIndentedString(stderr)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
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

