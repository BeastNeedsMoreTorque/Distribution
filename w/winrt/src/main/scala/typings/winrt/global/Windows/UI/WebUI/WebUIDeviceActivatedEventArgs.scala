package typings.winrt.global.Windows.UI.WebUI

import typings.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrt.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIDeviceActivatedEventArgs")
@js.native
class WebUIDeviceActivatedEventArgs ()
  extends typings.winrt.Windows.UI.WebUI.WebUIDeviceActivatedEventArgs {
  /* CompleteClass */
  override var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
  /* CompleteClass */
  override var deviceInformationId: String = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
  /* CompleteClass */
  override var verb: String = js.native
}

