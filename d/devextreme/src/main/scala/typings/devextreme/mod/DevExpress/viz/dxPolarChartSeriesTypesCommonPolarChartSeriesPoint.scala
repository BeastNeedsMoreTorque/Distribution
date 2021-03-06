package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorVisible
import typings.devextreme.anon.Size
import typings.devextreme.anon.Url
import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.allSeriesPoints
import typings.devextreme.devextremeStrings.circle
import typings.devextreme.devextremeStrings.cross
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onlyPoint
import typings.devextreme.devextremeStrings.polygon
import typings.devextreme.devextremeStrings.square
import typings.devextreme.devextremeStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartSeriesTypesCommonPolarChartSeriesPoint extends js.Object {
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.border */
  var border: js.UndefOr[ColorVisible] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.hoverMode */
  var hoverMode: js.UndefOr[allArgumentPoints | allSeriesPoints | none | onlyPoint] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.hoverStyle */
  var hoverStyle: js.UndefOr[Size] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.image */
  var image: js.UndefOr[String | Url] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.selectionMode */
  var selectionMode: js.UndefOr[allArgumentPoints | allSeriesPoints | none | onlyPoint] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.selectionStyle */
  var selectionStyle: js.UndefOr[Size] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.size */
  var size: js.UndefOr[Double] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.symbol */
  var symbol: js.UndefOr[circle | cross | polygon | square | triangle] = js.undefined
  /** @name dxPolarChartSeriesTypes.CommonPolarChartSeries.point.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object dxPolarChartSeriesTypesCommonPolarChartSeriesPoint {
  @scala.inline
  def apply(
    border: ColorVisible = null,
    color: String = null,
    hoverMode: allArgumentPoints | allSeriesPoints | none | onlyPoint = null,
    hoverStyle: Size = null,
    image: String | Url = null,
    selectionMode: allArgumentPoints | allSeriesPoints | none | onlyPoint = null,
    selectionStyle: Size = null,
    size: js.UndefOr[Double] = js.undefined,
    symbol: circle | cross | polygon | square | triangle = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxPolarChartSeriesTypesCommonPolarChartSeriesPoint = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (hoverStyle != null) __obj.updateDynamic("hoverStyle")(hoverStyle.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionStyle != null) __obj.updateDynamic("selectionStyle")(selectionStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartSeriesTypesCommonPolarChartSeriesPoint]
  }
}

