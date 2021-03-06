package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTTransferMode extends js.Object

/** ICAP_XFERMECH values. */
@JSGlobal("EnumDWT_TransferMode")
@js.native
object EnumDWTTransferMode extends js.Object {
  /** Disk File Mode Transfers. */
  @js.native
  sealed trait TWSX_FILE extends EnumDWTTransferMode
  
  /** Buffered Memory Mode Transfers. */
  @js.native
  sealed trait TWSX_MEMORY extends EnumDWTTransferMode
  
  /** Native transfers require the data to be transferred to a single large block of RAM. Therefore,
    *  they always face the risk of having an inadequate amount of RAM available to perform the transfer successfully.
    */
  @js.native
  sealed trait TWSX_NATIVE extends EnumDWTTransferMode
  
}

