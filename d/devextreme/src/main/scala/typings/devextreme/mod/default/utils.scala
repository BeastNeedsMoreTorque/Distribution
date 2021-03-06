package typings.devextreme.mod.default

import typings.devextreme.anon.AllowPan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "utils")
@js.native
object utils extends js.Object {
  def cancelAnimationFrame(requestID: Double): Unit = js.native
  def initMobileViewport(options: AllowPan): Unit = js.native
  def requestAnimationFrame(callback: js.Function): Double = js.native
}

