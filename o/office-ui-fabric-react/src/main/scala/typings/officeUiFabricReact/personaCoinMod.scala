package typings.officeUiFabricReact

import typings.officeUiFabricReact.personaTypesMod.IPersonaCoinProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin", JSImport.Namespace)
@js.native
object personaCoinMod extends js.Object {
  @js.native
  class PersonaCoinBase protected ()
    extends typings.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase {
    def this(props: IPersonaCoinProps) = this()
  }
  
  val PersonaCoin: FunctionComponent[IPersonaCoinProps] = js.native
  /* static members */
  @js.native
  object PersonaCoinBase extends js.Object {
    var defaultProps: IPersonaCoinProps = js.native
  }
  
}

