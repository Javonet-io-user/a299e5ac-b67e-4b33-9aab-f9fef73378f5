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
import jio.System.IO.*;

public class ExportHelper {
  protected NObject javonetHandle;

  public ExportHelper() {
    try {
      javonetHandle = Javonet.New("eBABrowserPluginHelper.ExportHelper");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ExportHelper(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static ResponseMessage Download(java.lang.String url, java.lang.String filePath) {
    try {
      Object res = Javonet.getType("ExportHelper").invoke("Download", url, filePath);
      if (res == null) return null;
      return new ResponseMessage((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ResponseMessage Upload(
      java.lang.String wsAddress,
      java.lang.Boolean isRemote,
      java.lang.String filePath,
      java.lang.Long partSize,
      java.lang.String fileName) {
    try {
      Object res =
          Javonet.getType("ExportHelper")
              .invoke("Upload", wsAddress, isRemote, filePath, partSize, fileName);
      if (res == null) return null;
      return new ResponseMessage((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ResponseMessage Upload(
      java.lang.String wsAddress,
      java.lang.Boolean isRemote,
      MemoryStream stream,
      java.lang.Long partSize,
      java.lang.String fileName) {
    try {
      Object res =
          Javonet.getType("ExportHelper")
              .invoke("Upload", wsAddress, isRemote, stream, partSize, fileName);
      if (res == null) return null;
      return new ResponseMessage((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ResponseMessage Upload(
      java.lang.String wsAddress,
      java.lang.Boolean isRemote,
      java.lang.Byte[] data,
      java.lang.Long partSize,
      java.lang.String fileName) {
    try {
      Object res =
          Javonet.getType("ExportHelper")
              .invoke("Upload", wsAddress, isRemote, new Object[] {data}, partSize, fileName);
      if (res == null) return null;
      return new ResponseMessage((NObject) res);
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
