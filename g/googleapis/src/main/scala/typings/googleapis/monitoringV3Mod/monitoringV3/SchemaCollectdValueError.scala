package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the error status for values that were not written.
  */
@js.native
trait SchemaCollectdValueError extends js.Object {
  /**
    * Records the error status for the value.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  /**
    * The zero-based index in CollectdPayload.values within the parent
    * CreateCollectdTimeSeriesRequest.collectd_payloads.
    */
  var index: js.UndefOr[Double] = js.native
}

object SchemaCollectdValueError {
  @scala.inline
  def apply(error: SchemaStatus = null, index: js.UndefOr[Double] = js.undefined): SchemaCollectdValueError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCollectdValueError]
  }
}

