package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disabled extends js.Object {
  var disabled: String
  var item: String
  var itemText: String
  var maxText: String
  var minText: String
  var root: String
  var selected: String
}

object Disabled {
  @scala.inline
  def apply(
    disabled: String,
    item: String,
    itemText: String,
    maxText: String,
    minText: String,
    root: String,
    selected: String
  ): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], maxText = maxText.asInstanceOf[js.Any], minText = minText.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
}

