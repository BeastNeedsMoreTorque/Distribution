package typings.typedoc.mod.TypeScript

import typings.typescript.mod.AssertsToken
import typings.typescript.mod.Identifier
import typings.typescript.mod.ThisTypeNode
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypePredicateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createTypePredicateNodeWithModifier")
@js.native
object createTypePredicateNodeWithModifier extends js.Object {
  def apply(assertsModifier: js.UndefOr[AssertsToken], parameterName: String): TypePredicateNode = js.native
  def apply(assertsModifier: js.UndefOr[AssertsToken], parameterName: String, `type`: TypeNode): TypePredicateNode = js.native
  def apply(assertsModifier: js.UndefOr[AssertsToken], parameterName: Identifier): TypePredicateNode = js.native
  def apply(assertsModifier: js.UndefOr[AssertsToken], parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
  def apply(assertsModifier: js.UndefOr[AssertsToken], parameterName: ThisTypeNode): TypePredicateNode = js.native
  def apply(assertsModifier: js.UndefOr[AssertsToken], parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
}

