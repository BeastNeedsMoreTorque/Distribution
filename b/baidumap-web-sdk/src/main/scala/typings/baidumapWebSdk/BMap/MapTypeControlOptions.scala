package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapTypeControlOptions extends js.Object {
  var mapTypes: js.UndefOr[js.Array[MapType]] = js.undefined
  var `type`: js.UndefOr[MapTypeControlType] = js.undefined
}

object MapTypeControlOptions {
  @scala.inline
  def apply(mapTypes: js.Array[MapType] = null, `type`: js.UndefOr[MapTypeControlType] = js.undefined): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal()
    if (mapTypes != null) __obj.updateDynamic("mapTypes")(mapTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeControlOptions]
  }
}

