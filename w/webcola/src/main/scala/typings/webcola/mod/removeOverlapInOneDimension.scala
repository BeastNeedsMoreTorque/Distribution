package typings.webcola.mod

import typings.webcola.anon.DesiredCenter
import typings.webcola.anon.LowerBound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "removeOverlapInOneDimension")
@js.native
object removeOverlapInOneDimension extends js.Object {
  def apply(spans: js.Array[DesiredCenter]): LowerBound = js.native
  def apply(spans: js.Array[DesiredCenter], lowerBound: Double): LowerBound = js.native
  def apply(spans: js.Array[DesiredCenter], lowerBound: Double, upperBound: Double): LowerBound = js.native
}

