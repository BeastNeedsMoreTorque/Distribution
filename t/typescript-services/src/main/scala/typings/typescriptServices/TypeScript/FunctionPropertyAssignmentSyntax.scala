package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionPropertyAssignmentSyntax extends SyntaxNode {
  var block: BlockSyntax = js.native
  var callSignature: CallSignatureSyntax = js.native
  var propertyName: ISyntaxToken = js.native
  def isPropertyAssignment(): Boolean = js.native
  def update(propertyName: ISyntaxToken, callSignature: CallSignatureSyntax, block: BlockSyntax): FunctionPropertyAssignmentSyntax = js.native
  def withBlock(block: BlockSyntax): FunctionPropertyAssignmentSyntax = js.native
  def withCallSignature(callSignature: CallSignatureSyntax): FunctionPropertyAssignmentSyntax = js.native
  def withPropertyName(propertyName: ISyntaxToken): FunctionPropertyAssignmentSyntax = js.native
}

