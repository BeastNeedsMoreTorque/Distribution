package typings.d3.mod

import typings.d3Interpolate.anon.ValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "interpolateNumber")
@js.native
object interpolateNumber extends js.Object {
  def apply(a: Double, b: Double): js.Function1[/* t */ Double, Double] = js.native
  def apply(a: Double, b: ValueOf): js.Function1[/* t */ Double, Double] = js.native
  def apply(a: ValueOf, b: Double): js.Function1[/* t */ Double, Double] = js.native
  def apply(a: ValueOf, b: ValueOf): js.Function1[/* t */ Double, Double] = js.native
}

