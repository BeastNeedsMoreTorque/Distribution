package typings.levelup.mod

import org.scalablytyped.runtime.StringDictionary
import typings.abstractLeveldown.mod.AbstractOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractClearOptions[K] extends AbstractOptions {
  var gt: js.UndefOr[K] = js.undefined
  var gte: js.UndefOr[K] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var lt: js.UndefOr[K] = js.undefined
  var lte: js.UndefOr[K] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
}

object AbstractClearOptions {
  @scala.inline
  def apply[K](
    StringDictionary: StringDictionary[js.Any] = null,
    gt: K = null,
    gte: K = null,
    limit: js.UndefOr[Double] = js.undefined,
    lt: K = null,
    lte: K = null,
    reverse: js.UndefOr[Boolean] = js.undefined
  ): AbstractClearOptions[K] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (gte != null) __obj.updateDynamic("gte")(gte.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (lte != null) __obj.updateDynamic("lte")(lte.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractClearOptions[K]]
  }
}

