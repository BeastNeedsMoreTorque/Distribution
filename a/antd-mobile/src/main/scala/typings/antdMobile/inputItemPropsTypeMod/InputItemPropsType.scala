package typings.antdMobile.inputItemPropsTypeMod

import typings.antdMobile.antdMobileStrings.bankCard
import typings.antdMobile.antdMobileStrings.center
import typings.antdMobile.antdMobileStrings.digit
import typings.antdMobile.antdMobileStrings.left
import typings.antdMobile.antdMobileStrings.money
import typings.antdMobile.antdMobileStrings.number
import typings.antdMobile.antdMobileStrings.password
import typings.antdMobile.antdMobileStrings.phone
import typings.antdMobile.antdMobileStrings.text
import typings.antdMobile.antdMobileStrings.top
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputItemPropsType extends js.Object {
  var clear: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledKeys: js.UndefOr[js.Array[InputKey] | Null] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var extra: js.UndefOr[ReactNode] = js.undefined
  var labelNumber: js.UndefOr[Double] = js.undefined
  var labelPosition: js.UndefOr[left | top] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var moneyKeyboardAlign: js.UndefOr[String] = js.undefined
  var moneyKeyboardHeader: js.UndefOr[ReactNode] = js.undefined
  var moneyKeyboardWrapProps: js.UndefOr[js.Object] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[InputEventHandler] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onFocus: js.UndefOr[InputEventHandler] = js.undefined
  var onVirtualKeyboardConfirm: js.UndefOr[InputEventHandler] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var textAlign: js.UndefOr[left | center] = js.undefined
  var `type`: js.UndefOr[text | bankCard | phone | password | number | digit | money] = js.undefined
  var updatePlaceholder: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object InputItemPropsType {
  @scala.inline
  def apply(
    clear: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledKeys: js.UndefOr[Null | js.Array[InputKey]] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: ReactNode = null,
    labelNumber: js.UndefOr[Double] = js.undefined,
    labelPosition: left | top = null,
    locale: js.Object = null,
    maxLength: js.UndefOr[Double] = js.undefined,
    moneyKeyboardAlign: String = null,
    moneyKeyboardHeader: ReactNode = null,
    moneyKeyboardWrapProps: js.Object = null,
    name: String = null,
    onBlur: /* value */ js.UndefOr[String] => Unit = null,
    onChange: /* value */ String => Unit = null,
    onFocus: /* value */ js.UndefOr[String] => Unit = null,
    onVirtualKeyboardConfirm: /* value */ js.UndefOr[String] => Unit = null,
    placeholder: String = null,
    textAlign: left | center = null,
    `type`: text | bankCard | phone | password | number | digit | money = null,
    updatePlaceholder: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): InputItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear.get.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledKeys)) __obj.updateDynamic("disabledKeys")(disabledKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.get.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(labelNumber)) __obj.updateDynamic("labelNumber")(labelNumber.get.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (moneyKeyboardAlign != null) __obj.updateDynamic("moneyKeyboardAlign")(moneyKeyboardAlign.asInstanceOf[js.Any])
    if (moneyKeyboardHeader != null) __obj.updateDynamic("moneyKeyboardHeader")(moneyKeyboardHeader.asInstanceOf[js.Any])
    if (moneyKeyboardWrapProps != null) __obj.updateDynamic("moneyKeyboardWrapProps")(moneyKeyboardWrapProps.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onVirtualKeyboardConfirm != null) __obj.updateDynamic("onVirtualKeyboardConfirm")(js.Any.fromFunction1(onVirtualKeyboardConfirm))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(updatePlaceholder)) __obj.updateDynamic("updatePlaceholder")(updatePlaceholder.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputItemPropsType]
  }
}

