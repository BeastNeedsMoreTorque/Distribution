package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains days and groups of days for use in recurrence patterns.
  */
trait ASPxClientWeekDays extends js.Object {
  /**
    * Specifies every day of the week.
    */
  var EveryDay: Double
  /**
    * Specifies Friday.
    */
  var Friday: Double
  /**
    * Specifies Monday.
    */
  var Monday: Double
  /**
    * Specifies Saturday.
    */
  var Saturday: Double
  /**
    * Specifies Sunday.
    */
  var Sunday: Double
  /**
    * Specifies Thursday.
    */
  var Thursday: Double
  /**
    * Specifies Tuesday.
    */
  var Tuesday: Double
  /**
    * Specifies Wednesday.
    */
  var Wednesday: Double
  /**
    * Specifies Saturday and Sunday.
    */
  var WeekendDays: Double
  /**
    * Specifies work days (Monday, Tuesday, Wednesday, Thursday and Friday).
    */
  var WorkDays: Double
}

object ASPxClientWeekDays {
  @scala.inline
  def apply(
    EveryDay: Double,
    Friday: Double,
    Monday: Double,
    Saturday: Double,
    Sunday: Double,
    Thursday: Double,
    Tuesday: Double,
    Wednesday: Double,
    WeekendDays: Double,
    WorkDays: Double
  ): ASPxClientWeekDays = {
    val __obj = js.Dynamic.literal(EveryDay = EveryDay.asInstanceOf[js.Any], Friday = Friday.asInstanceOf[js.Any], Monday = Monday.asInstanceOf[js.Any], Saturday = Saturday.asInstanceOf[js.Any], Sunday = Sunday.asInstanceOf[js.Any], Thursday = Thursday.asInstanceOf[js.Any], Tuesday = Tuesday.asInstanceOf[js.Any], Wednesday = Wednesday.asInstanceOf[js.Any], WeekendDays = WeekendDays.asInstanceOf[js.Any], WorkDays = WorkDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWeekDays]
  }
}

