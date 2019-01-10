package eBABrowserPluginHelper.PluginUpdaterWS;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import eBABrowserPluginHelper.PluginUpdaterWS.*;

public class UpdateFile {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setFilename(java.lang.String value) {
    try {
      javonetHandle.set("Filename", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getFilename() {
    try {
      java.lang.String res = javonetHandle.get("Filename");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setClientPath(java.lang.String value) {
    try {
      javonetHandle.set("ClientPath", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClientPath() {
    try {
      java.lang.String res = javonetHandle.get("ClientPath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setHash(java.lang.String value) {
    try {
      javonetHandle.set("Hash", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getHash() {
    try {
      java.lang.String res = javonetHandle.get("Hash");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public UpdateFile() {
    try {
      javonetHandle = Javonet.New("eBABrowserPluginHelper.PluginUpdaterWS.UpdateFile");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UpdateFile(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
