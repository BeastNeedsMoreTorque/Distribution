package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for the <Titanium.UI.Window.open> method.
  */
trait openWindowParams extends js.Object {
  /**
    * Animation resource to run on the activity being opened.
    */
  var activityEnterAnimation: js.UndefOr[Double] = js.undefined
  /**
    * Animation resource to run on the activity that is being put in background as a window is being opened above it.
    */
  var activityExitAnimation: js.UndefOr[Double] = js.undefined
  /**
    * Determines whether to use an animated effect when the window is shown.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * Window's bottom position, in platform-specific units.
    */
  var bottom: js.UndefOr[Double | java.lang.String] = js.undefined
  /**
    * Indicates whether the window enforces modal behaviour.
    */
  var forceModal: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines if the window is fullscreen.
    */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  /**
    * Window's height, in platform-specific units.
    */
  var height: js.UndefOr[Double | java.lang.String] = js.undefined
  /**
    * Window's left position, in platform-specific units.
    */
  var left: js.UndefOr[Double | java.lang.String] = js.undefined
  /**
    * Determines whether to open the window modal in front of other windows.
    */
  var modal: js.UndefOr[Boolean] = js.undefined
  /**
    * Presentation style of this modal window.
    */
  var modalStyle: js.UndefOr[Double] = js.undefined
  /**
    * Transition style of this modal window.
    */
  var modalTransitionStyle: js.UndefOr[Double] = js.undefined
  /**
    * For modal windows, hides the nav bar (`true`) or shows the nav bar (`false`).
    */
  var navBarHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Window's right position, in platform-specific units.
    */
  var right: js.UndefOr[Double | java.lang.String] = js.undefined
  /**
    * Window's top position, in platform-specific units.
    */
  var top: js.UndefOr[Double | java.lang.String] = js.undefined
  /**
    * Transition style of this non-modal window.
    */
  var transition: js.UndefOr[Double] = js.undefined
  /**
    * Window's width, in platform-specific units.
    */
  var width: js.UndefOr[Double | java.lang.String] = js.undefined
}

object openWindowParams {
  @scala.inline
  def apply(
    activityEnterAnimation: js.UndefOr[Double] = js.undefined,
    activityExitAnimation: js.UndefOr[Double] = js.undefined,
    animated: js.UndefOr[Boolean] = js.undefined,
    bottom: Double | java.lang.String = null,
    forceModal: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    height: Double | java.lang.String = null,
    left: Double | java.lang.String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    modalStyle: js.UndefOr[Double] = js.undefined,
    modalTransitionStyle: js.UndefOr[Double] = js.undefined,
    navBarHidden: js.UndefOr[Boolean] = js.undefined,
    right: Double | java.lang.String = null,
    top: Double | java.lang.String = null,
    transition: js.UndefOr[Double] = js.undefined,
    width: Double | java.lang.String = null
  ): openWindowParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activityEnterAnimation)) __obj.updateDynamic("activityEnterAnimation")(activityEnterAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(activityExitAnimation)) __obj.updateDynamic("activityExitAnimation")(activityExitAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (!js.isUndefined(forceModal)) __obj.updateDynamic("forceModal")(forceModal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modalStyle)) __obj.updateDynamic("modalStyle")(modalStyle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modalTransitionStyle)) __obj.updateDynamic("modalTransitionStyle")(modalTransitionStyle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(navBarHidden)) __obj.updateDynamic("navBarHidden")(navBarHidden.get.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[openWindowParams]
  }
}

