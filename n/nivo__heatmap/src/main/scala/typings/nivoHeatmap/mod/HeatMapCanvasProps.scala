package typings.nivoHeatmap.mod

import typings.nivoAxes.mod.Axis
import typings.nivoColors.mod.InheritedColorProp
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.Colors
import typings.nivoCore.mod.GetColor
import typings.nivoCore.mod.Theme
import typings.nivoHeatmap.nivoHeatmapStrings.auto
import typings.nivoHeatmap.nivoHeatmapStrings.cell
import typings.nivoHeatmap.nivoHeatmapStrings.circle
import typings.nivoHeatmap.nivoHeatmapStrings.column
import typings.nivoHeatmap.nivoHeatmapStrings.rect
import typings.nivoHeatmap.nivoHeatmapStrings.row
import typings.nivoHeatmap.nivoHeatmapStrings.rowColumn
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.StatelessComponent
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/heatmap.@nivo/heatmap.HeatMapData & @nivo/heatmap.@nivo/heatmap.HeatMapCommonProps & std.Partial<{onClick (datum : @nivo/heatmap.@nivo/heatmap.NodeData, event : react.react.MouseEvent<std.HTMLCanvasElement, react.react.NativeMouseEvent>): void,   pixelRatio  :number}> */
trait HeatMapCanvasProps extends js.Object {
  var axisBottom: js.UndefOr[Axis] = js.undefined
  var axisLeft: js.UndefOr[Axis] = js.undefined
  var axisRight: js.UndefOr[Axis] = js.undefined
  var axisTop: js.UndefOr[Axis] = js.undefined
  var cellBorderColor: js.UndefOr[InheritedColorProp[HeatMapDatumWithColor]] = js.undefined
  var cellBorderWidth: js.UndefOr[Double] = js.undefined
  var cellHoverOpacity: js.UndefOr[Double] = js.undefined
  var cellHoverOthersOpacity: js.UndefOr[Double] = js.undefined
  var cellOpacity: js.UndefOr[Double] = js.undefined
  var cellShape: js.UndefOr[rect | circle | StatelessComponent[_]] = js.undefined
  var colorBy: js.UndefOr[String | GetColor[HeatMapDatum]] = js.undefined
  var colors: js.UndefOr[Colors] = js.undefined
  var data: js.Array[HeatMapDatum]
  var enableGridX: js.UndefOr[Boolean] = js.undefined
  var enableGridY: js.UndefOr[Boolean] = js.undefined
  var enableLabels: js.UndefOr[Boolean] = js.undefined
  var forceSquare: js.UndefOr[Boolean] = js.undefined
  var hoverTarget: js.UndefOr[cell | row | column | rowColumn] = js.undefined
  var indexBy: js.UndefOr[String | IndexByFunc] = js.undefined
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  var labelTextColor: js.UndefOr[InheritedColorProp[HeatMapDatumWithColor]] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var maxValue: js.UndefOr[Double | auto] = js.undefined
  var minValue: js.UndefOr[Double | auto] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ NodeData, 
      /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent], 
      Unit
    ]
  ] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var sizeVariation: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var tooltipFormat: js.UndefOr[String | ValueFormatter] = js.undefined
}

object HeatMapCanvasProps {
  @scala.inline
  def apply(
    data: js.Array[HeatMapDatum],
    axisBottom: Axis = null,
    axisLeft: Axis = null,
    axisRight: Axis = null,
    axisTop: Axis = null,
    cellBorderColor: InheritedColorProp[HeatMapDatumWithColor] = null,
    cellBorderWidth: js.UndefOr[Double] = js.undefined,
    cellHoverOpacity: js.UndefOr[Double] = js.undefined,
    cellHoverOthersOpacity: js.UndefOr[Double] = js.undefined,
    cellOpacity: js.UndefOr[Double] = js.undefined,
    cellShape: rect | circle | StatelessComponent[_] = null,
    colorBy: String | GetColor[HeatMapDatum] = null,
    colors: Colors = null,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    enableLabels: js.UndefOr[Boolean] = js.undefined,
    forceSquare: js.UndefOr[Boolean] = js.undefined,
    hoverTarget: cell | row | column | rowColumn = null,
    indexBy: String | IndexByFunc = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[String] = null,
    labelTextColor: InheritedColorProp[HeatMapDatumWithColor] = null,
    margin: Box = null,
    maxValue: Double | auto = null,
    minValue: Double | auto = null,
    onClick: (/* datum */ NodeData, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit = null,
    padding: js.UndefOr[Double] = js.undefined,
    pixelRatio: js.UndefOr[Double] = js.undefined,
    sizeVariation: js.UndefOr[Double] = js.undefined,
    theme: Theme = null,
    tooltipFormat: String | ValueFormatter = null
  ): HeatMapCanvasProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (cellBorderColor != null) __obj.updateDynamic("cellBorderColor")(cellBorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(cellBorderWidth)) __obj.updateDynamic("cellBorderWidth")(cellBorderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellHoverOpacity)) __obj.updateDynamic("cellHoverOpacity")(cellHoverOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellHoverOthersOpacity)) __obj.updateDynamic("cellHoverOthersOpacity")(cellHoverOthersOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellOpacity)) __obj.updateDynamic("cellOpacity")(cellOpacity.get.asInstanceOf[js.Any])
    if (cellShape != null) __obj.updateDynamic("cellShape")(cellShape.asInstanceOf[js.Any])
    if (colorBy != null) __obj.updateDynamic("colorBy")(colorBy.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabels)) __obj.updateDynamic("enableLabels")(enableLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSquare)) __obj.updateDynamic("forceSquare")(forceSquare.get.asInstanceOf[js.Any])
    if (hoverTarget != null) __obj.updateDynamic("hoverTarget")(hoverTarget.asInstanceOf[js.Any])
    if (indexBy != null) __obj.updateDynamic("indexBy")(indexBy.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.get.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeVariation)) __obj.updateDynamic("sizeVariation")(sizeVariation.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapCanvasProps]
  }
}

