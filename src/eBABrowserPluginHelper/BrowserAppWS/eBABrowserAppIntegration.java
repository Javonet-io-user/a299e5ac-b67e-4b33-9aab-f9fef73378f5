package eBABrowserPluginHelper.BrowserAppWS;

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
import eBABrowserPluginHelper.BrowserAppWS.*;
import jio.System.*;
import jio.System.ComponentModel.*;

public class eBABrowserAppIntegration extends SoapHttpClientProtocol
    implements IComponent, IDisposable {
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

  public eBABrowserAppIntegration() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("eBABrowserPluginHelper.BrowserAppWS.eBABrowserAppIntegration");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "UpdateTaskStatusCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (UpdateTaskStatusCompletedEventHandler handler :
                  _UpdateTaskStatusCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTaskParametersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GetTaskParametersCompletedEventHandler handler :
                  _GetTaskParametersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTaskParametersCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetModuleParametersCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GetModuleParametersCompletedEventHandler handler :
                  _GetModuleParametersCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetModuleParametersCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public eBABrowserAppIntegration(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void UpdateTaskStatus(
      java.lang.String encryptedParameters,
      java.lang.Integer status,
      java.lang.String returnValue,
      java.lang.String errorMessage) {
    try {
      javonetHandle.invoke(
          "UpdateTaskStatus", encryptedParameters, status, returnValue, errorMessage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UpdateTaskStatusAsync(
      java.lang.String encryptedParameters,
      java.lang.Integer status,
      java.lang.String returnValue,
      java.lang.String errorMessage) {
    try {
      javonetHandle.invoke(
          "UpdateTaskStatusAsync", encryptedParameters, status, returnValue, errorMessage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UpdateTaskStatusAsync(
      java.lang.String encryptedParameters,
      java.lang.Integer status,
      java.lang.String returnValue,
      java.lang.String errorMessage,
      Object userState) {
    try {
      javonetHandle.invoke(
          "UpdateTaskStatusAsync",
          encryptedParameters,
          status,
          returnValue,
          errorMessage,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public KeyValueItem[] GetTaskParameters(
      java.lang.String encryptedParameters, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetTaskParameters", encryptedParameters);
      if (res == null) return null;
      return (KeyValueItem[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void GetTaskParametersAsync(java.lang.String encryptedParameters) {
    try {
      javonetHandle.invoke("GetTaskParametersAsync", encryptedParameters);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void GetTaskParametersAsync(java.lang.String encryptedParameters, Object userState) {
    try {
      javonetHandle.invoke("GetTaskParametersAsync", encryptedParameters, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public ModuleParameters GetModuleParameters(
      java.lang.String moduleName, java.lang.Integer taskId) {
    try {
      Object res = javonetHandle.invoke("GetModuleParameters", moduleName, taskId);
      if (res == null) return null;
      return new ModuleParameters((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void GetModuleParametersAsync(java.lang.String moduleName, java.lang.Integer taskId) {
    try {
      javonetHandle.invoke("GetModuleParametersAsync", moduleName, taskId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void GetModuleParametersAsync(
      java.lang.String moduleName, java.lang.Integer taskId, Object userState) {
    try {
      javonetHandle.invoke("GetModuleParametersAsync", moduleName, taskId, userState);
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

  private java.util.ArrayList<UpdateTaskStatusCompletedEventHandler>
      _UpdateTaskStatusCompletedListeners =
          new java.util.ArrayList<UpdateTaskStatusCompletedEventHandler>();

  public void addUpdateTaskStatusCompleted(UpdateTaskStatusCompletedEventHandler toAdd) {
    _UpdateTaskStatusCompletedListeners.add(toAdd);
  }

  public void removeUpdateTaskStatusCompleted(UpdateTaskStatusCompletedEventHandler toRemove) {
    _UpdateTaskStatusCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<GetTaskParametersCompletedEventHandler>
      _GetTaskParametersCompletedListeners =
          new java.util.ArrayList<GetTaskParametersCompletedEventHandler>();

  public void addGetTaskParametersCompleted(GetTaskParametersCompletedEventHandler toAdd) {
    _GetTaskParametersCompletedListeners.add(toAdd);
  }

  public void removeGetTaskParametersCompleted(GetTaskParametersCompletedEventHandler toRemove) {
    _GetTaskParametersCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<GetModuleParametersCompletedEventHandler>
      _GetModuleParametersCompletedListeners =
          new java.util.ArrayList<GetModuleParametersCompletedEventHandler>();

  public void addGetModuleParametersCompleted(GetModuleParametersCompletedEventHandler toAdd) {
    _GetModuleParametersCompletedListeners.add(toAdd);
  }

  public void removeGetModuleParametersCompleted(
      GetModuleParametersCompletedEventHandler toRemove) {
    _GetModuleParametersCompletedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
