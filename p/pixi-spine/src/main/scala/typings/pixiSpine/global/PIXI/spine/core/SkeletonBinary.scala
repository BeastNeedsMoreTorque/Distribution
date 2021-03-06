package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.AttachmentLoader
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.SkeletonBinary")
@js.native
class SkeletonBinary protected ()
  extends typings.pixiSpine.PIXI.spine.core.SkeletonBinary {
  def this(attachmentLoader: AttachmentLoader) = this()
  /* CompleteClass */
  override var attachmentLoader: AttachmentLoader = js.native
  /* CompleteClass */
  override var linkedMeshes: js.Any = js.native
  /* CompleteClass */
  override var readAnimation: js.Any = js.native
  /* CompleteClass */
  override var readAttachment: js.Any = js.native
  /* CompleteClass */
  override var readCurve: js.Any = js.native
  /* CompleteClass */
  override var readFloatArray: js.Any = js.native
  /* CompleteClass */
  override var readShortArray: js.Any = js.native
  /* CompleteClass */
  override var readSkin: js.Any = js.native
  /* CompleteClass */
  override var readVertices: js.Any = js.native
  /* CompleteClass */
  override var scale: Double = js.native
  /* CompleteClass */
  override def readSkeletonData(binary: Uint8Array): typings.pixiSpine.PIXI.spine.core.SkeletonData = js.native
  /* CompleteClass */
  override def setCurve(
    timeline: typings.pixiSpine.PIXI.spine.core.CurveTimeline,
    frameIndex: Double,
    cx1: Double,
    cy1: Double,
    cx2: Double,
    cy2: Double
  ): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.SkeletonBinary")
@js.native
object SkeletonBinary extends js.Object {
  var AttachmentTypeValues: js.Array[Double] = js.native
  var BONE_ROTATE: Double = js.native
  var BONE_SCALE: Double = js.native
  var BONE_SHEAR: Double = js.native
  var BONE_TRANSLATE: Double = js.native
  var BlendModeValues: js.Array[typings.pixiSpine.PIXI.spine.core.BlendMode] = js.native
  var CURVE_BEZIER: Double = js.native
  var CURVE_LINEAR: Double = js.native
  var CURVE_STEPPED: Double = js.native
  var PATH_MIX: Double = js.native
  var PATH_POSITION: Double = js.native
  var PATH_SPACING: Double = js.native
  var PositionModeValues: js.Array[typings.pixiSpine.PIXI.spine.core.PositionMode] = js.native
  var RotateModeValues: js.Array[typings.pixiSpine.PIXI.spine.core.RotateMode] = js.native
  var SLOT_ATTACHMENT: Double = js.native
  var SLOT_COLOR: Double = js.native
  var SLOT_TWO_COLOR: Double = js.native
  var SpacingModeValues: js.Array[typings.pixiSpine.PIXI.spine.core.SpacingMode] = js.native
  var TransformModeValues: js.Array[typings.pixiSpine.PIXI.spine.core.TransformMode] = js.native
}

