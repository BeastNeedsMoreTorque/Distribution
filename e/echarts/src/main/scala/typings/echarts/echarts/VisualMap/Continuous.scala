package typings.echarts.echarts.VisualMap

import typings.echarts.anon.InRange
import typings.echarts.echarts.EChartOption.BaseTextStyleWithRich
import typings.echarts.echartsStrings.auto
import typings.echarts.echartsStrings.bottom
import typings.echarts.echartsStrings.continuous
import typings.echarts.echartsStrings.horizontal
import typings.echarts.echartsStrings.left
import typings.echarts.echartsStrings.right
import typings.echarts.echartsStrings.top
import typings.echarts.echartsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Continuous
  extends typings.echarts.echarts.EChartOption.VisualMap {
  var align: js.UndefOr[auto | left | right | top | bottom] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var bottom: js.UndefOr[Double | String] = js.undefined
  var calculable: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[js.Array[String]] = js.undefined
  var controller: js.UndefOr[InRange] = js.undefined
  var dimension: js.UndefOr[String | Double] = js.undefined
  var formatter: js.UndefOr[String | js.Function] = js.undefined
  var hoverLink: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inRange: js.UndefOr[RangeObject] = js.undefined
  var inverse: js.UndefOr[Boolean] = js.undefined
  var itemHeight: js.UndefOr[Double] = js.undefined
  var itemWidth: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[Double | String] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var orient: js.UndefOr[vertical | horizontal] = js.undefined
  var outOfRange: js.UndefOr[RangeObject] = js.undefined
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  var realtime: js.UndefOr[Boolean] = js.undefined
  var right: js.UndefOr[Double | String] = js.undefined
  var seriesIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[js.Array[String]] = js.undefined
  var textGap: js.UndefOr[Double] = js.undefined
  var textStyle: js.UndefOr[BaseTextStyleWithRich] = js.undefined
  var top: js.UndefOr[Double | String] = js.undefined
  var `type`: js.UndefOr[continuous] = js.undefined
  var z: js.UndefOr[Double] = js.undefined
  var zlevel: js.UndefOr[Double] = js.undefined
}

object Continuous {
  @scala.inline
  def apply(
    align: auto | left | right | top | bottom = null,
    backgroundColor: String = null,
    borderColor: String = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    bottom: Double | String = null,
    calculable: js.UndefOr[Boolean] = js.undefined,
    color: js.Array[String] = null,
    controller: InRange = null,
    dimension: String | Double = null,
    formatter: String | js.Function = null,
    hoverLink: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inRange: RangeObject = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    itemHeight: js.UndefOr[Double] = js.undefined,
    itemWidth: js.UndefOr[Double] = js.undefined,
    left: Double | String = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    orient: vertical | horizontal = null,
    outOfRange: RangeObject = null,
    padding: Double | js.Array[Double] = null,
    precision: js.UndefOr[Double] = js.undefined,
    range: js.Array[Double] = null,
    realtime: js.UndefOr[Boolean] = js.undefined,
    right: Double | String = null,
    seriesIndex: Double | js.Array[Double] = null,
    show: js.UndefOr[Boolean] = js.undefined,
    text: js.Array[String] = null,
    textGap: js.UndefOr[Double] = js.undefined,
    textStyle: BaseTextStyleWithRich = null,
    top: Double | String = null,
    `type`: continuous = null,
    z: js.UndefOr[Double] = js.undefined,
    zlevel: js.UndefOr[Double] = js.undefined
  ): Continuous = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (!js.isUndefined(calculable)) __obj.updateDynamic("calculable")(calculable.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverLink)) __obj.updateDynamic("hoverLink")(hoverLink.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inRange != null) __obj.updateDynamic("inRange")(inRange.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemHeight)) __obj.updateDynamic("itemHeight")(itemHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemWidth)) __obj.updateDynamic("itemWidth")(itemWidth.get.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (outOfRange != null) __obj.updateDynamic("outOfRange")(outOfRange.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime.get.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (seriesIndex != null) __obj.updateDynamic("seriesIndex")(seriesIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(textGap)) __obj.updateDynamic("textGap")(textGap.get.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zlevel)) __obj.updateDynamic("zlevel")(zlevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Continuous]
  }
}

