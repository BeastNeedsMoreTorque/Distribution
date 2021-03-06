package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's alignment position.
  */
trait ChangeFloatingObjectAlignmentPositionCommand extends ChangeFloatingObjectPropertyCommandBase[FloatingObjectAlignmentPositionSettings]

object ChangeFloatingObjectAlignmentPositionCommand {
  @scala.inline
  def apply(
    execute: FloatingObjectAlignmentPositionSettings => Boolean,
    getState: () => CommandState[FloatingObjectAlignmentPositionSettings]
  ): ChangeFloatingObjectAlignmentPositionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectAlignmentPositionCommand]
  }
}

