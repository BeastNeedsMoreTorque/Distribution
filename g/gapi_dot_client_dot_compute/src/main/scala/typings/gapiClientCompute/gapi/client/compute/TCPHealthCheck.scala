package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TCPHealthCheck extends js.Object {
  /** The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535. */
  var port: js.UndefOr[Double] = js.undefined
  /** Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. */
  var portName: js.UndefOr[String] = js.undefined
  /** Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE. */
  var proxyHeader: js.UndefOr[String] = js.undefined
  /**
    * The application data to send once the TCP connection has been established (default value is empty). If both request and response are empty, the
    * connection establishment alone will indicate health. The request data can only be ASCII.
    */
  var request: js.UndefOr[String] = js.undefined
  /**
    * The bytes to match against the beginning of the response data. If left empty (the default value), any response will indicate health. The response data
    * can only be ASCII.
    */
  var response: js.UndefOr[String] = js.undefined
}

object TCPHealthCheck {
  @scala.inline
  def apply(
    port: js.UndefOr[Double] = js.undefined,
    portName: String = null,
    proxyHeader: String = null,
    request: String = null,
    response: String = null
  ): TCPHealthCheck = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (portName != null) __obj.updateDynamic("portName")(portName.asInstanceOf[js.Any])
    if (proxyHeader != null) __obj.updateDynamic("proxyHeader")(proxyHeader.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[TCPHealthCheck]
  }
}

