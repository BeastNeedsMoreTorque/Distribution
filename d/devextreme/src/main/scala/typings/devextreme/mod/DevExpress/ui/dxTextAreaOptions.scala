package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.Element
import typings.devextreme.anon.ElementEventJQueryEvent
import typings.devextreme.anon.JQueryEvent
import typings.devextreme.anon.Model
import typings.devextreme.anon.Name
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.clear
import typings.devextreme.devextremeStrings.email
import typings.devextreme.devextremeStrings.filled
import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.onFocus
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.password
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.search
import typings.devextreme.devextremeStrings.tel
import typings.devextreme.devextremeStrings.text
import typings.devextreme.devextremeStrings.underlined
import typings.devextreme.devextremeStrings.url
import typings.devextreme.devextremeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTextAreaOptions extends dxTextBoxOptions[dxTextArea] {
  /** @name dxTextArea.Options.autoResizeEnabled */
  var autoResizeEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name dxTextArea.Options.maxHeight */
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  /** @name dxTextArea.Options.minHeight */
  var minHeight: js.UndefOr[Double | String] = js.undefined
}

object dxTextAreaOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    autoResizeEnabled: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    buttons: js.Array[String | clear | dxTextEditorButton] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    inputAttr: js.Any = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    mask: String = null,
    maskChar: String = null,
    maskInvalidMessage: String = null,
    maskRules: js.Any = null,
    maxHeight: Double | String = null,
    maxLength: String | Double = null,
    minHeight: Double | String = null,
    mode: email | password | search | tel | text | url = null,
    name: String = null,
    onChange: /* e */ ElementEventJQueryEvent[dxTextArea] => _ = null,
    onContentReady: /* e */ ComponentElement[dxTextArea] => _ = null,
    onCopy: /* e */ ElementEventJQueryEvent[dxTextArea] => _ = null,
    onCut: /* e */ ElementEventJQueryEvent[dxTextArea] => _ = null,
    onDisposing: /* e */ Model[dxTextArea] => _ = null,
    onEnterKey: /* e */ ElementEventJQueryEvent[dxTextArea] => _ = null,
    onFocusIn: /* e */ ElementEventJQueryEvent[dxTextArea] => _ = null,
    onFocusOut: /* e */ ElementEventJQueryEvent[dxTextArea] => _ = null,
    onInitialized: /* e */ Element[dxTextArea] => _ = null,
    onInput: /* e */ ElementEventJQueryEvent[dxTextArea] => _ = null,
    onKeyDown: /* e */ ElementEventJQueryEvent[dxTextArea] => _ = null,
    onKeyPress: /* e */ ElementEventJQueryEvent[dxTextArea] => _ = null,
    onKeyUp: /* e */ ElementEventJQueryEvent[dxTextArea] => _ = null,
    onOptionChanged: /* e */ Name[dxTextArea] => _ = null,
    onPaste: /* e */ ElementEventJQueryEvent[dxTextArea] => _ = null,
    onValueChanged: /* e */ JQueryEvent[dxTextArea] => _ = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    showMaskMode: always | onFocus = null,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    stylingMode: outlined | underlined | filled = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    text: String = null,
    useMaskedValue: js.UndefOr[Boolean] = js.undefined,
    validationError: js.Any = null,
    validationErrors: js.Array[_] = null,
    validationMessageMode: always | auto = null,
    validationStatus: valid | invalid | pending = null,
    value: String = null,
    valueChangeEvent: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxTextAreaOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResizeEnabled)) __obj.updateDynamic("autoResizeEnabled")(autoResizeEnabled.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (inputAttr != null) __obj.updateDynamic("inputAttr")(inputAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.get.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskChar != null) __obj.updateDynamic("maskChar")(maskChar.asInstanceOf[js.Any])
    if (maskInvalidMessage != null) __obj.updateDynamic("maskInvalidMessage")(maskInvalidMessage.asInstanceOf[js.Any])
    if (maskRules != null) __obj.updateDynamic("maskRules")(maskRules.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onEnterKey != null) __obj.updateDynamic("onEnterKey")(js.Any.fromFunction1(onEnterKey))
    if (onFocusIn != null) __obj.updateDynamic("onFocusIn")(js.Any.fromFunction1(onFocusIn))
    if (onFocusOut != null) __obj.updateDynamic("onFocusOut")(js.Any.fromFunction1(onFocusOut))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onValueChanged != null) __obj.updateDynamic("onValueChanged")(js.Any.fromFunction1(onValueChanged))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton.get.asInstanceOf[js.Any])
    if (showMaskMode != null) __obj.updateDynamic("showMaskMode")(showMaskMode.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.get.asInstanceOf[js.Any])
    if (stylingMode != null) __obj.updateDynamic("stylingMode")(stylingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaskedValue)) __obj.updateDynamic("useMaskedValue")(useMaskedValue.get.asInstanceOf[js.Any])
    if (validationError != null) __obj.updateDynamic("validationError")(validationError.asInstanceOf[js.Any])
    if (validationErrors != null) __obj.updateDynamic("validationErrors")(validationErrors.asInstanceOf[js.Any])
    if (validationMessageMode != null) __obj.updateDynamic("validationMessageMode")(validationMessageMode.asInstanceOf[js.Any])
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueChangeEvent != null) __obj.updateDynamic("valueChangeEvent")(valueChangeEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTextAreaOptions]
  }
}

