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

public class ResponseMessage {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setStatus(java.lang.String value) {
    try {
      javonetHandle.set("Status", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getStatus() {
    try {
      java.lang.String res = javonetHandle.get("Status");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMessage(java.lang.String value) {
    try {
      javonetHandle.set("Message", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMessage() {
    try {
      java.lang.String res = javonetHandle.get("Message");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setUploadedFiles(List<UploadedFile> value) {
    try {
      javonetHandle.set("UploadedFiles", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public List<UploadedFile> getUploadedFiles() {
    try {
      Object res = javonetHandle.<NObject>get("UploadedFiles");
      if (res == null) return null;
      return new List<UploadedFile>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ResponseMessage() {
    try {
      javonetHandle = Javonet.New("eBABrowserPluginHelper.ResponseMessage");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ResponseMessage(NObject handle) {
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
