package typings.dayjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var utc: js.UndefOr[Boolean] = js.undefined
}

object Format {
  @scala.inline
  def apply(format: String = null, locale: String = null, utc: js.UndefOr[Boolean] = js.undefined): Format = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(utc)) __obj.updateDynamic("utc")(utc.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

