package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "tsMethodSignature")
@js.native
object tsMethodSignature extends js.Object {
  def apply(
    key: Expression,
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclaration_],
    parameters: js.Array[Identifier_ | RestElement_]
  ): TSMethodSignature_ = js.native
  def apply(
    key: Expression,
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclaration_],
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation_
  ): TSMethodSignature_ = js.native
}

