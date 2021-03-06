package typings.vexflow.global.Vex.Flow

import typings.vexflow.Vex.Flow.Tickable
import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveNote")
@js.native
class StaveNote protected ()
  extends typings.vexflow.Vex.Flow.StaveNote {
  def this(note_struct: typings.vexflow.anon.Clef) = this()
  /* CompleteClass */
  override def addModifier(mod: typings.vexflow.Vex.Flow.Modifier): Tickable = js.native
  /* CompleteClass */
  override def addToModifierContext(mc: typings.vexflow.Vex.Flow.ModifierContext): Unit = js.native
  /* CompleteClass */
  override def applyTickMultiplier(numerator: Double, denominator: Double): Unit = js.native
  /* CompleteClass */
  override def getBoundingBox(): typings.vexflow.Vex.Flow.BoundingBox = js.native
  /* CompleteClass */
  override def getCenterXShift(): Double = js.native
  /* CompleteClass */
  override def getIntrinsicTicks(): typings.vexflow.Vex.Flow.Fraction = js.native
  /* CompleteClass */
  override def getTickMultiplier(): typings.vexflow.Vex.Flow.Fraction = js.native
  /* CompleteClass */
  override def getTicks(): typings.vexflow.Vex.Flow.Fraction = js.native
  /* CompleteClass */
  override def getTuplet(): typings.vexflow.Vex.Flow.Tuplet = js.native
  /* CompleteClass */
  override def getVoice(): typings.vexflow.Vex.Flow.Voice = js.native
  /* CompleteClass */
  override def getWidth(): Double = js.native
  /* CompleteClass */
  override def isCenterAligned(): Boolean = js.native
  /* CompleteClass */
  override def postFormat(): Tickable = js.native
  /* CompleteClass */
  override def preFormat(): Unit = js.native
  /* CompleteClass */
  override def setCenterAlignment(align_center: Boolean): Tickable = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): Unit = js.native
  /* CompleteClass */
  override def setDuration(duration: typings.vexflow.Vex.Flow.Fraction): Unit = js.native
  /* CompleteClass */
  override def setIntrinsicTicks(intrinsicTicks: typings.vexflow.Vex.Flow.Fraction): Unit = js.native
  /* CompleteClass */
  override def setTickContext(tc: typings.vexflow.Vex.Flow.TickContext): Unit = js.native
  /* CompleteClass */
  override def setTuplet(tuplet: typings.vexflow.Vex.Flow.Tuplet): Tickable = js.native
  /* CompleteClass */
  override def setVoice(voice: typings.vexflow.Vex.Flow.Voice): Unit = js.native
  /* CompleteClass */
  override def setXShift(x: Double): Tickable = js.native
  /* CompleteClass */
  override def shouldIgnoreTicks(): Boolean = js.native
}

/* static members */
@JSGlobal("Vex.Flow.StaveNote")
@js.native
object StaveNote extends js.Object {
  val CATEGORY: String = js.native
  var DEBUG: Boolean = js.native
  val STEM_DOWN: Double = js.native
  val STEM_UP: Double = js.native
  def format(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote], state: Leftshift): Boolean = js.native
  def formatByY(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote], state: Leftshift): Unit = js.native
  def postFormat(notes: js.Array[typings.vexflow.Vex.Flow.StaveNote]): Boolean = js.native
}

