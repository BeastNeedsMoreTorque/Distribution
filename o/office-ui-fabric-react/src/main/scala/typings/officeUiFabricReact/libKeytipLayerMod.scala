package typings.officeUiFabricReact

import typings.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/KeytipLayer", JSImport.Namespace)
@js.native
object libKeytipLayerMod extends js.Object {
  @js.native
  class KeytipLayerBase protected ()
    extends typings.officeUiFabricReact.keytipLayerMod.KeytipLayerBase {
    def this(props: IKeytipLayerProps, context: js.Any) = this()
  }
  
  val KeytipLayer: FunctionComponent[IKeytipLayerProps] = js.native
  /* static members */
  @js.native
  object KeytipLayerBase extends js.Object {
    var defaultProps: IKeytipLayerProps = js.native
  }
  
}

