package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The named port. For example: .
  */
@js.native
trait SchemaNamedPort extends js.Object {
  /**
    * The name for this named port. The name must be 1-63 characters long, and
    * comply with RFC1035.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The port number, which can be a value between 1 and 65535.
    */
  var port: js.UndefOr[Double] = js.native
}

object SchemaNamedPort {
  @scala.inline
  def apply(name: String = null, port: js.UndefOr[Double] = js.undefined): SchemaNamedPort = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNamedPort]
  }
}

