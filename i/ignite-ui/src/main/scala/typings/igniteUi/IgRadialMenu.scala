package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgRadialMenu
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Returns or sets the background of the center button of the menu when the IsOpen property is false.
    */
  var centerButtonClosedFill: js.UndefOr[String] = js.undefined
  /**
    * Returns or sets the brush used for the outline of the ring of the center button when the IsOpen property is false.
    */
  var centerButtonClosedStroke: js.UndefOr[String] = js.undefined
  /**
    * Returns or sets the height of the center button content.
    */
  var centerButtonContentHeight: js.UndefOr[Double] = js.undefined
  /**
    * Returns or sets the width of the center button content.
    */
  var centerButtonContentWidth: js.UndefOr[Double] = js.undefined
  /**
    * Returns or sets the background of the center button of the menu when the IsOpen property is true.
    */
  var centerButtonFill: js.UndefOr[String] = js.undefined
  /**
    * Returns or sets the background of the center button of the menu when under the pointer.
    */
  var centerButtonHotTrackFill: js.UndefOr[String] = js.undefined
  /**
    * Returns or sets the brush used for the outline of the ring of the center button when under the pointer.
    */
  var centerButtonHotTrackStroke: js.UndefOr[String] = js.undefined
  /**
    * Returns or sets the brush used for the outline of the ring of the center button when the IsOpen is true.
    */
  var centerButtonStroke: js.UndefOr[String] = js.undefined
  /**
    * Returns or sets the width of the outline of the inner rings of the menu.
    */
  var centerButtonStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
    * Invoked when the IsOpen property is changed to false.
    * Function takes a first argument ui.
    * Use ui.owner to obtain reference to menu widget.
    */
  var closed: js.UndefOr[ClosedEvent] = js.undefined
  /**
    * Gets or sets the name of the item within the menu whose children are currently displayed.
    */
  var currentOpenMenuItemName: js.UndefOr[String] = js.undefined
  /**
    * The font for the control
    */
  var font: js.UndefOr[String] = js.undefined
  /**
    * Returns or sets a boolean indicating whether the items of the menu are currently displayed. When closed, only the center button is rendered.
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the items in the menu.
    */
  var items: js.UndefOr[js.Array[IgRadialMenuItem]] = js.undefined
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
    * Returns or sets the brush for the backing of the radial menu.
    */
  var menuBackground: js.UndefOr[String] = js.undefined
  /**
    * Returns or sets the duration of the animation performed when the IsOpen property is changed.
    */
  var menuItemOpenCloseAnimationDuration: js.UndefOr[Double] = js.undefined
  /**
    * Returns or sets the easing function applied to the animation that occurs when the IsOpen property is changed.
    */
  var menuItemOpenCloseAnimationEasingFunction: js.UndefOr[js.Any] = js.undefined
  /**
    * Returns or sets the duration of the animation performed when the IsOpen property is changed.
    */
  var menuOpenCloseAnimationDuration: js.UndefOr[Double] = js.undefined
  /**
    * Returns or sets the easing function applied to the animation that occurs when the IsOpen property is changed.
    */
  var menuOpenCloseAnimationEasingFunction: js.UndefOr[js.Any] = js.undefined
  /**
    * Returns or sets the minimum number of wedges displayed by the menu.
    */
  var minWedgeCount: js.UndefOr[Double] = js.undefined
  /**
    * Invoked when the IsOpen property is changed to true.
    * Function takes a first argument ui.
    * Use ui.owner to obtain reference to menu widget.
    */
  var opened: js.UndefOr[OpenedEvent] = js.undefined
  /**
    * Returns or sets the background of the outer ring of the menu.
    */
  var outerRingFill: js.UndefOr[String] = js.undefined
  /**
    * Returns or sets the brush used for the outline of the outer ring.
    */
  var outerRingStroke: js.UndefOr[String] = js.undefined
  /**
    * Returns or sets the width of the outline of the outer ring of the menu.
    */
  var outerRingStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
    * Returns or sets the thickness of the outer ring of the menu.
    */
  var outerRingThickness: js.UndefOr[Double] = js.undefined
  var pixelScalingRatio: js.UndefOr[Double] = js.undefined
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
    * Returns or sets the starting angle of the items expressed as the percentage of the width of a single wedge/slice.
    */
  var rotationAsPercentageOfWedge: js.UndefOr[Double] = js.undefined
  /**
    * Returns or sets the starting angle of the items in degrees.
    */
  var rotationInDegrees: js.UndefOr[Double] = js.undefined
  /**
    * Returns or sets the amount of padding around each wedge in degrees.
    */
  var wedgePaddingInDegrees: js.UndefOr[Double] = js.undefined
}

object IgRadialMenu {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    centerButtonClosedFill: String = null,
    centerButtonClosedStroke: String = null,
    centerButtonContentHeight: js.UndefOr[Double] = js.undefined,
    centerButtonContentWidth: js.UndefOr[Double] = js.undefined,
    centerButtonFill: String = null,
    centerButtonHotTrackFill: String = null,
    centerButtonHotTrackStroke: String = null,
    centerButtonStroke: String = null,
    centerButtonStrokeThickness: js.UndefOr[Double] = js.undefined,
    closed: (/* event */ Event, /* ui */ ClosedEventUIParam) => Unit = null,
    currentOpenMenuItemName: String = null,
    font: String = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[IgRadialMenuItem] = null,
    language: String = null,
    locale: js.Any = null,
    menuBackground: String = null,
    menuItemOpenCloseAnimationDuration: js.UndefOr[Double] = js.undefined,
    menuItemOpenCloseAnimationEasingFunction: js.Any = null,
    menuOpenCloseAnimationDuration: js.UndefOr[Double] = js.undefined,
    menuOpenCloseAnimationEasingFunction: js.Any = null,
    minWedgeCount: js.UndefOr[Double] = js.undefined,
    opened: (/* event */ Event, /* ui */ OpenedEventUIParam) => Unit = null,
    outerRingFill: String = null,
    outerRingStroke: String = null,
    outerRingStrokeThickness: js.UndefOr[Double] = js.undefined,
    outerRingThickness: js.UndefOr[Double] = js.undefined,
    pixelScalingRatio: js.UndefOr[Double] = js.undefined,
    regional: String | js.Object = null,
    rotationAsPercentageOfWedge: js.UndefOr[Double] = js.undefined,
    rotationInDegrees: js.UndefOr[Double] = js.undefined,
    wedgePaddingInDegrees: js.UndefOr[Double] = js.undefined
  ): IgRadialMenu = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (centerButtonClosedFill != null) __obj.updateDynamic("centerButtonClosedFill")(centerButtonClosedFill.asInstanceOf[js.Any])
    if (centerButtonClosedStroke != null) __obj.updateDynamic("centerButtonClosedStroke")(centerButtonClosedStroke.asInstanceOf[js.Any])
    if (!js.isUndefined(centerButtonContentHeight)) __obj.updateDynamic("centerButtonContentHeight")(centerButtonContentHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centerButtonContentWidth)) __obj.updateDynamic("centerButtonContentWidth")(centerButtonContentWidth.get.asInstanceOf[js.Any])
    if (centerButtonFill != null) __obj.updateDynamic("centerButtonFill")(centerButtonFill.asInstanceOf[js.Any])
    if (centerButtonHotTrackFill != null) __obj.updateDynamic("centerButtonHotTrackFill")(centerButtonHotTrackFill.asInstanceOf[js.Any])
    if (centerButtonHotTrackStroke != null) __obj.updateDynamic("centerButtonHotTrackStroke")(centerButtonHotTrackStroke.asInstanceOf[js.Any])
    if (centerButtonStroke != null) __obj.updateDynamic("centerButtonStroke")(centerButtonStroke.asInstanceOf[js.Any])
    if (!js.isUndefined(centerButtonStrokeThickness)) __obj.updateDynamic("centerButtonStrokeThickness")(centerButtonStrokeThickness.get.asInstanceOf[js.Any])
    if (closed != null) __obj.updateDynamic("closed")(js.Any.fromFunction2(closed))
    if (currentOpenMenuItemName != null) __obj.updateDynamic("currentOpenMenuItemName")(currentOpenMenuItemName.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (menuBackground != null) __obj.updateDynamic("menuBackground")(menuBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(menuItemOpenCloseAnimationDuration)) __obj.updateDynamic("menuItemOpenCloseAnimationDuration")(menuItemOpenCloseAnimationDuration.get.asInstanceOf[js.Any])
    if (menuItemOpenCloseAnimationEasingFunction != null) __obj.updateDynamic("menuItemOpenCloseAnimationEasingFunction")(menuItemOpenCloseAnimationEasingFunction.asInstanceOf[js.Any])
    if (!js.isUndefined(menuOpenCloseAnimationDuration)) __obj.updateDynamic("menuOpenCloseAnimationDuration")(menuOpenCloseAnimationDuration.get.asInstanceOf[js.Any])
    if (menuOpenCloseAnimationEasingFunction != null) __obj.updateDynamic("menuOpenCloseAnimationEasingFunction")(menuOpenCloseAnimationEasingFunction.asInstanceOf[js.Any])
    if (!js.isUndefined(minWedgeCount)) __obj.updateDynamic("minWedgeCount")(minWedgeCount.get.asInstanceOf[js.Any])
    if (opened != null) __obj.updateDynamic("opened")(js.Any.fromFunction2(opened))
    if (outerRingFill != null) __obj.updateDynamic("outerRingFill")(outerRingFill.asInstanceOf[js.Any])
    if (outerRingStroke != null) __obj.updateDynamic("outerRingStroke")(outerRingStroke.asInstanceOf[js.Any])
    if (!js.isUndefined(outerRingStrokeThickness)) __obj.updateDynamic("outerRingStrokeThickness")(outerRingStrokeThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outerRingThickness)) __obj.updateDynamic("outerRingThickness")(outerRingThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelScalingRatio)) __obj.updateDynamic("pixelScalingRatio")(pixelScalingRatio.get.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationAsPercentageOfWedge)) __obj.updateDynamic("rotationAsPercentageOfWedge")(rotationAsPercentageOfWedge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationInDegrees)) __obj.updateDynamic("rotationInDegrees")(rotationInDegrees.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wedgePaddingInDegrees)) __obj.updateDynamic("wedgePaddingInDegrees")(wedgePaddingInDegrees.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgRadialMenu]
  }
}

