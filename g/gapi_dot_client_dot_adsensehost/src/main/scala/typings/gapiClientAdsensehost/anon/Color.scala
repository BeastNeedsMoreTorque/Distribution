package typings.gapiClientAdsensehost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /** Color to use when type is set to COLOR. These are represented as six hexadecimal characters, similar to HTML color codes, but without the leading hash. */
  var color: js.UndefOr[String] = js.undefined
  /** Type of the backup option. Possible values are BLANK, COLOR and URL. */
  var `type`: js.UndefOr[String] = js.undefined
  /** URL to use when type is set to URL. */
  var url: js.UndefOr[String] = js.undefined
}

object Color {
  @scala.inline
  def apply(color: String = null, `type`: String = null, url: String = null): Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

