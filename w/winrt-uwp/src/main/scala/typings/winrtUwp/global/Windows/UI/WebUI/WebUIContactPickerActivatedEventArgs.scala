package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.ApplicationModel.Contacts.Provider.ContactPickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated because it uses the Contact Picker. */
@JSGlobal("Windows.UI.WebUI.WebUIContactPickerActivatedEventArgs")
@js.native
abstract class WebUIContactPickerActivatedEventArgs ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUIContactPickerActivatedEventArgs {
  /** Gets the app activated operation. */
  /* CompleteClass */
  override var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets the letterbox UI of the contact picker that is displayed when the user wants to pick contacts that are provided by the app. */
  /* CompleteClass */
  override var contactPickerUI: ContactPickerUI = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

