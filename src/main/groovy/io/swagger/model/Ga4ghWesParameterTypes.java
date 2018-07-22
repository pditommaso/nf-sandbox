package io.swagger.model;


/**
 * Gets or Sets ga4gh_wes_parameter_types
 */
public enum Ga4ghWesParameterTypes {
  
  DIRECTORY("Directory"),
  
  FILE("File"),
  
  PARAMETER("Parameter");

  private String value;

  Ga4ghWesParameterTypes(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Ga4ghWesParameterTypes fromValue(String text) {
    for (Ga4ghWesParameterTypes b : Ga4ghWesParameterTypes.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

