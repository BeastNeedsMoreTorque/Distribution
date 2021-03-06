package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the system dependent implementation of the window.
  * @see com.sun.star.lang.SystemDependent
  * @see WindowAttribute
  * @see WindowAttribute.SYSTEMDEPENDENT
  */
trait XSystemDependentMenuPeer extends XInterface {
  /**
    * returns a system-specific window handle.
    * @param ProcessId the process identifier. Use the sal_getGlobalProcessId function of the RTL library.
    * @param SystemType one constant out of the constant group {@link com.sun.star.lang.SystemDependent} .
    * @returns a system-specific handle to a menu or 0 if the menu is not in the same process.  You must check the machine ID and the process ID. ;  WIN32: Retu
    */
  def getMenuHandle(ProcessId: SeqEquiv[Double], SystemType: Double): js.Any
}

object XSystemDependentMenuPeer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getMenuHandle: (SeqEquiv[Double], Double) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSystemDependentMenuPeer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getMenuHandle = js.Any.fromFunction2(getMenuHandle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSystemDependentMenuPeer]
  }
}

