package typings.mobservable.coreMod

import typings.mobservable.observablemapMod.KeyValueMap
import typings.mobservable.observablemapMod.ObservableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/core", "map")
@js.native
object map extends js.Object {
  def apply[V](): ObservableMap[V] = js.native
  def apply[V](initialValues: KeyValueMap[V]): ObservableMap[V] = js.native
  def apply[V](initialValues: KeyValueMap[V], valueModifier: js.Function): ObservableMap[V] = js.native
}

