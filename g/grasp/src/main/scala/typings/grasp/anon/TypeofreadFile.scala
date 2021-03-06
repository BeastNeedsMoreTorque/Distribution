package typings.grasp.anon

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.anon.BaseEncodingOptionsflagst
import typings.node.anon.EncodingBufferEncoding
import typings.node.anon.EncodingNull
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofreadFile extends js.Object {
  def apply(path: Double, callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]): Unit = js.native
  def apply(
    path: Double,
    options: js.UndefOr[BaseEncodingOptionsflagst | EncodingNull | Null | String],
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
  ): Unit = js.native
  def apply(
    path: Double,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  def apply(
    path: Double,
    options: EncodingBufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[BaseEncodingOptionsflagst | EncodingNull | Null | String],
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: EncodingBufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  def __promisify__(path: Double): js.Promise[Buffer] = js.native
  def __promisify__(path: Double, options: String): js.Promise[String] = js.native
  def __promisify__(path: Double, options: BaseEncodingOptionsflagst): js.Promise[String | Buffer] = js.native
  def __promisify__(path: Double, options: EncodingBufferEncoding): js.Promise[String] = js.native
  def __promisify__(path: Double, options: EncodingNull): js.Promise[Buffer] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def __promisify__(path: PathLike): js.Promise[Buffer] = js.native
  def __promisify__(path: PathLike, options: String): js.Promise[String] = js.native
  def __promisify__(path: PathLike, options: BaseEncodingOptionsflagst): js.Promise[String | Buffer] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def __promisify__(path: PathLike, options: EncodingBufferEncoding): js.Promise[String] = js.native
  def __promisify__(path: PathLike, options: EncodingNull): js.Promise[Buffer] = js.native
}

