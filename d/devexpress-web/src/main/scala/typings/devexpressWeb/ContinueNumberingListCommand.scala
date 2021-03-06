package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to continue the list's numbering.
  */
trait ContinueNumberingListCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the ContinueNumberingListCommand command.
    */
  def execute(): Boolean
}

object ContinueNumberingListCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): ContinueNumberingListCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ContinueNumberingListCommand]
  }
}

