package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a floating text box.
  */
trait InsertFloatingTextBoxCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertFloatingTextBoxCommand command.
    */
  def execute(): Boolean
}

object InsertFloatingTextBoxCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertFloatingTextBoxCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertFloatingTextBoxCommand]
  }
}

