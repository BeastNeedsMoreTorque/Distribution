package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.recharts.rechartsStrings.bottom
import typings.recharts.rechartsStrings.category
import typings.recharts.rechartsStrings.number
import typings.recharts.rechartsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisProps extends EventAttributes {
  var allowDataOverflow: js.UndefOr[Boolean] = js.undefined
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  var allowDuplicatedCategory: js.UndefOr[Boolean] = js.undefined
  // Rotation of tick labels
  var angle: js.UndefOr[Double] = js.undefined
  var axisLine: js.UndefOr[Boolean | js.Object] = js.undefined
  // The key of data displayed in the axis
  var dataKey: js.UndefOr[DataKey] = js.undefined
  var domain: js.UndefOr[js.Tuple2[AxisDomain, AxisDomain]] = js.undefined
  // X offset of tick label
  var dx: js.UndefOr[Double] = js.undefined
  // Y offset of tick label
  var dy: js.UndefOr[Double] = js.undefined
  // The height of axis, which need to be set by user
  var height: js.UndefOr[Double] = js.undefined
  var hide: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[AxisInterval] = js.undefined
  // see label section at http://recharts.org/#/en-US/api/XAxis
  var label: js.UndefOr[String | Double | Label | LabelProps] = js.undefined
  var minTickGap: js.UndefOr[Double] = js.undefined
  var mirror: js.UndefOr[Boolean] = js.undefined
  // The name of data displayed in the axis
  var name: js.UndefOr[String | Double] = js.undefined
  // The orientation of axis
  var orientation: js.UndefOr[top | bottom] = js.undefined
  var padding: js.UndefOr[XPadding] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
  var scale: js.UndefOr[ScaleType | RechartsFunction] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var textAnchor: js.UndefOr[String] = js.undefined
  var tick: js.UndefOr[Boolean | ContentRenderer[_] | js.Object | ReactElement] = js.undefined
  // The count of ticks
  var tickCount: js.UndefOr[Double] = js.undefined
  // The formatter function of tick
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  var tickLine: js.UndefOr[Boolean | js.Object] = js.undefined
  // The margin between tick line and the label
  var tickMargin: js.UndefOr[Double] = js.undefined
  var tickSize: js.UndefOr[Double] = js.undefined
  // Ticks can be any type when the axis is the type of category
  // Ticks must be numbers when the axis is the type of number
  var ticks: js.UndefOr[js.Array[_]] = js.undefined
  var `type`: js.UndefOr[number | category] = js.undefined
  // The unit of data displayed in the axis
  var unit: js.UndefOr[String | Double] = js.undefined
  // The width of axis which is usually calculated internally
  var width: js.UndefOr[Double] = js.undefined
  // The unique id of x-axis
  var xAxisId: js.UndefOr[String | Double] = js.undefined
}

object XAxisProps {
  @scala.inline
  def apply(
    allowDataOverflow: js.UndefOr[Boolean] = js.undefined,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    allowDuplicatedCategory: js.UndefOr[Boolean] = js.undefined,
    angle: js.UndefOr[Double] = js.undefined,
    axisLine: Boolean | js.Object = null,
    dataKey: DataKey = null,
    domain: js.Tuple2[AxisDomain, AxisDomain] = null,
    dx: js.UndefOr[Double] = js.undefined,
    dy: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    hide: js.UndefOr[Boolean] = js.undefined,
    interval: AxisInterval = null,
    label: String | Double | Label | LabelProps = null,
    minTickGap: js.UndefOr[Double] = js.undefined,
    mirror: js.UndefOr[Boolean] = js.undefined,
    name: String | Double = null,
    onClick: /* repeated */ js.Any => Unit = null,
    onMouseDown: /* repeated */ js.Any => Unit = null,
    onMouseEnter: /* repeated */ js.Any => Unit = null,
    onMouseLeave: /* repeated */ js.Any => Unit = null,
    onMouseMove: /* repeated */ js.Any => Unit = null,
    onMouseOut: /* repeated */ js.Any => Unit = null,
    onMouseOver: /* repeated */ js.Any => Unit = null,
    onMouseUp: /* repeated */ js.Any => Unit = null,
    onTouchCancel: /* repeated */ js.Any => Unit = null,
    onTouchEnd: /* repeated */ js.Any => Unit = null,
    onTouchMove: /* repeated */ js.Any => Unit = null,
    onTouchStart: /* repeated */ js.Any => Unit = null,
    orientation: top | bottom = null,
    padding: XPadding = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    scale: ScaleType | RechartsFunction = null,
    stroke: String = null,
    textAnchor: String = null,
    tick: Boolean | ContentRenderer[_] | js.Object | ReactElement = null,
    tickCount: js.UndefOr[Double] = js.undefined,
    tickFormatter: /* value */ js.Any => js.Any = null,
    tickLine: Boolean | js.Object = null,
    tickMargin: js.UndefOr[Double] = js.undefined,
    tickSize: js.UndefOr[Double] = js.undefined,
    ticks: js.Array[_] = null,
    `type`: number | category = null,
    unit: String | Double = null,
    width: js.UndefOr[Double] = js.undefined,
    xAxisId: String | Double = null
  ): XAxisProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDataOverflow)) __obj.updateDynamic("allowDataOverflow")(allowDataOverflow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDuplicatedCategory)) __obj.updateDynamic("allowDuplicatedCategory")(allowDuplicatedCategory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(dx)) __obj.updateDynamic("dx")(dx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dy)) __obj.updateDynamic("dy")(dy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.get.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(minTickGap)) __obj.updateDynamic("minTickGap")(minTickGap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.get.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (!js.isUndefined(tickCount)) __obj.updateDynamic("tickCount")(tickCount.get.asInstanceOf[js.Any])
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(js.Any.fromFunction1(tickFormatter))
    if (tickLine != null) __obj.updateDynamic("tickLine")(tickLine.asInstanceOf[js.Any])
    if (!js.isUndefined(tickMargin)) __obj.updateDynamic("tickMargin")(tickMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickSize)) __obj.updateDynamic("tickSize")(tickSize.get.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxisProps]
  }
}

