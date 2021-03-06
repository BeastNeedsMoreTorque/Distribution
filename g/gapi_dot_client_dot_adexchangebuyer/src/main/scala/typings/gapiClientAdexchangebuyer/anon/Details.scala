package typings.gapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Details extends js.Object {
  /** Additional details about the reason for disapproval. */
  var details: js.UndefOr[js.Array[String]] = js.undefined
  /** The categorized reason for disapproval. */
  var reason: js.UndefOr[String] = js.undefined
}

object Details {
  @scala.inline
  def apply(details: js.Array[String] = null, reason: String = null): Details = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
}

