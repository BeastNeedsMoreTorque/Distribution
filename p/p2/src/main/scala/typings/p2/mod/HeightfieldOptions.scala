package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightfieldOptions extends SharedShapeOptions {
  var elementWidth: js.UndefOr[Double] = js.undefined
  var heights: js.UndefOr[js.Array[Double]] = js.undefined
  var maxValue: js.UndefOr[Double] = js.undefined
  var minValue: js.UndefOr[Double] = js.undefined
}

object HeightfieldOptions {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    collisionGroup: js.UndefOr[Double] = js.undefined,
    collisionMask: js.UndefOr[Double] = js.undefined,
    collisionResponse: js.UndefOr[Boolean] = js.undefined,
    elementWidth: js.UndefOr[Double] = js.undefined,
    heights: js.Array[Double] = null,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    position: js.Tuple2[Double, Double] = null,
    sensor: js.UndefOr[Boolean] = js.undefined
  ): HeightfieldOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionGroup)) __obj.updateDynamic("collisionGroup")(collisionGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionMask)) __obj.updateDynamic("collisionMask")(collisionMask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionResponse)) __obj.updateDynamic("collisionResponse")(collisionResponse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(elementWidth)) __obj.updateDynamic("elementWidth")(elementWidth.get.asInstanceOf[js.Any])
    if (heights != null) __obj.updateDynamic("heights")(heights.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(sensor)) __obj.updateDynamic("sensor")(sensor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightfieldOptions]
  }
}

