package eBABrowserPluginHelper.PluginDMWSRemote;

public enum ServiceDownloadTaskStatusType {
  UnknownTask(0L),
  Error(1L),
  Running(2L),
  Done(3L),
  ;
  private long numVal;

  ServiceDownloadTaskStatusType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
