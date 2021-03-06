package typings.vexflow.mod.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Bracketed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Tuplet")
@js.native
class Tuplet protected ()
  extends typings.vexflow.Vex.Flow.Tuplet {
  def this(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote]) = this()
  def this(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote], options: Bracketed) = this()
  /* CompleteClass */
  override def attach(): Unit = js.native
  /* CompleteClass */
  override def detach(): Unit = js.native
  /* CompleteClass */
  override def draw(): Unit = js.native
  /* CompleteClass */
  override def getBeatsOccupied(): Double = js.native
  /* CompleteClass */
  override def getNoteCount(): Double = js.native
  /* CompleteClass */
  override def getNotes(): js.Array[typings.vexflow.Vex.Flow.StaveNote] = js.native
  /* CompleteClass */
  override def resolveGlyphs(): Unit = js.native
  /* CompleteClass */
  override def setBeatsOccupied(beats: Double): Unit = js.native
  /* CompleteClass */
  override def setBracketed(bracketed: Boolean): typings.vexflow.Vex.Flow.Tuplet = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): typings.vexflow.Vex.Flow.Tuplet = js.native
  /* CompleteClass */
  override def setRatioed(ratioed: Boolean): typings.vexflow.Vex.Flow.Tuplet = js.native
  /* CompleteClass */
  override def setTupletLocation(location: Double): typings.vexflow.Vex.Flow.Tuplet = js.native
}

@JSImport("vexflow", "Flow.Tuplet")
@js.native
object Tuplet extends js.Object {
  val LOCATION_BOTTOM: Double = js.native
  val LOCATION_TOP: Double = js.native
}

