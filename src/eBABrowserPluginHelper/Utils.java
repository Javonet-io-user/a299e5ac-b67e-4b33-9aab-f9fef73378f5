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

public class Utils {
  protected NObject javonetHandle;

  public Utils() {
    try {
      javonetHandle = Javonet.New("eBABrowserPluginHelper.Utils");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Utils(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static Dictionary<java.lang.String, java.lang.String> ParseUrl(java.lang.String[] args) {
    try {
      Object res = Javonet.getType("Utils").invoke("ParseUrl", new Object[] {args});
      if (res == null) return null;
      return new Dictionary<java.lang.String, java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.String ConvertCommandParameter(
      Dictionary<java.lang.String, java.lang.String> parameters) {
    try {
      java.lang.String res = Javonet.getType("Utils").invoke("ConvertCommandParameter", parameters);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static Dictionary<java.lang.String, java.lang.String> ParseCommandParameter(
      java.lang.String parameter) {
    try {
      Object res = Javonet.getType("Utils").invoke("ParseCommandParameter", parameter);
      if (res == null) return null;
      return new Dictionary<java.lang.String, java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.String UrlDecode(java.lang.String url) {
    try {
      java.lang.String res = Javonet.getType("Utils").invoke("UrlDecode", url);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
