package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.anon.DefaultActionsContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogDefaultActionsProps extends js.Object {
  var actions: js.Array[String]
  var style: js.UndefOr[DefaultActionsContainer] = js.undefined
  def onActionPress(action: String): Unit
}

object DialogDefaultActionsProps {
  @scala.inline
  def apply(actions: js.Array[String], onActionPress: String => Unit, style: DefaultActionsContainer = null): DialogDefaultActionsProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onActionPress = js.Any.fromFunction1(onActionPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogDefaultActionsProps]
  }
}

