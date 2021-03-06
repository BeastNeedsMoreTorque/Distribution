package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstraintSyntax extends SyntaxNode {
  var extendsKeyword: ISyntaxToken = js.native
  var `type`: ITypeSyntax = js.native
  def update(extendsKeyword: ISyntaxToken, `type`: ITypeSyntax): ConstraintSyntax = js.native
  def withExtendsKeyword(extendsKeyword: ISyntaxToken): ConstraintSyntax = js.native
  def withType(`type`: ITypeSyntax): ConstraintSyntax = js.native
}

