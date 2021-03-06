package typings.devextreme.anon

import typings.devextreme.devextremeStrings.pan
import typings.devextreme.devextremeStrings.zoom
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.viz.VizRange
import typings.devextreme.mod.DevExpress.viz.chartAxisObject
import typings.devextreme.mod.DevExpress.viz.dxPolarChart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var actionType: js.UndefOr[zoom | pan] = js.undefined
  var axis: js.UndefOr[chartAxisObject] = js.undefined
  var cancel: js.UndefOr[Boolean] = js.undefined
  var component: js.UndefOr[dxPolarChart] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var range: js.UndefOr[VizRange] = js.undefined
}

object Range {
  @scala.inline
  def apply(
    actionType: zoom | pan = null,
    axis: chartAxisObject = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    component: dxPolarChart = null,
    element: dxElement = null,
    event: event = null,
    model: js.Any = null,
    range: VizRange = null
  ): Range = {
    val __obj = js.Dynamic.literal()
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

