package typings.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the USB control transfer, the type of control request, whether the data is sent from or to the host, and the recipient of the request in the device. */
trait UsbControlRequestType extends js.Object {
  /** Gets or sets the bmRequestType value as a byte. */
  var asByte: Double
  /** Gets or sets the type of USB control transfer: standard, class, or vendor. */
  var controlTransferType: UsbControlTransferType
  /** Gets or sets the direction of the USB control transfer. */
  var direction: UsbTransferDirection
  /** Gets or sets the recipient of the USB control transfer. */
  var recipient: UsbControlRecipient
}

object UsbControlRequestType {
  @scala.inline
  def apply(
    asByte: Double,
    controlTransferType: UsbControlTransferType,
    direction: UsbTransferDirection,
    recipient: UsbControlRecipient
  ): UsbControlRequestType = {
    val __obj = js.Dynamic.literal(asByte = asByte.asInstanceOf[js.Any], controlTransferType = controlTransferType.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbControlRequestType]
  }
}

