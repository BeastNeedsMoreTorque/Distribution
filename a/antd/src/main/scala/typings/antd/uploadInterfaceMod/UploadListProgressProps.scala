package typings.antd.uploadInterfaceMod

import typings.antd.antdStrings.active
import typings.antd.antdStrings.bottom
import typings.antd.antdStrings.butt
import typings.antd.antdStrings.exception
import typings.antd.antdStrings.left
import typings.antd.antdStrings.normal
import typings.antd.antdStrings.right
import typings.antd.antdStrings.round
import typings.antd.antdStrings.square
import typings.antd.antdStrings.success
import typings.antd.antdStrings.top
import typings.antd.progressProgressMod.ProgressGradient
import typings.antd.progressProgressMod.ProgressSize
import typings.antd.progressProgressMod.SuccessProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<antd.antd/lib/progress.ProgressProps, 'percent' | 'type'> */
trait UploadListProgressProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[
    js.Function2[/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double], ReactNode]
  ] = js.undefined
  var gapDegree: js.UndefOr[Double] = js.undefined
  var gapPosition: js.UndefOr[top | bottom | left | right] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showInfo: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[ProgressSize] = js.undefined
  var status: js.UndefOr[normal | exception | active | success] = js.undefined
  var steps: js.UndefOr[Double] = js.undefined
  var strokeColor: js.UndefOr[String | ProgressGradient] = js.undefined
  var strokeLinecap: js.UndefOr[butt | square | round] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var success: js.UndefOr[SuccessProps] = js.undefined
  var successPercent: js.UndefOr[Double] = js.undefined
  var trailColor: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object UploadListProgressProps {
  @scala.inline
  def apply(
    className: String = null,
    format: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => ReactNode = null,
    gapDegree: js.UndefOr[Double] = js.undefined,
    gapPosition: top | bottom | left | right = null,
    prefixCls: String = null,
    showInfo: js.UndefOr[Boolean] = js.undefined,
    size: ProgressSize = null,
    status: normal | exception | active | success = null,
    steps: js.UndefOr[Double] = js.undefined,
    strokeColor: String | ProgressGradient = null,
    strokeLinecap: butt | square | round = null,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    success: SuccessProps = null,
    successPercent: js.UndefOr[Double] = js.undefined,
    trailColor: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): UploadListProgressProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2(format))
    if (!js.isUndefined(gapDegree)) __obj.updateDynamic("gapDegree")(gapDegree.get.asInstanceOf[js.Any])
    if (gapPosition != null) __obj.updateDynamic("gapPosition")(gapPosition.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showInfo)) __obj.updateDynamic("showInfo")(showInfo.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(steps)) __obj.updateDynamic("steps")(steps.get.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (!js.isUndefined(successPercent)) __obj.updateDynamic("successPercent")(successPercent.get.asInstanceOf[js.Any])
    if (trailColor != null) __obj.updateDynamic("trailColor")(trailColor.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadListProgressProps]
  }
}

