package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseMetricDataResult extends js.Object {
  /**
    * An array of objects that describe the metric data returned.
    */
  var metricData: js.UndefOr[MetricDatapointList] = js.native
  /**
    * The name of the metric returned.
    */
  var metricName: js.UndefOr[RelationalDatabaseMetricName] = js.native
}

object GetRelationalDatabaseMetricDataResult {
  @scala.inline
  def apply(metricData: MetricDatapointList = null, metricName: RelationalDatabaseMetricName = null): GetRelationalDatabaseMetricDataResult = {
    val __obj = js.Dynamic.literal()
    if (metricData != null) __obj.updateDynamic("metricData")(metricData.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseMetricDataResult]
  }
}

