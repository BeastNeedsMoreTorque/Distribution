package typings.reactNativeElements.mod

import typings.reactNativeElements.anon.RecursivePartialFullTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProps[T] extends js.Object {
  var replaceTheme: ReplaceTheme
  var theme: Theme[T]
  var updateTheme: UpdateTheme
}

object ThemeProps {
  @scala.inline
  def apply[T](
    replaceTheme: /* updates */ RecursivePartialFullTheme => Unit,
    theme: Theme[T],
    updateTheme: /* updates */ RecursivePartialFullTheme => Unit
  ): ThemeProps[T] = {
    val __obj = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1(replaceTheme), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1(updateTheme))
    __obj.asInstanceOf[ThemeProps[T]]
  }
}

