package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for monitoring changes to Contact objects in the ContactStore . */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactChangeTracker")
@js.native
abstract class ContactChangeTracker ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactChangeTracker {
  /** Call this method to enable change tracking. */
  /* CompleteClass */
  override def enable(): Unit = js.native
  /**
    * Gets a ContactChangeReader that can be used to process changes.
    * @return A ContactChangeReader that can be used to process changes.
    */
  /* CompleteClass */
  override def getChangeReader(): typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactChangeReader = js.native
  /** Call this method to reset the change tracker if your app receives ContactChangeType.ChangeTrackingLost . */
  /* CompleteClass */
  override def reset(): Unit = js.native
}

