package typings.cesium.mod

import typings.cesium.anon.Toggled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ToggleButtonViewModel")
@js.native
class ToggleButtonViewModel protected () extends js.Object {
  def this(command: Command) = this()
  def this(command: Command, options: Toggled) = this()
  var command: Command = js.native
  var toggled: Boolean = js.native
  var tooltip: String = js.native
}

