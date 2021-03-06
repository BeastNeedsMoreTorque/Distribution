package typings.activexLibreoffice.com_.sun.star.gallery

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a single item of a Gallery theme. */
trait XGalleryItem extends XInterface {
  /**
    * retrieves the type of the Gallery item
    * @returns The type of the Gallery item
    * @see GalleryItemType
    */
  val Type: Double
  /**
    * retrieves the type of the Gallery item
    * @returns The type of the Gallery item
    * @see GalleryItemType
    */
  def getType(): Double
}

object XGalleryItem {
  @scala.inline
  def apply(
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGalleryItem = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGalleryItem]
  }
}

