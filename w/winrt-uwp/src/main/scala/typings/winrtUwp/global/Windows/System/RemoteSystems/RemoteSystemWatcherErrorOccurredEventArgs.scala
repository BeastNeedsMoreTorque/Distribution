package typings.winrtUwp.global.Windows.System.RemoteSystems

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets information about an **ErrorOccurred** event, namely the **RemoteSystemWatcherError** value describing the error. */
@JSGlobal("Windows.System.RemoteSystems.RemoteSystemWatcherErrorOccurredEventArgs")
@js.native
abstract class RemoteSystemWatcherErrorOccurredEventArgs ()
  extends typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcherErrorOccurredEventArgs {
  /** The **RemoteSystemWatcherError** value representing the error that occurred during discovery, causing the containing **ErrorOccurred** event to be raised. */
  /* CompleteClass */
  override var error: typings.winrtUwp.Windows.System.RemoteSystems.RemoteSystemWatcherError = js.native
}

