package typings.facebookPixel.facebook.Pixel.DPA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddToCartParameters
  extends typings.facebookPixel.facebook.Pixel.AddToCartParameters

object AddToCartParameters {
  @scala.inline
  def apply(
    content_ids: js.Array[String] = null,
    content_name: String = null,
    content_type: String = null,
    currency: String = null,
    value: js.UndefOr[Double] = js.undefined
  ): AddToCartParameters = {
    val __obj = js.Dynamic.literal()
    if (content_ids != null) __obj.updateDynamic("content_ids")(content_ids.asInstanceOf[js.Any])
    if (content_name != null) __obj.updateDynamic("content_name")(content_name.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddToCartParameters]
  }
}

