package typings
package d3DashRandomLib.d3DashRandomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomBates extends RandomNumberGenerationSource {
  /**
    * Returns a function for generating random numbers with a Bates distribution with n independent variables.
    *
    * @param n Number of independent random variables to use.
    */
  def apply(n: scala.Double): js.Function0[scala.Double] = js.native
}

