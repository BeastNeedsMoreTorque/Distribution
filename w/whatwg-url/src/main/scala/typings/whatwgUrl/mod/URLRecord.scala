package typings.whatwgUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLRecord extends js.Object {
  var cannotBeABaseURL: js.UndefOr[Boolean] = js.undefined
  var fragment: String | Null
  var host: String | Double | IPv6Address | Null
  var password: String
  var path: js.Array[String]
  var port: Double | Null
  var query: String | Null
  var scheme: String
  var username: String
}

object URLRecord {
  @scala.inline
  def apply(
    password: String,
    path: js.Array[String],
    scheme: String,
    username: String,
    cannotBeABaseURL: js.UndefOr[Boolean] = js.undefined,
    fragment: String = null,
    host: String | Double | IPv6Address = null,
    port: Double = null.asInstanceOf[Double],
    query: String = null
  ): URLRecord = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (!js.isUndefined(cannotBeABaseURL)) __obj.updateDynamic("cannotBeABaseURL")(cannotBeABaseURL.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLRecord]
  }
}

