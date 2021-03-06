package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.FocusedCellChanging event.
  */
@JSGlobal("ASPxClientTreeListFocusedCellChangingEventArgs")
@js.native
class ASPxClientTreeListFocusedCellChangingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientTreeListFocusedCellChangingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListFocusedCellChangingEventArgs class.
    * @param cellInfo An ASPxClientTreeListCellInfo object providing information about the focused cell.
    */
  def this(cellInfo: typings.devexpressWeb.ASPxClientTreeListCellInfo) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Provides information on a cell currently being focused.
    */
  /* CompleteClass */
  override var cellInfo: typings.devexpressWeb.ASPxClientTreeListCellInfo = js.native
}

