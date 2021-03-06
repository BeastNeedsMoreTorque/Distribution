package typings.crossStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossStorageClientOptions extends js.Object {
  var frameId: js.UndefOr[String] = js.undefined
  var promise: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object CrossStorageClientOptions {
  @scala.inline
  def apply(frameId: String = null, promise: js.Any = null, timeout: js.UndefOr[Double] = js.undefined): CrossStorageClientOptions = {
    val __obj = js.Dynamic.literal()
    if (frameId != null) __obj.updateDynamic("frameId")(frameId.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossStorageClientOptions]
  }
}

