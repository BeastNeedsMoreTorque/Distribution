package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeliveryControlFrequencyCap extends js.Object {
  var maxImpressions: js.UndefOr[Double] = js.native
  var numTimeUnits: js.UndefOr[Double] = js.native
  var timeUnitType: js.UndefOr[String] = js.native
}

object SchemaDeliveryControlFrequencyCap {
  @scala.inline
  def apply(
    maxImpressions: js.UndefOr[Double] = js.undefined,
    numTimeUnits: js.UndefOr[Double] = js.undefined,
    timeUnitType: String = null
  ): SchemaDeliveryControlFrequencyCap = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxImpressions)) __obj.updateDynamic("maxImpressions")(maxImpressions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numTimeUnits)) __obj.updateDynamic("numTimeUnits")(numTimeUnits.get.asInstanceOf[js.Any])
    if (timeUnitType != null) __obj.updateDynamic("timeUnitType")(timeUnitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeliveryControlFrequencyCap]
  }
}

