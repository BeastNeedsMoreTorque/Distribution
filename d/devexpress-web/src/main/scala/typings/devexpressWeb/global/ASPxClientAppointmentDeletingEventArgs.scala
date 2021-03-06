package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientScheduler.AppointmentDeleting event.
  */
@JSGlobal("ASPxClientAppointmentDeletingEventArgs")
@js.native
class ASPxClientAppointmentDeletingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientAppointmentDeletingEventArgs {
  /**
    * Creates an ASPxClientAppointmentDeletingEventArgs instance with the specified client appointments.
    * @param appointments An array of ASPxClientAppointment objects.
    */
  def this(appointments: js.Array[typings.devexpressWeb.ASPxClientAppointment]) = this()
  /**
    * Gets client IDs of the appointments to be removed.
    */
  /* CompleteClass */
  override var appointmentIds: js.Array[String] = js.native
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
}

