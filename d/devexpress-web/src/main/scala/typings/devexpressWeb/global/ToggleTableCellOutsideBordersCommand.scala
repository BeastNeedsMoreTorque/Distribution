package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle outer borders for selected cells on/off.
  */
@JSGlobal("ToggleTableCellOutsideBordersCommand")
@js.native
class ToggleTableCellOutsideBordersCommand ()
  extends typings.devexpressWeb.ToggleTableCellOutsideBordersCommand {
  /**
    * Executes the ToggleTableCellOutsideBordersCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}

