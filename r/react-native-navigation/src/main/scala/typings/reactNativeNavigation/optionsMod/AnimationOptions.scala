package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  /**
    * Configure what animates when modal is dismissed
    */
  var dismissModal: js.UndefOr[ViewAnimationOptions] = js.undefined
  /**
    * Configure what animates when a screen is popped
    */
  var pop: js.UndefOr[StackAnimationOptions] = js.undefined
  /**
    * Configure what animates when a screen is pushed
    */
  var push: js.UndefOr[StackAnimationOptions] = js.undefined
  /**
    * Configure the setRoot animation
    */
  var setRoot: js.UndefOr[ViewAnimationOptions] = js.undefined
  /**
    * Configure the setStackRoot animation
    */
  var setStackRoot: js.UndefOr[ViewAnimationOptions] = js.undefined
  /**
    * Configure what animates when modal is shown
    */
  var showModal: js.UndefOr[ViewAnimationOptions] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    dismissModal: ViewAnimationOptions = null,
    pop: StackAnimationOptions = null,
    push: StackAnimationOptions = null,
    setRoot: ViewAnimationOptions = null,
    setStackRoot: ViewAnimationOptions = null,
    showModal: ViewAnimationOptions = null
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (dismissModal != null) __obj.updateDynamic("dismissModal")(dismissModal.asInstanceOf[js.Any])
    if (pop != null) __obj.updateDynamic("pop")(pop.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (setRoot != null) __obj.updateDynamic("setRoot")(setRoot.asInstanceOf[js.Any])
    if (setStackRoot != null) __obj.updateDynamic("setStackRoot")(setStackRoot.asInstanceOf[js.Any])
    if (showModal != null) __obj.updateDynamic("showModal")(showModal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
}

