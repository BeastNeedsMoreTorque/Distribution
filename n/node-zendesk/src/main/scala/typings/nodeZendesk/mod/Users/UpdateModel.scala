package typings.nodeZendesk.mod.Users

import typings.nodeZendesk.mod.Attachments.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/users#update-user|Zendesk Users Update}
  */
trait UpdateModel extends BaseModel {
  var name: js.UndefOr[String] = js.undefined
}

object UpdateModel {
  @scala.inline
  def apply(
    alias: js.UndefOr[Null | String] = js.undefined,
    custom_role_id: js.UndefOr[Null | Double] = js.undefined,
    default_group_id: js.UndefOr[Null | Double] = js.undefined,
    details: js.UndefOr[Null | String] = js.undefined,
    email: js.UndefOr[Null | String] = js.undefined,
    external_id: js.UndefOr[Null | String] = js.undefined,
    locale_id: js.UndefOr[Null | Double] = js.undefined,
    moderator: js.UndefOr[Null | Boolean] = js.undefined,
    name: String = null,
    notes: js.UndefOr[Null | String] = js.undefined,
    only_private_comments: js.UndefOr[Null | Boolean] = js.undefined,
    organization_id: js.UndefOr[Null | Double] = js.undefined,
    phone: js.UndefOr[Null | String] = js.undefined,
    photo: js.UndefOr[Null | Model] = js.undefined,
    restricted_agent: js.UndefOr[Null | Boolean] = js.undefined,
    role: js.UndefOr[Null | Role] = js.undefined,
    signature: js.UndefOr[Null | String] = js.undefined,
    suspended: js.UndefOr[Null | Boolean] = js.undefined,
    tags: js.UndefOr[Null | js.Array[_]] = js.undefined,
    ticket_restriction: js.UndefOr[Null | TicketRestriction] = js.undefined,
    time_zone: js.UndefOr[Null | String] = js.undefined,
    user_fields: js.UndefOr[Null | js.Object] = js.undefined,
    verified: js.UndefOr[Null | Boolean] = js.undefined
  ): UpdateModel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(custom_role_id)) __obj.updateDynamic("custom_role_id")(custom_role_id.asInstanceOf[js.Any])
    if (!js.isUndefined(default_group_id)) __obj.updateDynamic("default_group_id")(default_group_id.asInstanceOf[js.Any])
    if (!js.isUndefined(details)) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (!js.isUndefined(email)) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(external_id)) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (!js.isUndefined(locale_id)) __obj.updateDynamic("locale_id")(locale_id.asInstanceOf[js.Any])
    if (!js.isUndefined(moderator)) __obj.updateDynamic("moderator")(moderator.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(notes)) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (!js.isUndefined(only_private_comments)) __obj.updateDynamic("only_private_comments")(only_private_comments.asInstanceOf[js.Any])
    if (!js.isUndefined(organization_id)) __obj.updateDynamic("organization_id")(organization_id.asInstanceOf[js.Any])
    if (!js.isUndefined(phone)) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (!js.isUndefined(photo)) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (!js.isUndefined(restricted_agent)) __obj.updateDynamic("restricted_agent")(restricted_agent.asInstanceOf[js.Any])
    if (!js.isUndefined(role)) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(signature)) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (!js.isUndefined(suspended)) __obj.updateDynamic("suspended")(suspended.asInstanceOf[js.Any])
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(ticket_restriction)) __obj.updateDynamic("ticket_restriction")(ticket_restriction.asInstanceOf[js.Any])
    if (!js.isUndefined(time_zone)) __obj.updateDynamic("time_zone")(time_zone.asInstanceOf[js.Any])
    if (!js.isUndefined(user_fields)) __obj.updateDynamic("user_fields")(user_fields.asInstanceOf[js.Any])
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModel]
  }
}

