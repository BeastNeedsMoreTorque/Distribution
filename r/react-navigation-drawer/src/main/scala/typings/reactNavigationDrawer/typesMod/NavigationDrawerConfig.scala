package typings.reactNavigationDrawer.typesMod

import typings.react.mod.ComponentType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.`on-drag`
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.back
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.fade
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.front
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.none
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationDrawerConfig extends js.Object {
  var contentComponent: js.UndefOr[ComponentType[DrawerContentComponentProps]] = js.undefined
  var drawerBackgroundColor: js.UndefOr[ThemedColor] = js.undefined
  var drawerLockMode: js.UndefOr[DrawerLockMode] = js.undefined
  var drawerPosition: js.UndefOr[left | right] = js.undefined
  var drawerType: js.UndefOr[front | back | slide] = js.undefined
  var drawerWidth: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  var edgeWidth: js.UndefOr[Double] = js.undefined
  var hideStatusBar: js.UndefOr[Boolean] = js.undefined
  var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.undefined
  var minSwipeDistance: js.UndefOr[Double] = js.undefined
  var overlayColor: js.UndefOr[ThemedColor] = js.undefined
  var screenContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var statusBarAnimation: js.UndefOr[slide | none | fade] = js.undefined
  var swipeDistanceThreshold: js.UndefOr[Double] = js.undefined
  var swipeEdgeWidth: js.UndefOr[Double] = js.undefined
  var swipeVelocityThreshold: js.UndefOr[Double] = js.undefined
}

object NavigationDrawerConfig {
  @scala.inline
  def apply(
    contentComponent: ComponentType[DrawerContentComponentProps] = null,
    drawerBackgroundColor: ThemedColor = null,
    drawerLockMode: DrawerLockMode = null,
    drawerPosition: left | right = null,
    drawerType: front | back | slide = null,
    drawerWidth: Double | js.Function0[Double] = null,
    edgeWidth: js.UndefOr[Double] = js.undefined,
    hideStatusBar: js.UndefOr[Boolean] = js.undefined,
    keyboardDismissMode: none | `on-drag` = null,
    minSwipeDistance: js.UndefOr[Double] = js.undefined,
    overlayColor: ThemedColor = null,
    screenContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    statusBarAnimation: slide | none | fade = null,
    swipeDistanceThreshold: js.UndefOr[Double] = js.undefined,
    swipeEdgeWidth: js.UndefOr[Double] = js.undefined,
    swipeVelocityThreshold: js.UndefOr[Double] = js.undefined
  ): NavigationDrawerConfig = {
    val __obj = js.Dynamic.literal()
    if (contentComponent != null) __obj.updateDynamic("contentComponent")(contentComponent.asInstanceOf[js.Any])
    if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor.asInstanceOf[js.Any])
    if (drawerLockMode != null) __obj.updateDynamic("drawerLockMode")(drawerLockMode.asInstanceOf[js.Any])
    if (drawerPosition != null) __obj.updateDynamic("drawerPosition")(drawerPosition.asInstanceOf[js.Any])
    if (drawerType != null) __obj.updateDynamic("drawerType")(drawerType.asInstanceOf[js.Any])
    if (drawerWidth != null) __obj.updateDynamic("drawerWidth")(drawerWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeWidth)) __obj.updateDynamic("edgeWidth")(edgeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideStatusBar)) __obj.updateDynamic("hideStatusBar")(hideStatusBar.get.asInstanceOf[js.Any])
    if (keyboardDismissMode != null) __obj.updateDynamic("keyboardDismissMode")(keyboardDismissMode.asInstanceOf[js.Any])
    if (!js.isUndefined(minSwipeDistance)) __obj.updateDynamic("minSwipeDistance")(minSwipeDistance.get.asInstanceOf[js.Any])
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (!js.isUndefined(screenContainerStyle)) __obj.updateDynamic("screenContainerStyle")(screenContainerStyle.asInstanceOf[js.Any])
    if (statusBarAnimation != null) __obj.updateDynamic("statusBarAnimation")(statusBarAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeDistanceThreshold)) __obj.updateDynamic("swipeDistanceThreshold")(swipeDistanceThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeEdgeWidth)) __obj.updateDynamic("swipeEdgeWidth")(swipeEdgeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeVelocityThreshold)) __obj.updateDynamic("swipeVelocityThreshold")(swipeVelocityThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerConfig]
  }
}

