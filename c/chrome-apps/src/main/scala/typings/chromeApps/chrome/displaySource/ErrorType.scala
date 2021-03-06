package typings.chromeApps.chrome.displaySource

import typings.chromeApps.chromeAppsStrings.capabilities_negotiation_error_
import typings.chromeApps.chromeAppsStrings.connection_error_
import typings.chromeApps.chromeAppsStrings.media_pipeline_error_
import typings.chromeApps.chromeAppsStrings.timeout_error_
import typings.chromeApps.chromeAppsStrings.unknown_error_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @enum
  * @description
  * **'connection_error'**
  * The connection with sink cannot be established or has dropped unexpectedly.
  *
  * **'capabilities_negotiation_error'**
  * The capabilities of this Display Source and the connected
  * sink do not fit (e.g. the sink cannot play the media content of
  * the formats given by the source).
  *
  * **'media_pipeline_error'**
  * There was an error in media pipeline: while encoding, packetizing or
  * sending the media content.
  *
  * **'timeout_error'**
  * The sink became unresponsive.
  *
  * **'unknown_error'**
  * Unspecified error.
  */
@JSGlobal("chrome.displaySource.ErrorType")
@js.native
object ErrorType extends js.Object {
  var CAPABILITIES_NEGOTIATION_ERROR: capabilities_negotiation_error_ = js.native
  var CONNECTION_ERROR: connection_error_ = js.native
  var MEDIA_PIPELINE_ERROR: media_pipeline_error_ = js.native
  var TIMEOUT_ERROR: timeout_error_ = js.native
  var UNKNOWN_ERROR: unknown_error_ = js.native
}

