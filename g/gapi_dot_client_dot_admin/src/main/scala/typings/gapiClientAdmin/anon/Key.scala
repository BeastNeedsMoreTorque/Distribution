package typings.gapiClientAdmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  /** Key associated with a key-value pair to give detailed information on the warning. */
  var key: js.UndefOr[String] = js.undefined
  /** Value associated with a key-value pair to give detailed information on the warning. */
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

