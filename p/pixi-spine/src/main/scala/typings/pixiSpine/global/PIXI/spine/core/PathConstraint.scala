package typings.pixiSpine.global.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.PathConstraint")
@js.native
class PathConstraint protected ()
  extends typings.pixiSpine.PIXI.spine.core.PathConstraint {
  def this(
    data: typings.pixiSpine.PIXI.spine.core.PathConstraintData,
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton
  ) = this()
  /* CompleteClass */
  override var active: Boolean = js.native
  /* CompleteClass */
  override var bones: js.Array[typings.pixiSpine.PIXI.spine.core.Bone] = js.native
  /* CompleteClass */
  override var curves: js.Array[Double] = js.native
  /* CompleteClass */
  override var data: typings.pixiSpine.PIXI.spine.core.PathConstraintData = js.native
  /* CompleteClass */
  override var lengths: js.Array[Double] = js.native
  /* CompleteClass */
  override var position: Double = js.native
  /* CompleteClass */
  override var positions: js.Array[Double] = js.native
  /* CompleteClass */
  override var rotateMix: Double = js.native
  /* CompleteClass */
  override var segments: js.Array[Double] = js.native
  /* CompleteClass */
  override var spaces: js.Array[Double] = js.native
  /* CompleteClass */
  override var spacing: Double = js.native
  /* CompleteClass */
  override var target: typings.pixiSpine.PIXI.spine.core.Slot = js.native
  /* CompleteClass */
  override var translateMix: Double = js.native
  /* CompleteClass */
  override var world: js.Array[Double] = js.native
  /* CompleteClass */
  override def addAfterPosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit = js.native
  /* CompleteClass */
  override def addBeforePosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit = js.native
  /* CompleteClass */
  override def addCurvePosition(
    p: Double,
    x1: Double,
    y1: Double,
    cx1: Double,
    cy1: Double,
    cx2: Double,
    cy2: Double,
    x2: Double,
    y2: Double,
    out: js.Array[Double],
    o: Double,
    tangents: Boolean
  ): Unit = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(): Unit = js.native
  /* CompleteClass */
  override def computeWorldPositions(
    path: typings.pixiSpine.PIXI.spine.core.PathAttachment,
    spacesCount: Double,
    tangents: Boolean,
    percentPosition: Boolean,
    percentSpacing: Boolean
  ): js.Array[Double] = js.native
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  /* CompleteClass */
  override def update(): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.PathConstraint")
@js.native
object PathConstraint extends js.Object {
  var AFTER: Double = js.native
  var BEFORE: Double = js.native
  var NONE: Double = js.native
  var epsilon: Double = js.native
}

