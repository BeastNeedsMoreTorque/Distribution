package typings.pem.mod

import typings.pem.anon.Prime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "getDhparamInfo")
@js.native
object getDhparamInfo extends js.Object {
  def apply(dh: String, callback: Callback[Prime]): Unit = js.native
}

