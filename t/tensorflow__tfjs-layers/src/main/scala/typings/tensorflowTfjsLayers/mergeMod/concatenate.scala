package typings.tensorflowTfjsLayers.mergeMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.topologyMod.Layer
import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "concatenate")
@js.native
object concatenate extends js.Object {
  def apply(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def apply(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def apply(config: ConcatenateLayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
}

