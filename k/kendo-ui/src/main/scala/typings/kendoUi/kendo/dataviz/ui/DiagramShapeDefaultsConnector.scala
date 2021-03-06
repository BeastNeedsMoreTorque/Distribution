package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsConnector extends js.Object {
  var fill: js.UndefOr[String | DiagramShapeDefaultsConnectorFill] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hover: js.UndefOr[DiagramShapeDefaultsConnectorHover] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[js.Function] = js.undefined
  var stroke: js.UndefOr[String | DiagramShapeDefaultsConnectorStroke] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DiagramShapeDefaultsConnector {
  @scala.inline
  def apply(
    fill: String | DiagramShapeDefaultsConnectorFill = null,
    height: js.UndefOr[Double] = js.undefined,
    hover: DiagramShapeDefaultsConnectorHover = null,
    name: String = null,
    position: js.Function = null,
    stroke: String | DiagramShapeDefaultsConnectorStroke = null,
    width: js.UndefOr[Double] = js.undefined
  ): DiagramShapeDefaultsConnector = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsConnector]
  }
}

