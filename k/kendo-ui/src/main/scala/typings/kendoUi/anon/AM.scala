package typings.kendoUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AM extends js.Object {
  var AM: js.Array[String]
  @JSName(":")
  var Colon: String
  var PM: js.Array[String]
  @JSName("/")
  var Slash: String
  var days: Names
  var firstDay: String
  var months: NamesAbbr
  var patterns: D
  var twoDigitYearMax: Double
}

object AM {
  @scala.inline
  def apply(
    AM: js.Array[String],
    Colon: String,
    PM: js.Array[String],
    Slash: String,
    days: Names,
    firstDay: String,
    months: NamesAbbr,
    patterns: D,
    twoDigitYearMax: Double
  ): AM = {
    val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
    __obj.updateDynamic(":")(Colon.asInstanceOf[js.Any])
    __obj.updateDynamic("/")(Slash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AM]
  }
}

