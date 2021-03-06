package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the current power and availability status of the cash drawer. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerStatus")
@js.native
abstract class CashDrawerStatus ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.CashDrawerStatus {
  /** ExtendedStatus provides a way for a Point of Service driver or provider to send custom notifications to the app. */
  /* CompleteClass */
  override var extendedStatus: Double = js.native
  /** Gets the status kind for the cash drawer status. */
  /* CompleteClass */
  override var statusKind: typings.winrtUwp.Windows.Devices.PointOfService.CashDrawerStatusKind = js.native
}

