package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlModel
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the controls in a view.
  * @see com.sun.star.frame.XController
  */
trait XControlAccess extends XInterface {
  /** is called to get the control from the specified control model. */
  def getControl(xModel: XControlModel): XControl
}

object XControlAccess {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getControl: XControlModel => XControl,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XControlAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getControl = js.Any.fromFunction1(getControl), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XControlAccess]
  }
}

