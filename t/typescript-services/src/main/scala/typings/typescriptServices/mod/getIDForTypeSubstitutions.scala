package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "getIDForTypeSubstitutions")
@js.native
object getIDForTypeSubstitutions extends js.Object {
  def apply(
    instantiatingSignature: typings.typescriptServices.TypeScript.PullSignatureSymbol,
    typeArgumentMap: TypeArgumentMap
  ): String = js.native
  def apply(
    instantiatingType: typings.typescriptServices.TypeScript.PullTypeSymbol,
    typeArgumentMap: TypeArgumentMap
  ): String = js.native
}

