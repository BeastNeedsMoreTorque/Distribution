package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the capabilities of the point-of-service printer. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterCapabilities")
@js.native
abstract class PosPrinterCapabilities ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.PosPrinterCapabilities {
  /** Gets whether the point-of-service printer can map the characters that the application sends (in the character set that the ClaimedPosPrinter.CharacterSet property defines) to the character sets that the PosPrinter.SupportedCharacterSets property defines. */
  /* CompleteClass */
  override var canMapCharacterSet: Boolean = js.native
  /** Gets the character set that the point-of-service printer uses by default. */
  /* CompleteClass */
  override var defaultCharacterSet: Double = js.native
  /** Gets whether the point-of-service printer has a sensor that detects if the printer cover is open. */
  /* CompleteClass */
  override var hasCoverSensor: Boolean = js.native
  /** Gets whether the point-of-service printer supports reporting statistics. */
  /* CompleteClass */
  override var isStatisticsReportingSupported: Boolean = js.native
  /** Gets whether the point-of-service printer supports updating statistics. */
  /* CompleteClass */
  override var isStatisticsUpdatingSupported: Boolean = js.native
  /** Gets whether the point-of-service printer supports printer transactions. */
  /* CompleteClass */
  override var isTransactionSupported: Boolean = js.native
  /** Gets the capabilities of the journal station for the point-of-service printer. */
  /* CompleteClass */
  override var journal: typings.winrtUwp.Windows.Devices.PointOfService.JournalPrinterCapabilities = js.native
  /** Gets the power reporting capabilities of the point-of-service printer. */
  /* CompleteClass */
  override var powerReportingType: typings.winrtUwp.Windows.Devices.PointOfService.UnifiedPosPowerReportingType = js.native
  /** Gets the capabilities of the receipt station for the point-of-service printer. */
  /* CompleteClass */
  override var receipt: typings.winrtUwp.Windows.Devices.PointOfService.ReceiptPrinterCapabilities = js.native
  /** Gets the capabilities of the slip station for the point-of-service printer. */
  /* CompleteClass */
  override var slip: typings.winrtUwp.Windows.Devices.PointOfService.SlipPrinterCapabilities = js.native
}

