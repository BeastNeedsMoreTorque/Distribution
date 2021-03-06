package typings.nukaCarousel.mod

import typings.nukaCarousel.anon.ContainerClassName
import typings.nukaCarousel.anon.slideActioninCarouselSlid
import typings.nukaCarousel.nukaCarouselStrings.zoom
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselProps extends js.Object {
  /**
    * Hook to be called after a slide is changed
    * @param index Index of the current slide
    */
  var afterSlide: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  /**
    * Adds a zoom effect on the currently visible slide.
    */
  var animation: js.UndefOr[zoom] = js.undefined
  /**
    * Will generate a style tag to help ensure images are displayed properly
    * @default true
    */
  var autoGenerateStyleTag: js.UndefOr[Boolean] = js.undefined
  /**
    * Autoplay mode active
    * @default false
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /**
    * Interval for autoplay iteration (ms)
    * @default 3000
    */
  var autoplayInterval: js.UndefOr[Double] = js.undefined
  /**
    * Autoplay cycles through slide indexes in reverse
    * @default false
    */
  var autoplayReverse: js.UndefOr[Boolean] = js.undefined
  /**
    * Hook to be called before a slide is changed
    * @param currentSlide Index of the current slide
    * @param endSlide Index of the last slide
    */
  var beforeSlide: js.UndefOr[js.Function2[/* currentSlide */ Double, /* endSlide */ Double, Unit]] = js.undefined
  /**
    * When displaying more than one slide,
    * sets which position to anchor the current slide to
    */
  var cellAlign: js.UndefOr[CarouselCellAlignProp] = js.undefined
  /**
    * Space between slides, as an integer, but reflected as px
    */
  var cellSpacing: js.UndefOr[Double] = js.undefined
  /**
    * Additional className
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * This prop lets you apply custom classes and styles to the default Next, Previous, and Paging Dots controls
    */
  var defaultControlsConfig: js.UndefOr[ContainerClassName] = js.undefined
  /**
    * Disable slides animation
    * @default false
    */
  var disableAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable swipe before first slide and after last slide
    * @default false
    */
  var disableEdgeSwiping: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable mouse swipe/dragging
    */
  var dragging: js.UndefOr[Boolean] = js.undefined
  /**
    * Animation easing function
    * @see https://github.com/d3/d3-ease
    */
  var easing: js.UndefOr[String] = js.undefined
  /**
    * Animation easing function when swipe exceeds edge
    * @see https://github.com/d3/d3-ease
    */
  var edgeEasing: js.UndefOr[String] = js.undefined
  /**
    * When set to true, disable keyboard controls
    * @default false
    */
  var enableKeyboardControls: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to set overflow style property on slider frame
    * @default 'hidden'
    */
  var frameOverflow: js.UndefOr[String] = js.undefined
  /**
    * Used to set the margin of the slider frame.
    * Accepts any string dimension value such as "0px 20px" or "500px"
    * @example '0px 20px'
    * @example '500px'
    */
  var framePadding: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to apply styles to the container of a control.
    */
  var getControlsContainerStyles: js.UndefOr[js.Function1[/* key */ CarouselControlContainerProp, CSSProperties]] = js.undefined
  /**
    * Used to hardcode the slider height
    * @example '80%'
    * @example '500px'
    */
  var height: js.UndefOr[String] = js.undefined
  /**
    * Change the height of the slides based either on the first slide,
    * the current slide, or the maximum height of all slides.
    */
  var heightMode: js.UndefOr[CarouselHeightModeProp] = js.undefined
  /**
    * Initial height of the slides (px)
    */
  var initialSlideHeight: js.UndefOr[Double] = js.undefined
  /**
    * Initial width of the slides (px)
    */
  var initialSlideWidth: js.UndefOr[Double] = js.undefined
  /**
    * Ref to pass to carousel element
    */
  var innerRef: js.UndefOr[RefObject[HTMLInputElement]] = js.undefined
  /**
    * When enableKeyboardControls is enabled, Configure keyCodes for corresponding slide actions as array of keyCodes
    */
  var keyCodeConfig: js.UndefOr[slideActioninCarouselSlid] = js.undefined
  /**
    * optional callback function
    */
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Window onResize callback
    */
  var onResize: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Pause autoPlay when mouse is over carousel
    * @default true
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
  /**
    * Function for rendering aria-live announcement messages
    */
  var renderAnnounceSlideMessage: js.UndefOr[
    js.Function1[/* hasCurrentSlideSlideCount */ CarouselSlideRenderControlProps, String]
  ] = js.undefined
  /**
    * Function for rendering bottom center control
    */
  var renderBottomCenterControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering bottom left control
    */
  var renderBottomLeftControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering bottom right control
    */
  var renderBottomRightControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering center center control
    */
  var renderCenterCenterControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering center left control
    */
  var renderCenterLeftControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering center right control
    */
  var renderCenterRightControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering top center control
    */
  var renderTopCenterControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering top left control
    */
  var renderTopLeftControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering top right control
    */
  var renderTopRightControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Supports 'page' and 'remainder' scroll modes.
    * Defaults to 'remainder'.
    */
  var scrollMode: js.UndefOr[CarouselScrollModeProp] = js.undefined
  /**
    * Manually set the index of the slide to be shown
    */
  var slideIndex: js.UndefOr[Double] = js.undefined
  /**
    * Manually set slideWidth
    * @example '20px'
    * @example 0.8
    */
  var slideWidth: js.UndefOr[CarouselSlideWidthProp] = js.undefined
  /**
    * Slides to scroll at once. Set to "auto"
    * to always scroll the current number of visible slides
    */
  var slidesToScroll: js.UndefOr[CarouselSlidesToScrollProp] = js.undefined
  /**
    * Slides to show at once
    */
  var slidesToShow: js.UndefOr[Double] = js.undefined
  /**
    * Animation duration
    */
  var speed: js.UndefOr[Double] = js.undefined
  /**
    * style object
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Enable touch swipe/dragging
    */
  var swiping: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the way slides transition from one to the next
    */
  var transitionMode: js.UndefOr[CarouselTransitionModeProp] = js.undefined
  /**
    * Enable the slides to transition vertically
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to hardcode the slider width
    * @example '80%'
    * @example '500px'
    */
  var width: js.UndefOr[String] = js.undefined
  /**
    * Used to remove all controls at once. Overwrites the render[Top, Right, Bottom, Left]CenterControls()
    * @default false
    */
  var withoutControls: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets infinite wrapAround mode
    * @default false
    */
  var wrapAround: js.UndefOr[Boolean] = js.undefined
}

object CarouselProps {
  @scala.inline
  def apply(
    afterSlide: /* index */ Double => Unit = null,
    animation: zoom = null,
    autoGenerateStyleTag: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayInterval: js.UndefOr[Double] = js.undefined,
    autoplayReverse: js.UndefOr[Boolean] = js.undefined,
    beforeSlide: (/* currentSlide */ Double, /* endSlide */ Double) => Unit = null,
    cellAlign: CarouselCellAlignProp = null,
    cellSpacing: js.UndefOr[Double] = js.undefined,
    className: String = null,
    defaultControlsConfig: ContainerClassName = null,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    disableEdgeSwiping: js.UndefOr[Boolean] = js.undefined,
    dragging: js.UndefOr[Boolean] = js.undefined,
    easing: String = null,
    edgeEasing: String = null,
    enableKeyboardControls: js.UndefOr[Boolean] = js.undefined,
    frameOverflow: String = null,
    framePadding: String = null,
    getControlsContainerStyles: /* key */ CarouselControlContainerProp => CSSProperties = null,
    height: String = null,
    heightMode: CarouselHeightModeProp = null,
    initialSlideHeight: js.UndefOr[Double] = js.undefined,
    initialSlideWidth: js.UndefOr[Double] = js.undefined,
    innerRef: RefObject[HTMLInputElement] = null,
    keyCodeConfig: slideActioninCarouselSlid = null,
    onDragStart: () => Unit = null,
    onResize: () => Unit = null,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    renderAnnounceSlideMessage: /* hasCurrentSlideSlideCount */ CarouselSlideRenderControlProps => String = null,
    renderBottomCenterControls: js.UndefOr[Null | (/* props */ CarouselSlideRenderControlProps => ReactNode)] = js.undefined,
    renderBottomLeftControls: js.UndefOr[Null | (/* props */ CarouselSlideRenderControlProps => ReactNode)] = js.undefined,
    renderBottomRightControls: js.UndefOr[Null | (/* props */ CarouselSlideRenderControlProps => ReactNode)] = js.undefined,
    renderCenterCenterControls: js.UndefOr[Null | (/* props */ CarouselSlideRenderControlProps => ReactNode)] = js.undefined,
    renderCenterLeftControls: js.UndefOr[Null | (/* props */ CarouselSlideRenderControlProps => ReactNode)] = js.undefined,
    renderCenterRightControls: js.UndefOr[Null | (/* props */ CarouselSlideRenderControlProps => ReactNode)] = js.undefined,
    renderTopCenterControls: js.UndefOr[Null | (/* props */ CarouselSlideRenderControlProps => ReactNode)] = js.undefined,
    renderTopLeftControls: js.UndefOr[Null | (/* props */ CarouselSlideRenderControlProps => ReactNode)] = js.undefined,
    renderTopRightControls: js.UndefOr[Null | (/* props */ CarouselSlideRenderControlProps => ReactNode)] = js.undefined,
    scrollMode: CarouselScrollModeProp = null,
    slideIndex: js.UndefOr[Double] = js.undefined,
    slideWidth: CarouselSlideWidthProp = null,
    slidesToScroll: CarouselSlidesToScrollProp = null,
    slidesToShow: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    swiping: js.UndefOr[Boolean] = js.undefined,
    transitionMode: CarouselTransitionModeProp = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    width: String = null,
    withoutControls: js.UndefOr[Boolean] = js.undefined,
    wrapAround: js.UndefOr[Boolean] = js.undefined
  ): CarouselProps = {
    val __obj = js.Dynamic.literal()
    if (afterSlide != null) __obj.updateDynamic("afterSlide")(js.Any.fromFunction1(afterSlide))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGenerateStyleTag)) __obj.updateDynamic("autoGenerateStyleTag")(autoGenerateStyleTag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayInterval)) __obj.updateDynamic("autoplayInterval")(autoplayInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayReverse)) __obj.updateDynamic("autoplayReverse")(autoplayReverse.get.asInstanceOf[js.Any])
    if (beforeSlide != null) __obj.updateDynamic("beforeSlide")(js.Any.fromFunction2(beforeSlide))
    if (cellAlign != null) __obj.updateDynamic("cellAlign")(cellAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(cellSpacing)) __obj.updateDynamic("cellSpacing")(cellSpacing.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultControlsConfig != null) __obj.updateDynamic("defaultControlsConfig")(defaultControlsConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEdgeSwiping)) __obj.updateDynamic("disableEdgeSwiping")(disableEdgeSwiping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (edgeEasing != null) __obj.updateDynamic("edgeEasing")(edgeEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableKeyboardControls)) __obj.updateDynamic("enableKeyboardControls")(enableKeyboardControls.get.asInstanceOf[js.Any])
    if (frameOverflow != null) __obj.updateDynamic("frameOverflow")(frameOverflow.asInstanceOf[js.Any])
    if (framePadding != null) __obj.updateDynamic("framePadding")(framePadding.asInstanceOf[js.Any])
    if (getControlsContainerStyles != null) __obj.updateDynamic("getControlsContainerStyles")(js.Any.fromFunction1(getControlsContainerStyles))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightMode != null) __obj.updateDynamic("heightMode")(heightMode.asInstanceOf[js.Any])
    if (!js.isUndefined(initialSlideHeight)) __obj.updateDynamic("initialSlideHeight")(initialSlideHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialSlideWidth)) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.get.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (keyCodeConfig != null) __obj.updateDynamic("keyCodeConfig")(keyCodeConfig.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction0(onResize))
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.get.asInstanceOf[js.Any])
    if (renderAnnounceSlideMessage != null) __obj.updateDynamic("renderAnnounceSlideMessage")(js.Any.fromFunction1(renderAnnounceSlideMessage))
    if (!js.isUndefined(renderBottomCenterControls)) __obj.updateDynamic("renderBottomCenterControls")(if (renderBottomCenterControls != null) js.Any.fromFunction1(renderBottomCenterControls.asInstanceOf[/* props */ CarouselSlideRenderControlProps => ReactNode]) else null)
    if (!js.isUndefined(renderBottomLeftControls)) __obj.updateDynamic("renderBottomLeftControls")(if (renderBottomLeftControls != null) js.Any.fromFunction1(renderBottomLeftControls.asInstanceOf[/* props */ CarouselSlideRenderControlProps => ReactNode]) else null)
    if (!js.isUndefined(renderBottomRightControls)) __obj.updateDynamic("renderBottomRightControls")(if (renderBottomRightControls != null) js.Any.fromFunction1(renderBottomRightControls.asInstanceOf[/* props */ CarouselSlideRenderControlProps => ReactNode]) else null)
    if (!js.isUndefined(renderCenterCenterControls)) __obj.updateDynamic("renderCenterCenterControls")(if (renderCenterCenterControls != null) js.Any.fromFunction1(renderCenterCenterControls.asInstanceOf[/* props */ CarouselSlideRenderControlProps => ReactNode]) else null)
    if (!js.isUndefined(renderCenterLeftControls)) __obj.updateDynamic("renderCenterLeftControls")(if (renderCenterLeftControls != null) js.Any.fromFunction1(renderCenterLeftControls.asInstanceOf[/* props */ CarouselSlideRenderControlProps => ReactNode]) else null)
    if (!js.isUndefined(renderCenterRightControls)) __obj.updateDynamic("renderCenterRightControls")(if (renderCenterRightControls != null) js.Any.fromFunction1(renderCenterRightControls.asInstanceOf[/* props */ CarouselSlideRenderControlProps => ReactNode]) else null)
    if (!js.isUndefined(renderTopCenterControls)) __obj.updateDynamic("renderTopCenterControls")(if (renderTopCenterControls != null) js.Any.fromFunction1(renderTopCenterControls.asInstanceOf[/* props */ CarouselSlideRenderControlProps => ReactNode]) else null)
    if (!js.isUndefined(renderTopLeftControls)) __obj.updateDynamic("renderTopLeftControls")(if (renderTopLeftControls != null) js.Any.fromFunction1(renderTopLeftControls.asInstanceOf[/* props */ CarouselSlideRenderControlProps => ReactNode]) else null)
    if (!js.isUndefined(renderTopRightControls)) __obj.updateDynamic("renderTopRightControls")(if (renderTopRightControls != null) js.Any.fromFunction1(renderTopRightControls.asInstanceOf[/* props */ CarouselSlideRenderControlProps => ReactNode]) else null)
    if (scrollMode != null) __obj.updateDynamic("scrollMode")(scrollMode.asInstanceOf[js.Any])
    if (!js.isUndefined(slideIndex)) __obj.updateDynamic("slideIndex")(slideIndex.get.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesToShow)) __obj.updateDynamic("slidesToShow")(slidesToShow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swiping)) __obj.updateDynamic("swiping")(swiping.get.asInstanceOf[js.Any])
    if (transitionMode != null) __obj.updateDynamic("transitionMode")(transitionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutControls)) __obj.updateDynamic("withoutControls")(withoutControls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselProps]
  }
}

