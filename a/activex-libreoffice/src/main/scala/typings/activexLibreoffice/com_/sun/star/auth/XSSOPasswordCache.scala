package typings.activexLibreoffice.com_.sun.star.auth

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supports password caching for security mechanisms which use passwords as credentials or as an input to credential creation but don't have an external
  * method to cache these passwords.
  * @since OOo 1.1.2
  */
trait XSSOPasswordCache extends XInterface {
  /**
    * adds a username/password combination to the cache.
    *
    * If an entry for the specified username already exists in the cache, it will be overwritten.
    * @param UserName the user name to add
    * @param Password the associated password
    * @param Persist indicates whether or not the username/password combination should be persisted
    */
  def addPassword(UserName: String, Password: String, Persist: Boolean): Unit
  /**
    * retrieves a password for a given user from the cache.
    *
    * Non persistent cache is searched first, followed by the persistent cache ( if it exists ).
    * @param UserName the name of the user whose password should be retrieved
    * @param Persist indicates whether or not the password is persistent
    * @returns the required password
    */
  def getPassword(UserName: String, Persist: js.Array[Boolean]): String
  /**
    * removes a password from the cache
    * @param UserName the name of the user whose password should be removed.
    * @param RemovePersist indicates whether or not the password should also be removed, if present, from persistent cache.
    */
  def removePassword(UserName: String, RemovePersist: Boolean): Unit
}

object XSSOPasswordCache {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addPassword: (String, String, Boolean) => Unit,
    getPassword: (String, js.Array[Boolean]) => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePassword: (String, Boolean) => Unit
  ): XSSOPasswordCache = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addPassword = js.Any.fromFunction3(addPassword), getPassword = js.Any.fromFunction2(getPassword), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePassword = js.Any.fromFunction2(removePassword))
    __obj.asInstanceOf[XSSOPasswordCache]
  }
}

