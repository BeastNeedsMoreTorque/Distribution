package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.WorkspaceSymbolParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkspaceSymbolRegistrationOptions
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashsymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "WorkspaceSymbolRequest")
@js.native
object WorkspaceSymbolRequest extends js.Object {
  val method: workspaceSlashsymbol = js.native
  /** @deprecated Use WorkspaceSymbolRequest.type */
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[js.Array[typings.vscodeLanguageserverTypes.mod.SymbolInformation]] = js.native
  val `type`: ProtocolRequestType[
    WorkspaceSymbolParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.SymbolInformation] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.SymbolInformation], 
    Unit, 
    WorkspaceSymbolRegistrationOptions
  ] = js.native
}

