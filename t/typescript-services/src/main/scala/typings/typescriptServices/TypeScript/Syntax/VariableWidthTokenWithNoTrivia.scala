package typings.typescriptServices.TypeScript.Syntax

import typings.typescriptServices.TypeScript.ISyntaxElement
import typings.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typings.typescriptServices.TypeScript.ISyntaxToken
import typings.typescriptServices.TypeScript.ISyntaxTriviaList
import typings.typescriptServices.TypeScript.ISyntaxVisitor
import typings.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableWidthTokenWithNoTrivia extends ISyntaxToken {
  var _fullText: js.Any
  /* private */ def findTokenInternal(parent: js.Any, position: js.Any, fullStart: js.Any): js.Any
  /* private */ def realize(): js.Any
  def toJSON(key: js.Any): js.Any
}

object VariableWidthTokenWithNoTrivia {
  @scala.inline
  def apply(
    _fullText: js.Any,
    accept: ISyntaxVisitor => js.Any,
    childAt: Double => ISyntaxElement,
    childCount: () => Double,
    collectTextElements: js.Array[String] => Unit,
    findTokenInternal: (js.Any, js.Any, js.Any) => js.Any,
    firstToken: () => ISyntaxToken,
    fullText: () => String,
    fullWidth: () => Double,
    hasLeadingComment: () => Boolean,
    hasLeadingNewLine: () => Boolean,
    hasLeadingSkippedText: () => Boolean,
    hasLeadingTrivia: () => Boolean,
    hasSkippedToken: () => Boolean,
    hasTrailingComment: () => Boolean,
    hasTrailingNewLine: () => Boolean,
    hasTrailingSkippedText: () => Boolean,
    hasTrailingTrivia: () => Boolean,
    isExpression: () => Boolean,
    isIncrementallyUnusable: () => Boolean,
    isList: () => Boolean,
    isMemberExpression: () => Boolean,
    isNode: () => Boolean,
    isPostfixExpression: () => Boolean,
    isPrimaryExpression: () => Boolean,
    isSeparatedList: () => Boolean,
    isToken: () => Boolean,
    isTypeScriptSpecific: () => Boolean,
    isUnaryExpression: () => Boolean,
    kind: () => SyntaxKind,
    lastToken: () => ISyntaxToken,
    leadingTrivia: () => ISyntaxTriviaList,
    leadingTriviaWidth: () => Double,
    realize: () => js.Any,
    text: () => String,
    toJSON: js.Any => js.Any,
    tokenKind: SyntaxKind,
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => Double,
    value: () => js.Any,
    valueText: () => String,
    width: () => Double,
    withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
    withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
  ): VariableWidthTokenWithNoTrivia = {
    val __obj = js.Dynamic.literal(_fullText = _fullText.asInstanceOf[js.Any], accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), findTokenInternal = js.Any.fromFunction3(findTokenInternal), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), hasLeadingComment = js.Any.fromFunction0(hasLeadingComment), hasLeadingNewLine = js.Any.fromFunction0(hasLeadingNewLine), hasLeadingSkippedText = js.Any.fromFunction0(hasLeadingSkippedText), hasLeadingTrivia = js.Any.fromFunction0(hasLeadingTrivia), hasSkippedToken = js.Any.fromFunction0(hasSkippedToken), hasTrailingComment = js.Any.fromFunction0(hasTrailingComment), hasTrailingNewLine = js.Any.fromFunction0(hasTrailingNewLine), hasTrailingSkippedText = js.Any.fromFunction0(hasTrailingSkippedText), hasTrailingTrivia = js.Any.fromFunction0(hasTrailingTrivia), isExpression = js.Any.fromFunction0(isExpression), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isMemberExpression = js.Any.fromFunction0(isMemberExpression), isNode = js.Any.fromFunction0(isNode), isPostfixExpression = js.Any.fromFunction0(isPostfixExpression), isPrimaryExpression = js.Any.fromFunction0(isPrimaryExpression), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), isUnaryExpression = js.Any.fromFunction0(isUnaryExpression), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), realize = js.Any.fromFunction0(realize), text = js.Any.fromFunction0(text), toJSON = js.Any.fromFunction1(toJSON), tokenKind = tokenKind.asInstanceOf[js.Any], trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), value = js.Any.fromFunction0(value), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
    __obj.asInstanceOf[VariableWidthTokenWithNoTrivia]
  }
}

