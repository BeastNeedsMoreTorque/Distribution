package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.updateTypeParameterDeclaration")
@js.native
object updateTypeParameterDeclaration extends js.Object {
  def apply(node: TypeParameterDeclaration, name: Identifier): TypeParameterDeclaration = js.native
  def apply(node: TypeParameterDeclaration, name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
  def apply(node: TypeParameterDeclaration, name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
}

