package typings.numeric.anon

import typings.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iact extends js.Object {
  var iact: Vector
  var iterations: Vector
  var message: String
  var solution: Vector
  var unconstrained_solution: Vector
  var value: Vector
}

object Iact {
  @scala.inline
  def apply(
    iact: Vector,
    iterations: Vector,
    message: String,
    solution: Vector,
    unconstrained_solution: Vector,
    value: Vector
  ): Iact = {
    val __obj = js.Dynamic.literal(iact = iact.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], solution = solution.asInstanceOf[js.Any], unconstrained_solution = unconstrained_solution.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iact]
  }
}

