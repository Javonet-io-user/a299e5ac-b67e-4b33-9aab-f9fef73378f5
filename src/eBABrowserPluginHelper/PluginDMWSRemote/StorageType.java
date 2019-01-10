package eBABrowserPluginHelper.PluginDMWSRemote;

public enum StorageType {
  Database(0L),
  FileSystem(1L),
  ;
  private long numVal;

  StorageType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
