package typings.tensorflowTfjsCore.opsMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "expandDims")
@js.native
object expandDims extends js.Object {
  def apply[R2 /* <: Rank */](x: TensorLike): Tensor[R2] = js.native
  def apply[R2 /* <: Rank */](x: TensorLike, axis: Double): Tensor[R2] = js.native
  def apply[R2 /* <: Rank */](x: Tensor[Rank]): Tensor[R2] = js.native
  def apply[R2 /* <: Rank */](x: Tensor[Rank], axis: Double): Tensor[R2] = js.native
}

