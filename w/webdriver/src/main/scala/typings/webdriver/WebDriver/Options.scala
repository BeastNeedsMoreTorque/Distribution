package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.WritableStream
import typings.webdriver.HTTPRequestOptions
import typings.webdriver.HTTPResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var capabilities: js.UndefOr[DesiredCapabilities] = js.undefined
  var connectionRetryCount: js.UndefOr[Double] = js.undefined
  var connectionRetryTimeout: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var logLevel: js.UndefOr[WebDriverLogTypes] = js.undefined
  var logOutput: js.UndefOr[String | WritableStream] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
  var requestedCapabilities: js.UndefOr[DesiredCapabilities] = js.undefined
  var transformRequest: js.UndefOr[js.Function1[/* requestOptions */ HTTPRequestOptions, HTTPRequestOptions]] = js.undefined
  var transformResponse: js.UndefOr[
    js.Function2[/* response */ HTTPResponse, /* requestOptions */ HTTPRequestOptions, HTTPResponse]
  ] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    capabilities: DesiredCapabilities = null,
    connectionRetryCount: js.UndefOr[Double] = js.undefined,
    connectionRetryTimeout: js.UndefOr[Double] = js.undefined,
    headers: StringDictionary[String] = null,
    hostname: String = null,
    key: String = null,
    logLevel: WebDriverLogTypes = null,
    logOutput: String | WritableStream = null,
    path: String = null,
    port: js.UndefOr[Double] = js.undefined,
    protocol: String = null,
    queryParams: StringDictionary[String] = null,
    requestedCapabilities: DesiredCapabilities = null,
    transformRequest: /* requestOptions */ HTTPRequestOptions => HTTPRequestOptions = null,
    transformResponse: (/* response */ HTTPResponse, /* requestOptions */ HTTPRequestOptions) => HTTPResponse = null,
    user: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionRetryCount)) __obj.updateDynamic("connectionRetryCount")(connectionRetryCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionRetryTimeout)) __obj.updateDynamic("connectionRetryTimeout")(connectionRetryTimeout.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logOutput != null) __obj.updateDynamic("logOutput")(logOutput.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (requestedCapabilities != null) __obj.updateDynamic("requestedCapabilities")(requestedCapabilities.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(js.Any.fromFunction2(transformResponse))
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

