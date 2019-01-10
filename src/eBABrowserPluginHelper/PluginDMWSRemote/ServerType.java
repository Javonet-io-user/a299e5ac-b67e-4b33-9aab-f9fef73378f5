package eBABrowserPluginHelper.PluginDMWSRemote;

public enum ServerType {
  SqlServer(0L),
  Oracle(1L),
  MySql(2L),
  ;
  private long numVal;

  ServerType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
