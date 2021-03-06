package typings.reactNativeGestureHandler.drawerLayoutMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StatusBarAnimation
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerLayoutProperties extends js.Object {
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var drawerBackgroundColor: js.UndefOr[String] = js.undefined
  var drawerLockMode: js.UndefOr[DrawerLockMode] = js.undefined
  var drawerPosition: js.UndefOr[DrawerPosition] = js.undefined
  var drawerType: js.UndefOr[DrawerType] = js.undefined
  var drawerWidth: js.UndefOr[Double] = js.undefined
  var edgeWidth: js.UndefOr[Double] = js.undefined
  var hideStatusBar: js.UndefOr[Boolean] = js.undefined
  var keyboardDismissMode: js.UndefOr[DrawerKeyboardDismissMode] = js.undefined
  var minSwipeDistance: js.UndefOr[Double] = js.undefined
  var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDrawerStateChanged: js.UndefOr[js.Function2[/* newState */ DrawerState, /* drawerWillShow */ Boolean, Unit]] = js.undefined
  var overlayColor: js.UndefOr[String] = js.undefined
  var statusBarAnimation: js.UndefOr[StatusBarAnimation] = js.undefined
  var useNativeAnimations: js.UndefOr[Boolean] = js.undefined
  def renderNavigationView(progressAnimatedValue: Value): ReactNode
}

object DrawerLayoutProperties {
  @scala.inline
  def apply(
    renderNavigationView: Value => ReactNode,
    contentContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    drawerBackgroundColor: String = null,
    drawerLockMode: DrawerLockMode = null,
    drawerPosition: DrawerPosition = null,
    drawerType: DrawerType = null,
    drawerWidth: js.UndefOr[Double] = js.undefined,
    edgeWidth: js.UndefOr[Double] = js.undefined,
    hideStatusBar: js.UndefOr[Boolean] = js.undefined,
    keyboardDismissMode: DrawerKeyboardDismissMode = null,
    minSwipeDistance: js.UndefOr[Double] = js.undefined,
    onDrawerClose: () => Unit = null,
    onDrawerOpen: () => Unit = null,
    onDrawerStateChanged: (/* newState */ DrawerState, /* drawerWillShow */ Boolean) => Unit = null,
    overlayColor: String = null,
    statusBarAnimation: StatusBarAnimation = null,
    useNativeAnimations: js.UndefOr[Boolean] = js.undefined
  ): DrawerLayoutProperties = {
    val __obj = js.Dynamic.literal(renderNavigationView = js.Any.fromFunction1(renderNavigationView))
    if (!js.isUndefined(contentContainerStyle)) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor.asInstanceOf[js.Any])
    if (drawerLockMode != null) __obj.updateDynamic("drawerLockMode")(drawerLockMode.asInstanceOf[js.Any])
    if (drawerPosition != null) __obj.updateDynamic("drawerPosition")(drawerPosition.asInstanceOf[js.Any])
    if (drawerType != null) __obj.updateDynamic("drawerType")(drawerType.asInstanceOf[js.Any])
    if (!js.isUndefined(drawerWidth)) __obj.updateDynamic("drawerWidth")(drawerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeWidth)) __obj.updateDynamic("edgeWidth")(edgeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideStatusBar)) __obj.updateDynamic("hideStatusBar")(hideStatusBar.get.asInstanceOf[js.Any])
    if (keyboardDismissMode != null) __obj.updateDynamic("keyboardDismissMode")(keyboardDismissMode.asInstanceOf[js.Any])
    if (!js.isUndefined(minSwipeDistance)) __obj.updateDynamic("minSwipeDistance")(minSwipeDistance.get.asInstanceOf[js.Any])
    if (onDrawerClose != null) __obj.updateDynamic("onDrawerClose")(js.Any.fromFunction0(onDrawerClose))
    if (onDrawerOpen != null) __obj.updateDynamic("onDrawerOpen")(js.Any.fromFunction0(onDrawerOpen))
    if (onDrawerStateChanged != null) __obj.updateDynamic("onDrawerStateChanged")(js.Any.fromFunction2(onDrawerStateChanged))
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (statusBarAnimation != null) __obj.updateDynamic("statusBarAnimation")(statusBarAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeAnimations)) __obj.updateDynamic("useNativeAnimations")(useNativeAnimations.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutProperties]
  }
}

