package typings.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  /** Name of the service provider. */
  var title: js.UndefOr[String] = js.undefined
}

object Title {
  @scala.inline
  def apply(title: String = null): Title = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

