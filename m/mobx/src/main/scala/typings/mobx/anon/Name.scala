package typings.mobx.anon

import typings.mobx.mobxStrings.update
import typings.mobx.observablemapMod.IMapDidChange
import typings.mobx.observablemapMod.ObservableMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name[K, V] extends IMapDidChange[K, V] {
  var name: K
  var newValue: V
  var `object`: ObservableMap[K, V]
  var oldValue: V
  var `type`: update
}

object Name {
  @scala.inline
  def apply[K, V](name: K, newValue: V, `object`: ObservableMap[K, V], oldValue: V, `type`: update): Name[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[K, V]]
  }
}

