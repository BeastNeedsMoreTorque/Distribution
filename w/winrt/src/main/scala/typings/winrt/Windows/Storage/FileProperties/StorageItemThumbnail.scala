package typings.winrt.Windows.Storage.FileProperties

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IContentTypeProvider
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import typings.winrt.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageItemThumbnail
  extends IRandomAccessStream
     with IContentTypeProvider
     with IThumbnailProperties {
  def dispose(): Unit
}

object StorageItemThumbnail {
  @scala.inline
  def apply(
    canRead: Boolean,
    canWrite: Boolean,
    cloneStream: () => IRandomAccessStream,
    close: () => Unit,
    contentType: String,
    dispose: () => Unit,
    flushAsync: () => IAsyncOperation[Boolean],
    getInputStreamAt: Double => IInputStream,
    getOutputStreamAt: Double => IOutputStream,
    originalHeight: Double,
    originalWidth: Double,
    position: Double,
    readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double],
    returnedSmallerCachedSize: Boolean,
    seek: Double => Unit,
    size: Double,
    `type`: ThumbnailType,
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): StorageItemThumbnail = {
    val __obj = js.Dynamic.literal(canRead = canRead.asInstanceOf[js.Any], canWrite = canWrite.asInstanceOf[js.Any], cloneStream = js.Any.fromFunction0(cloneStream), close = js.Any.fromFunction0(close), contentType = contentType.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), flushAsync = js.Any.fromFunction0(flushAsync), getInputStreamAt = js.Any.fromFunction1(getInputStreamAt), getOutputStreamAt = js.Any.fromFunction1(getOutputStreamAt), originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], readAsync = js.Any.fromFunction3(readAsync), returnedSmallerCachedSize = returnedSmallerCachedSize.asInstanceOf[js.Any], seek = js.Any.fromFunction1(seek), size = size.asInstanceOf[js.Any], writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageItemThumbnail]
  }
}

