package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandA2[R, T, U] extends js.Object {
  def execute(t: T, u: U): js.Thenable[R]
}

object CommandA2 {
  @scala.inline
  def apply[R, T, U](execute: (T, U) => js.Thenable[R]): CommandA2[R, T, U] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute))
    __obj.asInstanceOf[CommandA2[R, T, U]]
  }
}

