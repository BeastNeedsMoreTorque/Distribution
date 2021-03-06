package typings.tinySliderReact.mod

import typings.std.HTMLElement
import typings.tinySliderReact.tinySliderReactBooleans.`false`
import typings.tinySliderReact.tinySliderReactStrings.backward
import typings.tinySliderReact.tinySliderReactStrings.carousel
import typings.tinySliderReact.tinySliderReactStrings.forward
import typings.tinySliderReact.tinySliderReactStrings.gallery
import typings.tinySliderReact.tinySliderReactStrings.horizontal
import typings.tinySliderReact.tinySliderReactStrings.inner
import typings.tinySliderReact.tinySliderReactStrings.outer
import typings.tinySliderReact.tinySliderReactStrings.page
import typings.tinySliderReact.tinySliderReactStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinySliderSettings extends CommonOptions {
  /**
    * Time between each gallery animation (in "ms").
    * @defaultValue false
    */
  var animateDelay: js.UndefOr[Double | `false`] = js.undefined
  /**
    * Name of intro animation class.
    * @defaultValue "tns-fadeIn"
    */
  var animateIn: js.UndefOr[String] = js.undefined
  /**
    * Name of default animation class.
    * @defaultValue "tns-normal"
    */
  var animateNormal: js.UndefOr[String] = js.undefined
  /**
    * Name of outro animation class.
    * @defaultValue "tns-fadeOut"
    */
  var animateOut: js.UndefOr[String] = js.undefined
  /**
    * The customized autoplay start/stop button or selector.
    * @defaultValue false
    */
  var autoplayButton: js.UndefOr[HTMLElement | String | `false`] = js.undefined
  /**
    * Output autoplayButton markup when autoplay is true but a customized autoplayButton is not provided.
    * @defaultValue true
    */
  var autoplayButtonOutput: js.UndefOr[Boolean] = js.undefined
  /**
    * Direction of slide movement (ascending/descending the slide index).
    * @defaultValue "forward"
    */
  var autoplayDirection: js.UndefOr[forward | backward] = js.undefined
  /**
    * The axis of the slider.
    * @defaultValue "horizontal"
    */
  var axis: js.UndefOr[horizontal | vertical] = js.undefined
  /**
    * The container element/selector around the prev/next buttons.
    * controlsContainer must have at least 2 child elements.
    * @defaultValue false
    */
  var controlsContainer: js.UndefOr[HTMLElement | String | `false`] = js.undefined
  /**
    * Indicate whether the slider will be frozen (controls, nav, autoplay and other functions will stop work) when all slides can be displayed in one page.
    * @defaultValue true
    */
  var freezable: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables lazyloading images that are currently not viewed, thus saving bandwidth
    * @defaultValue false
    */
  var lazyload: js.UndefOr[Boolean] = js.undefined
  /**
    * Moves throughout all the slides seamlessly.
    * @defaultValue true
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls animation behaviour.
    * With carousel everything slides to the side, while gallery uses fade animations and changes all slides at once.
    * @defaultValue "carousel"
    */
  var mode: js.UndefOr[carousel | gallery] = js.undefined
  /**
    * Indecate if the dots are thurbnails. If true, they will always be visible even when more than 1 slides displayed in the viewport.
    * @defaultValue false
    */
  var navAsThumbnails: js.UndefOr[Boolean] = js.undefined
  /**
    * The container element/selector around the dots.
    * navContainer must have at least same number of children as the slides.
    * @defaultValue false
    */
  var navContainer: js.UndefOr[HTMLElement | String | `false`] = js.undefined
  /**
    * Difine the relationship between nested sliders.
    * Make sure you run the inner slider first, otherwise the height of the inner slider container will be wrong.
    * @defaultValue false
    */
  var nested: js.UndefOr[inner | outer | `false`] = js.undefined
  /**
    * Callback to be run on initialization.
    * @defaultValue false
    */
  var onInit: js.UndefOr[js.Function0[Unit | `false`]] = js.undefined
  /**
    * Breakpoint: Integer.
    * Defines options for different viewport widths
    * @defaultValue false
    */
  var responsive: js.UndefOr[ResponsiveOptions | `false`] = js.undefined
  /**
    * Moves to the opposite edge when reaching the first or last slide.
    * @defaultValue false
    */
  var rewind: js.UndefOr[Boolean] = js.undefined
  /**
    * Swipe or drag will not be triggered if the angle is not inside the range when set.
    * @defaultValue 15
    */
  var swipeAngle: js.UndefOr[Double | Boolean] = js.undefined
}

object TinySliderSettings {
  @scala.inline
  def apply(
    animateDelay: Double | `false` = null,
    animateIn: String = null,
    animateNormal: String = null,
    animateOut: String = null,
    arrowKeys: js.UndefOr[Boolean] = js.undefined,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayButton: HTMLElement | String | `false` = null,
    autoplayButtonOutput: js.UndefOr[Boolean] = js.undefined,
    autoplayDirection: forward | backward = null,
    autoplayHoverPause: js.UndefOr[Boolean] = js.undefined,
    autoplayResetOnVisibility: js.UndefOr[Boolean] = js.undefined,
    autoplayText: js.Array[String] = null,
    autoplayTimeout: js.UndefOr[Double] = js.undefined,
    axis: horizontal | vertical = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    controlsContainer: HTMLElement | String | `false` = null,
    controlsText: js.Array[String] = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    edgePadding: js.UndefOr[Double] = js.undefined,
    fixedWidth: Double | `false` = null,
    freezable: js.UndefOr[Boolean] = js.undefined,
    gutter: js.UndefOr[Double] = js.undefined,
    items: js.UndefOr[Double] = js.undefined,
    lazyload: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    mode: carousel | gallery = null,
    mouseDrag: js.UndefOr[Boolean] = js.undefined,
    nav: js.UndefOr[Boolean] = js.undefined,
    navAsThumbnails: js.UndefOr[Boolean] = js.undefined,
    navContainer: HTMLElement | String | `false` = null,
    nested: inner | outer | `false` = null,
    onInit: () => Unit | `false` = null,
    responsive: ResponsiveOptions | `false` = null,
    rewind: js.UndefOr[Boolean] = js.undefined,
    slideBy: Double | page = null,
    speed: js.UndefOr[Double] = js.undefined,
    startIndex: js.UndefOr[Double] = js.undefined,
    swipeAngle: Double | Boolean = null,
    touch: js.UndefOr[Boolean] = js.undefined
  ): TinySliderSettings = {
    val __obj = js.Dynamic.literal()
    if (animateDelay != null) __obj.updateDynamic("animateDelay")(animateDelay.asInstanceOf[js.Any])
    if (animateIn != null) __obj.updateDynamic("animateIn")(animateIn.asInstanceOf[js.Any])
    if (animateNormal != null) __obj.updateDynamic("animateNormal")(animateNormal.asInstanceOf[js.Any])
    if (animateOut != null) __obj.updateDynamic("animateOut")(animateOut.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowKeys)) __obj.updateDynamic("arrowKeys")(arrowKeys.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (autoplayButton != null) __obj.updateDynamic("autoplayButton")(autoplayButton.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayButtonOutput)) __obj.updateDynamic("autoplayButtonOutput")(autoplayButtonOutput.get.asInstanceOf[js.Any])
    if (autoplayDirection != null) __obj.updateDynamic("autoplayDirection")(autoplayDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayHoverPause)) __obj.updateDynamic("autoplayHoverPause")(autoplayHoverPause.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayResetOnVisibility)) __obj.updateDynamic("autoplayResetOnVisibility")(autoplayResetOnVisibility.get.asInstanceOf[js.Any])
    if (autoplayText != null) __obj.updateDynamic("autoplayText")(autoplayText.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayTimeout)) __obj.updateDynamic("autoplayTimeout")(autoplayTimeout.get.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.get.asInstanceOf[js.Any])
    if (controlsContainer != null) __obj.updateDynamic("controlsContainer")(controlsContainer.asInstanceOf[js.Any])
    if (controlsText != null) __obj.updateDynamic("controlsText")(controlsText.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(edgePadding)) __obj.updateDynamic("edgePadding")(edgePadding.get.asInstanceOf[js.Any])
    if (fixedWidth != null) __obj.updateDynamic("fixedWidth")(fixedWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(freezable)) __obj.updateDynamic("freezable")(freezable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gutter)) __obj.updateDynamic("gutter")(gutter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(items)) __obj.updateDynamic("items")(items.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyload)) __obj.updateDynamic("lazyload")(lazyload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseDrag)) __obj.updateDynamic("mouseDrag")(mouseDrag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nav)) __obj.updateDynamic("nav")(nav.get.asInstanceOf[js.Any])
    if (!js.isUndefined(navAsThumbnails)) __obj.updateDynamic("navAsThumbnails")(navAsThumbnails.get.asInstanceOf[js.Any])
    if (navContainer != null) __obj.updateDynamic("navContainer")(navContainer.asInstanceOf[js.Any])
    if (nested != null) __obj.updateDynamic("nested")(nested.asInstanceOf[js.Any])
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction0(onInit))
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(rewind)) __obj.updateDynamic("rewind")(rewind.get.asInstanceOf[js.Any])
    if (slideBy != null) __obj.updateDynamic("slideBy")(slideBy.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (swipeAngle != null) __obj.updateDynamic("swipeAngle")(swipeAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinySliderSettings]
  }
}

