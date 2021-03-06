package typings.reactGateway

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactGateway.gatewayDestMod.GatewayDestProps
import typings.reactGateway.gatewayMod.GatewayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-gateway", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Gateway ()
    extends Component[GatewayProps, js.Object, js.Any]
  
  @js.native
  class GatewayDest ()
    extends Component[GatewayDestProps, js.Object, js.Any]
  
  @js.native
  class GatewayProvider ()
    extends Component[js.Object, js.Object, js.Any]
  
  @js.native
  class GatewayRegistry ()
    extends typings.reactGateway.gatewayRegistryMod.GatewayRegistry {
    /* CompleteClass */
    override var _children: StringDictionary[js.UndefOr[StringDictionary[ReactNode]]] = js.native
    /* CompleteClass */
    override var _containers: StringDictionary[js.UndefOr[(Component[js.Object, js.Object, _]) | Null]] = js.native
    /* CompleteClass */
    override var _currentId: Double = js.native
    /* CompleteClass */
    override def _renderContainer(name: String): Unit = js.native
    /* CompleteClass */
    override def addChild(name: String, gatewayId: String, child: ReactNode): Unit = js.native
    /* CompleteClass */
    override def addContainer(name: String, container: Component[js.Object, js.Object, _]): Unit = js.native
    /* CompleteClass */
    override def clearChild(name: String, gatewayId: String): Unit = js.native
    /* CompleteClass */
    override def register(name: String, child: ReactNode): String = js.native
    /* CompleteClass */
    override def removeContainer(name: String): Unit = js.native
    /* CompleteClass */
    override def unregister(name: String, gatewayId: String): Unit = js.native
  }
  
}

