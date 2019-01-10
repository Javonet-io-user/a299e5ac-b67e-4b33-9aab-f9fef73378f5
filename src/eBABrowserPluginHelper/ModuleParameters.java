package eBABrowserPluginHelper;

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
import eBABrowserPluginHelper.*;
import jio.System.Collections.Generic.*;
import eBABrowserPluginHelper.BrowserAppWS.*;

public class ModuleParameters {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setAppParameters(Dictionary<java.lang.String, java.lang.String> value) {
    try {
      javonetHandle.set("AppParameters", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Dictionary<java.lang.String, java.lang.String> getAppParameters() {
    try {
      Object res = javonetHandle.<NObject>get("AppParameters");
      if (res == null) return null;
      return new Dictionary<java.lang.String, java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setTaskParameters(Dictionary<java.lang.String, java.lang.String> value) {
    try {
      javonetHandle.set("TaskParameters", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Dictionary<java.lang.String, java.lang.String> getTaskParameters() {
    try {
      Object res = javonetHandle.<NObject>get("TaskParameters");
      if (res == null) return null;
      return new Dictionary<java.lang.String, java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ModuleParameters() {
    try {
      javonetHandle = Javonet.New("eBABrowserPluginHelper.ModuleParameters");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ModuleParameters(ModuleParameters prms) {
    try {
      javonetHandle = Javonet.New("eBABrowserPluginHelper.ModuleParameters", prms);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ModuleParameters(NObject handle) {
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
