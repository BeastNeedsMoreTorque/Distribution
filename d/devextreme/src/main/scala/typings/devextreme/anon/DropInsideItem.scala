package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import typings.devextreme.mod.DevExpress.ui.dxDraggable
import typings.devextreme.mod.DevExpress.ui.dxSortable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropInsideItem extends js.Object {
  var dropInsideItem: js.UndefOr[Boolean] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
  var fromData: js.UndefOr[js.Any] = js.undefined
  var fromIndex: js.UndefOr[Double] = js.undefined
  var itemData: js.UndefOr[js.Any] = js.undefined
  var itemElement: js.UndefOr[dxElement] = js.undefined
  var toComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
  var toData: js.UndefOr[js.Any] = js.undefined
  var toIndex: js.UndefOr[Double] = js.undefined
}

object DropInsideItem {
  @scala.inline
  def apply(
    dropInsideItem: js.UndefOr[Boolean] = js.undefined,
    event: event = null,
    fromComponent: dxSortable | dxDraggable = null,
    fromData: js.Any = null,
    fromIndex: js.UndefOr[Double] = js.undefined,
    itemData: js.Any = null,
    itemElement: dxElement = null,
    toComponent: dxSortable | dxDraggable = null,
    toData: js.Any = null,
    toIndex: js.UndefOr[Double] = js.undefined
  ): DropInsideItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropInsideItem)) __obj.updateDynamic("dropInsideItem")(dropInsideItem.get.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (fromComponent != null) __obj.updateDynamic("fromComponent")(fromComponent.asInstanceOf[js.Any])
    if (fromData != null) __obj.updateDynamic("fromData")(fromData.asInstanceOf[js.Any])
    if (!js.isUndefined(fromIndex)) __obj.updateDynamic("fromIndex")(fromIndex.get.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    if (toComponent != null) __obj.updateDynamic("toComponent")(toComponent.asInstanceOf[js.Any])
    if (toData != null) __obj.updateDynamic("toData")(toData.asInstanceOf[js.Any])
    if (!js.isUndefined(toIndex)) __obj.updateDynamic("toIndex")(toIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropInsideItem]
  }
}

