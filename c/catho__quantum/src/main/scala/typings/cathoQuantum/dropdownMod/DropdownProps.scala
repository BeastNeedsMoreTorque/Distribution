package typings.cathoQuantum.dropdownMod

import typings.cathoQuantum.anon.BaseFontSize
import typings.downshift.mod.ControllerStateAndHelpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps extends js.Object {
  var autocomplete: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var helperText: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var ignoreSpecialChars: js.UndefOr[Boolean] = js.undefined
  var items: js.UndefOr[js.Array[ItemPropType]] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  /** More about stateAndHelpers parameter here https://github.com/downshift-js/downshift#children-function */
  var onChange: js.UndefOr[
    js.Function2[
      /* selectedItem */ ItemPropType | Null, 
      /* stateAndHelpers */ ControllerStateAndHelpers[ItemPropType], 
      Unit
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var selectedItem: js.UndefOr[ItemPropType] = js.undefined
  var theme: js.UndefOr[BaseFontSize] = js.undefined
}

object DropdownProps {
  @scala.inline
  def apply(
    autocomplete: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    helperText: String = null,
    id: String = null,
    ignoreSpecialChars: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[ItemPropType] = null,
    label: String = null,
    onChange: (/* selectedItem */ ItemPropType | Null, /* stateAndHelpers */ ControllerStateAndHelpers[ItemPropType]) => Unit = null,
    placeholder: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    selectedItem: ItemPropType = null,
    theme: BaseFontSize = null
  ): DropdownProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autocomplete)) __obj.updateDynamic("autocomplete")(autocomplete.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSpecialChars)) __obj.updateDynamic("ignoreSpecialChars")(ignoreSpecialChars.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownProps]
  }
}

