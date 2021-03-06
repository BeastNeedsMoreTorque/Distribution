package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatSegmentsParams extends GenericParams {
  var format: String
  var h: js.UndefOr[NameList] = js.undefined
  var help: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[NameList] = js.undefined
  var v: js.UndefOr[Boolean] = js.undefined
}

object CatSegmentsParams {
  @scala.inline
  def apply(
    format: String,
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    h: NameList = null,
    help: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    index: NameList = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    v: js.UndefOr[Boolean] = js.undefined
  ): CatSegmentsParams = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatSegmentsParams]
  }
}

