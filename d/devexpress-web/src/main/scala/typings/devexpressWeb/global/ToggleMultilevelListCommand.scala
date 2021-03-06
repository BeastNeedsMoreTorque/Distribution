package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle between the multilevel list style and normal text.
  */
@JSGlobal("ToggleMultilevelListCommand")
@js.native
class ToggleMultilevelListCommand ()
  extends typings.devexpressWeb.ToggleMultilevelListCommand {
  /**
    * Executes the ToggleMultilevelListCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}

