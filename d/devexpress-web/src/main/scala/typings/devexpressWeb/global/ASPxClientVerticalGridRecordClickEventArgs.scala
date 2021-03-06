package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.RecordClick event.
  */
@JSGlobal("ASPxClientVerticalGridRecordClickEventArgs")
@js.native
class ASPxClientVerticalGridRecordClickEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientVerticalGridRecordClickEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridRecordClickEventArgs class.
    * @param visibleIndex A zero-based integer index that identifies the clicked record.
    * @param htmlEvent An object that contains parameters associated with the event. This value is assigned to the ASPxClientVerticalGridRecordClickEventArgs.htmlEvent property.
    */
  def this(visibleIndex: Double, htmlEvent: js.Any) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Provides access to the parameters associated with the ASPxClientVerticalGrid.RecordClick event.
    */
  /* CompleteClass */
  override var htmlEvent: js.Any = js.native
  /**
    * Gets the processed record's visible index.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

