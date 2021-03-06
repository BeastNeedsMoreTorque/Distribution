package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.StreamedFileDataRequestedHandler
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.StorageFile")
@js.native
class StorageFile ()
  extends typings.winrt.Windows.Storage.StorageFile {
  /* CompleteClass */
  override def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  /* CompleteClass */
  override def openSequentialReadAsync(): IAsyncOperation[IInputStream] = js.native
}

/* static members */
@JSGlobal("Windows.Storage.StorageFile")
@js.native
object StorageFile extends js.Object {
  def createStreamedFileAsync(
    displayNameWithExtension: String,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
  def createStreamedFileFromUriAsync(displayNameWithExtension: String, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
  def getFileFromApplicationUriAsync(uri: Uri): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
  def getFileFromPathAsync(path: String): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
  def replaceWithStreamedFileAsync(
    fileToReplace: IStorageFile,
    dataRequested: StreamedFileDataRequestedHandler,
    thumbnail: IRandomAccessStreamReference
  ): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
  def replaceWithStreamedFileFromUriAsync(fileToReplace: IStorageFile, uri: Uri, thumbnail: IRandomAccessStreamReference): IAsyncOperation[typings.winrt.Windows.Storage.StorageFile] = js.native
}

