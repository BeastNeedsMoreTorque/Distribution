package typings.winrtUwp.Windows.Storage.FileProperties

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the thumbnail image associated with a system resource (like a file or folder). */
trait StorageItemThumbnail extends js.Object {
  /** Gets a value that indicates whether the thumbnail stream can be read from. */
  var canRead: Boolean
  /** Gets a value that indicates whether the thumbnail stream can be written to. */
  var canWrite: Boolean
  /** Gets the MIME content type of the thumbnail image. */
  var contentType: String
  /** Gets the original (not scaled) height of the thumbnail image. */
  var originalHeight: Double
  /** Gets the original (not scaled) width of the thumbnail image. */
  var originalWidth: Double
  /** Gets the byte offset of the thumbnail stream. */
  var position: Double
  /** Gets a value that indicates whether the thumbnail image returned was a cached version with a smaller size. */
  var returnedSmallerCachedSize: Boolean
  /** Gets or sets the size of the thumbnail image. */
  var size: Double
  /** Gets a value that indicates if the thumbnail is an icon or an image. */
  var `type`: ThumbnailType
  /**
    * Creates a new stream over the thumbnail that is represented by the current storageItemThumbnail object.
    * @return The new thumbnail stream. The initial, internal position of the stream is 0.
    */
  def cloneStream(): IRandomAccessStream
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit
  /**
    * Flushes data asynchronously in a sequential stream.
    * @return The stream flush operation.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean]
  /**
    * Retrieves the thumbnail image data as an undecoded stream.
    * @param position The position in the storage item to start reading thumbnail image data.
    * @return An object for reading the thumbnail image data.
    */
  def getInputStreamAt(position: Double): IInputStream
  /**
    * Retrieves an output stream object for writing thumbnail image data to a storage item.
    * @param position The position in the storage item to start writing thumbnail image data.
    * @return The output stream.
    */
  def getOutputStreamAt(position: Double): IOutputStream
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
  /**
    * Sets the offset of the thumbnail stream to the specified value.
    * @param position The number of bytes from the start of the thumbnail stream where the position of the thumbnail stream is set.
    */
  def seek(position: Double): Unit
  /**
    * Writes data asynchronously in a sequential stream.
    * @param buffer The buffer into which the asynchronous writer operation writes.
    * @return The byte writer operation.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double]
}

object StorageItemThumbnail {
  @scala.inline
  def apply(
    canRead: Boolean,
    canWrite: Boolean,
    cloneStream: () => IRandomAccessStream,
    close: () => Unit,
    contentType: String,
    flushAsync: () => IPromiseWithIAsyncOperation[Boolean],
    getInputStreamAt: Double => IInputStream,
    getOutputStreamAt: Double => IOutputStream,
    originalHeight: Double,
    originalWidth: Double,
    position: Double,
    readAsync: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double],
    returnedSmallerCachedSize: Boolean,
    seek: Double => Unit,
    size: Double,
    `type`: ThumbnailType,
    writeAsync: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): StorageItemThumbnail = {
    val __obj = js.Dynamic.literal(canRead = canRead.asInstanceOf[js.Any], canWrite = canWrite.asInstanceOf[js.Any], cloneStream = js.Any.fromFunction0(cloneStream), close = js.Any.fromFunction0(close), contentType = contentType.asInstanceOf[js.Any], flushAsync = js.Any.fromFunction0(flushAsync), getInputStreamAt = js.Any.fromFunction1(getInputStreamAt), getOutputStreamAt = js.Any.fromFunction1(getOutputStreamAt), originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], readAsync = js.Any.fromFunction3(readAsync), returnedSmallerCachedSize = returnedSmallerCachedSize.asInstanceOf[js.Any], seek = js.Any.fromFunction1(seek), size = size.asInstanceOf[js.Any], writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageItemThumbnail]
  }
}

