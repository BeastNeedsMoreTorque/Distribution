package typings.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsDeviceStatus extends js.Object

@JSGlobal("Windows.Devices.Sms.SmsDeviceStatus")
@js.native
object SmsDeviceStatus extends js.Object {
  @js.native
  sealed trait badSim extends SmsDeviceStatus
  
  @js.native
  sealed trait deviceBlocked extends SmsDeviceStatus
  
  @js.native
  sealed trait deviceFailure extends SmsDeviceStatus
  
  @js.native
  sealed trait deviceLocked extends SmsDeviceStatus
  
  @js.native
  sealed trait off extends SmsDeviceStatus
  
  @js.native
  sealed trait ready extends SmsDeviceStatus
  
  @js.native
  sealed trait simNotInserted extends SmsDeviceStatus
  
  @js.native
  sealed trait subscriptionNotActivated extends SmsDeviceStatus
  
}

