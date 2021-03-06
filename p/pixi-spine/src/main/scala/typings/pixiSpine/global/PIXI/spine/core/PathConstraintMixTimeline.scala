package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.PathConstraintMixTimeline")
@js.native
class PathConstraintMixTimeline protected ()
  extends typings.pixiSpine.PIXI.spine.core.PathConstraintMixTimeline {
  def this(frameCount: Double) = this()
  /* CompleteClass */
  override var curves: js.Any = js.native
  /* CompleteClass */
  override var frames: ArrayLike[Double] = js.native
  /* CompleteClass */
  override var pathConstraintIndex: Double = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: typings.pixiSpine.PIXI.spine.core.Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[typings.pixiSpine.PIXI.spine.core.Event],
    alpha: Double,
    blend: typings.pixiSpine.PIXI.spine.core.MixBlend,
    direction: typings.pixiSpine.PIXI.spine.core.MixDirection
  ): Unit = js.native
  /* CompleteClass */
  override def getCurvePercent(frameIndex: Double, percent: Double): Double = js.native
  /* CompleteClass */
  override def getCurveType(frameIndex: Double): Double = js.native
  /* CompleteClass */
  override def getFrameCount(): Double = js.native
  /* CompleteClass */
  override def getPropertyId(): Double = js.native
  /* CompleteClass */
  override def setCurve(frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
  /* CompleteClass */
  override def setFrame(frameIndex: Double, time: Double, rotateMix: Double, translateMix: Double): Unit = js.native
  /* CompleteClass */
  override def setLinear(frameIndex: Double): Unit = js.native
  /* CompleteClass */
  override def setStepped(frameIndex: Double): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.PathConstraintMixTimeline")
@js.native
object PathConstraintMixTimeline extends js.Object {
  var ENTRIES: Double = js.native
  var PREV_ROTATE: Double = js.native
  var PREV_TIME: Double = js.native
  var PREV_TRANSLATE: Double = js.native
  var ROTATE: Double = js.native
  var TRANSLATE: Double = js.native
}

