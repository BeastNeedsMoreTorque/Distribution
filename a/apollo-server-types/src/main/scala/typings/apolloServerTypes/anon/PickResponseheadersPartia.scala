package typings.apolloServerTypes.anon

import typings.apolloServerEnv.fetchMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-server-env.apollo-server-env.Response, 'headers'> & std.Partial<std.Pick<apollo-server-types.apollo-server-types.Mutable<apollo-server-env.apollo-server-env.Response>, 'status'>> */
trait PickResponseheadersPartia extends js.Object {
  var headers: Headers
  var status: js.UndefOr[Double] = js.undefined
}

object PickResponseheadersPartia {
  @scala.inline
  def apply(headers: Headers, status: js.UndefOr[Double] = js.undefined): PickResponseheadersPartia = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickResponseheadersPartia]
  }
}

