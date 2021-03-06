package typings.protobufjs.mod.common

import typings.protobufjs.mod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.Duration message. */
trait IDuration extends js.Object {
  var nanos: js.UndefOr[Double] = js.undefined
  var seconds: js.UndefOr[Double | Long] = js.undefined
}

object IDuration {
  @scala.inline
  def apply(nanos: js.UndefOr[Double] = js.undefined, seconds: Double | Long = null): IDuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nanos)) __obj.updateDynamic("nanos")(nanos.get.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDuration]
  }
}

