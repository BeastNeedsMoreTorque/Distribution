package typings.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryConfiguration extends js.Object {
  var ageBuckets: js.UndefOr[Double] = js.undefined
  var aggregator: js.UndefOr[Aggregator] = js.undefined
  var compressCount: js.UndefOr[Double] = js.undefined
  var help: String
  var labelNames: js.UndefOr[js.Array[String]] = js.undefined
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
  var name: String
  var percentiles: js.UndefOr[js.Array[Double]] = js.undefined
  var registers: js.UndefOr[js.Array[Registry]] = js.undefined
}

object SummaryConfiguration {
  @scala.inline
  def apply(
    help: String,
    name: String,
    ageBuckets: js.UndefOr[Double] = js.undefined,
    aggregator: Aggregator = null,
    compressCount: js.UndefOr[Double] = js.undefined,
    labelNames: js.Array[String] = null,
    maxAgeSeconds: js.UndefOr[Double] = js.undefined,
    percentiles: js.Array[Double] = null,
    registers: js.Array[Registry] = null
  ): SummaryConfiguration = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(ageBuckets)) __obj.updateDynamic("ageBuckets")(ageBuckets.get.asInstanceOf[js.Any])
    if (aggregator != null) __obj.updateDynamic("aggregator")(aggregator.asInstanceOf[js.Any])
    if (!js.isUndefined(compressCount)) __obj.updateDynamic("compressCount")(compressCount.get.asInstanceOf[js.Any])
    if (labelNames != null) __obj.updateDynamic("labelNames")(labelNames.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAgeSeconds)) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.get.asInstanceOf[js.Any])
    if (percentiles != null) __obj.updateDynamic("percentiles")(percentiles.asInstanceOf[js.Any])
    if (registers != null) __obj.updateDynamic("registers")(registers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryConfiguration]
  }
}

