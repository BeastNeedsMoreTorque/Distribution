package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditConfirmShowing event.
  */
@JSGlobal("ASPxClientCardViewBatchEditConfirmShowingEventArgs")
@js.native
class ASPxClientCardViewBatchEditConfirmShowingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientCardViewBatchEditConfirmShowingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditConfirmShowingEventArgs class.
    * @param requestTriggerID A string value specifying the client identifier of an object that initiates a request.
    */
  def this(requestTriggerID: String) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the client identifier of an object that initiates a send request.
    */
  /* CompleteClass */
  override var requestTriggerID: String = js.native
}

