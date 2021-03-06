package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxEventLoopDelay extends js.Object {
  /**
    * maximum event loop delay duration in milliseconds over which incoming requests are rejected with an HTTP Server Timeout (503) response.
    * Defaults to 0 (no limit).
    */
  var maxEventLoopDelay: js.UndefOr[Double] = js.undefined
  /** maximum V8 heap size over which incoming requests are rejected with an HTTP Server Timeout (503) response. Defaults to 0 (no limit). */
  var maxHeapUsedBytes: js.UndefOr[Double] = js.undefined
  /**
    * maximum process RSS size over which incoming requests are rejected with an HTTP Server Timeout (503) response. Defaults to 0 (no limit).
    */
  var maxRssBytes: js.UndefOr[Double] = js.undefined
  /** the frequency of sampling in milliseconds. When set to 0, the other load options are ignored. Defaults to 0 (no sampling). */
  var sampleInterval: js.UndefOr[Double] = js.undefined
}

object MaxEventLoopDelay {
  @scala.inline
  def apply(
    maxEventLoopDelay: js.UndefOr[Double] = js.undefined,
    maxHeapUsedBytes: js.UndefOr[Double] = js.undefined,
    maxRssBytes: js.UndefOr[Double] = js.undefined,
    sampleInterval: js.UndefOr[Double] = js.undefined
  ): MaxEventLoopDelay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxEventLoopDelay)) __obj.updateDynamic("maxEventLoopDelay")(maxEventLoopDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeapUsedBytes)) __obj.updateDynamic("maxHeapUsedBytes")(maxHeapUsedBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRssBytes)) __obj.updateDynamic("maxRssBytes")(maxRssBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleInterval)) __obj.updateDynamic("sampleInterval")(sampleInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxEventLoopDelay]
  }
}

