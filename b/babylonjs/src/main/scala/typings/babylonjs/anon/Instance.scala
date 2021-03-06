package typings.babylonjs.anon

import typings.babylonjs.linesMeshMod.LinesMesh
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  var colors: js.UndefOr[Nullable[js.Array[js.Array[Color4]]]] = js.undefined
  var instance: js.UndefOr[Nullable[LinesMesh]] = js.undefined
  var lines: js.Array[js.Array[Vector3]]
  var updatable: js.UndefOr[Boolean] = js.undefined
  var useVertexAlpha: js.UndefOr[Boolean] = js.undefined
}

object Instance {
  @scala.inline
  def apply(
    lines: js.Array[js.Array[Vector3]],
    colors: js.UndefOr[Null | Nullable[js.Array[js.Array[Color4]]]] = js.undefined,
    instance: js.UndefOr[Null | Nullable[LinesMesh]] = js.undefined,
    updatable: js.UndefOr[Boolean] = js.undefined,
    useVertexAlpha: js.UndefOr[Boolean] = js.undefined
  ): Instance = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(instance)) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useVertexAlpha)) __obj.updateDynamic("useVertexAlpha")(useVertexAlpha.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

