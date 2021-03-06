package typings.babylonjs.BABYLON

import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerInfoPre extends PointerInfoBase {
  /**
    * Defines the local position of the pointer on the canvas.
    */
  var localPosition: Vector2
  /**
    * Ray from a pointer if availible (eg. 6dof controller)
    */
  var ray: Nullable[Ray]
  /**
    * Defines whether the engine should skip the next OnPointerObservable associated to this pre.
    */
  var skipOnPointerObservable: Boolean
}

object PointerInfoPre {
  @scala.inline
  def apply(
    event: PointerEvent | MouseWheelEvent,
    localPosition: Vector2,
    skipOnPointerObservable: Boolean,
    `type`: Double,
    ray: Nullable[Ray] = null
  ): PointerInfoPre = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], localPosition = localPosition.asInstanceOf[js.Any], skipOnPointerObservable = skipOnPointerObservable.asInstanceOf[js.Any], ray = ray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerInfoPre]
  }
}

