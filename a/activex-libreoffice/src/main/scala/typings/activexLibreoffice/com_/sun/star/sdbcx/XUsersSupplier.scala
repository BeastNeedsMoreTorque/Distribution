package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a container of users, typically used for a database definition object. */
trait XUsersSupplier extends XInterface {
  /**
    * returns the container of users.
    * @returns the users
    */
  val Users: XNameAccess
  /**
    * returns the container of users.
    * @returns the users
    */
  def getUsers(): XNameAccess
}

object XUsersSupplier {
  @scala.inline
  def apply(
    Users: XNameAccess,
    acquire: () => Unit,
    getUsers: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUsersSupplier = {
    val __obj = js.Dynamic.literal(Users = Users.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getUsers = js.Any.fromFunction0(getUsers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUsersSupplier]
  }
}

