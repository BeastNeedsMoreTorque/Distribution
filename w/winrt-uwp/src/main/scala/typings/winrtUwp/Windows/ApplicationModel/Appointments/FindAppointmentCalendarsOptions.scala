package typings.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FindAppointmentCalendarsOptions extends js.Object

/** Specifies additional options when querying for appointment calendars. */
@JSGlobal("Windows.ApplicationModel.Appointments.FindAppointmentCalendarsOptions")
@js.native
object FindAppointmentCalendarsOptions extends js.Object {
  /** Include appointment calendars that are hidden. */
  @js.native
  sealed trait includeHidden extends FindAppointmentCalendarsOptions
  
  /** No additional options. */
  @js.native
  sealed trait none extends FindAppointmentCalendarsOptions
  
}

