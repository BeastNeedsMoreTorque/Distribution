package typings.adone

import typings.async.asyncMod.AsyncBooleanIterator
import typings.async.asyncMod.AsyncResultArrayCallback
import typings.async.asyncMod.IterableCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Arr extends js.Object {
  def apply[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def apply[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
}

