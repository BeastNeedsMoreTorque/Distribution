package typings.webdriverio.WebdriverIO

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.WritableStream
import typings.webdriver.HTTPRequestOptions
import typings.webdriver.HTTPResponse
import typings.webdriver.WebDriver.DesiredCapabilities
import typings.webdriver.WebDriver.WebDriverLogTypes
import typings.webdriverio.anon.SpecFiltering
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent webdriver.WebDriver.Options */
/* Inlined parent std.Omit<webdriverio.WebdriverIO.Options, 'capabilities'> */
trait RemoteOptions extends js.Object {
  var bail: js.UndefOr[Double] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var capabilities: js.UndefOr[DesiredCapabilities] = js.undefined
  var connectionRetryCount: js.UndefOr[Double] = js.undefined
  var connectionRetryTimeout: js.UndefOr[Double] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var execArgv: js.UndefOr[js.Array[String]] = js.undefined
  var featureFlags: js.UndefOr[SpecFiltering] = js.undefined
  var framework: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var jasmineNodeOpts: js.UndefOr[js.Object] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var logLevel: js.UndefOr[WebDriverLogTypes] = js.undefined
  var logOutput: js.UndefOr[String | WritableStream] = js.undefined
  var maxInstances: js.UndefOr[Double] = js.undefined
  var maxInstancesPerCapability: js.UndefOr[Double] = js.undefined
  var mochaOpts: js.UndefOr[js.Object] = js.undefined
  var outputDir: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
  var reporters: js.UndefOr[js.Array[String | js.Object]] = js.undefined
  var requestedCapabilities: js.UndefOr[DesiredCapabilities] = js.undefined
  var runner: js.UndefOr[String] = js.undefined
  var services: js.UndefOr[js.Array[String | js.Object]] = js.undefined
  var specFileRetries: js.UndefOr[Double] = js.undefined
  var specFileRetryAttempts: js.UndefOr[Double] = js.undefined
  var specs: js.UndefOr[js.Array[String]] = js.undefined
  var suites: js.UndefOr[js.Object] = js.undefined
  var transformRequest: js.UndefOr[js.Function1[/* requestOptions */ HTTPRequestOptions, HTTPRequestOptions]] = js.undefined
  var transformResponse: js.UndefOr[
    js.Function2[/* response */ HTTPResponse, /* requestOptions */ HTTPRequestOptions, HTTPResponse]
  ] = js.undefined
  var user: js.UndefOr[String] = js.undefined
  var waitforInterval: js.UndefOr[Double] = js.undefined
  var waitforTimeout: js.UndefOr[Double] = js.undefined
}

object RemoteOptions {
  @scala.inline
  def apply(
    bail: js.UndefOr[Double] = js.undefined,
    baseUrl: String = null,
    capabilities: DesiredCapabilities = null,
    connectionRetryCount: js.UndefOr[Double] = js.undefined,
    connectionRetryTimeout: js.UndefOr[Double] = js.undefined,
    exclude: js.Array[String] = null,
    execArgv: js.Array[String] = null,
    featureFlags: SpecFiltering = null,
    framework: String = null,
    headers: StringDictionary[String] = null,
    hostname: String = null,
    jasmineNodeOpts: js.Object = null,
    key: String = null,
    logLevel: WebDriverLogTypes = null,
    logOutput: String | WritableStream = null,
    maxInstances: js.UndefOr[Double] = js.undefined,
    maxInstancesPerCapability: js.UndefOr[Double] = js.undefined,
    mochaOpts: js.Object = null,
    outputDir: String = null,
    path: String = null,
    port: js.UndefOr[Double] = js.undefined,
    protocol: String = null,
    queryParams: StringDictionary[String] = null,
    reporters: js.Array[String | js.Object] = null,
    requestedCapabilities: DesiredCapabilities = null,
    runner: String = null,
    services: js.Array[String | js.Object] = null,
    specFileRetries: js.UndefOr[Double] = js.undefined,
    specFileRetryAttempts: js.UndefOr[Double] = js.undefined,
    specs: js.Array[String] = null,
    suites: js.Object = null,
    transformRequest: /* requestOptions */ HTTPRequestOptions => HTTPRequestOptions = null,
    transformResponse: (/* response */ HTTPResponse, /* requestOptions */ HTTPRequestOptions) => HTTPResponse = null,
    user: String = null,
    waitforInterval: js.UndefOr[Double] = js.undefined,
    waitforTimeout: js.UndefOr[Double] = js.undefined
  ): RemoteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail.get.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionRetryCount)) __obj.updateDynamic("connectionRetryCount")(connectionRetryCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionRetryTimeout)) __obj.updateDynamic("connectionRetryTimeout")(connectionRetryTimeout.get.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (execArgv != null) __obj.updateDynamic("execArgv")(execArgv.asInstanceOf[js.Any])
    if (featureFlags != null) __obj.updateDynamic("featureFlags")(featureFlags.asInstanceOf[js.Any])
    if (framework != null) __obj.updateDynamic("framework")(framework.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (jasmineNodeOpts != null) __obj.updateDynamic("jasmineNodeOpts")(jasmineNodeOpts.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logOutput != null) __obj.updateDynamic("logOutput")(logOutput.asInstanceOf[js.Any])
    if (!js.isUndefined(maxInstances)) __obj.updateDynamic("maxInstances")(maxInstances.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxInstancesPerCapability)) __obj.updateDynamic("maxInstancesPerCapability")(maxInstancesPerCapability.get.asInstanceOf[js.Any])
    if (mochaOpts != null) __obj.updateDynamic("mochaOpts")(mochaOpts.asInstanceOf[js.Any])
    if (outputDir != null) __obj.updateDynamic("outputDir")(outputDir.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (reporters != null) __obj.updateDynamic("reporters")(reporters.asInstanceOf[js.Any])
    if (requestedCapabilities != null) __obj.updateDynamic("requestedCapabilities")(requestedCapabilities.asInstanceOf[js.Any])
    if (runner != null) __obj.updateDynamic("runner")(runner.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    if (!js.isUndefined(specFileRetries)) __obj.updateDynamic("specFileRetries")(specFileRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(specFileRetryAttempts)) __obj.updateDynamic("specFileRetryAttempts")(specFileRetryAttempts.get.asInstanceOf[js.Any])
    if (specs != null) __obj.updateDynamic("specs")(specs.asInstanceOf[js.Any])
    if (suites != null) __obj.updateDynamic("suites")(suites.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(js.Any.fromFunction2(transformResponse))
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (!js.isUndefined(waitforInterval)) __obj.updateDynamic("waitforInterval")(waitforInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitforTimeout)) __obj.updateDynamic("waitforTimeout")(waitforTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteOptions]
  }
}

