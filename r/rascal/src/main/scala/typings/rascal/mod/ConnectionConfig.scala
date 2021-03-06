package typings.rascal.mod

import typings.rascal.anon.Dictkey
import typings.rascal.anon.TimeoutNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig extends ConnectionAttributes {
  var management: js.UndefOr[ConnectionAttributes] = js.undefined
  var retry: js.UndefOr[RetryConfig] = js.undefined
}

object ConnectionConfig {
  @scala.inline
  def apply(
    auth: String = null,
    hostname: String = null,
    loggableUrl: String = null,
    management: ConnectionAttributes = null,
    options: Dictkey = null,
    password: String = null,
    pathname: String = null,
    port: String | Double = null,
    protocol: String = null,
    query: String = null,
    retry: RetryConfig = null,
    slashes: js.UndefOr[Boolean] = js.undefined,
    socketOptions: TimeoutNumber = null,
    url: String = null,
    user: String = null,
    vhost: String = null
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (loggableUrl != null) __obj.updateDynamic("loggableUrl")(loggableUrl.asInstanceOf[js.Any])
    if (management != null) __obj.updateDynamic("management")(management.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (!js.isUndefined(slashes)) __obj.updateDynamic("slashes")(slashes.get.asInstanceOf[js.Any])
    if (socketOptions != null) __obj.updateDynamic("socketOptions")(socketOptions.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (vhost != null) __obj.updateDynamic("vhost")(vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfig]
  }
}

