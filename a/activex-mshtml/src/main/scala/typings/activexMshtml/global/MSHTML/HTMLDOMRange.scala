package typings.activexMshtml.global.MSHTML

import typings.activexMshtml.MSHTML.IHTMLRectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.HTMLDOMRange")
@js.native
class HTMLDOMRange protected ()
  extends typings.activexMshtml.MSHTML.HTMLDOMRange {
  /* CompleteClass */
  @JSName("MSHTML.HTMLDOMRange_typekey")
  override var MSHTMLDotHTMLDOMRange_typekey: typings.activexMshtml.MSHTML.HTMLDOMRange = js.native
  /* CompleteClass */
  override val collapsed: Boolean = js.native
  /* CompleteClass */
  override val commonAncestorContainer: typings.activexMshtml.MSHTML.IHTMLDOMNode = js.native
  /* CompleteClass */
  override val endContainer: typings.activexMshtml.MSHTML.IHTMLDOMNode = js.native
  /* CompleteClass */
  override val endOffset: Double = js.native
  /* CompleteClass */
  override val startContainer: typings.activexMshtml.MSHTML.IHTMLDOMNode = js.native
  /* CompleteClass */
  override val startOffset: Double = js.native
  /* CompleteClass */
  override def Detach(): Unit = js.native
  /* CompleteClass */
  override def cloneContents(): js.Any = js.native
  /* CompleteClass */
  override def cloneRange(): typings.activexMshtml.MSHTML.IHTMLDOMRange = js.native
  /* CompleteClass */
  override def collapse(toStart: Boolean): Unit = js.native
  /* CompleteClass */
  override def compareBoundaryPoints(how: Double, sourceRange: js.Any): Double = js.native
  /* CompleteClass */
  override def deleteContents(): Unit = js.native
  /* CompleteClass */
  override def extractContents(): js.Any = js.native
  /* CompleteClass */
  override def getBoundingClientRect(): typings.activexMshtml.MSHTML.IHTMLRect = js.native
  /* CompleteClass */
  override def getClientRects(): IHTMLRectCollection = js.native
  /* CompleteClass */
  override def insertNode(newNode: js.Any): Unit = js.native
  /* CompleteClass */
  override def selectNode(refNode: js.Any): Unit = js.native
  /* CompleteClass */
  override def selectNodeContents(refNode: js.Any): Unit = js.native
  /* CompleteClass */
  override def setEnd(refNode: js.Any, offset: Double): Unit = js.native
  /* CompleteClass */
  override def setEndAfter(refNode: js.Any): Unit = js.native
  /* CompleteClass */
  override def setEndBefore(refNode: js.Any): Unit = js.native
  /* CompleteClass */
  override def setStart(refNode: js.Any, offset: Double): Unit = js.native
  /* CompleteClass */
  override def setStartAfter(refNode: js.Any): Unit = js.native
  /* CompleteClass */
  override def setStartBefore(refNode: js.Any): Unit = js.native
  /* CompleteClass */
  override def surroundContents(newParent: js.Any): Unit = js.native
}

