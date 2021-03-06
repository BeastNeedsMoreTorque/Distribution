package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineStyle extends js.Object {
  /** The dash type of the line. */
  var `type`: js.UndefOr[String] = js.undefined
  /** The thickness of the line, in px. */
  var width: js.UndefOr[Double] = js.undefined
}

object LineStyle {
  @scala.inline
  def apply(`type`: String = null, width: js.UndefOr[Double] = js.undefined): LineStyle = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineStyle]
  }
}

