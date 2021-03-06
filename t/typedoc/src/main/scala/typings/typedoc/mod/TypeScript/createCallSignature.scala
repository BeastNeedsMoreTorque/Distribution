package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CallSignatureDeclaration
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createCallSignature")
@js.native
object createCallSignature extends js.Object {
  def apply(
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration]
  ): CallSignatureDeclaration = js.native
  def apply(
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): CallSignatureDeclaration = js.native
}

