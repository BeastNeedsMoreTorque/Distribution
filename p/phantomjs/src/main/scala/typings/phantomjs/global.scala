package typings.phantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  var phantom: Phantom = js.native
  def require(module: String): js.Any = js.native
}

