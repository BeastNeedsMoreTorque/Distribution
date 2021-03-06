package typings.gapiClientResourceviews.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  /** [Output Only] Metadata key for this warning. */
  var key: js.UndefOr[String] = js.undefined
  /** [Output Only] Metadata value for this warning. */
  var value: js.UndefOr[String] = js.undefined
}

object Key {
  @scala.inline
  def apply(key: String = null, value: String = null): Key = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

