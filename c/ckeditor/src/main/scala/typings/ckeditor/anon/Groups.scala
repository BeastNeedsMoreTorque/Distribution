package typings.ckeditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  var items: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
}

object Groups {
  @scala.inline
  def apply(name: String, groups: js.Array[String] = null, items: js.Array[String] = null): Groups = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
}

