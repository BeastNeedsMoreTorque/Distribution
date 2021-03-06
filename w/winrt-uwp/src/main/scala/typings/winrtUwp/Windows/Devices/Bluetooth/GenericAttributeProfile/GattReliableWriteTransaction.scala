package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs GATT reliable writes on the Bluetooth LE device, in the form of a transaction write operation. */
trait GattReliableWriteTransaction extends js.Object {
  /**
    * Performs all the queued writes, in sequence, writing the data to the device. Once a transaction object has been committed, no further operations are possible on the GattReliableWriteTransaction object.
    * @return The object used to manage the asynchronous operation, which, upon completion, will return the status of the asynchronous operation.
    */
  def commitAsync(): IPromiseWithIAsyncOperation[GattCommunicationStatus]
  /**
    * Adds a new write operation to the transaction object.
    * @param characteristic The GattCharacteristic object on which to perform the write operation.
    * @param value The Characteristic Value to be written to characteristic.
    */
  def writeValue(characteristic: GattCharacteristic, value: IBuffer): Unit
}

object GattReliableWriteTransaction {
  @scala.inline
  def apply(
    commitAsync: () => IPromiseWithIAsyncOperation[GattCommunicationStatus],
    writeValue: (GattCharacteristic, IBuffer) => Unit
  ): GattReliableWriteTransaction = {
    val __obj = js.Dynamic.literal(commitAsync = js.Any.fromFunction0(commitAsync), writeValue = js.Any.fromFunction2(writeValue))
    __obj.asInstanceOf[GattReliableWriteTransaction]
  }
}

