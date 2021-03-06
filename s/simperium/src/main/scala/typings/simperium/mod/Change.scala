package typings.simperium.mod

import typings.simperium.simperiumStrings.M
import typings.simperium.simperiumStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.simperium.mod.ModificationChange[T]
  - typings.simperium.mod.RemovalChange
*/
trait Change[T] extends js.Object

object Change {
  @scala.inline
  def ModificationChange[T](ccid: String, id: String, o: M, v: JSONDiff[T], d: T = null, sv: js.UndefOr[Double] = js.undefined): Change[T] = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (!js.isUndefined(sv)) __obj.updateDynamic("sv")(sv.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change[T]]
  }
  @scala.inline
  def RemovalChange[T](ccid: String, id: String, o: `-_`): Change[T] = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change[T]]
  }
}

