package typings.antdMobile.actionSheetMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareActionSheetWithOptions extends ActionSheetOptions {
  var badges: js.UndefOr[js.Array[BadgesOption]] = js.undefined
  var options: js.Array[js.Array[ShareOption] | ShareOption]
}

object ShareActionSheetWithOptions {
  @scala.inline
  def apply(
    options: js.Array[js.Array[ShareOption] | ShareOption],
    badges: js.Array[BadgesOption] = null,
    cancelButtonIndex: js.UndefOr[Double] = js.undefined,
    className: String = null,
    destructiveButtonIndex: js.UndefOr[Double] = js.undefined,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskTransitionName: String = null,
    message: ReactNode = null,
    title: ReactNode = null,
    transitionName: String = null
  ): ShareActionSheetWithOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (badges != null) __obj.updateDynamic("badges")(badges.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelButtonIndex)) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(destructiveButtonIndex)) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.get.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareActionSheetWithOptions]
  }
}

