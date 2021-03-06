package typings.winrtUwp.global.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundDownloadProgress
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs an asynchronous download operation. The Background Transfer sample demonstrates this functionality. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
@JSGlobal("Windows.Networking.BackgroundTransfer.DownloadOperation")
@js.native
abstract class DownloadOperation ()
  extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation {
  /** Gets and sets the cost policy for the download. */
  /* CompleteClass */
  override var costPolicy: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy = js.native
  /** Gets a string value indicating the group the transfer belongs to. */
  /* CompleteClass */
  override var group: String = js.native
  /** This is a unique identifier for a specific download operation. A GUID associated to a download operation will not change for the duration of the download. */
  /* CompleteClass */
  override var guid: String = js.native
  /** Gets the method to use for the download. */
  /* CompleteClass */
  override var method: String = js.native
  /** Gets or sets the transfer priority of this download operation when within a BackgroundTransferGroup . Possible values are defined by BackgroundTransferPriority . */
  /* CompleteClass */
  override var priority: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferPriority = js.native
  /** Gets the current progress of the upload operation. */
  /* CompleteClass */
  override var progress: BackgroundDownloadProgress = js.native
  /** Gets the URI from which to download the file. */
  /* CompleteClass */
  override var requestedUri: Uri = js.native
  /** Returns the IStorageFile object provided by the caller when creating the DownloadOperation object using CreateDownload . */
  /* CompleteClass */
  override var resultFile: IStorageFile = js.native
  /** Gets the group that this download operation belongs to. */
  /* CompleteClass */
  override var transferGroup: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup = js.native
  /**
    * Returns an asynchronous operation that can be used to monitor progress and completion of the attached download. Calling this method allows an app to attach download operations that were started in a previous app instance.
    * @return Download operation with callback.
    */
  /* CompleteClass */
  override def attachAsync(): IPromiseWithIAsyncOperationWithProgress[
    typings.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation, 
    typings.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation
  ] = js.native
  /**
    * Gets the response information.
    * @return Contains the data returned by a server response.
    */
  /* CompleteClass */
  override def getResponseInformation(): typings.winrtUwp.Windows.Networking.BackgroundTransfer.ResponseInformation = js.native
  /**
    * Gets the partially downloaded response at the specified position.
    * @param position The position at which to start reading.
    * @return The result stream.
    */
  /* CompleteClass */
  override def getResultStreamAt(position: Double): IInputStream = js.native
  /** Pauses a download operation. */
  /* CompleteClass */
  override def pause(): Unit = js.native
  /** Resumes a paused download operation. */
  /* CompleteClass */
  override def resume(): Unit = js.native
  /**
    * Starts an asynchronous download operation.
    * @return An asynchronous download operation that includes progress updates.
    */
  /* CompleteClass */
  override def startAsync(): IPromiseWithIAsyncOperationWithProgress[
    typings.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation, 
    typings.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation
  ] = js.native
}

