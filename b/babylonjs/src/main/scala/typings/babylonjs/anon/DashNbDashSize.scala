package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashNbDashSize extends js.Object {
  var dashNb: js.UndefOr[Double] = js.undefined
  var dashSize: js.UndefOr[Double] = js.undefined
  var gapSize: js.UndefOr[Double] = js.undefined
  var points: js.Array[Vector3]
}

object DashNbDashSize {
  @scala.inline
  def apply(
    points: js.Array[Vector3],
    dashNb: js.UndefOr[Double] = js.undefined,
    dashSize: js.UndefOr[Double] = js.undefined,
    gapSize: js.UndefOr[Double] = js.undefined
  ): DashNbDashSize = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (!js.isUndefined(dashNb)) __obj.updateDynamic("dashNb")(dashNb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dashSize)) __obj.updateDynamic("dashSize")(dashSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gapSize)) __obj.updateDynamic("gapSize")(gapSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashNbDashSize]
  }
}

