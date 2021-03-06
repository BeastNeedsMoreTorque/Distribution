package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a StoreChanged event. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreChangedEventArgs")
@js.native
abstract class AppointmentStoreChangedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChangedEventArgs {
  /**
    * Gets the deferral object for the StoreChanged event.
    * @return The deferral object for the StoreChanged event.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChangedDeferral = js.native
}

