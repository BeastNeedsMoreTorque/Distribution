package typings.winrtUwp.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the app to signal when it has finished populating a SearchSuggestionCollection object while handling the SuggestionsRequested event. Use a deferral if and only if your app needs to respond to a request for suggestions asynchronously. */
trait SearchSuggestionsRequestDeferral extends js.Object {
  /** Signals that the app has finished populating a SearchSuggestionCollection object while handling the SuggestionsRequested event. */
  def complete(): Unit
}

object SearchSuggestionsRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): SearchSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SearchSuggestionsRequestDeferral]
  }
}

