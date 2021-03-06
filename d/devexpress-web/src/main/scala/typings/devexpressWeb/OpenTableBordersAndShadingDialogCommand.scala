package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Borders and Shading table dialog.
  */
trait OpenTableBordersAndShadingDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the OpenTableBordersAndShadingDialogCommand command.
    */
  def execute(): Boolean
}

object OpenTableBordersAndShadingDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): OpenTableBordersAndShadingDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[OpenTableBordersAndShadingDialogCommand]
  }
}

