package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0x08`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestNFrame extends Frame {
  var flags: Double
  var length: js.UndefOr[Double] = js.undefined
  var requestN: Double
  var streamId: Double
  var `type`: `0x08`
}

object RequestNFrame {
  @scala.inline
  def apply(
    flags: Double,
    requestN: Double,
    streamId: Double,
    `type`: `0x08`,
    length: js.UndefOr[Double] = js.undefined
  ): RequestNFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestNFrame]
  }
}

