package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditChangesSaving event.
  */
@JSGlobal("ASPxClientTreeListBatchEditChangesSavingEventArgs")
@js.native
class ASPxClientTreeListBatchEditChangesSavingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientTreeListBatchEditChangesSavingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditChangesSavingEventArgs class.
    * @param insertedValues A hashtable that stores information about inserted cells.
    * @param deletedValues A hashtable that stores information about deleted cells.
    * @param updatedValues A hashtable that stores information about updated cells.
    */
  def this(insertedValues: js.Any, deletedValues: js.Any, updatedValues: js.Any) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  /* CompleteClass */
  override var deletedValues: js.Any = js.native
  /**
    * Gets a hashtable that maintains information about inserted cells.
    */
  /* CompleteClass */
  override var insertedValues: js.Any = js.native
  /**
    * Gets a hashtable that maintains information about updated cells.
    */
  /* CompleteClass */
  override var updatedValues: js.Any = js.native
}

