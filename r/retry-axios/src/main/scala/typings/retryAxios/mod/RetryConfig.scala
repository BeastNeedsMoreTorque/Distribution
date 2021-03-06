package typings.retryAxios.mod

import typings.axios.mod.AxiosError
import typings.axios.mod.AxiosInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryConfig extends js.Object {
  /**
    * The number of retries already attempted.
    */
  var currentRetryAttempt: js.UndefOr[Double] = js.undefined
  /**
    * The HTTP Methods that will be automatically retried.
    * Defaults to ['GET','PUT','HEAD','OPTIONS','DELETE']
    */
  var httpMethodsToRetry: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The instance of the axios object to which the interceptor is attached.
    */
  var instance: js.UndefOr[AxiosInstance] = js.undefined
  /**
    * When there is no response, the number of retries to attempt. Defaults to 2.
    */
  var noResponseRetries: js.UndefOr[Double] = js.undefined
  /**
    * Function to invoke when a retry attempt is made.
    */
  var onRetryAttempt: js.UndefOr[js.Function1[/* err */ AxiosError[_], Unit]] = js.undefined
  /**
    * The number of times to retry the request.  Defaults to 3.
    */
  var retry: js.UndefOr[Double] = js.undefined
  /**
    * The amount of time to initially delay the retry.  Defaults to 100.
    */
  var retryDelay: js.UndefOr[Double] = js.undefined
  /**
    * Function to invoke which determines if you should retry
    */
  var shouldRetry: js.UndefOr[js.Function1[/* err */ AxiosError[_], Boolean]] = js.undefined
  /**
    * The HTTP response status codes that will automatically be retried.
    * Defaults to: [[100, 199], [429, 429], [500, 599]]
    */
  var statusCodesToRetry: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
}

object RetryConfig {
  @scala.inline
  def apply(
    currentRetryAttempt: js.UndefOr[Double] = js.undefined,
    httpMethodsToRetry: js.Array[String] = null,
    instance: AxiosInstance = null,
    noResponseRetries: js.UndefOr[Double] = js.undefined,
    onRetryAttempt: /* err */ AxiosError[_] => Unit = null,
    retry: js.UndefOr[Double] = js.undefined,
    retryDelay: js.UndefOr[Double] = js.undefined,
    shouldRetry: /* err */ AxiosError[_] => Boolean = null,
    statusCodesToRetry: js.Array[js.Array[Double]] = null
  ): RetryConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentRetryAttempt)) __obj.updateDynamic("currentRetryAttempt")(currentRetryAttempt.get.asInstanceOf[js.Any])
    if (httpMethodsToRetry != null) __obj.updateDynamic("httpMethodsToRetry")(httpMethodsToRetry.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (!js.isUndefined(noResponseRetries)) __obj.updateDynamic("noResponseRetries")(noResponseRetries.get.asInstanceOf[js.Any])
    if (onRetryAttempt != null) __obj.updateDynamic("onRetryAttempt")(js.Any.fromFunction1(onRetryAttempt))
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryDelay)) __obj.updateDynamic("retryDelay")(retryDelay.get.asInstanceOf[js.Any])
    if (shouldRetry != null) __obj.updateDynamic("shouldRetry")(js.Any.fromFunction1(shouldRetry))
    if (statusCodesToRetry != null) __obj.updateDynamic("statusCodesToRetry")(statusCodesToRetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryConfig]
  }
}

