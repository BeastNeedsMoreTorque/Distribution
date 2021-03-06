package typings.collections.sortedSetMod.internal

import typings.collections.anon.Done
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator[T] extends js.Object {
  def next(): Done[T]
}

object Iterator {
  @scala.inline
  def apply[T](next: () => Done[T]): Iterator[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Iterator[T]]
  }
}

