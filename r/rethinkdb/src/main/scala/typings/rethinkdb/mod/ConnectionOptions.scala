package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Connection options.
  *
  * See: https://rethinkdb.com/api/javascript/connect/
  */
trait ConnectionOptions extends js.Object {
  /** The default database (default `test`) */
  var db: js.UndefOr[String] = js.undefined
  /** The host to connect to (default `localhost`) */
  var host: js.UndefOr[String] = js.undefined
  /** The password for the user account to connect as (default `''`, empty) */
  var password: js.UndefOr[String] = js.undefined
  /** The port to connect on (default `28015`) */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * A hash of options to support SSL connections (default `null`). Currently,
    * there is only one option available, and if the `ssl` option is specified,
    * this key is required.
    */
  var ssl: js.UndefOr[typings.node.tlsMod.ConnectionOptions] = js.undefined
  /** Timeout period in seconds for the connection to be opened (default `20`) */
  var timeout: js.UndefOr[Double] = js.undefined
  /** The user account to connect as (default `admin`) */
  var user: js.UndefOr[String] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    db: String = null,
    host: String = null,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    ssl: typings.node.tlsMod.ConnectionOptions = null,
    timeout: js.UndefOr[Double] = js.undefined,
    user: String = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

