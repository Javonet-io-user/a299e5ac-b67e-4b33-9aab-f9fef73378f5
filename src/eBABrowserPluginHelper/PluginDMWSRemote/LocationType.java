package eBABrowserPluginHelper.PluginDMWSRemote;

public enum LocationType {
  Local(0L),
  Remote(1L),
  ;
  private long numVal;

  LocationType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
