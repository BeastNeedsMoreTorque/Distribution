package typings.antDesignReactNative.pickerMod

import typings.antDesignReactNative.cascaderTypesMod.CascaderValue
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.pickerPropsTypeMod.PickerData
import typings.antDesignReactNative.pickerPropsTypeMod.PickerPropsType
import typings.antDesignReactNative.pickerStyleMod.PickerStyle
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerProps
  extends PickerPropsType
     with WithThemeStyles[PickerStyle] {
  var pickerPrefixCls: js.UndefOr[String] = js.undefined
  var popupPrefixCls: js.UndefOr[String] = js.undefined
}

object PickerProps {
  @scala.inline
  def apply(
    data: js.Array[js.Array[PickerData] | PickerData],
    WrapComponent: js.Any = null,
    actionTextActiveOpacity: js.UndefOr[Double] = js.undefined,
    actionTextUnderlayColor: String = null,
    cascade: js.UndefOr[Boolean] = js.undefined,
    cols: js.UndefOr[Double] = js.undefined,
    content: ReactElement | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dismissText: String | ReactElement = null,
    extra: String = null,
    format: /* values */ js.Array[String] => String = null,
    indicatorStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    itemStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    maskTransitionName: String = null,
    okText: String | ReactElement = null,
    onChange: /* date */ js.UndefOr[CascaderValue] => Unit = null,
    onDismiss: () => Unit = null,
    onOk: /* value */ js.UndefOr[js.Any] => Unit = null,
    onPickerChange: /* value */ CascaderValue => Unit = null,
    onVisibleChange: /* visible */ Boolean => Unit = null,
    picker: js.Any = null,
    pickerPrefixCls: String = null,
    pickerValueChangeProp: String = null,
    pickerValueProp: String = null,
    popupPrefixCls: String = null,
    popupTransitionName: String = null,
    style: js.Any = null,
    styles: Partial[PickerStyle] = null,
    title: String | ReactElement = null,
    transitionName: String = null,
    triggerType: String = null,
    value: js.Array[String | Double] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wrapStyle: CSSProperties = null
  ): PickerProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (WrapComponent != null) __obj.updateDynamic("WrapComponent")(WrapComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(actionTextActiveOpacity)) __obj.updateDynamic("actionTextActiveOpacity")(actionTextActiveOpacity.get.asInstanceOf[js.Any])
    if (actionTextUnderlayColor != null) __obj.updateDynamic("actionTextUnderlayColor")(actionTextUnderlayColor.asInstanceOf[js.Any])
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (!js.isUndefined(indicatorStyle)) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(itemStyle)) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (onPickerChange != null) __obj.updateDynamic("onPickerChange")(js.Any.fromFunction1(onPickerChange))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls.asInstanceOf[js.Any])
    if (pickerValueChangeProp != null) __obj.updateDynamic("pickerValueChangeProp")(pickerValueChangeProp.asInstanceOf[js.Any])
    if (pickerValueProp != null) __obj.updateDynamic("pickerValueProp")(pickerValueProp.asInstanceOf[js.Any])
    if (popupPrefixCls != null) __obj.updateDynamic("popupPrefixCls")(popupPrefixCls.asInstanceOf[js.Any])
    if (popupTransitionName != null) __obj.updateDynamic("popupTransitionName")(popupTransitionName.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (wrapStyle != null) __obj.updateDynamic("wrapStyle")(wrapStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps]
  }
}

