package typings.steamLogin.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("steam-login", "authenticate")
@js.native
object authenticate extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

