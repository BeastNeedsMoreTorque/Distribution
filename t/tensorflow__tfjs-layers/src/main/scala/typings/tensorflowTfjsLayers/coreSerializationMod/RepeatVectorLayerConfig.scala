package typings.tensorflowTfjsLayers.coreSerializationMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeatVectorLayerConfig extends LayerConfig {
  var n: Double
}

object RepeatVectorLayerConfig {
  @scala.inline
  def apply(
    n: Double,
    batch_input_shape: Shape = null,
    batch_size: js.UndefOr[Double] = js.undefined,
    dtype: DataType = null,
    input_dtype: DataType = null,
    input_shape: Shape = null,
    name: String = null,
    trainable: js.UndefOr[Boolean] = js.undefined
  ): RepeatVectorLayerConfig = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any])
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (!js.isUndefined(batch_size)) __obj.updateDynamic("batch_size")(batch_size.get.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatVectorLayerConfig]
  }
}

