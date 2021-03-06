package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a row in a table above the selected row.
  */
trait InsertTableRowAboveCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertTableRowAboveCommand command.
    */
  def execute(): Boolean
}

object InsertTableRowAboveCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertTableRowAboveCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertTableRowAboveCommand]
  }
}

