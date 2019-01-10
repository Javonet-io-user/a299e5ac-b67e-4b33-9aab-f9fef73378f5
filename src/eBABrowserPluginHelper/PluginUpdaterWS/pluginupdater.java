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
import jio.System.Web.Services.Protocols.*;
import eBABrowserPluginHelper.PluginUpdaterWS.*;
import jio.System.*;
import jio.System.ComponentModel.*;

public class pluginupdater extends SoapHttpClientProtocol implements IComponent, IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setUrl(java.lang.String value) {
    try {
      javonetHandle.set("Url", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getUrl() {
    try {
      java.lang.String res = javonetHandle.get("Url");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setUseDefaultCredentials(java.lang.Boolean value) {
    try {
      javonetHandle.set("UseDefaultCredentials", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getUseDefaultCredentials() {
    try {
      java.lang.Boolean res = javonetHandle.get("UseDefaultCredentials");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public pluginupdater() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("eBABrowserPluginHelper.PluginUpdaterWS.pluginupdater");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "GetUpdateFileNamesCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GetUpdateFileNamesCompletedEventHandler handler :
                  _GetUpdateFileNamesCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetUpdateFileNamesCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetUpdateFileCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GetUpdateFileCompletedEventHandler handler : _GetUpdateFileCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetUpdateFileCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public pluginupdater(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public UpdateFile[] GetUpdateFileNames(java.lang.String module, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetUpdateFileNames", module);
      if (res == null) return null;
      return (UpdateFile[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void GetUpdateFileNamesAsync(java.lang.String module) {
    try {
      javonetHandle.invoke("GetUpdateFileNamesAsync", module);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void GetUpdateFileNamesAsync(java.lang.String module, Object userState) {
    try {
      javonetHandle.invoke("GetUpdateFileNamesAsync", module, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Byte[] GetUpdateFile(
      java.lang.String module, java.lang.String fileName, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetUpdateFile", module, fileName);
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void GetUpdateFileAsync(java.lang.String module, java.lang.String fileName) {
    try {
      javonetHandle.invoke("GetUpdateFileAsync", module, fileName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void GetUpdateFileAsync(
      java.lang.String module, java.lang.String fileName, Object userState) {
    try {
      javonetHandle.invoke("GetUpdateFileAsync", module, fileName, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CancelAsync(Object userState) {
    try {
      javonetHandle.invoke("CancelAsync", userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<GetUpdateFileNamesCompletedEventHandler>
      _GetUpdateFileNamesCompletedListeners =
          new java.util.ArrayList<GetUpdateFileNamesCompletedEventHandler>();

  public void addGetUpdateFileNamesCompleted(GetUpdateFileNamesCompletedEventHandler toAdd) {
    _GetUpdateFileNamesCompletedListeners.add(toAdd);
  }

  public void removeGetUpdateFileNamesCompleted(GetUpdateFileNamesCompletedEventHandler toRemove) {
    _GetUpdateFileNamesCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<GetUpdateFileCompletedEventHandler> _GetUpdateFileCompletedListeners =
      new java.util.ArrayList<GetUpdateFileCompletedEventHandler>();

  public void addGetUpdateFileCompleted(GetUpdateFileCompletedEventHandler toAdd) {
    _GetUpdateFileCompletedListeners.add(toAdd);
  }

  public void removeGetUpdateFileCompleted(GetUpdateFileCompletedEventHandler toRemove) {
    _GetUpdateFileCompletedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
