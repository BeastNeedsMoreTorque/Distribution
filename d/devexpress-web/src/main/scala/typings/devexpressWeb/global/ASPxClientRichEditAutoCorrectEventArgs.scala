package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.AutoCorrect event.
  */
@JSGlobal("ASPxClientRichEditAutoCorrectEventArgs")
@js.native
class ASPxClientRichEditAutoCorrectEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientRichEditAutoCorrectEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditAutoCorrectEventArgs object. For internal use only.
    * @param text The input string to check whether it should be replaced.
    * @param interval The Interval object specifying the input string.
    * @param handled true if the event is handled and no default processing is required; otherwise false.
    */
  def this(text: js.Any, interval: js.Any, handled: js.Any) = this()
  /**
    * Specifies whether the event is handled.
    */
  /* CompleteClass */
  override var handled: Boolean = js.native
  /**
    * Gets the input string's interval.
    */
  /* CompleteClass */
  override var interval: typings.devexpressWeb.Interval = js.native
  /**
    * Gets the input string to check whether it should be replaced.
    */
  /* CompleteClass */
  override var text: String = js.native
}

