package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragEnter extends js.Object {
  var dataTypes: String | js.Array[String]
  def dragEnter(param0: typings.std.Event, param1: js.Object): Unit
  def dragLeave(param0: typings.std.Event, param1: js.Object): Unit
  def dragOver(param0: typings.std.Event, param1: js.Object): Unit
  def drop(param0: typings.std.Event, param1: js.Object): Unit
}

object DragEnter {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    dragEnter: (typings.std.Event, js.Object) => Unit,
    dragLeave: (typings.std.Event, js.Object) => Unit,
    dragOver: (typings.std.Event, js.Object) => Unit,
    drop: (typings.std.Event, js.Object) => Unit
  ): DragEnter = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], dragEnter = js.Any.fromFunction2(dragEnter), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), drop = js.Any.fromFunction2(drop))
    __obj.asInstanceOf[DragEnter]
  }
}

