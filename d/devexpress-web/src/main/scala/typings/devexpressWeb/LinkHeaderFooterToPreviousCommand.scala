package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to link a header/footer to the previous section, so it has the same content.
  */
trait LinkHeaderFooterToPreviousCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the LinkHeaderFooterToPreviousCommand command.
    */
  def execute(): Boolean
}

object LinkHeaderFooterToPreviousCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): LinkHeaderFooterToPreviousCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[LinkHeaderFooterToPreviousCommand]
  }
}

