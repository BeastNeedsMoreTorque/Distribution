package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashrangeFormatting
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentRangeFormattingParams
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentRangeFormattingRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "DocumentRangeFormattingRequest")
@js.native
object DocumentRangeFormattingRequest extends js.Object {
  val method: textDocumentSlashrangeFormatting = js.native
  val `type`: ProtocolRequestType[
    DocumentRangeFormattingParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentRangeFormattingRegistrationOptions
  ] = js.native
}

