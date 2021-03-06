package typings.azureSb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: String
  var expiry: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Body {
  @scala.inline
  def apply(body: String, expiry: String = null, headers: js.Any = null, tags: js.Array[String] = null): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

