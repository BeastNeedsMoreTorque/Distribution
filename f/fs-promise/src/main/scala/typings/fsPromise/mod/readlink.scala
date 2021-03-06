package typings.fsPromise.mod

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

@JSImport("fs-promise", "readlink")
@js.native
object readlink extends js.Object {
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: String, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, _]): Unit = js.native
  def apply(path: Buffer): js.Promise[String] = js.native
  def apply(path: Buffer, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, _]): Unit = js.native
  def apply(path: PathLike): js.Promise[String] = js.native
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ String, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[`1` | BufferEncoding | Encoding | Null | String],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* linkString */ String), Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: Encoding): js.Promise[String] = js.native
  def apply(path: PathLike, options: `0`): js.Promise[Buffer] = js.native
  def apply(
    path: PathLike,
    options: `0`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ Buffer, Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: `1`): js.Promise[String | Buffer] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
}

