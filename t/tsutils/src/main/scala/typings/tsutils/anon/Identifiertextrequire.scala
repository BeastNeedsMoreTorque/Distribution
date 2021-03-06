package typings.tsutils.anon

import typings.tsutils.tsutilsStrings.require
import typings.typescript.mod.Decorator
import typings.typescript.mod.ModifiersArray
import typings.typescript.mod.Node
import typings.typescript.mod.NodeArray
import typings.typescript.mod.NodeFlags
import typings.typescript.mod.SourceFile
import typings.typescript.mod.SourceFileLike
import typings.typescript.mod.String
import typings.typescript.mod.SyntaxKind
import typings.typescript.mod.SyntaxKind.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined typescript.typescript.Identifier & {  text  :'require'} */
@js.native
trait Identifiertextrequire extends js.Object {
  var _declarationBrand: js.Any = js.native
  var _expressionBrand: js.Any = js.native
  var _leftHandSideExpressionBrand: js.Any = js.native
  var _memberExpressionBrand: js.Any = js.native
  var _primaryExpressionBrand: js.Any = js.native
  var _unaryExpressionBrand: js.Any = js.native
  var _updateExpressionBrand: js.Any = js.native
  var decorators: js.UndefOr[NodeArray[Decorator]] = js.native
  var end: Double = js.native
  /**
    * Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
    * Text of identifier, but if the identifier begins with two underscores, this will begin with three.
    */
  var escapedText: String = js.native
  var flags: NodeFlags = js.native
  var isInJSDocNamespace: js.UndefOr[Boolean] = js.native
  var kind: Identifier = js.native
  var modifiers: js.UndefOr[ModifiersArray] = js.native
  var originalKeywordKind: js.UndefOr[SyntaxKind] = js.native
  var parent: Node = js.native
  var pos: Double = js.native
  val text: java.lang.String with require = js.native
  def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
  def forEachChild[T](
    cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
    cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
  def getChildAt(index: Double): Node = js.native
  def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
  def getChildCount(): Double = js.native
  def getChildCount(sourceFile: SourceFile): Double = js.native
  def getChildren(): js.Array[Node] = js.native
  def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
  def getEnd(): Double = js.native
  def getFirstToken(): js.UndefOr[Node] = js.native
  def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
  def getFullStart(): Double = js.native
  def getFullText(): java.lang.String = js.native
  def getFullText(sourceFile: SourceFile): java.lang.String = js.native
  def getFullWidth(): Double = js.native
  def getLastToken(): js.UndefOr[Node] = js.native
  def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
  def getLeadingTriviaWidth(): Double = js.native
  def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
  def getSourceFile(): SourceFile = js.native
  def getStart(): Double = js.native
  def getStart(sourceFile: SourceFile): Double = js.native
  def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
  def getText(): java.lang.String = js.native
  def getText(sourceFile: SourceFile): java.lang.String = js.native
  def getWidth(): Double = js.native
  def getWidth(sourceFile: SourceFileLike): Double = js.native
}

