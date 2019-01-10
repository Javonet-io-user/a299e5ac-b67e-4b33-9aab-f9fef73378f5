package eBABrowserPluginHelper.PluginDMWSRemote;

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
import eBABrowserPluginHelper.PluginDMWSRemote.*;

public class ServiceDownloadTaskStatus {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setStatus(ServiceDownloadTaskStatusType value) {
    try {
      javonetHandle.set("Status", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ServiceDownloadTaskStatusType getStatus() {
    try {
      Object res = javonetHandle.<NEnum>get("Status");
      if (res == null) return null;
      return ServiceDownloadTaskStatusType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDownloadUrl(java.lang.String value) {
    try {
      javonetHandle.set("DownloadUrl", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDownloadUrl() {
    try {
      java.lang.String res = javonetHandle.get("DownloadUrl");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setErrorMessage(java.lang.String value) {
    try {
      javonetHandle.set("ErrorMessage", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getErrorMessage() {
    try {
      java.lang.String res = javonetHandle.get("ErrorMessage");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public ServiceDownloadTaskStatus() {
    try {
      javonetHandle =
          Javonet.New("eBABrowserPluginHelper.PluginDMWSRemote.ServiceDownloadTaskStatus");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ServiceDownloadTaskStatus(NObject handle) {
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
