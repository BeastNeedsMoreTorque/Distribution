package typings.steamLogin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Avatar extends js.Object {
  var avatar: String
  var avatarfull: String
  var avatarmedium: String
  var commentpermission: js.UndefOr[Double] = js.undefined
  var communityvisibilitystate: Double
  var gameextrainfo: js.UndefOr[String] = js.undefined
  var gameid: js.UndefOr[String] = js.undefined
  var gameserverip: js.UndefOr[String] = js.undefined
  var lastlogoff: Double
  var loccityid: js.UndefOr[Double] = js.undefined
  var loccountrycode: js.UndefOr[String] = js.undefined
  var locstatecode: js.UndefOr[String] = js.undefined
  var personaname: String
  var personastate: Double
  var primaryclanid: js.UndefOr[String] = js.undefined
  var profilestate: js.UndefOr[Double] = js.undefined
  var profileurl: String
  var realname: js.UndefOr[String] = js.undefined
  var steamid: String
  var timecreated: js.UndefOr[Double] = js.undefined
}

object Avatar {
  @scala.inline
  def apply(
    avatar: String,
    avatarfull: String,
    avatarmedium: String,
    communityvisibilitystate: Double,
    lastlogoff: Double,
    personaname: String,
    personastate: Double,
    profileurl: String,
    steamid: String,
    commentpermission: js.UndefOr[Double] = js.undefined,
    gameextrainfo: String = null,
    gameid: String = null,
    gameserverip: String = null,
    loccityid: js.UndefOr[Double] = js.undefined,
    loccountrycode: String = null,
    locstatecode: String = null,
    primaryclanid: String = null,
    profilestate: js.UndefOr[Double] = js.undefined,
    realname: String = null,
    timecreated: js.UndefOr[Double] = js.undefined
  ): Avatar = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], avatarfull = avatarfull.asInstanceOf[js.Any], avatarmedium = avatarmedium.asInstanceOf[js.Any], communityvisibilitystate = communityvisibilitystate.asInstanceOf[js.Any], lastlogoff = lastlogoff.asInstanceOf[js.Any], personaname = personaname.asInstanceOf[js.Any], personastate = personastate.asInstanceOf[js.Any], profileurl = profileurl.asInstanceOf[js.Any], steamid = steamid.asInstanceOf[js.Any])
    if (!js.isUndefined(commentpermission)) __obj.updateDynamic("commentpermission")(commentpermission.get.asInstanceOf[js.Any])
    if (gameextrainfo != null) __obj.updateDynamic("gameextrainfo")(gameextrainfo.asInstanceOf[js.Any])
    if (gameid != null) __obj.updateDynamic("gameid")(gameid.asInstanceOf[js.Any])
    if (gameserverip != null) __obj.updateDynamic("gameserverip")(gameserverip.asInstanceOf[js.Any])
    if (!js.isUndefined(loccityid)) __obj.updateDynamic("loccityid")(loccityid.get.asInstanceOf[js.Any])
    if (loccountrycode != null) __obj.updateDynamic("loccountrycode")(loccountrycode.asInstanceOf[js.Any])
    if (locstatecode != null) __obj.updateDynamic("locstatecode")(locstatecode.asInstanceOf[js.Any])
    if (primaryclanid != null) __obj.updateDynamic("primaryclanid")(primaryclanid.asInstanceOf[js.Any])
    if (!js.isUndefined(profilestate)) __obj.updateDynamic("profilestate")(profilestate.get.asInstanceOf[js.Any])
    if (realname != null) __obj.updateDynamic("realname")(realname.asInstanceOf[js.Any])
    if (!js.isUndefined(timecreated)) __obj.updateDynamic("timecreated")(timecreated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
}

