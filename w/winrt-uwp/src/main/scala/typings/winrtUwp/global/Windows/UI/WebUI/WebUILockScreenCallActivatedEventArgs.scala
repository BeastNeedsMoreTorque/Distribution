package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.ApplicationModel.Calls.LockScreenCallUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event information when communication to and from the lock screen is required. */
@JSGlobal("Windows.UI.WebUI.WebUILockScreenCallActivatedEventArgs")
@js.native
abstract class WebUILockScreenCallActivatedEventArgs ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUILockScreenCallActivatedEventArgs {
  /** Gets the app activated operation. */
  /* CompleteClass */
  override var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets the arguments that are passed to the app during its launch activation. */
  /* CompleteClass */
  override var arguments: String = js.native
  /** Gets the UI that handles communication to and from the lock screen. */
  /* CompleteClass */
  override var callUI: LockScreenCallUI = js.native
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  override var currentlyShownApplicationViewId: Double = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
  /** Gets the identifier of the source that launched the app. */
  /* CompleteClass */
  override var tileId: String = js.native
}

