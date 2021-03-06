package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to invoke the Insert Merge Field dialog.
  */
trait MergeFieldDialogCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the MergeFieldDialogCommand command.
    */
  def execute(): Boolean
}

object MergeFieldDialogCommand {
  @scala.inline
  def apply(execute: () => Boolean, getState: () => SimpleCommandState): MergeFieldDialogCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[MergeFieldDialogCommand]
  }
}

