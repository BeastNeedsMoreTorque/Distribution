package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to activate the page header and begin editing.
  */
trait InsertHeaderCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the InsertHeaderCommand command.
    */
  def execute(): Boolean
}

object InsertHeaderCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): InsertHeaderCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertHeaderCommand]
  }
}

