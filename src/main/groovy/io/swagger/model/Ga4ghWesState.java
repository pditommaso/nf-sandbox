package io.swagger.model;



/**
 * Gets or Sets ga4gh_wes_state
 */
public enum Ga4ghWesState {
  
  UNKNOWN("Unknown"),
  
  QUEUED("Queued"),
  
  RUNNING("Running"),
  
  PAUSED("Paused"),
  
  COMPLETE("Complete"),
  
  ERROR("Error"),
  
  SYSTEMERROR("SystemError"),
  
  CANCELED("Canceled"),
  
  INITIALIZING("Initializing");

  private String value;

  Ga4ghWesState(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Ga4ghWesState fromValue(String text) {
    for (Ga4ghWesState b : Ga4ghWesState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

