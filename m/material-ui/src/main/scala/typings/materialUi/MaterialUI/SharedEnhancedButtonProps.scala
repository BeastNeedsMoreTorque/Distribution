package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedEnhancedButtonProps[T] extends js.Object {
  var centerRipple: js.UndefOr[Boolean] = js.undefined
  var containerElement: js.UndefOr[ReactNode | String] = js.undefined
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  var disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[Boolean] = js.undefined
  var focusRippleColor: js.UndefOr[String] = js.undefined
  var focusRippleOpacity: js.UndefOr[Double] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var keyboardFocused: js.UndefOr[Boolean] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var touchRippleColor: js.UndefOr[String] = js.undefined
  var touchRippleOpacity: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object SharedEnhancedButtonProps {
  @scala.inline
  def apply[T](
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    containerElement: ReactNode | String = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    focusRippleColor: String = null,
    focusRippleOpacity: js.UndefOr[Double] = js.undefined,
    href: String = null,
    keyboardFocused: js.UndefOr[Boolean] = js.undefined,
    onBlur: FocusEvent[js.Object] => Unit = null,
    onClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onFocus: FocusEvent[js.Object] => Unit = null,
    onKeyDown: KeyboardEvent[js.Object] => Unit = null,
    onKeyUp: KeyboardEvent[js.Object] => Unit = null,
    onKeyboardFocus: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    style: CSSProperties = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    target: String = null,
    touchRippleColor: String = null,
    touchRippleOpacity: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): SharedEnhancedButtonProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple.get.asInstanceOf[js.Any])
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple.get.asInstanceOf[js.Any])
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor.asInstanceOf[js.Any])
    if (!js.isUndefined(focusRippleOpacity)) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.get.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused.get.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor.asInstanceOf[js.Any])
    if (!js.isUndefined(touchRippleOpacity)) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedEnhancedButtonProps[T]]
  }
}

