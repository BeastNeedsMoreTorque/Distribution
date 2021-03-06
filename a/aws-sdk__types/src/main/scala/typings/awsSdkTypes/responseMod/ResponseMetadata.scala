package typings.awsSdkTypes.responseMod

import typings.awsSdkTypes.httpMod.HeaderBag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseMetadata extends js.Object {
  /**
    * A tertiary identifier for the last request sent. Used for debugging.
    */
  var cfId: js.UndefOr[String] = js.undefined
  /**
    * A secondary identifier for the last request sent. Used for debugging.
    */
  var extendedRequestId: js.UndefOr[String] = js.undefined
  /**
    * The headers of the last HTTP response received for this operation.
    */
  var httpHeaders: js.UndefOr[HeaderBag] = js.undefined
  /**
    * The status code of the last HTTP response received for this operation.
    */
  var httpStatusCode: js.UndefOr[Double] = js.undefined
  /**
    * A unique identifier for the last request sent for this operation. Often
    * requested by AWS service teams to aid in debugging.
    */
  var requestId: js.UndefOr[String] = js.undefined
  /**
    * The number of times this operation was retried.
    */
  var retries: js.UndefOr[Double] = js.undefined
  /**
    * The total amount of time (in milliseconds) that was spent waiting between
    * retry attempts.
    */
  var totalRetryDelay: js.UndefOr[Double] = js.undefined
}

object ResponseMetadata {
  @scala.inline
  def apply(
    cfId: String = null,
    extendedRequestId: String = null,
    httpHeaders: HeaderBag = null,
    httpStatusCode: js.UndefOr[Double] = js.undefined,
    requestId: String = null,
    retries: js.UndefOr[Double] = js.undefined,
    totalRetryDelay: js.UndefOr[Double] = js.undefined
  ): ResponseMetadata = {
    val __obj = js.Dynamic.literal()
    if (cfId != null) __obj.updateDynamic("cfId")(cfId.asInstanceOf[js.Any])
    if (extendedRequestId != null) __obj.updateDynamic("extendedRequestId")(extendedRequestId.asInstanceOf[js.Any])
    if (httpHeaders != null) __obj.updateDynamic("httpHeaders")(httpHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(httpStatusCode)) __obj.updateDynamic("httpStatusCode")(httpStatusCode.get.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalRetryDelay)) __obj.updateDynamic("totalRetryDelay")(totalRetryDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseMetadata]
  }
}

