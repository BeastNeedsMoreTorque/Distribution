package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supplies access to the cursor in the view.
  *
  * This cursor is the same instance that is available in the user interface.
  * @see TextDocumentView
  */
trait XTextViewCursorSupplier extends XInterface {
  /** @returns the cursor of the document view. */
  val ViewCursor: XTextViewCursor
  /** @returns the cursor of the document view. */
  def getViewCursor(): XTextViewCursor
}

object XTextViewCursorSupplier {
  @scala.inline
  def apply(
    ViewCursor: XTextViewCursor,
    acquire: () => Unit,
    getViewCursor: () => XTextViewCursor,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextViewCursorSupplier = {
    val __obj = js.Dynamic.literal(ViewCursor = ViewCursor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getViewCursor = js.Any.fromFunction0(getViewCursor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextViewCursorSupplier]
  }
}

