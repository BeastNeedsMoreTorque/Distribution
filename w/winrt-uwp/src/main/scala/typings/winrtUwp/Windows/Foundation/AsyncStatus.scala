package typings.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AsyncStatus extends js.Object

/** Specifies the status of an asynchronous operation. */
@JSGlobal("Windows.Foundation.AsyncStatus")
@js.native
object AsyncStatus extends js.Object {
  /** The operation was canceled. */
  @js.native
  sealed trait canceled extends AsyncStatus
  
  /** The operation has completed. */
  @js.native
  sealed trait completed extends AsyncStatus
  
  /** The operation has encountered an error. */
  @js.native
  sealed trait error extends AsyncStatus
  
  /** The operation has started. */
  @js.native
  sealed trait started extends AsyncStatus
  
}

