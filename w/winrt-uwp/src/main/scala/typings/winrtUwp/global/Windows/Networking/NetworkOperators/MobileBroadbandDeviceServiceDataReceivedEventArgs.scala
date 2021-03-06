package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a DataReceived event on a MobileBroadbandDeviceServiceDataSession when data is received . */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceDataReceivedEventArgs")
@js.native
abstract class MobileBroadbandDeviceServiceDataReceivedEventArgs ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandDeviceServiceDataReceivedEventArgs {
  /** Gets the data received on the MobileBroadbandDeviceServiceDataSession . */
  /* CompleteClass */
  override var receivedData: IBuffer = js.native
}

