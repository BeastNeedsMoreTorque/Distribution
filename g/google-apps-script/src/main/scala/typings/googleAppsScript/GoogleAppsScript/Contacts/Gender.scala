package typings.googleAppsScript.GoogleAppsScript.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Gender extends js.Object

/**
  * An enum for contact gender.
  */
@JSGlobal("GoogleAppsScript.Contacts.Gender")
@js.native
object Gender extends js.Object {
  @js.native
  sealed trait FEMALE extends Gender
  
  @js.native
  sealed trait MALE extends Gender
  
}

