package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to increment the indent level of paragraphs in a selected range.
  */
trait IncreaseIndentCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the IncreaseIndentCommand command.
    */
  def execute(): Boolean
}

object IncreaseIndentCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): IncreaseIndentCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[IncreaseIndentCommand]
  }
}

