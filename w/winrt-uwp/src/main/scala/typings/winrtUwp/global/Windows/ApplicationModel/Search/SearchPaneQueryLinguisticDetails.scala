package typings.winrtUwp.global.Windows.ApplicationModel.Search

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about query text that the user enters through an Input Method Editor (IME). */
@JSGlobal("Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails")
@js.native
abstract class SearchPaneQueryLinguisticDetails ()
  extends typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails {
  /** A list of the text alternatives for the current query text. These alternatives account for uncomposed text the user is entering in an IME. */
  /* CompleteClass */
  override var queryTextAlternatives: IVectorView[String] = js.native
  /** The length of the portion of the query text that the user is composing with an Input Method Editor (IME). */
  /* CompleteClass */
  override var queryTextCompositionLength: Double = js.native
  /** The starting location of the text that the user is composing with an Input Method Editor (IME). */
  /* CompleteClass */
  override var queryTextCompositionStart: Double = js.native
}

