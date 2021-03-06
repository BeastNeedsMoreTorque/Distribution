package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertySignatureSyntax extends SyntaxNode {
  var propertyName: ISyntaxToken = js.native
  var questionToken: ISyntaxToken = js.native
  var typeAnnotation: TypeAnnotationSyntax = js.native
  def update(propertyName: ISyntaxToken, questionToken: ISyntaxToken, typeAnnotation: TypeAnnotationSyntax): PropertySignatureSyntax = js.native
  def withPropertyName(propertyName: ISyntaxToken): PropertySignatureSyntax = js.native
  def withQuestionToken(questionToken: ISyntaxToken): PropertySignatureSyntax = js.native
  def withTypeAnnotation(typeAnnotation: TypeAnnotationSyntax): PropertySignatureSyntax = js.native
}

