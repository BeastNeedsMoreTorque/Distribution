package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to disable automatic adjusting of the selected table.
  */
trait ToggleTableFixedColumnWidthCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the ToggleTableFixedColumnWidthCommand command.
    */
  def execute(): Boolean
}

object ToggleTableFixedColumnWidthCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): ToggleTableFixedColumnWidthCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ToggleTableFixedColumnWidthCommand]
  }
}

