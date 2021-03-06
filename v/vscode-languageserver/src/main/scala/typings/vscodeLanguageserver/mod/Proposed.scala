package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.callHierarchySlashincomingCalls
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.callHierarchySlashoutgoingCalls
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashprepareCallHierarchy
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashsemanticTokens
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashsemanticTokensSlashedits
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashsemanticTokensSlashrange
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCall
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCallsParams
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyItem
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCall
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCallsParams
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyPrepareParams
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEdits
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsParams
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsPartialResult
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensParams
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensPartialResult
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRangeParams
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "Proposed")
@js.native
object Proposed extends js.Object {
  val SemanticTokenModifiers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof st.SemanticTokenModifiers */ js.Any = js.native
  val SemanticTokenTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof st.SemanticTokenTypes */ js.Any = js.native
  @js.native
  object CallHierarchyIncomingCallsRequest extends js.Object {
    val method: callHierarchySlashincomingCalls = js.native
    val `type`: ProtocolRequestType[
        CallHierarchyIncomingCallsParams, 
        js.Array[CallHierarchyIncomingCall] | Null, 
        js.Array[CallHierarchyIncomingCall], 
        Unit, 
        Unit
      ] = js.native
  }
  
  @js.native
  object CallHierarchyOutgoingCallsRequest extends js.Object {
    val method: callHierarchySlashoutgoingCalls = js.native
    val `type`: ProtocolRequestType[
        CallHierarchyOutgoingCallsParams, 
        js.Array[CallHierarchyOutgoingCall] | Null, 
        js.Array[CallHierarchyOutgoingCall], 
        Unit, 
        Unit
      ] = js.native
  }
  
  @js.native
  object CallHierarchyPrepareRequest extends js.Object {
    val method: textDocumentSlashprepareCallHierarchy = js.native
    val `type`: ProtocolRequestType[
        CallHierarchyPrepareParams, 
        js.Array[CallHierarchyItem] | Null, 
        scala.Nothing, 
        Unit, 
        CallHierarchyRegistrationOptions
      ] = js.native
  }
  
  @js.native
  object SemanticTokens extends js.Object {
    def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed.SemanticTokens */ Boolean = js.native
  }
  
  @js.native
  object SemanticTokensEditsRequest extends js.Object {
    val method: textDocumentSlashsemanticTokensSlashedits = js.native
    val `type`: ProtocolRequestType[
        SemanticTokensEditsParams, 
        SemanticTokens | SemanticTokensEdits | Null, 
        SemanticTokensPartialResult | SemanticTokensEditsPartialResult, 
        Unit, 
        SemanticTokensRegistrationOptions
      ] = js.native
  }
  
  @js.native
  object SemanticTokensRangeRequest extends js.Object {
    val method: textDocumentSlashsemanticTokensSlashrange = js.native
    val `type`: ProtocolRequestType[
        SemanticTokensRangeParams, 
        SemanticTokens | Null, 
        SemanticTokensPartialResult, 
        Unit, 
        Unit
      ] = js.native
  }
  
  @js.native
  object SemanticTokensRequest extends js.Object {
    val method: textDocumentSlashsemanticTokens = js.native
    val `type`: ProtocolRequestType[
        SemanticTokensParams, 
        SemanticTokens | Null, 
        SemanticTokensPartialResult, 
        Unit, 
        SemanticTokensRegistrationOptions
      ] = js.native
  }
  
}

