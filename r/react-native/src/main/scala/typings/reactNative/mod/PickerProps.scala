package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.`box-none`
import typings.reactNative.reactNativeStrings.`box-only`
import typings.reactNative.reactNativeStrings.`no-hide-descendants`
import typings.reactNative.reactNativeStrings.assertive
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.button
import typings.reactNative.reactNativeStrings.dialog
import typings.reactNative.reactNativeStrings.dropdown
import typings.reactNative.reactNativeStrings.no
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.polite
import typings.reactNative.reactNativeStrings.radiobutton_checked
import typings.reactNative.reactNativeStrings.radiobutton_unchecked
import typings.reactNative.reactNativeStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
- typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
- typings.reactNative.mod.TVViewPropsIOS because Already inherited
- typings.reactNative.mod.AccessibilityProps because Already inherited
- typings.reactNative.mod.Touchable because Already inherited
- typings.reactNative.mod.GestureResponderHandlers because Already inherited
- typings.reactNative.mod.ViewPropsIOS because Already inherited
- typings.reactNative.mod.ViewPropsAndroid because Already inherited
- typings.reactNative.mod.ViewProps because Already inherited
- typings.reactNative.mod.PickerPropsAndroid because var conflicts: accessibilityActions, accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityTraits, accessibilityValue, accessibilityViewIsModal, accessible, collapsable, focusable, hasTVPreferredFocus, hitSlop, importantForAccessibility, isTVSelectable, nativeID, needsOffscreenAlphaCompositing, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onLayout, onMagicTap, onMoveShouldSetResponder, onMoveShouldSetResponderCapture, onResponderEnd, onResponderGrant, onResponderMove, onResponderReject, onResponderRelease, onResponderStart, onResponderTerminate, onResponderTerminationRequest, onStartShouldSetResponder, onStartShouldSetResponderCapture, onTouchCancel, onTouchEnd, onTouchEndCapture, onTouchMove, onTouchStart, pointerEvents, removeClippedSubviews, renderToHardwareTextureAndroid, shouldRasterizeIOS, style, testID, tvParallaxMagnification, tvParallaxProperties, tvParallaxShiftDistanceX, tvParallaxShiftDistanceY, tvParallaxTiltAngle. Inlined enabled, mode, prompt */ trait PickerProps extends PickerPropsIOS {
  /**
    * If set to false, the picker will be disabled, i.e. the user will not be able to make a
    * selection.
    * @platform android
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * On Android, specifies how to display the selection items when the user taps on the picker:
    *
    *   - 'dialog': Show a modal dialog. This is the default.
    *   - 'dropdown': Shows a dropdown anchored to the picker view
    *
    * @platform android
    */
  var mode: js.UndefOr[dialog | dropdown] = js.undefined
  /**
    * Callback for when an item is selected. This is called with the
    * following parameters:
    * - itemValue: the value prop of the item that was selected
    * - itemPosition: the index of the selected item in this picker
    */
  var onValueChange: js.UndefOr[js.Function2[/* itemValue */ js.Any, /* itemPosition */ Double, Unit]] = js.undefined
  /**
    * Prompt string for this picker, used on Android in dialog mode as the title of the dialog.
    * @platform android
    */
  var prompt: js.UndefOr[String] = js.undefined
  /**
    * Value matching value of one of the items.
    * Can be a string or an integer.
    */
  var selectedValue: js.UndefOr[js.Any] = js.undefined
  @JSName("style")
  var style_PickerProps: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Used to locate this view in end-to-end tests.
    */
  var testId: js.UndefOr[String] = js.undefined
}

object PickerProps {
  @scala.inline
  def apply(
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityValue: AccessibilityValue = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    focusable: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    itemStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    mode: dialog | dropdown = null,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Unit = null,
    onAccessibilityEscape: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onMoveShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onMoveShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onResponderEnd: /* event */ GestureResponderEvent => Unit = null,
    onResponderGrant: /* event */ GestureResponderEvent => Unit = null,
    onResponderMove: /* event */ GestureResponderEvent => Unit = null,
    onResponderReject: /* event */ GestureResponderEvent => Unit = null,
    onResponderRelease: /* event */ GestureResponderEvent => Unit = null,
    onResponderStart: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminate: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminationRequest: /* event */ GestureResponderEvent => Boolean = null,
    onStartShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onStartShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onTouchCancel: /* event */ GestureResponderEvent => Unit = null,
    onTouchEnd: /* event */ GestureResponderEvent => Unit = null,
    onTouchEndCapture: /* event */ GestureResponderEvent => Unit = null,
    onTouchMove: /* event */ GestureResponderEvent => Unit = null,
    onTouchStart: /* event */ GestureResponderEvent => Unit = null,
    onValueChange: (/* itemValue */ js.Any, /* itemPosition */ Double) => Unit = null,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    prompt: String = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    selectedValue: js.Any = null,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    testID: String = null,
    testId: String = null,
    tvParallaxMagnification: js.UndefOr[Double] = js.undefined,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined,
    tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined,
    tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
  ): PickerProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.get.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.get.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (accessibilityValue != null) __obj.updateDynamic("accessibilityValue")(accessibilityValue.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.get.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemStyle)) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.get.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1(onResponderEnd))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1(onResponderGrant))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1(onResponderMove))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1(onResponderReject))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1(onResponderRelease))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1(onResponderStart))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1(onResponderTerminate))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(onResponderTerminationRequest))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.get.asInstanceOf[js.Any])
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (testId != null) __obj.updateDynamic("testId")(testId.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxMagnification)) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.get.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxShiftDistanceX)) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxShiftDistanceY)) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxTiltAngle)) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps]
  }
}

