package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-notarize", "stapleApp")
@js.native
object stapleApp extends js.Object {
  def apply(opts: NotarizeStapleOptions): js.Promise[Unit] = js.native
}

