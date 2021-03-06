package typings.mongodb.mod

import typings.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbAddUserOptions extends CommonOptions {
  var customData: js.UndefOr[js.Object] = js.undefined
  var roles: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object DbAddUserOptions {
  @scala.inline
  def apply(
    customData: js.Object = null,
    j: js.UndefOr[Boolean] = js.undefined,
    roles: js.Array[js.Object] = null,
    session: ClientSession = null,
    w: scala.Double | majority | String = null,
    wtimeout: js.UndefOr[scala.Double] = js.undefined
  ): DbAddUserOptions = {
    val __obj = js.Dynamic.literal()
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.get.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (!js.isUndefined(wtimeout)) __obj.updateDynamic("wtimeout")(wtimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbAddUserOptions]
  }
}

