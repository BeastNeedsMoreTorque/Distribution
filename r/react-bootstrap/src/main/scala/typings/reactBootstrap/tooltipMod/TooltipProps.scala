package typings.reactBootstrap.tooltipMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps
  extends AllHTMLAttributes[Tooltip]
     with ClassAttributes[Tooltip] {
  // Optional
  var arrowOffsetLeft: js.UndefOr[Double | String] = js.undefined
  var arrowOffsetTop: js.UndefOr[Double | String] = js.undefined
  var bsClass: js.UndefOr[String] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var positionLeft: js.UndefOr[Double] = js.undefined
  var positionTop: js.UndefOr[Double] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Tooltip] = null,
    ClassAttributes: ClassAttributes[Tooltip] = null,
    arrowOffsetLeft: Double | String = null,
    arrowOffsetTop: Double | String = null,
    bsClass: String = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    placement: String = null,
    positionLeft: js.UndefOr[Double] = js.undefined,
    positionTop: js.UndefOr[Double] = js.undefined
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (arrowOffsetLeft != null) __obj.updateDynamic("arrowOffsetLeft")(arrowOffsetLeft.asInstanceOf[js.Any])
    if (arrowOffsetTop != null) __obj.updateDynamic("arrowOffsetTop")(arrowOffsetTop.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(positionLeft)) __obj.updateDynamic("positionLeft")(positionLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(positionTop)) __obj.updateDynamic("positionTop")(positionTop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

