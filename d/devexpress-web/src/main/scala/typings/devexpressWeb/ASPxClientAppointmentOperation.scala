package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains methods allowing you to perform or cancel an operation.
  */
trait ASPxClientAppointmentOperation extends js.Object {
  /**
    * Passes parameters to the corresponding callback function to accomplish the operation.
    */
  def Apply(): Unit
  /**
    * Cancels the operation.
    */
  def Cancel(): Unit
}

object ASPxClientAppointmentOperation {
  @scala.inline
  def apply(Apply: () => Unit, Cancel: () => Unit): ASPxClientAppointmentOperation = {
    val __obj = js.Dynamic.literal(Apply = js.Any.fromFunction0(Apply), Cancel = js.Any.fromFunction0(Cancel))
    __obj.asInstanceOf[ASPxClientAppointmentOperation]
  }
}

