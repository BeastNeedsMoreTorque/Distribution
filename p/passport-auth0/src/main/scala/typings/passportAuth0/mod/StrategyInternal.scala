package typings.passportAuth0.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passport.mod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyInternal extends Strategy {
  @JSName("name")
  var name_StrategyInternal: String = js.native
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
}

