package eBABrowserPluginHelper.PluginDMWS;

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
import eBABrowserPluginHelper.PluginDMWS.*;
import jio.System.*;
import jio.System.ComponentModel.*;

public class ws extends SoapHttpClientProtocol implements IComponent, IDisposable {
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

  public ws() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("eBABrowserPluginHelper.PluginDMWS.ws");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "DownloadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DownloadCompletedEventHandler handler : _DownloadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadRemoteCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DownloadRemoteCompletedEventHandler handler :
                  _DownloadRemoteCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadRemoteCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UploadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (UploadCompletedEventHandler handler : _UploadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UploadFromTempCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (UploadFromTempCompletedEventHandler handler :
                  _UploadFromTempCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetTempFilenameCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GetTempFilenameCompletedEventHandler handler :
                  _GetTempFilenameCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetTempFilenameCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteTempFolderCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DeleteTempFolderCompletedEventHandler handler :
                  _DeleteTempFolderCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CreateZipFileCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (CreateZipFileCompletedEventHandler handler : _CreateZipFileCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CreateZipFileCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CheckStatusZipFileCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (CheckStatusZipFileCompletedEventHandler handler :
                  _CheckStatusZipFileCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CheckStatusZipFileCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UploadFromBrowserPluginCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (UploadFromBrowserPluginCompletedEventHandler handler :
                  _UploadFromBrowserPluginCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DeleteFileDataPartsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DeleteFileDataPartsCompletedEventHandler handler :
                  _DeleteFileDataPartsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "GetFileDataPartsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (GetFileDataPartsCompletedEventHandler handler :
                  _GetFileDataPartsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], GetFileDataPartsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "UploadFilePartCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (UploadFilePartCompletedEventHandler handler :
                  _UploadFilePartCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadFilePartCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CreateFileFromPartsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (CreateFileFromPartsCompletedEventHandler handler :
                  _CreateFileFromPartsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CreateFileFromPartsCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "CreateFileContentFromPartsCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (CreateFileContentFromPartsCompletedEventHandler handler :
                  _CreateFileContentFromPartsCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CreateFileContentFromPartsCompletedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ws(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Byte[] Download(
      java.lang.String token,
      java.lang.String key,
      java.lang.Integer libraryId,
      java.lang.Integer dataId,
      java.lang.Integer partNo,
      StorageConfig storage,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle.invoke("Download", token, key, libraryId, dataId, partNo, storage);
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void DownloadAsync(
      java.lang.String token,
      java.lang.String key,
      java.lang.Integer libraryId,
      java.lang.Integer dataId,
      java.lang.Integer partNo,
      StorageConfig storage) {
    try {
      javonetHandle.invoke("DownloadAsync", token, key, libraryId, dataId, partNo, storage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DownloadAsync(
      java.lang.String token,
      java.lang.String key,
      java.lang.Integer libraryId,
      java.lang.Integer dataId,
      java.lang.Integer partNo,
      StorageConfig storage,
      Object userState) {
    try {
      javonetHandle.invoke(
          "DownloadAsync", token, key, libraryId, dataId, partNo, storage, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Byte[] DownloadRemote(
      java.lang.String token,
      java.lang.String key,
      java.lang.Integer libraryId,
      java.lang.Integer dataId,
      java.lang.Integer partNo,
      StorageConfig storage,
      StorageConfig destinationStorage,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle.invoke(
              "DownloadRemote", token, key, libraryId, dataId, partNo, storage, destinationStorage);
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void DownloadRemoteAsync(
      java.lang.String token,
      java.lang.String key,
      java.lang.Integer libraryId,
      java.lang.Integer dataId,
      java.lang.Integer partNo,
      StorageConfig storage,
      StorageConfig destinationStorage) {
    try {
      javonetHandle.invoke(
          "DownloadRemoteAsync",
          token,
          key,
          libraryId,
          dataId,
          partNo,
          storage,
          destinationStorage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DownloadRemoteAsync(
      java.lang.String token,
      java.lang.String key,
      java.lang.Integer libraryId,
      java.lang.Integer dataId,
      java.lang.Integer partNo,
      StorageConfig storage,
      StorageConfig destinationStorage,
      Object userState) {
    try {
      javonetHandle.invoke(
          "DownloadRemoteAsync",
          token,
          key,
          libraryId,
          dataId,
          partNo,
          storage,
          destinationStorage,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Upload(
      java.lang.String token,
      java.lang.String key,
      java.lang.Integer libraryId,
      java.lang.Integer dataId,
      java.lang.Integer partNo,
      java.lang.Byte[] data,
      StorageConfig storage) {
    try {
      javonetHandle.invoke(
          "Upload", token, key, libraryId, dataId, partNo, new Object[] {data}, storage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UploadAsync(
      java.lang.String token,
      java.lang.String key,
      java.lang.Integer libraryId,
      java.lang.Integer dataId,
      java.lang.Integer partNo,
      java.lang.Byte[] data,
      StorageConfig storage) {
    try {
      javonetHandle.invoke(
          "UploadAsync", token, key, libraryId, dataId, partNo, new Object[] {data}, storage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UploadAsync(
      java.lang.String token,
      java.lang.String key,
      java.lang.Integer libraryId,
      java.lang.Integer dataId,
      java.lang.Integer partNo,
      java.lang.Byte[] data,
      StorageConfig storage,
      Object userState) {
    try {
      javonetHandle.invoke(
          "UploadAsync",
          token,
          key,
          libraryId,
          dataId,
          partNo,
          new Object[] {data},
          storage,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UploadFromTemp(
      java.lang.String token,
      java.lang.String key,
      java.lang.String dmPath,
      java.lang.String tempFileName,
      java.lang.String tempFolderId,
      java.lang.String extension,
      java.lang.String userId) {
    try {
      javonetHandle.invoke(
          "UploadFromTemp", token, key, dmPath, tempFileName, tempFolderId, extension, userId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UploadFromTempAsync(
      java.lang.String token,
      java.lang.String key,
      java.lang.String dmPath,
      java.lang.String tempFileName,
      java.lang.String tempFolderId,
      java.lang.String extension,
      java.lang.String userId) {
    try {
      javonetHandle.invoke(
          "UploadFromTempAsync", token, key, dmPath, tempFileName, tempFolderId, extension, userId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UploadFromTempAsync(
      java.lang.String token,
      java.lang.String key,
      java.lang.String dmPath,
      java.lang.String tempFileName,
      java.lang.String tempFolderId,
      java.lang.String extension,
      java.lang.String userId,
      Object userState) {
    try {
      javonetHandle.invoke(
          "UploadFromTempAsync",
          token,
          key,
          dmPath,
          tempFileName,
          tempFolderId,
          extension,
          userId,
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String GetTempFilename(java.lang.String tempFileId) {
    try {
      java.lang.String res = javonetHandle.invoke("GetTempFilename", tempFileId);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void GetTempFilenameAsync(java.lang.String tempFileId) {
    try {
      javonetHandle.invoke("GetTempFilenameAsync", tempFileId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void GetTempFilenameAsync(java.lang.String tempFileId, Object userState) {
    try {
      javonetHandle.invoke("GetTempFilenameAsync", tempFileId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DeleteTempFolder(
      java.lang.String token, java.lang.String key, java.lang.String tempFolderId) {
    try {
      javonetHandle.invoke("DeleteTempFolder", token, key, tempFolderId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DeleteTempFolderAsync(
      java.lang.String token, java.lang.String key, java.lang.String tempFolderId) {
    try {
      javonetHandle.invoke("DeleteTempFolderAsync", token, key, tempFolderId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DeleteTempFolderAsync(
      java.lang.String token,
      java.lang.String key,
      java.lang.String tempFolderId,
      Object userState) {
    try {
      javonetHandle.invoke("DeleteTempFolderAsync", token, key, tempFolderId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String CreateZipFile(
      java.lang.String token,
      java.lang.String key,
      ServiceDownloadDMObject[] objects,
      java.lang.String userId) {
    try {
      java.lang.String res =
          javonetHandle.invoke("CreateZipFile", token, key, new Object[] {objects}, userId);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void CreateZipFileAsync(
      java.lang.String token,
      java.lang.String key,
      ServiceDownloadDMObject[] objects,
      java.lang.String userId) {
    try {
      javonetHandle.invoke("CreateZipFileAsync", token, key, new Object[] {objects}, userId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CreateZipFileAsync(
      java.lang.String token,
      java.lang.String key,
      ServiceDownloadDMObject[] objects,
      java.lang.String userId,
      Object userState) {
    try {
      javonetHandle.invoke(
          "CreateZipFileAsync", token, key, new Object[] {objects}, userId, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public ServiceDownloadTaskStatus CheckStatusZipFile(
      java.lang.String token, java.lang.String key, java.lang.String param) {
    try {
      Object res = javonetHandle.invoke("CheckStatusZipFile", token, key, param);
      if (res == null) return null;
      return new ServiceDownloadTaskStatus((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void CheckStatusZipFileAsync(
      java.lang.String token, java.lang.String key, java.lang.String param) {
    try {
      javonetHandle.invoke("CheckStatusZipFileAsync", token, key, param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CheckStatusZipFileAsync(
      java.lang.String token, java.lang.String key, java.lang.String param, Object userState) {
    try {
      javonetHandle.invoke("CheckStatusZipFileAsync", token, key, param, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UploadFromBrowserPlugin(
      java.lang.String token,
      java.lang.String tempFileId,
      java.lang.String filename,
      java.lang.Integer partNo,
      java.lang.Integer partCount,
      java.lang.Byte[] data) {
    try {
      javonetHandle.invoke(
          "UploadFromBrowserPlugin",
          token,
          tempFileId,
          filename,
          partNo,
          partCount,
          new Object[] {data});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UploadFromBrowserPluginAsync(
      java.lang.String token,
      java.lang.String tempFileId,
      java.lang.String filename,
      java.lang.Integer partNo,
      java.lang.Integer partCount,
      java.lang.Byte[] data) {
    try {
      javonetHandle.invoke(
          "UploadFromBrowserPluginAsync",
          token,
          tempFileId,
          filename,
          partNo,
          partCount,
          new Object[] {data});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UploadFromBrowserPluginAsync(
      java.lang.String token,
      java.lang.String tempFileId,
      java.lang.String filename,
      java.lang.Integer partNo,
      java.lang.Integer partCount,
      java.lang.Byte[] data,
      Object userState) {
    try {
      javonetHandle.invoke(
          "UploadFromBrowserPluginAsync",
          token,
          tempFileId,
          filename,
          partNo,
          partCount,
          new Object[] {data},
          userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DeleteFileDataParts(
      java.lang.String token,
      java.lang.String key,
      java.lang.Integer libraryId,
      java.lang.Integer dataId,
      StorageConfig storage) {
    try {
      javonetHandle.invoke("DeleteFileDataParts", token, key, libraryId, dataId, storage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DeleteFileDataPartsAsync(
      java.lang.String token,
      java.lang.String key,
      java.lang.Integer libraryId,
      java.lang.Integer dataId,
      StorageConfig storage) {
    try {
      javonetHandle.invoke("DeleteFileDataPartsAsync", token, key, libraryId, dataId, storage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DeleteFileDataPartsAsync(
      java.lang.String token,
      java.lang.String key,
      java.lang.Integer libraryId,
      java.lang.Integer dataId,
      StorageConfig storage,
      Object userState) {
    try {
      javonetHandle.invoke(
          "DeleteFileDataPartsAsync", token, key, libraryId, dataId, storage, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Byte[] GetFileDataParts(
      java.lang.String token,
      java.lang.String key,
      java.lang.Integer libraryId,
      java.lang.Integer dataId,
      StorageConfig storage,
      Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle.invoke("GetFileDataParts", token, key, libraryId, dataId, storage);
      if (res == null) return null;
      return (java.lang.Byte[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void GetFileDataPartsAsync(
      java.lang.String token,
      java.lang.String key,
      java.lang.Integer libraryId,
      java.lang.Integer dataId,
      StorageConfig storage) {
    try {
      javonetHandle.invoke("GetFileDataPartsAsync", token, key, libraryId, dataId, storage);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void GetFileDataPartsAsync(
      java.lang.String token,
      java.lang.String key,
      java.lang.Integer libraryId,
      java.lang.Integer dataId,
      StorageConfig storage,
      Object userState) {
    try {
      javonetHandle.invoke(
          "GetFileDataPartsAsync", token, key, libraryId, dataId, storage, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean UploadFilePart(
      java.lang.String token,
      java.lang.String tempFileId,
      java.lang.String filename,
      java.lang.Byte[] data) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke("UploadFilePart", token, tempFileId, filename, new Object[] {data});
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void UploadFilePartAsync(
      java.lang.String token,
      java.lang.String tempFileId,
      java.lang.String filename,
      java.lang.Byte[] data) {
    try {
      javonetHandle.invoke("UploadFilePartAsync", token, tempFileId, filename, new Object[] {data});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UploadFilePartAsync(
      java.lang.String token,
      java.lang.String tempFileId,
      java.lang.String filename,
      java.lang.Byte[] data,
      Object userState) {
    try {
      javonetHandle.invoke(
          "UploadFilePartAsync", token, tempFileId, filename, new Object[] {data}, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean CreateFileFromParts(
      java.lang.String userId, java.lang.String tempFileId, java.lang.String dmpath) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke("CreateFileFromParts", userId, tempFileId, dmpath);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void CreateFileFromPartsAsync(
      java.lang.String userId, java.lang.String tempFileId, java.lang.String dmpath) {
    try {
      javonetHandle.invoke("CreateFileFromPartsAsync", userId, tempFileId, dmpath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CreateFileFromPartsAsync(
      java.lang.String userId,
      java.lang.String tempFileId,
      java.lang.String dmpath,
      Object userState) {
    try {
      javonetHandle.invoke("CreateFileFromPartsAsync", userId, tempFileId, dmpath, userState);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean CreateFileContentFromParts(
      java.lang.String userId,
      java.lang.String tempFileId,
      java.lang.String parentFilePath,
      java.lang.String contentName) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke(
              "CreateFileContentFromParts", userId, tempFileId, parentFilePath, contentName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void CreateFileContentFromPartsAsync(
      java.lang.String userId,
      java.lang.String tempFileId,
      java.lang.String parentFilePath,
      java.lang.String contentName) {
    try {
      javonetHandle.invoke(
          "CreateFileContentFromPartsAsync", userId, tempFileId, parentFilePath, contentName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CreateFileContentFromPartsAsync(
      java.lang.String userId,
      java.lang.String tempFileId,
      java.lang.String parentFilePath,
      java.lang.String contentName,
      Object userState) {
    try {
      javonetHandle.invoke(
          "CreateFileContentFromPartsAsync",
          userId,
          tempFileId,
          parentFilePath,
          contentName,
          userState);
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

  private java.util.ArrayList<DownloadCompletedEventHandler> _DownloadCompletedListeners =
      new java.util.ArrayList<DownloadCompletedEventHandler>();

  public void addDownloadCompleted(DownloadCompletedEventHandler toAdd) {
    _DownloadCompletedListeners.add(toAdd);
  }

  public void removeDownloadCompleted(DownloadCompletedEventHandler toRemove) {
    _DownloadCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DownloadRemoteCompletedEventHandler>
      _DownloadRemoteCompletedListeners =
          new java.util.ArrayList<DownloadRemoteCompletedEventHandler>();

  public void addDownloadRemoteCompleted(DownloadRemoteCompletedEventHandler toAdd) {
    _DownloadRemoteCompletedListeners.add(toAdd);
  }

  public void removeDownloadRemoteCompleted(DownloadRemoteCompletedEventHandler toRemove) {
    _DownloadRemoteCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<UploadCompletedEventHandler> _UploadCompletedListeners =
      new java.util.ArrayList<UploadCompletedEventHandler>();

  public void addUploadCompleted(UploadCompletedEventHandler toAdd) {
    _UploadCompletedListeners.add(toAdd);
  }

  public void removeUploadCompleted(UploadCompletedEventHandler toRemove) {
    _UploadCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<UploadFromTempCompletedEventHandler>
      _UploadFromTempCompletedListeners =
          new java.util.ArrayList<UploadFromTempCompletedEventHandler>();

  public void addUploadFromTempCompleted(UploadFromTempCompletedEventHandler toAdd) {
    _UploadFromTempCompletedListeners.add(toAdd);
  }

  public void removeUploadFromTempCompleted(UploadFromTempCompletedEventHandler toRemove) {
    _UploadFromTempCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<GetTempFilenameCompletedEventHandler>
      _GetTempFilenameCompletedListeners =
          new java.util.ArrayList<GetTempFilenameCompletedEventHandler>();

  public void addGetTempFilenameCompleted(GetTempFilenameCompletedEventHandler toAdd) {
    _GetTempFilenameCompletedListeners.add(toAdd);
  }

  public void removeGetTempFilenameCompleted(GetTempFilenameCompletedEventHandler toRemove) {
    _GetTempFilenameCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DeleteTempFolderCompletedEventHandler>
      _DeleteTempFolderCompletedListeners =
          new java.util.ArrayList<DeleteTempFolderCompletedEventHandler>();

  public void addDeleteTempFolderCompleted(DeleteTempFolderCompletedEventHandler toAdd) {
    _DeleteTempFolderCompletedListeners.add(toAdd);
  }

  public void removeDeleteTempFolderCompleted(DeleteTempFolderCompletedEventHandler toRemove) {
    _DeleteTempFolderCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<CreateZipFileCompletedEventHandler> _CreateZipFileCompletedListeners =
      new java.util.ArrayList<CreateZipFileCompletedEventHandler>();

  public void addCreateZipFileCompleted(CreateZipFileCompletedEventHandler toAdd) {
    _CreateZipFileCompletedListeners.add(toAdd);
  }

  public void removeCreateZipFileCompleted(CreateZipFileCompletedEventHandler toRemove) {
    _CreateZipFileCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<CheckStatusZipFileCompletedEventHandler>
      _CheckStatusZipFileCompletedListeners =
          new java.util.ArrayList<CheckStatusZipFileCompletedEventHandler>();

  public void addCheckStatusZipFileCompleted(CheckStatusZipFileCompletedEventHandler toAdd) {
    _CheckStatusZipFileCompletedListeners.add(toAdd);
  }

  public void removeCheckStatusZipFileCompleted(CheckStatusZipFileCompletedEventHandler toRemove) {
    _CheckStatusZipFileCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<UploadFromBrowserPluginCompletedEventHandler>
      _UploadFromBrowserPluginCompletedListeners =
          new java.util.ArrayList<UploadFromBrowserPluginCompletedEventHandler>();

  public void addUploadFromBrowserPluginCompleted(
      UploadFromBrowserPluginCompletedEventHandler toAdd) {
    _UploadFromBrowserPluginCompletedListeners.add(toAdd);
  }

  public void removeUploadFromBrowserPluginCompleted(
      UploadFromBrowserPluginCompletedEventHandler toRemove) {
    _UploadFromBrowserPluginCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DeleteFileDataPartsCompletedEventHandler>
      _DeleteFileDataPartsCompletedListeners =
          new java.util.ArrayList<DeleteFileDataPartsCompletedEventHandler>();

  public void addDeleteFileDataPartsCompleted(DeleteFileDataPartsCompletedEventHandler toAdd) {
    _DeleteFileDataPartsCompletedListeners.add(toAdd);
  }

  public void removeDeleteFileDataPartsCompleted(
      DeleteFileDataPartsCompletedEventHandler toRemove) {
    _DeleteFileDataPartsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<GetFileDataPartsCompletedEventHandler>
      _GetFileDataPartsCompletedListeners =
          new java.util.ArrayList<GetFileDataPartsCompletedEventHandler>();

  public void addGetFileDataPartsCompleted(GetFileDataPartsCompletedEventHandler toAdd) {
    _GetFileDataPartsCompletedListeners.add(toAdd);
  }

  public void removeGetFileDataPartsCompleted(GetFileDataPartsCompletedEventHandler toRemove) {
    _GetFileDataPartsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<UploadFilePartCompletedEventHandler>
      _UploadFilePartCompletedListeners =
          new java.util.ArrayList<UploadFilePartCompletedEventHandler>();

  public void addUploadFilePartCompleted(UploadFilePartCompletedEventHandler toAdd) {
    _UploadFilePartCompletedListeners.add(toAdd);
  }

  public void removeUploadFilePartCompleted(UploadFilePartCompletedEventHandler toRemove) {
    _UploadFilePartCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<CreateFileFromPartsCompletedEventHandler>
      _CreateFileFromPartsCompletedListeners =
          new java.util.ArrayList<CreateFileFromPartsCompletedEventHandler>();

  public void addCreateFileFromPartsCompleted(CreateFileFromPartsCompletedEventHandler toAdd) {
    _CreateFileFromPartsCompletedListeners.add(toAdd);
  }

  public void removeCreateFileFromPartsCompleted(
      CreateFileFromPartsCompletedEventHandler toRemove) {
    _CreateFileFromPartsCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<CreateFileContentFromPartsCompletedEventHandler>
      _CreateFileContentFromPartsCompletedListeners =
          new java.util.ArrayList<CreateFileContentFromPartsCompletedEventHandler>();

  public void addCreateFileContentFromPartsCompleted(
      CreateFileContentFromPartsCompletedEventHandler toAdd) {
    _CreateFileContentFromPartsCompletedListeners.add(toAdd);
  }

  public void removeCreateFileContentFromPartsCompleted(
      CreateFileContentFromPartsCompletedEventHandler toRemove) {
    _CreateFileContentFromPartsCompletedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
