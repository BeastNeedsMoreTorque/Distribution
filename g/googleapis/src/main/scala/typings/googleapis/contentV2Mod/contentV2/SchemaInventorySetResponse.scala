package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInventorySetResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#inventorySetResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaInventorySetResponse {
  @scala.inline
  def apply(kind: String = null): SchemaInventorySetResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInventorySetResponse]
  }
}

