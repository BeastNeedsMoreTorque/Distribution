package typings.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomConfig
  extends DrawOptionsConfig
     with ObjectOptionsConfig {
  def drawFunc(): js.Any
}

object CustomConfig {
  @scala.inline
  def apply(
    drawFunc: () => js.Any,
    dragBoundFunc: /* pos */ Vector2d => Vector2d = null,
    dragBounds: js.Any = null,
    dragConstraint: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    fill: String = null,
    height: js.UndefOr[Double] = js.undefined,
    id: String = null,
    lineJoin: String = null,
    listening: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    offset: Vector2d = null,
    opacity: js.Any = null,
    rotation: js.UndefOr[Double] = js.undefined,
    rotationDeg: js.UndefOr[Double] = js.undefined,
    scale: Vector2d = null,
    shadow: js.Any = null,
    stroke: String = null,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): CustomConfig = {
    val __obj = js.Dynamic.literal(drawFunc = js.Any.fromFunction0(drawFunc))
    if (dragBoundFunc != null) __obj.updateDynamic("dragBoundFunc")(js.Any.fromFunction1(dragBoundFunc))
    if (dragBounds != null) __obj.updateDynamic("dragBounds")(dragBounds.asInstanceOf[js.Any])
    if (dragConstraint != null) __obj.updateDynamic("dragConstraint")(dragConstraint.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (!js.isUndefined(listening)) __obj.updateDynamic("listening")(listening.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationDeg)) __obj.updateDynamic("rotationDeg")(rotationDeg.get.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomConfig]
  }
}

