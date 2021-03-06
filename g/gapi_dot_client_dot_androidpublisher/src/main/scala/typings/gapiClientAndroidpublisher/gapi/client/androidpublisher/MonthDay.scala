package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthDay extends js.Object {
  /** Day of a month, value in [1, 31] range. Valid range depends on the specified month. */
  var day: js.UndefOr[Double] = js.undefined
  /** Month of a year. e.g. 1 = JAN, 2 = FEB etc. */
  var month: js.UndefOr[Double] = js.undefined
}

object MonthDay {
  @scala.inline
  def apply(day: js.UndefOr[Double] = js.undefined, month: js.UndefOr[Double] = js.undefined): MonthDay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(day)) __obj.updateDynamic("day")(day.get.asInstanceOf[js.Any])
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthDay]
  }
}

