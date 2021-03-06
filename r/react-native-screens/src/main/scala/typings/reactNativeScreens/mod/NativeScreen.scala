package typings.reactNativeScreens.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-screens", "NativeScreen")
@js.native
class NativeScreen protected ()
  extends Component[ScreenProps, ComponentState, js.Any] {
  def this(props: ScreenProps) = this()
  def this(props: ScreenProps, context: js.Any) = this()
}

@JSImport("react-native-screens", "NativeScreen")
@js.native
object NativeScreen extends TopLevel[ComponentClass[ScreenProps, ComponentState]]

