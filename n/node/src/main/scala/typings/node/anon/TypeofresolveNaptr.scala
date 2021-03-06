package typings.node.anon

import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.NaptrRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofresolveNaptr extends js.Object {
  def apply(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = js.native
  def __promisify__(hostname: String): js.Promise[js.Array[NaptrRecord]] = js.native
}

