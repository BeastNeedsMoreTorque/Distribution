package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x'> */
trait BroadcastToInputs extends js.Object {
  var x: js.UndefOr[js.Any] = js.undefined
}

object BroadcastToInputs {
  @scala.inline
  def apply(x: js.Any = null): BroadcastToInputs = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastToInputs]
  }
}

