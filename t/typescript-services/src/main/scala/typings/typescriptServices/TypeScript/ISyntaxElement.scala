package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxElement extends js.Object {
  def childAt(index: Double): ISyntaxElement
  def childCount(): Double
  def collectTextElements(elements: js.Array[String]): Unit
  def firstToken(): ISyntaxToken
  def fullText(): String
  def fullWidth(): Double
  def isIncrementallyUnusable(): Boolean
  def isList(): Boolean
  def isNode(): Boolean
  def isSeparatedList(): Boolean
  def isToken(): Boolean
  def isTypeScriptSpecific(): Boolean
  def kind(): SyntaxKind
  def lastToken(): ISyntaxToken
  def leadingTrivia(): ISyntaxTriviaList
  def leadingTriviaWidth(): Double
  def trailingTrivia(): ISyntaxTriviaList
  def trailingTriviaWidth(): Double
  def width(): Double
}

object ISyntaxElement {
  @scala.inline
  def apply(
    childAt: Double => ISyntaxElement,
    childCount: () => Double,
    collectTextElements: js.Array[String] => Unit,
    firstToken: () => ISyntaxToken,
    fullText: () => String,
    fullWidth: () => Double,
    isIncrementallyUnusable: () => Boolean,
    isList: () => Boolean,
    isNode: () => Boolean,
    isSeparatedList: () => Boolean,
    isToken: () => Boolean,
    isTypeScriptSpecific: () => Boolean,
    kind: () => SyntaxKind,
    lastToken: () => ISyntaxToken,
    leadingTrivia: () => ISyntaxTriviaList,
    leadingTriviaWidth: () => Double,
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): ISyntaxElement = {
    val __obj = js.Dynamic.literal(childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isNode = js.Any.fromFunction0(isNode), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ISyntaxElement]
  }
}

