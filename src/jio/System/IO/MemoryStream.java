package jio.System.IO;

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
import jio.System.IO.*;
import jio.System.*;

public class MemoryStream extends Stream implements IDisposable {
  protected NObject javonetHandle;

  public MemoryStream() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.MemoryStream");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MemoryStream(java.lang.Integer capacity) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.MemoryStream", capacity);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MemoryStream(java.lang.Byte[] buffer) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.MemoryStream", new Object[] {buffer});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MemoryStream(java.lang.Byte[] buffer, java.lang.Boolean writable) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.MemoryStream", new Object[] {buffer}, writable);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MemoryStream(java.lang.Byte[] buffer, java.lang.Integer index, java.lang.Integer count) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.IO.MemoryStream", new Object[] {buffer}, index, count);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MemoryStream(
      java.lang.Byte[] buffer,
      java.lang.Integer index,
      java.lang.Integer count,
      java.lang.Boolean writable) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.IO.MemoryStream", new Object[] {buffer}, index, count, writable);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MemoryStream(
      java.lang.Byte[] buffer,
      java.lang.Integer index,
      java.lang.Integer count,
      java.lang.Boolean writable,
      java.lang.Boolean publiclyVisible) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.IO.MemoryStream",
              new Object[] {buffer},
              index,
              count,
              writable,
              publiclyVisible);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MemoryStream(NObject handle) {
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
