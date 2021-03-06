package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AlignItemLabels
import typings.devextreme.devextremeStrings.button
import typings.devextreme.devextremeStrings.empty
import typings.devextreme.devextremeStrings.group
import typings.devextreme.devextremeStrings.simple
import typings.devextreme.devextremeStrings.tabbed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFormTabbedItem extends js.Object {
  /** @name dxFormTabbedItem.colSpan */
  var colSpan: js.UndefOr[Double] = js.undefined
  /** @name dxFormTabbedItem.cssClass */
  var cssClass: js.UndefOr[String] = js.undefined
  /** @name dxFormTabbedItem.itemType */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.undefined
  /** @name dxFormTabbedItem.name */
  var name: js.UndefOr[String] = js.undefined
  /** @name dxFormTabbedItem.tabPanelOptions */
  var tabPanelOptions: js.UndefOr[dxTabPanelOptions] = js.undefined
  /** @name dxFormTabbedItem.tabs */
  var tabs: js.UndefOr[js.Array[AlignItemLabels]] = js.undefined
  /** @name dxFormTabbedItem.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** @name dxFormTabbedItem.visibleIndex */
  var visibleIndex: js.UndefOr[Double] = js.undefined
}

object dxFormTabbedItem {
  @scala.inline
  def apply(
    colSpan: js.UndefOr[Double] = js.undefined,
    cssClass: String = null,
    itemType: empty | group | simple | tabbed | button = null,
    name: String = null,
    tabPanelOptions: dxTabPanelOptions = null,
    tabs: js.Array[AlignItemLabels] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visibleIndex: js.UndefOr[Double] = js.undefined
  ): dxFormTabbedItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tabPanelOptions != null) __obj.updateDynamic("tabPanelOptions")(tabPanelOptions.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleIndex)) __obj.updateDynamic("visibleIndex")(visibleIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFormTabbedItem]
  }
}

