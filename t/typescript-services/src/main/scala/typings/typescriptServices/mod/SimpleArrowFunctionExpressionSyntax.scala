package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxElement
import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ISyntaxTriviaList
import typings.typescriptServices.TypeScript.ISyntaxVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SimpleArrowFunctionExpressionSyntax")
@js.native
class SimpleArrowFunctionExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax {
  def this(
    identifier: ISyntaxToken,
    equalsGreaterThanToken: ISyntaxToken,
    block: typings.typescriptServices.TypeScript.BlockSyntax,
    expression: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  /* CompleteClass */
  override var block: typings.typescriptServices.TypeScript.BlockSyntax = js.native
  /* CompleteClass */
  override var equalsGreaterThanToken: ISyntaxToken = js.native
  /* CompleteClass */
  override var expression: IExpressionSyntax = js.native
  /* CompleteClass */
  override def accept(visitor: ISyntaxVisitor): js.Any = js.native
  /* CompleteClass */
  override def childAt(index: Double): ISyntaxElement = js.native
  /* CompleteClass */
  override def childCount(): Double = js.native
  /* CompleteClass */
  override def collectTextElements(elements: js.Array[String]): Unit = js.native
  /* CompleteClass */
  override def firstToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def fullText(): String = js.native
  /* CompleteClass */
  override def fullWidth(): Double = js.native
  /* CompleteClass */
  override def isArrowFunctionExpression(): Boolean = js.native
  /* CompleteClass */
  override def isExpression(): Boolean = js.native
  /* CompleteClass */
  override def isIncrementallyUnusable(): Boolean = js.native
  /* CompleteClass */
  override def isList(): Boolean = js.native
  /* CompleteClass */
  override def isNode(): Boolean = js.native
  /* CompleteClass */
  override def isSeparatedList(): Boolean = js.native
  /* CompleteClass */
  override def isToken(): Boolean = js.native
  /* CompleteClass */
  override def isTypeScriptSpecific(): Boolean = js.native
  /* CompleteClass */
  override def isUnaryExpression(): Boolean = js.native
  /* CompleteClass */
  override def kind(): typings.typescriptServices.TypeScript.SyntaxKind = js.native
  /* CompleteClass */
  override def lastToken(): ISyntaxToken = js.native
  /* CompleteClass */
  override def leadingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def leadingTriviaWidth(): Double = js.native
  /* CompleteClass */
  override def trailingTrivia(): ISyntaxTriviaList = js.native
  /* CompleteClass */
  override def trailingTriviaWidth(): Double = js.native
  /* CompleteClass */
  override def width(): Double = js.native
  /* CompleteClass */
  override def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  /* CompleteClass */
  override def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}

/* static members */
@JSImport("typescript-services", "SimpleArrowFunctionExpressionSyntax")
@js.native
object SimpleArrowFunctionExpressionSyntax extends js.Object {
  def create(identifier: ISyntaxToken, equalsGreaterThanToken: ISyntaxToken): typings.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.SimpleArrowFunctionExpressionSyntax = js.native
}

