package typings.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enabled extends js.Object {
  /** While set to true, versioning is fully enabled for this bucket. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object Enabled {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
}

