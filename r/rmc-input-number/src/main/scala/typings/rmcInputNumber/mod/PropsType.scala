package typings.rmcInputNumber.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType
  extends typings.rmcInputNumber.baseMod.PropsType {
  var className: js.UndefOr[js.Any] = js.undefined
  var downHandler: js.UndefOr[ReactNode] = js.undefined
  var focusOnUpDown: js.UndefOr[Boolean] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var upHandler: js.UndefOr[ReactNode] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: js.Any = null,
    defaultValue: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    downHandler: ReactNode = null,
    focusOnUpDown: js.UndefOr[Boolean] = js.undefined,
    formatter: /* v */ js.Any => Unit = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    onBlur: /* e */ js.Any => Unit = null,
    onChange: /* e */ js.Any => Unit = null,
    onFocus: /* e */ js.UndefOr[js.Any] => Unit = null,
    parser: /* v */ js.Any => Unit = null,
    precision: js.UndefOr[Double] = js.undefined,
    prefixCls: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    step: String | Double = null,
    style: js.Any = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    upHandler: ReactNode = null,
    value: js.UndefOr[Double] = js.undefined
  ): PropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (downHandler != null) __obj.updateDynamic("downHandler")(downHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnUpDown)) __obj.updateDynamic("focusOnUpDown")(focusOnUpDown.get.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1(parser))
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (upHandler != null) __obj.updateDynamic("upHandler")(upHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

