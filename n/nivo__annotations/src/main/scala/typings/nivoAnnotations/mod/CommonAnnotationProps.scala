package typings.nivoAnnotations.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  containerWidth  :number,   containerHeight  :number,   x  :number,   y  :number,   noteX  :@nivo/annotations.@nivo/annotations.NoteCoordinate,   noteY  :@nivo/annotations.@nivo/annotations.NoteCoordinate,   noteWidth ? :number,   noteTextOffset ? :number,   note  :react.react.ReactNode} & @nivo/core.@nivo/core.MotionProps */
trait CommonAnnotationProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var containerHeight: Double
  var containerWidth: Double
  var motionDamping: js.UndefOr[Double] = js.undefined
  var motionStiffness: js.UndefOr[Double] = js.undefined
  var note: ReactNode
  var noteTextOffset: js.UndefOr[Double] = js.undefined
  var noteWidth: js.UndefOr[Double] = js.undefined
  var noteX: NoteCoordinate
  var noteY: NoteCoordinate
  var x: Double
  var y: Double
}

object CommonAnnotationProps {
  @scala.inline
  def apply(
    containerHeight: Double,
    containerWidth: Double,
    noteX: NoteCoordinate,
    noteY: NoteCoordinate,
    x: Double,
    y: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    motionDamping: js.UndefOr[Double] = js.undefined,
    motionStiffness: js.UndefOr[Double] = js.undefined,
    note: ReactNode = null,
    noteTextOffset: js.UndefOr[Double] = js.undefined,
    noteWidth: js.UndefOr[Double] = js.undefined
  ): CommonAnnotationProps = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(motionDamping)) __obj.updateDynamic("motionDamping")(motionDamping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(motionStiffness)) __obj.updateDynamic("motionStiffness")(motionStiffness.get.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (!js.isUndefined(noteTextOffset)) __obj.updateDynamic("noteTextOffset")(noteTextOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noteWidth)) __obj.updateDynamic("noteWidth")(noteWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonAnnotationProps]
  }
}

