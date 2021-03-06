package typings.isArraySorted.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  /**
  		Same as [`Array#sort(comparator)`](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Array/sort#Description).
  		@default (a, b) => a - b
  		*/
  def comparator(left: T, right: T): Double
}

object Options {
  @scala.inline
  def apply[T](comparator: (T, T) => Double): Options[T] = {
    val __obj = js.Dynamic.literal(comparator = js.Any.fromFunction2(comparator))
    __obj.asInstanceOf[Options[T]]
  }
}

