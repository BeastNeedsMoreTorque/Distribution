package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the tab controllers of a {@link UnoControlContainer} . */
trait XUnoControlContainer extends XInterface {
  /** returns all currently specified tab controllers. */
  var TabControllers: SafeArray[XTabController]
  /** adds a single tab controller. */
  def addTabController(TabController: XTabController): Unit
  /** returns all currently specified tab controllers. */
  def getTabControllers(): SafeArray[XTabController]
  /** removes a single tab controller. */
  def removeTabController(TabController: XTabController): Unit
  /** sets a set of tab controllers. */
  def setTabControllers(TabControllers: SeqEquiv[XTabController]): Unit
}

object XUnoControlContainer {
  @scala.inline
  def apply(
    TabControllers: SafeArray[XTabController],
    acquire: () => Unit,
    addTabController: XTabController => Unit,
    getTabControllers: () => SafeArray[XTabController],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTabController: XTabController => Unit,
    setTabControllers: SeqEquiv[XTabController] => Unit
  ): XUnoControlContainer = {
    val __obj = js.Dynamic.literal(TabControllers = TabControllers.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addTabController = js.Any.fromFunction1(addTabController), getTabControllers = js.Any.fromFunction0(getTabControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTabController = js.Any.fromFunction1(removeTabController), setTabControllers = js.Any.fromFunction1(setTabControllers))
    __obj.asInstanceOf[XUnoControlContainer]
  }
}

