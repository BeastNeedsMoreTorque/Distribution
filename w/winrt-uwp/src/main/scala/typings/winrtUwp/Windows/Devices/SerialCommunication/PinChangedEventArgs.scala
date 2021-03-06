package typings.winrtUwp.Windows.Devices.SerialCommunication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the object that is passed as a parameter to the event handler that is invoked when the state of a signal line changes on the serial port. */
trait PinChangedEventArgs extends js.Object {
  /** Gets the type of signal change that caused the event on the serial port. */
  var pinChange: SerialPinChange
}

object PinChangedEventArgs {
  @scala.inline
  def apply(pinChange: SerialPinChange): PinChangedEventArgs = {
    val __obj = js.Dynamic.literal(pinChange = pinChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinChangedEventArgs]
  }
}

