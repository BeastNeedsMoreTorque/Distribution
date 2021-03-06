package typings.mysticateaSpy.mod.Spy_

import typings.mysticateaSpy.mod.This
import typings.mysticateaSpy.mysticateaSpyStrings.`return`
import typings.std.Parameters
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information for each returned call. */
trait ReturnedCall[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends Call[T] {
  var arguments: Parameters[T]
  var `return`: ReturnType[T]
  var `this`: This[T]
  var `type`: `return`
}

object ReturnedCall {
  @scala.inline
  def apply[/* <: js.Function1[/ * repeated * / js.Any, _] */ T](
    arguments: Parameters[T],
    `return`: ReturnType[T],
    `type`: `return`,
    `this`: js.UndefOr[This[T]] = js.undefined
  ): ReturnedCall[T] = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(`this`)) __obj.updateDynamic("this")(`this`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnedCall[T]]
  }
}

