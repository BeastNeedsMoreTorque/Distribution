package typings.chrome.chrome.extension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchProperties extends js.Object {
  /** Optional. The type of view to get. If omitted, returns all views (including background pages and tabs). Valid values: 'tab', 'notification', 'popup'.  */
  var `type`: js.UndefOr[String] = js.undefined
  /** Optional. The window to restrict the search to. If omitted, returns all views.  */
  var windowId: js.UndefOr[Double] = js.undefined
}

object FetchProperties {
  @scala.inline
  def apply(`type`: String = null, windowId: js.UndefOr[Double] = js.undefined): FetchProperties = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(windowId)) __obj.updateDynamic("windowId")(windowId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchProperties]
  }
}

