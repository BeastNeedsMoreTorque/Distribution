package typings.winrtUwp.Windows.Graphics.Printing

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.printtaskrequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Informs Windows that an application wishes to participate in printing. The PrintManager class is also used for programmatically initiating printing. */
@js.native
trait PrintManager extends js.Object {
  /** Raised when a request to print has occurred. This event may be triggered by user action or via programmatic invocation of printing via the ShowPrintUIAsync method. */
  @JSName("onprinttaskrequested")
  var onprinttaskrequested_Original: TypedEventHandler[PrintManager, PrintTaskRequestedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_printtaskrequested(`type`: printtaskrequested, listener: TypedEventHandler[PrintManager, PrintTaskRequestedEventArgs]): Unit = js.native
  /** Raised when a request to print has occurred. This event may be triggered by user action or via programmatic invocation of printing via the ShowPrintUIAsync method. */
  def onprinttaskrequested(ev: PrintTaskRequestedEventArgs with WinRTEvent[PrintManager]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_printtaskrequested(`type`: printtaskrequested, listener: TypedEventHandler[PrintManager, PrintTaskRequestedEventArgs]): Unit = js.native
}

