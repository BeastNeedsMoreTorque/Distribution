package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactListOtherAppReadAccess extends js.Object

/** Specifies the level of contact read access granted to other apps. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactListOtherAppReadAccess")
@js.native
object ContactListOtherAppReadAccess extends js.Object {
  /** Other apps have read access to system and app contacts. */
  @js.native
  sealed trait full extends ContactListOtherAppReadAccess
  
  /** Other apps can only read contacts for this app. */
  @js.native
  sealed trait limited extends ContactListOtherAppReadAccess
  
  /** Other apps can only read system contacts. */
  @js.native
  sealed trait systemOnly extends ContactListOtherAppReadAccess
  
}

