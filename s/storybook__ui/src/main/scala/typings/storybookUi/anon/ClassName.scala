package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassName extends js.Object {
  var className: String
  var isSelected: js.UndefOr[Boolean] = js.undefined
}

object ClassName {
  @scala.inline
  def apply(className: String, isSelected: js.UndefOr[Boolean] = js.undefined): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
}

