package typings.jsbn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomGenerator extends js.Object {
  def nextBytes(bytes: js.Array[Double]): Unit
}

object RandomGenerator {
  @scala.inline
  def apply(nextBytes: js.Array[Double] => Unit): RandomGenerator = {
    val __obj = js.Dynamic.literal(nextBytes = js.Any.fromFunction1(nextBytes))
    __obj.asInstanceOf[RandomGenerator]
  }
}

