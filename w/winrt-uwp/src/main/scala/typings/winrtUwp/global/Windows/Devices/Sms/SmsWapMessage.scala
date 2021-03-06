package typings.winrtUwp.global.Windows.Devices.Sms

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an SMS WAP push message. */
@JSGlobal("Windows.Devices.Sms.SmsWapMessage")
@js.native
abstract class SmsWapMessage ()
  extends typings.winrtUwp.Windows.Devices.Sms.SmsWapMessage {
  /** Gets the value of the X-Wap-Application-Id header of the SmsWapMessage . */
  /* CompleteClass */
  override var applicationId: String = js.native
  /** Gets the binary body of the blob in the SmsWapMessage . */
  /* CompleteClass */
  override var binaryBody: IBuffer = js.native
  /** Gets the cellular class of the SMS device that received the message. */
  /* CompleteClass */
  override var cellularClass: typings.winrtUwp.Windows.Devices.Sms.CellularClass = js.native
  /** Gets the value of the Content-Type header in the SmsWapMessage . Parameters are presents in the Headers property. */
  /* CompleteClass */
  override var contentType: String = js.native
  /** Gets the device information ID of the SmsDevice that receives the SmsWapMessage . */
  /* CompleteClass */
  override var deviceId: String = js.native
  /** Gets the phone number of the sender of the SmsWapMessage . */
  /* CompleteClass */
  override var from: String = js.native
  /** Gets the header name-value pairs of the WAP push message. */
  /* CompleteClass */
  override var headers: IMap[String, String] = js.native
  /** Gets the message class of the SmsWapMessage . */
  /* CompleteClass */
  override var messageClass: typings.winrtUwp.Windows.Devices.Sms.SmsMessageClass = js.native
  /** Gets the message type of the SmsWapMessage . */
  /* CompleteClass */
  override var messageType: typings.winrtUwp.Windows.Devices.Sms.SmsMessageType = js.native
  /** Gets the ICCID (Integrated Circuit Card Identifier) of the SIM that received the message. */
  /* CompleteClass */
  override var simIccId: String = js.native
  /** Gets the timestamp of the SmsWapMessage . */
  /* CompleteClass */
  override var timestamp: Date = js.native
  /** Gets the recipient phone number of this SmsWapMessage . */
  /* CompleteClass */
  override var to: String = js.native
}

