package typings.activexLibreoffice.com_.sun.star.system

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implementations of this interface do provide access to a simple mail client if there is one available
  * @see com.sun.star.system.XSimpleMailClient
  */
trait XSimpleMailClientSupplier extends XInterface {
  /**
    * Allows a client to query for an object that implements {@link XSimpleMailClient} .
    * @returns An interface to a simple mail client if there is one available on the system or an empty reference else.
    * @see com.sun.star.system.XSimpleMailClient
    */
  def querySimpleMailClient(): XSimpleMailClient
}

object XSimpleMailClientSupplier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    querySimpleMailClient: () => XSimpleMailClient,
    release: () => Unit
  ): XSimpleMailClientSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), querySimpleMailClient = js.Any.fromFunction0(querySimpleMailClient), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSimpleMailClientSupplier]
  }
}

