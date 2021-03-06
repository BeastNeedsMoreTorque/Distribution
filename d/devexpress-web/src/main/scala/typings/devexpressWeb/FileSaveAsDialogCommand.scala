package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to open the file's Save As dialog.
  */
trait FileSaveAsDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the FileSaveAsDialogCommand command.
    */
  def execute(): Boolean
}

object FileSaveAsDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): FileSaveAsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[FileSaveAsDialogCommand]
  }
}

