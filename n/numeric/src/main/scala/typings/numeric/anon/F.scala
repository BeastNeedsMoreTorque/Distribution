package typings.numeric.anon

import typings.numeric.mod.Matrix
import typings.numeric.mod.Scalar
import typings.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait F extends js.Object {
  var f: Scalar
  var gradient: Vector
  var invHessian: Matrix
  var iterations: Double
  var message: String
  var solution: Vector
}

object F {
  @scala.inline
  def apply(
    f: Scalar,
    gradient: Vector,
    invHessian: Matrix,
    iterations: Double,
    message: String,
    solution: Vector
  ): F = {
    val __obj = js.Dynamic.literal(f = f.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], invHessian = invHessian.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], solution = solution.asInstanceOf[js.Any])
    __obj.asInstanceOf[F]
  }
}

