package typings.namedRoutes.mod.expressServeStaticCoreAugmentingMod

import typings.namedRoutes.mod.NamedRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends js.Object {
  var namedRoutes: NamedRouter
}

object Application {
  @scala.inline
  def apply(namedRoutes: NamedRouter): Application = {
    val __obj = js.Dynamic.literal(namedRoutes = namedRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
}

