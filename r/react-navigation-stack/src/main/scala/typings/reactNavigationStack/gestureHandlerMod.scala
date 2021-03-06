package typings.reactNavigationStack

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactNative.mod.View
import typings.reactNativeGestureHandler.mod.PanGestureHandlerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler", JSImport.Namespace)
@js.native
object gestureHandlerMod extends js.Object {
  @js.native
  class GestureHandlerRootView () extends View
  
  @js.native
  class PanGestureHandler protected ()
    extends Component[PanGestureHandlerProperties, ComponentState, js.Any] {
    def this(props: PanGestureHandlerProperties) = this()
    def this(props: PanGestureHandlerProperties, context: js.Any) = this()
  }
  
  @js.native
  object GestureHandlerRootView extends Instantiable0[View] {
    /**
      * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
      * @platform ios
      */
    var forceTouchAvailable: Boolean = js.native
  }
  
  @js.native
  object GestureState extends js.Object {
    var ACTIVE: Double = js.native
    var BEGAN: Double = js.native
    var CANCELLED: Double = js.native
    var END: Double = js.native
    var FAILED: Double = js.native
    var UNDETERMINED: Double = js.native
  }
  
  @js.native
  object PanGestureHandler extends TopLevel[ComponentType[PanGestureHandlerProperties]]
  
}

