package typings.loryJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoryOptions extends js.Object {
  /**
    * executed after initialisation (end of setup function)
    */
  var afterInit: js.UndefOr[js.Function0[_]] = js.undefined
  //////////////////////////////////////////////////
  //  Callbacks
  //////////////////////////////////////////////////
  /**
    * executed before initialisation (first in setup function)
    */
  var beforeInit: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * executed on click of next controls (next function)
    */
  var beforeNext: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * executed on click of prev controls (prev function)
    */
  var beforePrev: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * executed on every resize event
    */
  var beforeResize: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * executed on touch attempt (touchstart)
    */
  var beforeTouch: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * class name for slider frame
    * default: 'js_frame'
    */
  var classNameFrame: js.UndefOr[String] = js.undefined
  /**
    * class name for slider next control
    * default: 'js_next'
    */
  var classNameNextCtrl: js.UndefOr[String] = js.undefined
  /**
    * class name for slider previous control
    * default: 'js_prev'
    */
  var classNamePrevCtrl: js.UndefOr[String] = js.undefined
  /**
    * class name for slides container
    * default: 'js_slides'
    */
  var classNameSlideContainer: js.UndefOr[String] = js.undefined
  /**
    * cubic bezier easing functions: http://easings.net/de (default: 'cubic-bezier(0.455, 0.03, 0.515, 0.955)').
    */
  var ease: js.UndefOr[String] = js.undefined
  /**
    * enabled mouse events
    * default: false
    */
  var enableMouseEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * like carousel, works with multiple slides (default: false). (do not combine with rewind)
    */
  var infinite: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * the slide index to show when the slider is initialized (    default: 0 )
    */
  var initialIndex: js.UndefOr[Double] = js.undefined
  /**
    * if slider reached the last slide, with next click the slider goes back to the startindex (default: false).
    */
  var rewind: js.UndefOr[Boolean] = js.undefined
  /**
    * time in milliseconds for the animation of the rewind after the last slide (default: 600).
    */
  var rewindSpeed: js.UndefOr[Double] = js.undefined
  /**
    * time in milliseconds for the animation of a valid slide attempt (default: 300).
    */
  var slideSpeed: js.UndefOr[Double] = js.undefined
  //////////////////////////////////////////////////
  //  Options
  //////////////////////////////////////////////////
  /**
    * slides scrolled at once (default: 1).
    */
  var slidesToScroll: js.UndefOr[Double] = js.undefined
  /**
    * time for the snapBack of the slider if the slide attempt was not valid (default: 200).
    */
  var snapBackSpeed: js.UndefOr[Double] = js.undefined
}

object LoryOptions {
  @scala.inline
  def apply(
    afterInit: () => _ = null,
    beforeInit: () => _ = null,
    beforeNext: () => _ = null,
    beforePrev: () => _ = null,
    beforeResize: () => _ = null,
    beforeTouch: () => _ = null,
    classNameFrame: String = null,
    classNameNextCtrl: String = null,
    classNamePrevCtrl: String = null,
    classNameSlideContainer: String = null,
    ease: String = null,
    enableMouseEvents: js.UndefOr[Boolean] = js.undefined,
    infinite: Boolean | Double = null,
    initialIndex: js.UndefOr[Double] = js.undefined,
    rewind: js.UndefOr[Boolean] = js.undefined,
    rewindSpeed: js.UndefOr[Double] = js.undefined,
    slideSpeed: js.UndefOr[Double] = js.undefined,
    slidesToScroll: js.UndefOr[Double] = js.undefined,
    snapBackSpeed: js.UndefOr[Double] = js.undefined
  ): LoryOptions = {
    val __obj = js.Dynamic.literal()
    if (afterInit != null) __obj.updateDynamic("afterInit")(js.Any.fromFunction0(afterInit))
    if (beforeInit != null) __obj.updateDynamic("beforeInit")(js.Any.fromFunction0(beforeInit))
    if (beforeNext != null) __obj.updateDynamic("beforeNext")(js.Any.fromFunction0(beforeNext))
    if (beforePrev != null) __obj.updateDynamic("beforePrev")(js.Any.fromFunction0(beforePrev))
    if (beforeResize != null) __obj.updateDynamic("beforeResize")(js.Any.fromFunction0(beforeResize))
    if (beforeTouch != null) __obj.updateDynamic("beforeTouch")(js.Any.fromFunction0(beforeTouch))
    if (classNameFrame != null) __obj.updateDynamic("classNameFrame")(classNameFrame.asInstanceOf[js.Any])
    if (classNameNextCtrl != null) __obj.updateDynamic("classNameNextCtrl")(classNameNextCtrl.asInstanceOf[js.Any])
    if (classNamePrevCtrl != null) __obj.updateDynamic("classNamePrevCtrl")(classNamePrevCtrl.asInstanceOf[js.Any])
    if (classNameSlideContainer != null) __obj.updateDynamic("classNameSlideContainer")(classNameSlideContainer.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseEvents)) __obj.updateDynamic("enableMouseEvents")(enableMouseEvents.get.asInstanceOf[js.Any])
    if (infinite != null) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (!js.isUndefined(initialIndex)) __obj.updateDynamic("initialIndex")(initialIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rewind)) __obj.updateDynamic("rewind")(rewind.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rewindSpeed)) __obj.updateDynamic("rewindSpeed")(rewindSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slideSpeed)) __obj.updateDynamic("slideSpeed")(slideSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesToScroll)) __obj.updateDynamic("slidesToScroll")(slidesToScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapBackSpeed)) __obj.updateDynamic("snapBackSpeed")(snapBackSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoryOptions]
  }
}

