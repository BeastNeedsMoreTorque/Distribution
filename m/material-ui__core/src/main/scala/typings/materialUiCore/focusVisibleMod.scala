package typings.materialUiCore

import typings.materialUiCore.anon.FocusVisibleCheckTime
import typings.std.Element
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/ButtonBase/focusVisible", JSImport.Namespace)
@js.native
object focusVisibleMod extends js.Object {
  def detectFocusVisible(instance: FocusVisibleCheckTime, element: Element, cb: js.Function0[Unit], attempt: Double): Unit = js.native
  def focusKeyPressed(pressed: Boolean): Boolean = js.native
  def listenForFocusKeys(window: Window): Unit = js.native
}

