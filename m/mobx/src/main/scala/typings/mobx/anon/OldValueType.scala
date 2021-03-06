package typings.mobx.anon

import typings.mobx.mobxStrings.delete
import typings.mobx.observablesetMod.ISetWillChange
import typings.mobx.observablesetMod.ObservableSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldValueType[T] extends ISetWillChange[T] {
  var `object`: ObservableSet[T]
  var oldValue: T
  var `type`: delete
}

object OldValueType {
  @scala.inline
  def apply[T](`object`: ObservableSet[T], oldValue: T, `type`: delete): OldValueType[T] = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldValueType[T]]
  }
}

