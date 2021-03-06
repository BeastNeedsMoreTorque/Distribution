package typings.blueprintjsCore.numericInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumericInputState extends js.Object {
  var currentImeInputInvalid: Boolean
  var prevMaxProp: js.UndefOr[Double] = js.undefined
  var prevMinProp: js.UndefOr[Double] = js.undefined
  var prevValueProp: js.UndefOr[Double | String] = js.undefined
  var shouldSelectAfterUpdate: Boolean
  var stepMaxPrecision: Double
  var value: String
}

object INumericInputState {
  @scala.inline
  def apply(
    currentImeInputInvalid: Boolean,
    shouldSelectAfterUpdate: Boolean,
    stepMaxPrecision: Double,
    value: String,
    prevMaxProp: js.UndefOr[Double] = js.undefined,
    prevMinProp: js.UndefOr[Double] = js.undefined,
    prevValueProp: Double | String = null
  ): INumericInputState = {
    val __obj = js.Dynamic.literal(currentImeInputInvalid = currentImeInputInvalid.asInstanceOf[js.Any], shouldSelectAfterUpdate = shouldSelectAfterUpdate.asInstanceOf[js.Any], stepMaxPrecision = stepMaxPrecision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(prevMaxProp)) __obj.updateDynamic("prevMaxProp")(prevMaxProp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prevMinProp)) __obj.updateDynamic("prevMinProp")(prevMinProp.get.asInstanceOf[js.Any])
    if (prevValueProp != null) __obj.updateDynamic("prevValueProp")(prevValueProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumericInputState]
  }
}

