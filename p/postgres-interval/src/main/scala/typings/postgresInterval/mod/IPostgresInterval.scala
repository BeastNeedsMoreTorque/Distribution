package typings.postgresInterval.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPostgresInterval extends js.Object {
  var days: js.UndefOr[Double] = js.undefined
  var hours: js.UndefOr[Double] = js.undefined
  var milliseconds: js.UndefOr[Double] = js.undefined
  var minutes: js.UndefOr[Double] = js.undefined
  var months: js.UndefOr[Double] = js.undefined
  var seconds: js.UndefOr[Double] = js.undefined
  var years: js.UndefOr[Double] = js.undefined
  def toISO(): String
  def toISOString(): String
  def toPostgres(): String
}

object IPostgresInterval {
  @scala.inline
  def apply(
    toISO: () => String,
    toISOString: () => String,
    toPostgres: () => String,
    days: js.UndefOr[Double] = js.undefined,
    hours: js.UndefOr[Double] = js.undefined,
    milliseconds: js.UndefOr[Double] = js.undefined,
    minutes: js.UndefOr[Double] = js.undefined,
    months: js.UndefOr[Double] = js.undefined,
    seconds: js.UndefOr[Double] = js.undefined,
    years: js.UndefOr[Double] = js.undefined
  ): IPostgresInterval = {
    val __obj = js.Dynamic.literal(toISO = js.Any.fromFunction0(toISO), toISOString = js.Any.fromFunction0(toISOString), toPostgres = js.Any.fromFunction0(toPostgres))
    if (!js.isUndefined(days)) __obj.updateDynamic("days")(days.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hours)) __obj.updateDynamic("hours")(hours.get.asInstanceOf[js.Any])
    if (!js.isUndefined(milliseconds)) __obj.updateDynamic("milliseconds")(milliseconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minutes)) __obj.updateDynamic("minutes")(minutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(months)) __obj.updateDynamic("months")(months.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seconds)) __obj.updateDynamic("seconds")(seconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(years)) __obj.updateDynamic("years")(years.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPostgresInterval]
  }
}

