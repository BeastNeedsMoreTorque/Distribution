package typings.winrtUwp.global.Windows.UI.Notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the reason that a toast notification is no longer displayed on-screen. */
@JSGlobal("Windows.UI.Notifications.ToastDismissedEventArgs")
@js.native
abstract class ToastDismissedEventArgs ()
  extends typings.winrtUwp.Windows.UI.Notifications.ToastDismissedEventArgs {
  /** Gets the reason that a toast notification is no longer displayed on-screen. */
  /* CompleteClass */
  override var reason: typings.winrtUwp.Windows.UI.Notifications.ToastDismissalReason = js.native
}

