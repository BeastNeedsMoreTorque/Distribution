package typings.ava.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Complete extends js.Object {
  def complete(): Unit
  def error(err: js.Any): Unit
}

object Complete {
  @scala.inline
  def apply(complete: () => Unit, error: js.Any => Unit): Complete = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error))
    __obj.asInstanceOf[Complete]
  }
}

