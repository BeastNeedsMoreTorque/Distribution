package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke a browser-specific Print dialog allowing one to print the current document.
  */
trait FilePrintCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the FilePrintCommand command.
    */
  def execute(): Boolean
}

object FilePrintCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): FilePrintCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[FilePrintCommand]
  }
}

