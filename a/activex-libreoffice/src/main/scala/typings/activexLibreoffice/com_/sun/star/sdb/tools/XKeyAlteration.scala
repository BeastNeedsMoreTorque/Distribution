package typings.activexLibreoffice.com_.sun.star.sdb.tools

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to alter the keys of a table.
  * @see com.sun.star.sdb.DataSource.Settings
  * @see com.sun.star.sdbcx.XAppend
  * @see com.sun.star.sdbcx.XDrop
  * @since OOo 3.3
  */
trait XKeyAlteration extends XConnectionSupplier {
  /**
    * creates a new object using the given descriptor and appends it to the related container. ** Note: ** The descriptor will not be changed and can be
    * used again to append another object.
    * @param table the table to be altered
    * @param descriptor the descriptor which should be serve to append a new object
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def addKey(table: XPropertySet, descriptor: XPropertySet): Unit
  /**
    * drops an object of the related container identified by its name.
    * @param table the table to be altered
    * @param key the key to be dropped
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropKey(table: XPropertySet, key: XPropertySet): Unit
}

object XKeyAlteration {
  @scala.inline
  def apply(
    ActiveConnection: XConnection,
    acquire: () => Unit,
    addKey: (XPropertySet, XPropertySet) => Unit,
    dropKey: (XPropertySet, XPropertySet) => Unit,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XKeyAlteration = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addKey = js.Any.fromFunction2(addKey), dropKey = js.Any.fromFunction2(dropKey), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XKeyAlteration]
  }
}

