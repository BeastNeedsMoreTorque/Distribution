package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Expand
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ODataStore extends Store {
  def byKey(key: String, extraOptions: Expand): Promise[_] with JQueryPromise[_] = js.native
  /** @name ODataStore.byKey(key, extraOptions) */
  def byKey(key: js.Any, extraOptions: Expand): Promise[_] with JQueryPromise[_] = js.native
  def byKey(key: Double, extraOptions: Expand): Promise[_] with JQueryPromise[_] = js.native
  /** @name ODataStore.createQuery(loadOptions) */
  def createQuery(loadOptions: js.Any): js.Any = js.native
}

