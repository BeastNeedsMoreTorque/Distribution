package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveByExampleOptions extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}

object RemoveByExampleOptions {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined, waitForSync: js.UndefOr[Boolean] = js.undefined): RemoveByExampleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveByExampleOptions]
  }
}

