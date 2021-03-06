package typings.winrtUwp.global.Windows.Gaming

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.System.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Gaming.XboxLive")
@js.native
object XboxLive extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object Storage extends js.Object {
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveBlobGetResult ()
      extends typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobGetResult {
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var status: GameSaveErrorStatus = js.native
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var value: IMapView[String, IBuffer] = js.native
    }
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveBlobInfo ()
      extends typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfo {
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var name: String = js.native
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var size: Double = js.native
    }
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveBlobInfoGetResult ()
      extends typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoGetResult {
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var status: GameSaveErrorStatus = js.native
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var value: IVectorView[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfo] = js.native
    }
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveBlobInfoQuery ()
      extends typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoQuery
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveContainer ()
      extends typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainer {
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var name: String = js.native
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var provider: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProvider = js.native
      /**
        * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param blobNamePrefix This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        */
      /* CompleteClass */
      override def createBlobInfoQuery(blobNamePrefix: String): typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoQuery = js.native
      /**
        * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param blobsToRead This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        */
      /* CompleteClass */
      override def getAsync(blobsToRead: IIterable[String]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobGetResult] = js.native
      /**
        * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param blobsToRead This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        */
      /* CompleteClass */
      override def readAsync(blobsToRead: IMapView[String, IBuffer]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveOperationResult] = js.native
      /**
        * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param blobsToWrite This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param blobsToDelete This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param displayName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        */
      /* CompleteClass */
      override def submitPropertySetUpdatesAsync(blobsToWrite: IPropertySet, blobsToDelete: IIterable[String], displayName: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveOperationResult] = js.native
      /**
        * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param blobsToWrite This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param blobsToDelete This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param displayName This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        */
      /* CompleteClass */
      override def submitUpdatesAsync(blobsToWrite: IMapView[String, IBuffer], blobsToDelete: IIterable[String], displayName: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveOperationResult] = js.native
    }
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveContainerInfo ()
      extends typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfo {
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var displayName: String = js.native
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var lastModifiedTime: Date = js.native
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var name: String = js.native
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var needsSync: Boolean = js.native
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var totalSize: Double = js.native
    }
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveContainerInfoGetResult ()
      extends typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoGetResult {
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var status: GameSaveErrorStatus = js.native
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var value: IVectorView[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfo] = js.native
    }
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveContainerInfoQuery ()
      extends typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoQuery
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveOperationResult ()
      extends typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveOperationResult {
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var status: GameSaveErrorStatus = js.native
    }
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveProvider ()
      extends typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProvider
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveProviderGetResult ()
      extends typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult {
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var status: GameSaveErrorStatus = js.native
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      /* CompleteClass */
      override var value: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProvider = js.native
    }
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    object GameSaveErrorStatus extends js.Object {
      /* 1 */ val abort: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.abort with Double = js.native
      /* 9 */ val blobNotFound: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.blobNotFound with Double = js.native
      /* 11 */ val containerNotInSync: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.containerNotInSync with Double = js.native
      /* 12 */ val containerSyncFailed: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.containerSyncFailed with Double = js.native
      /* 2 */ val invalidContainerName: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.invalidContainerName with Double = js.native
      /* 3 */ val noAccess: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.noAccess with Double = js.native
      /* 10 */ val noXboxLiveInfo: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.noXboxLiveInfo with Double = js.native
      /* 14 */ val objectExpired: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.objectExpired with Double = js.native
      /* 0 */ val ok: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.ok with Double = js.native
      /* 4 */ val outOfLocalStorage: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.outOfLocalStorage with Double = js.native
      /* 8 */ val providedBufferTooSmall: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.providedBufferTooSmall with Double = js.native
      /* 7 */ val quotaExceeded: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.quotaExceeded with Double = js.native
      /* 6 */ val updateTooBig: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.updateTooBig with Double = js.native
      /* 5 */ val userCanceled: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.userCanceled with Double = js.native
      /* 13 */ val userHasNoXboxLiveInfo: typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.userHasNoXboxLiveInfo with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus with Double] = js.native
    }
    
    /* static members */
    @js.native
    object GameSaveProvider extends js.Object {
      /**
        * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param user This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param serviceConfigId This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        */
      def getForUserAsync(user: User, serviceConfigId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult] = js.native
      /**
        * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param user This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param serviceConfigId This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        */
      def getSyncOnDemandForUserAsync(user: User, serviceConfigId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult] = js.native
    }
    
  }
  
}

