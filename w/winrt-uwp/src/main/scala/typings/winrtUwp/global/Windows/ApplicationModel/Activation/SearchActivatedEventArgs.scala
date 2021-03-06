package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails
import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the activated event that fires when the user searches the app from the Search charm and the app isn't the main app on screen. */
@JSGlobal("Windows.ApplicationModel.Activation.SearchActivatedEventArgs")
@js.native
abstract class SearchActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.SearchActivatedEventArgs {
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  override var currentlyShownApplicationViewId: Double = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  /* CompleteClass */
  override var language: String = js.native
  /** Gets a SearchPaneQueryLinguisticDetails object that provides info about query text that the user enters through an Input Method Editor (IME). */
  /* CompleteClass */
  override var linguisticDetails: SearchPaneQueryLinguisticDetails = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the text that the user wants the app to search for. The user entered this text into the search box of the search pane. */
  /* CompleteClass */
  override var queryText: String = js.native
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  /* CompleteClass */
  override var viewSwitcher: ActivationViewSwitcher = js.native
}

