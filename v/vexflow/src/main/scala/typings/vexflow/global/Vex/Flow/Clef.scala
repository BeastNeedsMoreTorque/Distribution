package typings.vexflow.global.Vex.Flow

import typings.vexflow.anon.GetContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Clef")
@js.native
class Clef protected ()
  extends typings.vexflow.Vex.Flow.Clef {
  def this(clef: String) = this()
  def this(clef: String, size: String) = this()
  def this(clef: String, size: String, annotation: String) = this()
  /* CompleteClass */
  override def addEndModifier(): Unit = js.native
  /* CompleteClass */
  override def addModifier(): Unit = js.native
  /* CompleteClass */
  override def addToStave(stave: typings.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typings.vexflow.Vex.Flow.StaveModifier = js.native
  /* CompleteClass */
  override def addToStaveEnd(stave: typings.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typings.vexflow.Vex.Flow.StaveModifier = js.native
  /* CompleteClass */
  override def getCategory(): String = js.native
  /* CompleteClass */
  override def getPadding(index: Double): Double = js.native
  /* CompleteClass */
  override def getPosition(): Double = js.native
  /* CompleteClass */
  override def getWidth(): Double = js.native
  /* CompleteClass */
  override def makeSpacer(padding: Double): GetContext = js.native
  /* CompleteClass */
  override def placeGlyphOnLine(glyph: typings.vexflow.Vex.Flow.Glyph, stave: typings.vexflow.Vex.Flow.Stave, line: Double): Unit = js.native
  /* CompleteClass */
  override def setPadding(padding: Double): Unit = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Clef")
@js.native
object Clef extends js.Object {
  var DEBUG: Boolean = js.native
}

