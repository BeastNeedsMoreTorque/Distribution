package typings.chrome.global.chrome

import typings.chrome.chrome.webRequest.WebAuthenticationChallengeEvent
import typings.chrome.chrome.webRequest.WebRedirectionResponseEvent
import typings.chrome.chrome.webRequest.WebRequestBodyEvent
import typings.chrome.chrome.webRequest.WebRequestHeadersEvent
import typings.chrome.chrome.webRequest.WebRequestHeadersSynchronousEvent
import typings.chrome.chrome.webRequest.WebResponseCacheEvent
import typings.chrome.chrome.webRequest.WebResponseErrorEvent
import typings.chrome.chrome.webRequest.WebResponseHeadersEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Web Request
////////////////////
/**
  * Use the chrome.webRequest API to observe and analyze traffic and to intercept, block, or modify requests in-flight.
  * Permissions:  "webRequest", host permissions
  * @since Chrome 17.
  */
@JSGlobal("chrome.webRequest")
@js.native
object webRequest extends js.Object {
  var MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Double = js.native
  var onAuthRequired: WebAuthenticationChallengeEvent = js.native
  var onBeforeRedirect: WebRedirectionResponseEvent = js.native
  var onBeforeRequest: WebRequestBodyEvent = js.native
  var onBeforeSendHeaders: WebRequestHeadersSynchronousEvent = js.native
  var onCompleted: WebResponseCacheEvent = js.native
  var onErrorOccurred: WebResponseErrorEvent = js.native
  var onHeadersReceived: WebResponseHeadersEvent = js.native
  var onResponseStarted: WebResponseCacheEvent = js.native
  var onSendHeaders: WebRequestHeadersEvent = js.native
  def handlerBehaviorChanged(): Unit = js.native
  def handlerBehaviorChanged(callback: js.Function): Unit = js.native
}

