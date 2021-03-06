package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameter passed to the `error` callback of <PreviewImageOptions>.
  */
trait PreviewImageError extends FailureResponse {
  /**
    * Description of the error.
    * @deprecated
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object PreviewImageError {
  @scala.inline
  def apply(
    code: js.UndefOr[Double] = js.undefined,
    error: java.lang.String = null,
    message: java.lang.String = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): PreviewImageError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewImageError]
  }
}

