package typings.lusca.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lusca", "referrerPolicy")
@js.native
object referrerPolicy extends js.Object {
  def apply(value: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

