package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.PrivateIdentifier
import typings.typescript.mod.PropertyAccessExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createPropertyAccess")
@js.native
object createPropertyAccess extends js.Object {
  def apply(expression: Expression, name: String): PropertyAccessExpression = js.native
  def apply(expression: Expression, name: Identifier): PropertyAccessExpression = js.native
  def apply(expression: Expression, name: PrivateIdentifier): PropertyAccessExpression = js.native
}

