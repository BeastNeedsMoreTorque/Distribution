package typings.angularDynamicLocale.mod.tmh

import typings.angular.mod.ILocaleService
import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDynamicLocale extends js.Object {
  def get(): String
  def set(locale: String): IPromise[ILocaleService]
}

object IDynamicLocale {
  @scala.inline
  def apply(get: () => String, set: String => IPromise[ILocaleService]): IDynamicLocale = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IDynamicLocale]
  }
}

