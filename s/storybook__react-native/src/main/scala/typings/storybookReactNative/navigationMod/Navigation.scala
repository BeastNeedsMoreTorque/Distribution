package typings.storybookReactNative.navigationMod

import typings.react.mod.Component
import typings.storybookReactNative.anon.IsUIVisible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigation
  extends Component[Props, js.Object, js.Any] {
  @JSName("state")
  var state_Navigation: IsUIVisible = js.native
  def handleSwipeLeft(): Unit = js.native
  def handleSwipeRight(): Unit = js.native
  def handleToggleUI(): Unit = js.native
}

