package typings.freeStyle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("free-style", "FreeStyle")
@js.native
class FreeStyle protected ()
  extends Cache[Rule | Style]
     with Container[FreeStyle] {
  def this(id: String) = this()
  def this(id: String, changes: Changes) = this()
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override def getStyles(): String = js.native
  def registerCss(styles: Styles): Unit = js.native
  def registerHashRule(prefix: String, styles: Styles): String = js.native
  def registerKeyframes(keyframes: Styles): String = js.native
  def registerRule(rule: String, styles: Styles): Unit = js.native
  def registerStyle(styles: Styles): String = js.native
}

