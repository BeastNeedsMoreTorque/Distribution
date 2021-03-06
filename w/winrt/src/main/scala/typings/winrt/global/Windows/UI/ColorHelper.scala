package typings.winrt.global.Windows.UI

import typings.winrt.Windows.UI.Color
import typings.winrt.Windows.UI.IColorHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.ColorHelper")
@js.native
class ColorHelper () extends IColorHelper

/* static members */
@JSGlobal("Windows.UI.ColorHelper")
@js.native
object ColorHelper extends js.Object {
  def fromArgb(a: Double, r: Double, g: Double, b: Double): Color = js.native
}

