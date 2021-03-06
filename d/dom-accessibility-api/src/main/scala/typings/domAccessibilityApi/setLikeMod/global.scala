package typings.domAccessibilityApi.setLikeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Set[T] () extends js.Object {
    val size: Double = js.native
    def add(value: T): this.type = js.native
    def clear(): Unit = js.native
    def delete(value: T): Boolean = js.native
    def forEach(callbackfn: js.Function3[/* value */ T, /* value2 */ T, /* set */ Set[T], Unit]): Unit = js.native
    def forEach(callbackfn: js.Function3[/* value */ T, /* value2 */ T, /* set */ Set[T], Unit], thisArg: js.Any): Unit = js.native
    def has(value: T): Boolean = js.native
  }
  
}

