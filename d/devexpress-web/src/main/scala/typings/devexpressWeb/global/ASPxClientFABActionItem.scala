package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the floating action button's action item object.
  */
@JSGlobal("ASPxClientFABActionItem")
@js.native
class ASPxClientFABActionItem ()
  extends typings.devexpressWeb.ASPxClientFABActionItemBase {
  /**
    * Gets the action item's name.
    */
  /* CompleteClass */
  override def GetActionName(): String = js.native
  /**
    * Gets the action item's text.
    */
  /* CompleteClass */
  override def GetText(): String = js.native
  /**
    * Returns a value specifying whether an action item is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  /**
    * Specifies the action item's text.
    * @param value A string value that specifies the action item's text.
    */
  /* CompleteClass */
  override def SetText(value: String): Unit = js.native
  /**
    * Specifies the action item's visibility.
    * @param value true, if the action item is visible; otherwise, false.
    */
  /* CompleteClass */
  override def SetVisible(value: Boolean): Unit = js.native
}

