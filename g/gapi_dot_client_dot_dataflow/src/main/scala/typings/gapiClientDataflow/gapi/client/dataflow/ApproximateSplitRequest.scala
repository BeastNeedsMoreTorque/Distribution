package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApproximateSplitRequest extends js.Object {
  /**
    * A fraction at which to split the work item, from 0.0 (beginning of the
    * input) to 1.0 (end of the input).
    */
  var fractionConsumed: js.UndefOr[Double] = js.undefined
  /** A Position at which to split the work item. */
  var position: js.UndefOr[Position] = js.undefined
}

object ApproximateSplitRequest {
  @scala.inline
  def apply(fractionConsumed: js.UndefOr[Double] = js.undefined, position: Position = null): ApproximateSplitRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fractionConsumed)) __obj.updateDynamic("fractionConsumed")(fractionConsumed.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApproximateSplitRequest]
  }
}

