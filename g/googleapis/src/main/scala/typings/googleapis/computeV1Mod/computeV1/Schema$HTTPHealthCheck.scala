package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$HTTPHealthCheck extends js.Object {
  /**
    * The value of the host header in the HTTP health check request. If left
    * empty (default value), the IP on behalf of which this health check is
    * performed will be used.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The TCP port number for the health check request. The default value
    * is 80. Valid values are 1 through 65535.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * Port name as defined in InstanceGroup#NamedPort#name. If both port and
    * port_name are defined, port takes precedence.
    */
  var portName: js.UndefOr[String] = js.native
  /**
    * Specifies how port is selected for health checking, can be one of
    * following values: USE_FIXED_PORT: The port number in port is used for
    * health checking. USE_NAMED_PORT: The portName is used for health
    * checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified
    * for each network endpoint is used for health checking. For other
    * backends, the port or named port specified in the Backend Service is used
    * for health checking.   If not specified, HTTP health check follows
    * behavior specified in port and portName fields.
    */
  var portSpecification: js.UndefOr[String] = js.native
  /**
    * Specifies the type of proxy header to append before sending data to the
    * backend, either NONE or PROXY_V1. The default is NONE.
    */
  var proxyHeader: js.UndefOr[String] = js.native
  /**
    * The request path of the HTTP health check request. The default value is
    * /.
    */
  var requestPath: js.UndefOr[String] = js.native
  /**
    * The string to match anywhere in the first 1024 bytes of the response
    * body. If left empty (the default value), the status code determines
    * health. The response data can only be ASCII.
    */
  var response: js.UndefOr[String] = js.native
}

object Schema$HTTPHealthCheck {
  @scala.inline
  def apply(
    host: String = null,
    port: js.UndefOr[Double] = js.undefined,
    portName: String = null,
    portSpecification: String = null,
    proxyHeader: String = null,
    requestPath: String = null,
    response: String = null
  ): Schema$HTTPHealthCheck = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (portName != null) __obj.updateDynamic("portName")(portName.asInstanceOf[js.Any])
    if (portSpecification != null) __obj.updateDynamic("portSpecification")(portSpecification.asInstanceOf[js.Any])
    if (proxyHeader != null) __obj.updateDynamic("proxyHeader")(proxyHeader.asInstanceOf[js.Any])
    if (requestPath != null) __obj.updateDynamic("requestPath")(requestPath.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HTTPHealthCheck]
  }
}

