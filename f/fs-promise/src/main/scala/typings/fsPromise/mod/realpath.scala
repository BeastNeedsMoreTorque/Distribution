package typings.fsPromise.mod

import org.scalablytyped.runtime.StringDictionary
import typings.fsPromise.fsPromiseStrings.buffer
import typings.mz.anon.Encoding
import typings.mz.anon.`0`
import typings.mz.anon.`1`
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", "realpath")
@js.native
object realpath extends js.Object {
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: String, cache: StringDictionary[String]): js.Promise[String] = js.native
  def apply(
    path: String,
    cache: StringDictionary[String],
    callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]
  ): Unit = js.native
  def apply(path: String, callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]): Unit = js.native
  def apply(path: Buffer): js.Promise[String] = js.native
  def apply(path: Buffer, cache: StringDictionary[String]): js.Promise[String] = js.native
  def apply(
    path: Buffer,
    cache: StringDictionary[String],
    callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]
  ): Unit = js.native
  def apply(path: Buffer, callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, _]): Unit = js.native
  def apply(path: PathLike): js.Promise[String] = js.native
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[`1` | BufferEncoding | Encoding | Null | String],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
  def apply(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: Encoding): js.Promise[String] = js.native
  def apply(path: PathLike, options: `0`): js.Promise[Buffer] = js.native
  def apply(
    path: PathLike,
    options: `0`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: `1`): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  def native(path: PathLike): js.Promise[String] = js.native
  def native(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: js.UndefOr[`1` | BufferEncoding | Encoding | Null | String],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def native(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def native(path: PathLike, options: Encoding): js.Promise[String] = js.native
  def native(path: PathLike, options: `0`): js.Promise[Buffer] = js.native
  def native(
    path: PathLike,
    options: `0`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  def native(path: PathLike, options: `1`): js.Promise[String | Buffer] = js.native
  def native(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
  @JSName("native")
  def native_buffer(path: PathLike, options: buffer): js.Promise[Buffer] = js.native
  @JSName("native")
  def native_buffer(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
}

