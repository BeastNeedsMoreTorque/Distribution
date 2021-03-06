package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change a floating object's absolute size.
  */
trait ChangeFloatingObjectAbsoluteSizeCommand extends ChangeFloatingObjectPropertyCommandBase[FloatingObjectAbsoluteSizeSettings]

object ChangeFloatingObjectAbsoluteSizeCommand {
  @scala.inline
  def apply(
    execute: FloatingObjectAbsoluteSizeSettings => Boolean,
    getState: () => CommandState[FloatingObjectAbsoluteSizeSettings]
  ): ChangeFloatingObjectAbsoluteSizeCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[ChangeFloatingObjectAbsoluteSizeCommand]
  }
}

