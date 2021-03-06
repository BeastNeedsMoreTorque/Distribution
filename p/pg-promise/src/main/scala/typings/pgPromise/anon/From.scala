package typings.pgPromise.anon

import typings.pgPromise.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From[S] extends js.Object {
  var from: js.UndefOr[String] = js.undefined
  var skip: js.UndefOr[String | js.Array[String] | (js.Function1[/* c */ Column[S], Boolean])] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object From {
  @scala.inline
  def apply[S](
    from: String = null,
    skip: String | js.Array[String] | (js.Function1[/* c */ Column[S], Boolean]) = null,
    to: String = null
  ): From[S] = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From[S]]
  }
}

