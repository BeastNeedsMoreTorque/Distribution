package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryBufferRendererSceneComponent extends ISceneComponent {
  var _gatherRenderTargets: js.Any
}

object GeometryBufferRendererSceneComponent {
  @scala.inline
  def apply(
    _gatherRenderTargets: js.Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): GeometryBufferRendererSceneComponent = {
    val __obj = js.Dynamic.literal(_gatherRenderTargets = _gatherRenderTargets.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryBufferRendererSceneComponent]
  }
}

