package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents something that provides a {@link DrawPage} .
  *
  * This interface is provided if the container only supports exactly one {@link DrawPage} . For containers which support multiple {@link DrawPages}
  * interface {@link XDrawPagesSupplier} is supported.
  * @deprecated Deprecated
  */
trait XDrawPageSupplier extends XInterface {
  /** returns the {@link DrawPage} . */
  val DrawPage: XDrawPage
  /** returns the {@link DrawPage} . */
  def getDrawPage(): XDrawPage
}

object XDrawPageSupplier {
  @scala.inline
  def apply(
    DrawPage: XDrawPage,
    acquire: () => Unit,
    getDrawPage: () => XDrawPage,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDrawPageSupplier = {
    val __obj = js.Dynamic.literal(DrawPage = DrawPage.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDrawPage = js.Any.fromFunction0(getDrawPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDrawPageSupplier]
  }
}

