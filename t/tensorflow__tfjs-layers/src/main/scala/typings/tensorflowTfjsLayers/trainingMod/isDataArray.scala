package typings.tensorflowTfjsLayers.trainingMod

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training", "isDataArray")
@js.native
object isDataArray extends js.Object {
  def apply(x: js.Array[Tensor[Rank]]): Boolean = js.native
  def apply(x: StringDictionary[Tensor[Rank]]): Boolean = js.native
  def apply(x: Tensor[Rank]): Boolean = js.native
}

