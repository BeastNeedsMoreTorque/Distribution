package typings.typedoc.mod.TypeScript

import typings.typescript.mod.MethodSignature
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.PropertyName
import typings.typescript.mod.QuestionToken
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createMethodSignature")
@js.native
object createMethodSignature extends js.Object {
  def apply(
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    name: String
  ): MethodSignature = js.native
  def apply(
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    name: String,
    questionToken: QuestionToken
  ): MethodSignature = js.native
  def apply(
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    name: PropertyName
  ): MethodSignature = js.native
  def apply(
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    name: PropertyName,
    questionToken: QuestionToken
  ): MethodSignature = js.native
}

