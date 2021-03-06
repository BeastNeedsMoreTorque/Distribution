package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the collection of document indexes.
  *
  * In general this interface is supported by a {@link TextDocument} .
  */
trait XDocumentIndexesSupplier extends XInterface {
  /** @returns the collection of "DocumentIndexes" currently contained in the object. */
  val DocumentIndexes: XIndexAccess
  /** @returns the collection of "DocumentIndexes" currently contained in the object. */
  def getDocumentIndexes(): XIndexAccess
}

object XDocumentIndexesSupplier {
  @scala.inline
  def apply(
    DocumentIndexes: XIndexAccess,
    acquire: () => Unit,
    getDocumentIndexes: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentIndexesSupplier = {
    val __obj = js.Dynamic.literal(DocumentIndexes = DocumentIndexes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDocumentIndexes = js.Any.fromFunction0(getDocumentIndexes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDocumentIndexesSupplier]
  }
}

