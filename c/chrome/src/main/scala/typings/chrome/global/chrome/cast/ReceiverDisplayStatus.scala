package typings.chrome.global.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.ReceiverDisplayStatus")
@js.native
class ReceiverDisplayStatus protected ()
  extends typings.chrome.chrome.cast.ReceiverDisplayStatus {
  /**
    * @param {string} statusText
    * @param {!Array<chrome.cast.Image>} appImages
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.ReceiverDisplayStatus
    */
  def this(statusText: String, appImages: js.Array[typings.chrome.chrome.cast.Image]) = this()
  /* CompleteClass */
  override var appImages: js.Array[typings.chrome.chrome.cast.Image] = js.native
  /* CompleteClass */
  override var statusText: String = js.native
}

