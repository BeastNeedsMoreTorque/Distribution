package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateMappedTypeNode")
@js.native
object updateMappedTypeNode extends js.Object {
  def apply(
    node: MappedTypeNode,
    readonlyToken: js.UndefOr[MinusToken | PlusToken | ReadonlyToken],
    typeParameter: TypeParameterDeclaration
  ): MappedTypeNode = js.native
  def apply(
    node: MappedTypeNode,
    readonlyToken: js.UndefOr[MinusToken | PlusToken | ReadonlyToken],
    typeParameter: TypeParameterDeclaration,
    questionToken: MinusToken | PlusToken | QuestionToken
  ): MappedTypeNode = js.native
  def apply(
    node: MappedTypeNode,
    readonlyToken: js.UndefOr[MinusToken | PlusToken | ReadonlyToken],
    typeParameter: TypeParameterDeclaration,
    questionToken: MinusToken | PlusToken | QuestionToken,
    `type`: TypeNode
  ): MappedTypeNode = js.native
}

