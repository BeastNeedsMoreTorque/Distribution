package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.IkConstraintTimeline")
@js.native
class IkConstraintTimeline protected ()
  extends typings.phaser.spine.IkConstraintTimeline {
  def this(frameCount: Double) = this()
  /* CompleteClass */
  override var curves: js.Any = js.native
  /* CompleteClass */
  override var frames: ArrayLike[Double] = js.native
  /* CompleteClass */
  override var ikConstraintIndex: Double = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: typings.phaser.spine.Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[typings.phaser.spine.Event],
    alpha: Double,
    blend: typings.phaser.spine.MixBlend,
    direction: typings.phaser.spine.MixDirection
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
  override def setFrame(
    frameIndex: Double,
    time: Double,
    mix: Double,
    softness: Double,
    bendDirection: Double,
    compress: Boolean,
    stretch: Boolean
  ): Unit = js.native
  /* CompleteClass */
  override def setLinear(frameIndex: Double): Unit = js.native
  /* CompleteClass */
  override def setStepped(frameIndex: Double): Unit = js.native
}

/* static members */
@JSGlobal("spine.IkConstraintTimeline")
@js.native
object IkConstraintTimeline extends js.Object {
  var BEND_DIRECTION: Double = js.native
  var COMPRESS: Double = js.native
  var ENTRIES: Double = js.native
  var MIX: Double = js.native
  var PREV_BEND_DIRECTION: Double = js.native
  var PREV_COMPRESS: Double = js.native
  var PREV_MIX: Double = js.native
  var PREV_SOFTNESS: Double = js.native
  var PREV_STRETCH: Double = js.native
  var PREV_TIME: Double = js.native
  var SOFTNESS: Double = js.native
  var STRETCH: Double = js.native
}

