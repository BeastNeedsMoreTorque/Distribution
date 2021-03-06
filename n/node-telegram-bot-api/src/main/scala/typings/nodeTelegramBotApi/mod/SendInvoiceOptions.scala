package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendInvoiceOptions extends SendBasicOptions {
  var is_flexible: js.UndefOr[Boolean] = js.undefined
  var need_email: js.UndefOr[Boolean] = js.undefined
  var need_name: js.UndefOr[Boolean] = js.undefined
  var need_phone_number: js.UndefOr[Boolean] = js.undefined
  var need_shipping_address: js.UndefOr[Boolean] = js.undefined
  var photo_height: js.UndefOr[Double] = js.undefined
  var photo_size: js.UndefOr[Double] = js.undefined
  var photo_url: js.UndefOr[String] = js.undefined
  var photo_width: js.UndefOr[Double] = js.undefined
  var provider_data: js.UndefOr[String] = js.undefined
}

object SendInvoiceOptions {
  @scala.inline
  def apply(
    disable_notification: js.UndefOr[Boolean] = js.undefined,
    is_flexible: js.UndefOr[Boolean] = js.undefined,
    need_email: js.UndefOr[Boolean] = js.undefined,
    need_name: js.UndefOr[Boolean] = js.undefined,
    need_phone_number: js.UndefOr[Boolean] = js.undefined,
    need_shipping_address: js.UndefOr[Boolean] = js.undefined,
    photo_height: js.UndefOr[Double] = js.undefined,
    photo_size: js.UndefOr[Double] = js.undefined,
    photo_url: String = null,
    photo_width: js.UndefOr[Double] = js.undefined,
    provider_data: String = null,
    reply_markup: InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply = null,
    reply_to_message_id: js.UndefOr[Double] = js.undefined
  ): SendInvoiceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disable_notification)) __obj.updateDynamic("disable_notification")(disable_notification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(is_flexible)) __obj.updateDynamic("is_flexible")(is_flexible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(need_email)) __obj.updateDynamic("need_email")(need_email.get.asInstanceOf[js.Any])
    if (!js.isUndefined(need_name)) __obj.updateDynamic("need_name")(need_name.get.asInstanceOf[js.Any])
    if (!js.isUndefined(need_phone_number)) __obj.updateDynamic("need_phone_number")(need_phone_number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(need_shipping_address)) __obj.updateDynamic("need_shipping_address")(need_shipping_address.get.asInstanceOf[js.Any])
    if (!js.isUndefined(photo_height)) __obj.updateDynamic("photo_height")(photo_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(photo_size)) __obj.updateDynamic("photo_size")(photo_size.get.asInstanceOf[js.Any])
    if (photo_url != null) __obj.updateDynamic("photo_url")(photo_url.asInstanceOf[js.Any])
    if (!js.isUndefined(photo_width)) __obj.updateDynamic("photo_width")(photo_width.get.asInstanceOf[js.Any])
    if (provider_data != null) __obj.updateDynamic("provider_data")(provider_data.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (!js.isUndefined(reply_to_message_id)) __obj.updateDynamic("reply_to_message_id")(reply_to_message_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendInvoiceOptions]
  }
}

