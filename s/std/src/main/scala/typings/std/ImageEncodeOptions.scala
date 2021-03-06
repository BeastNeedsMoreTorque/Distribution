package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageEncodeOptions extends js.Object {
  var quality: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ImageEncodeOptions {
  @scala.inline
  def apply(quality: js.UndefOr[Double] = js.undefined, `type`: java.lang.String = null): ImageEncodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageEncodeOptions]
  }
}

