package eBABrowserPluginHelper.PluginDMWS;

public enum DMObjectType {
  Library(0L),
  Folder(1L),
  File(2L),
  ;
  private long numVal;

  DMObjectType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
