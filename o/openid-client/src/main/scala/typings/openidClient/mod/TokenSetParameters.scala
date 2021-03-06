package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenSetParameters
  extends /* key */ StringDictionary[js.Any] {
  /**
    * The raw access token in JWT format
    */
  var access_token: js.UndefOr[String] = js.undefined
  /**
    * When the token set was received the expires_at field was calculated based on current timestamp
    * and the expires_in. When recalling a TokenSet instance just the expires_at should be passed in.
    */
  var expires_at: js.UndefOr[Double] = js.undefined
  /**
    * The raw id token in JWT format
    */
  var id_token: js.UndefOr[String] = js.undefined
  /**
    * Refresh token, opaque string value
    */
  var refresh_token: js.UndefOr[String] = js.undefined
  /**
    * space-separated scope(s) used for the authentication request
    */
  var scope: js.UndefOr[String] = js.undefined
  /**
    * State value passed in the authentication request
    */
  var session_state: js.UndefOr[String] = js.undefined
  /**
    * Usually "Bearer"
    */
  var token_type: js.UndefOr[String] = js.undefined
}

object TokenSetParameters {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    access_token: String = null,
    expires_at: js.UndefOr[Double] = js.undefined,
    id_token: String = null,
    refresh_token: String = null,
    scope: String = null,
    session_state: String = null,
    token_type: String = null
  ): TokenSetParameters = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (!js.isUndefined(expires_at)) __obj.updateDynamic("expires_at")(expires_at.get.asInstanceOf[js.Any])
    if (id_token != null) __obj.updateDynamic("id_token")(id_token.asInstanceOf[js.Any])
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (session_state != null) __obj.updateDynamic("session_state")(session_state.asInstanceOf[js.Any])
    if (token_type != null) __obj.updateDynamic("token_type")(token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenSetParameters]
  }
}

