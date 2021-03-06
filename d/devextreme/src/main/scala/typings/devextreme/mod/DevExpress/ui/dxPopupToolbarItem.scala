package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.after
import typings.devextreme.devextremeStrings.before
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPopupToolbarItem extends js.Object {
  /** @name dxPopup.Options.toolbarItems.disabled */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxPopup.Options.toolbarItems.html */
  var html: js.UndefOr[String] = js.undefined
  /** @name dxPopup.Options.toolbarItems.location */
  var location: js.UndefOr[after | before | center] = js.undefined
  /** @name dxPopup.Options.toolbarItems.options */
  var options: js.UndefOr[js.Any] = js.undefined
  /** @name dxPopup.Options.toolbarItems.template */
  var template: js.UndefOr[typings.devextreme.mod.DevExpress.core.template] = js.undefined
  /** @name dxPopup.Options.toolbarItems.text */
  var text: js.UndefOr[String] = js.undefined
  /** @name dxPopup.Options.toolbarItems.toolbar */
  var toolbar: js.UndefOr[bottom | top] = js.undefined
  /** @name dxPopup.Options.toolbarItems.visible */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** @name dxPopup.Options.toolbarItems.widget */
  var widget: js.UndefOr[
    typings.devextreme.devextremeStrings.dxAutocomplete | typings.devextreme.devextremeStrings.dxButton | typings.devextreme.devextremeStrings.dxCheckBox | typings.devextreme.devextremeStrings.dxDateBox | typings.devextreme.devextremeStrings.dxMenu | typings.devextreme.devextremeStrings.dxSelectBox | typings.devextreme.devextremeStrings.dxTabs | typings.devextreme.devextremeStrings.dxTextBox | typings.devextreme.devextremeStrings.dxButtonGroup | typings.devextreme.devextremeStrings.dxDropDownButton
  ] = js.undefined
}

object dxPopupToolbarItem {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    html: String = null,
    location: after | before | center = null,
    options: js.Any = null,
    template: typings.devextreme.mod.DevExpress.core.template = null,
    text: String = null,
    toolbar: bottom | top = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    widget: typings.devextreme.devextremeStrings.dxAutocomplete | typings.devextreme.devextremeStrings.dxButton | typings.devextreme.devextremeStrings.dxCheckBox | typings.devextreme.devextremeStrings.dxDateBox | typings.devextreme.devextremeStrings.dxMenu | typings.devextreme.devextremeStrings.dxSelectBox | typings.devextreme.devextremeStrings.dxTabs | typings.devextreme.devextremeStrings.dxTextBox | typings.devextreme.devextremeStrings.dxButtonGroup | typings.devextreme.devextremeStrings.dxDropDownButton = null
  ): dxPopupToolbarItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (widget != null) __obj.updateDynamic("widget")(widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPopupToolbarItem]
  }
}

