package typings.apolloCacheControl.anon

import typings.apolloCacheControl.mod.CacheScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  path  :std.Array<string | number>} & apollo-cache-control.apollo-cache-control.CacheHint */
trait pathArraystringnumberCach extends js.Object {
  var maxAge: js.UndefOr[Double] = js.undefined
  var path: js.Array[String | Double]
  var scope: js.UndefOr[CacheScope] = js.undefined
}

object pathArraystringnumberCach {
  @scala.inline
  def apply(
    path: js.Array[String | Double],
    maxAge: js.UndefOr[Double] = js.undefined,
    scope: CacheScope = null
  ): pathArraystringnumberCach = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[pathArraystringnumberCach]
  }
}

