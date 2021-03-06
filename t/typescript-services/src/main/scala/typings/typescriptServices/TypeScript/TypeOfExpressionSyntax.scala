package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeOfExpressionSyntax
  extends IUnaryExpressionSyntax
     with SyntaxNode {
  var expression: IUnaryExpressionSyntax = js.native
  var typeOfKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(typeOfKeyword: ISyntaxToken, expression: IUnaryExpressionSyntax): TypeOfExpressionSyntax = js.native
  def withExpression(expression: IUnaryExpressionSyntax): TypeOfExpressionSyntax = js.native
  def withTypeOfKeyword(typeOfKeyword: ISyntaxToken): TypeOfExpressionSyntax = js.native
}

