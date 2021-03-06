package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ContactChanged event. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactChangedEventArgs")
@js.native
abstract class ContactChangedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactChangedEventArgs {
  /**
    * Gets the ContactChangedDeferral object to use for asynchronous operations.
    * @return The deferral object to use for asynchronous operations.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactChangedDeferral = js.native
}

