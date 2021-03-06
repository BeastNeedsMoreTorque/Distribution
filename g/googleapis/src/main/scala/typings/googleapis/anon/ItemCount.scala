package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemCount extends js.Object {
  var itemCount: js.UndefOr[String] = js.native
  var itemType: js.UndefOr[String] = js.native
}

object ItemCount {
  @scala.inline
  def apply(itemCount: String = null, itemType: String = null): ItemCount = {
    val __obj = js.Dynamic.literal()
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemCount]
  }
}

