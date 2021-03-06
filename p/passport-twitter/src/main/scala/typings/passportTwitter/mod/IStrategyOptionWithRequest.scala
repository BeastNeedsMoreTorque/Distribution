package typings.passportTwitter.mod

import typings.passportTwitter.passportTwitterBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrategyOptionWithRequest extends IStrategyOptionBase {
  var passReqToCallback: `true`
}

object IStrategyOptionWithRequest {
  @scala.inline
  def apply(
    callbackURL: String,
    consumerKey: String,
    consumerSecret: String,
    passReqToCallback: `true`,
    accessTokenURL: String = null,
    forceLogin: js.UndefOr[Boolean] = js.undefined,
    includeEmail: js.UndefOr[Boolean] = js.undefined,
    includeEntities: js.UndefOr[Boolean] = js.undefined,
    includeStatus: js.UndefOr[Boolean] = js.undefined,
    reguestTokenURL: String = null,
    screenName: String = null,
    sessionKey: String = null,
    skipExtendedUserProfile: js.UndefOr[Boolean] = js.undefined,
    userAuthorizationURL: String = null,
    userProfileURL: String = null
  ): IStrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    if (accessTokenURL != null) __obj.updateDynamic("accessTokenURL")(accessTokenURL.asInstanceOf[js.Any])
    if (!js.isUndefined(forceLogin)) __obj.updateDynamic("forceLogin")(forceLogin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeEmail)) __obj.updateDynamic("includeEmail")(includeEmail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeEntities)) __obj.updateDynamic("includeEntities")(includeEntities.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeStatus)) __obj.updateDynamic("includeStatus")(includeStatus.get.asInstanceOf[js.Any])
    if (reguestTokenURL != null) __obj.updateDynamic("reguestTokenURL")(reguestTokenURL.asInstanceOf[js.Any])
    if (screenName != null) __obj.updateDynamic("screenName")(screenName.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (!js.isUndefined(skipExtendedUserProfile)) __obj.updateDynamic("skipExtendedUserProfile")(skipExtendedUserProfile.get.asInstanceOf[js.Any])
    if (userAuthorizationURL != null) __obj.updateDynamic("userAuthorizationURL")(userAuthorizationURL.asInstanceOf[js.Any])
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStrategyOptionWithRequest]
  }
}

