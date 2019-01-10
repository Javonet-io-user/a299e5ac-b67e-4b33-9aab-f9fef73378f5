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
import jio.System.*;
import jio.System.Collections.Generic.*;
import eBABrowserPluginHelper.BrowserAppWS.*;
import eBABrowserPluginHelper.PluginUpdaterWS.*;

public class Helper {
  protected NObject javonetHandle;

  public Helper() {
    try {
      javonetHandle = Javonet.New("eBABrowserPluginHelper.Helper");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Helper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static void UpdateAppTaskStatus(
      java.lang.String wsAddress,
      java.lang.Integer id,
      AppTaskStatus status,
      DateTime date,
      java.lang.String returnValue,
      java.lang.String errorMessage) {
    try {
      Javonet.getType("Helper")
          .invoke(
              "UpdateAppTaskStatus",
              wsAddress,
              id,
              NEnum.fromJavaEnum(status),
              date,
              returnValue,
              errorMessage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static Dictionary<java.lang.String, java.lang.String> GetTaskParameters(
      java.lang.String wsAddress, java.lang.Integer id, DateTime date) {
    try {
      Object res = Javonet.getType("Helper").invoke("GetTaskParameters", wsAddress, id, date);
      if (res == null) return null;
      return new Dictionary<java.lang.String, java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ModuleParameters GetPluginParameters(
      java.lang.String wsAddress, java.lang.String appName, java.lang.Integer taskId) {
    try {
      Object res =
          Javonet.getType("Helper").invoke("GetPluginParameters", wsAddress, appName, taskId);
      if (res == null) return null;
      return new ModuleParameters((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Dictionary<java.lang.String, java.lang.String> ConvertKeyValueItemListToDictionary(
      KeyValueItem[] prms) {
    try {
      Object res =
          Javonet.getType("Helper")
              .invoke("ConvertKeyValueItemListToDictionary", new Object[] {prms});
      if (res == null) return null;
      return new Dictionary<java.lang.String, java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static pluginupdater GetPluginUpdater(java.lang.String wsAddress) {
    try {
      Object res = Javonet.getType("Helper").invoke("GetPluginUpdater", wsAddress);
      if (res == null) return null;
      return new pluginupdater((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static UpdateFile[] GetUpdateFileNames(
      java.lang.String wsAddress, java.lang.String module, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("Helper").invoke("GetUpdateFileNames", wsAddress, module);
      if (res == null) return null;
      return (UpdateFile[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.Byte[] GetUpdateFile(
      java.lang.String wsAddress,
      java.lang.String module,
      java.lang.String fileName,
      Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("Helper").invoke("GetUpdateFile", wsAddress, module, fileName);
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
