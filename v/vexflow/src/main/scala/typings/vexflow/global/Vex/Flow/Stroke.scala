package typings.vexflow.global.Vex.Flow

import typings.vexflow.Vex.Flow.Modifier.Position
import typings.vexflow.Vex.Flow.Stroke.Type
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Allvoices
import typings.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Stroke")
@js.native
class Stroke protected ()
  extends typings.vexflow.Vex.Flow.Stroke {
  def this(`type`: Type) = this()
  def this(`type`: Type, options: Allvoices) = this()
  /* CompleteClass */
  override def addEndNote(note: typings.vexflow.Vex.Flow.Note): typings.vexflow.Vex.Flow.Stroke = js.native
  /* CompleteClass */
  override def alignSubNotesWithNote(subNotes: js.Array[typings.vexflow.Vex.Flow.Note], note: typings.vexflow.Vex.Flow.Note): Unit = js.native
   //inconsistent type: void -> Modifier
  /* CompleteClass */
  override def draw(): Unit = js.native
  /* CompleteClass */
  override def getCategory(): String = js.native
  /* CompleteClass */
  override def getContext(): IRenderContext = js.native
  /* CompleteClass */
  override def getIndex(): Double = js.native
  /* CompleteClass */
  override def getModifierContext(): typings.vexflow.Vex.Flow.ModifierContext = js.native
  /* CompleteClass */
  override def getNote(): typings.vexflow.Vex.Flow.Note = js.native
  /* CompleteClass */
  override def getPosition(): Position = js.native
  /* CompleteClass */
  override def getWidth(): Double = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setIndex(index: Double): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setModifierContext(c: typings.vexflow.Vex.Flow.ModifierContext): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setNote(note: typings.vexflow.Vex.Flow.Note): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setPosition(position: Position): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setTextLine(line: Double): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setWidth(width: Double): typings.vexflow.Vex.Flow.Modifier = js.native
  /* CompleteClass */
  override def setXShift(x: Double): Unit = js.native
  /* CompleteClass */
  override def setYShift(y: Double): typings.vexflow.Vex.Flow.Modifier = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Stroke")
@js.native
object Stroke extends js.Object {
  val CATEGORY: String = js.native
  def format(strokes: js.Array[typings.vexflow.Vex.Flow.Stroke], state: Leftshift): Boolean = js.native
  @js.native
  object Type extends js.Object {
    /* 5 */ val ARPEGGIO_DIRECTIONLESS: typings.vexflow.Vex.Flow.Stroke.Type.ARPEGGIO_DIRECTIONLESS with Double = js.native
    /* 1 */ val BRUSH_DOWN: typings.vexflow.Vex.Flow.Stroke.Type.BRUSH_DOWN with Double = js.native
    /* 0 */ val BRUSH_UP: typings.vexflow.Vex.Flow.Stroke.Type.BRUSH_UP with Double = js.native
    /* 3 */ val RASQUEDO_DOWN: typings.vexflow.Vex.Flow.Stroke.Type.RASQUEDO_DOWN with Double = js.native
    /* 4 */ val RASQUEDO_UP: typings.vexflow.Vex.Flow.Stroke.Type.RASQUEDO_UP with Double = js.native
    /* 1 */ val ROLL_DOWN: typings.vexflow.Vex.Flow.Stroke.Type.ROLL_DOWN with Double = js.native
    /* 2 */ val ROLL_UP: typings.vexflow.Vex.Flow.Stroke.Type.ROLL_UP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Stroke.Type with Double] = js.native
  }
  
}

