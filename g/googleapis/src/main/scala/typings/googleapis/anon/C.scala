package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait C extends js.Object {
  var c: js.UndefOr[js.Array[V]] = js.native
}

object C {
  @scala.inline
  def apply(c: js.Array[V] = null): C = {
    val __obj = js.Dynamic.literal()
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    __obj.asInstanceOf[C]
  }
}

