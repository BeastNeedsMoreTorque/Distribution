package typings.reactNavigation.anon

import typings.reactNavigation.mod._NavigationAction
import typings.reactNavigation.reactNavigationStrings.CHILD_ACTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends _NavigationAction {
  var key: js.UndefOr[String] = js.undefined
  var `type`: CHILD_ACTION
}

object Type {
  @scala.inline
  def apply(`type`: CHILD_ACTION, key: String = null): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

