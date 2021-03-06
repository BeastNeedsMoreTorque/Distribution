package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle between the numbered paragraph and normal text.
  */
@JSGlobal("ToggleNumberingListCommand")
@js.native
class ToggleNumberingListCommand ()
  extends typings.devexpressWeb.ToggleNumberingListCommand {
  /**
    * Executes the ToggleNumberingListCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typings.devexpressWeb.CommandState[Boolean] = js.native
}

