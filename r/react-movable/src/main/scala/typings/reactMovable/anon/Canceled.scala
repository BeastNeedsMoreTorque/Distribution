package typings.reactMovable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canceled extends js.Object {
  def canceled(position: Double): String
  def dropped(from: Double, to: Double): String
  def item(position: Double): String
  def lifted(position: Double): String
  def moved(position: Double, up: Boolean): String
}

object Canceled {
  @scala.inline
  def apply(
    canceled: Double => String,
    dropped: (Double, Double) => String,
    item: Double => String,
    lifted: Double => String,
    moved: (Double, Boolean) => String
  ): Canceled = {
    val __obj = js.Dynamic.literal(canceled = js.Any.fromFunction1(canceled), dropped = js.Any.fromFunction2(dropped), item = js.Any.fromFunction1(item), lifted = js.Any.fromFunction1(lifted), moved = js.Any.fromFunction2(moved))
    __obj.asInstanceOf[Canceled]
  }
}

