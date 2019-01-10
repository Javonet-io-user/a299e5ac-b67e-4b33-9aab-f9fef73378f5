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
import jio.System.ComponentModel.*;
import eBABrowserPluginHelper.BrowserAppWS.*;

public class GetModuleParametersCompletedEventArgs extends AsyncCompletedEventArgs {
  protected NObject javonetHandle;
  /** GetProperty */
  public ModuleParameters getResult() {
    try {
      Object res = javonetHandle.<NObject>get("Result");
      if (res == null) return null;
      return new ModuleParameters((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public GetModuleParametersCompletedEventArgs(NObject handle) {
    super(handle);
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
