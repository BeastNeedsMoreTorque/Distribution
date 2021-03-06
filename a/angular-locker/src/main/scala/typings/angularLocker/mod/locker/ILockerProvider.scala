package typings.angularLocker.mod.locker

import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockerProvider extends IServiceProvider {
  /**
    * Allow the defaults to be specified via the `lockerProvider`
    *
    * @param {ILockerSettings}  lockerSettings  The defaults to override
    */
  def defaults(lockerSettings: ILockerSettings): Unit
}

object ILockerProvider {
  @scala.inline
  def apply($get: js.Any, defaults: ILockerSettings => Unit): ILockerProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], defaults = js.Any.fromFunction1(defaults))
    __obj.asInstanceOf[ILockerProvider]
  }
}

