package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a media processing background task access to the set of arguments supplied in the call to MediaProcessingTrigger::RequestAsync . */
trait MediaProcessingTriggerDetails extends js.Object {
  /** Gets a value set containing the arguments supplied in the call to MediaProcessingTrigger::RequestAsync . */
  var arguments: ValueSet
}

object MediaProcessingTriggerDetails {
  @scala.inline
  def apply(arguments: ValueSet): MediaProcessingTriggerDetails = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaProcessingTriggerDetails]
  }
}

