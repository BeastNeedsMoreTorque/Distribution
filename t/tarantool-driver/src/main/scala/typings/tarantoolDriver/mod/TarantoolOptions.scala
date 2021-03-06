package typings.tarantoolDriver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TarantoolOptions extends js.Object {
  var beforeReserve: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var lazyConnect: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var reserveHosts: js.UndefOr[js.Array[String]] = js.undefined
  var retryStrategy: js.UndefOr[js.Function1[/* times */ Double, Double]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object TarantoolOptions {
  @scala.inline
  def apply(
    beforeReserve: js.UndefOr[Double] = js.undefined,
    host: String = null,
    lazyConnect: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    reserveHosts: js.Array[String] = null,
    retryStrategy: /* times */ Double => Double = null,
    timeout: js.UndefOr[Double] = js.undefined,
    username: String = null
  ): TarantoolOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beforeReserve)) __obj.updateDynamic("beforeReserve")(beforeReserve.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyConnect)) __obj.updateDynamic("lazyConnect")(lazyConnect.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (reserveHosts != null) __obj.updateDynamic("reserveHosts")(reserveHosts.asInstanceOf[js.Any])
    if (retryStrategy != null) __obj.updateDynamic("retryStrategy")(js.Any.fromFunction1(retryStrategy))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TarantoolOptions]
  }
}

