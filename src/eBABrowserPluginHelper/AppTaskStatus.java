package eBABrowserPluginHelper;

public enum AppTaskStatus {
  Executed(1L),
  Completed(2L),
  Failed(3L),
  Cancelled(4L),
  Timeout(5L),
  ;
  private long numVal;

  AppTaskStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
