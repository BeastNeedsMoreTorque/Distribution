package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the info about a significant other for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactSignificantOther")
@js.native
/** Initializes a new instance of a ContactSignificantOther class. */
class ContactSignificantOther ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactSignificantOther {
  /** Gets and sets the description of a significant other for a contact. The maximum string length for the description is 512 characters. */
  /* CompleteClass */
  override var description: String = js.native
  /** Gets and sets the name of a significant other for a contact. The maximum string length for the name is 256 characters. */
  /* CompleteClass */
  override var name: String = js.native
  /** Gets or puts a value that indicates the nature of the relationship, such as spouse, partner, sibling, parent and so on. */
  /* CompleteClass */
  override var relationship: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactRelationship = js.native
}

