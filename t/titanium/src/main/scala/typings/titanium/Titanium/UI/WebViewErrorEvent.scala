package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the web view cannot load the content.
  */
trait WebViewErrorEvent extends WebViewBaseEvent {
  /**
    * Error code.
    * If the error was generated by the operating system, that system's error value
    * is used. Otherwise, this value will be -1.
    */
  var code: Double
  /**
    * Error message, if any returned. May be undefined.
    */
  var error: String
  /**
    * Indicates a successful operation. Returns `false`.
    */
  var success: Boolean
  /**
    * URL of the web document.
    */
  var url: String
}

object WebViewErrorEvent {
  @scala.inline
  def apply(code: Double, error: String, source: WebView, success: Boolean, url: String): WebViewErrorEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewErrorEvent]
  }
}

