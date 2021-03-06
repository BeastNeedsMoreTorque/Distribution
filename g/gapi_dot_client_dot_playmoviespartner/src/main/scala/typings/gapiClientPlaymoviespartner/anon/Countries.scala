package typings.gapiClientPlaymoviespartner.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Countries extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  /** REQUIRED. See _General rules_ for more information about this field. */
  var accountId: String
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  /**
    * Filter StoreInfos that match (case-insensitive) any of the given country
    * codes, using the "ISO 3166-1 alpha-2" format (examples: "US", "us", "Us").
    */
  var countries: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Filter StoreInfos that match any of the given `mid`s. */
  var mids: js.UndefOr[String] = js.undefined
  /**
    * Filter that matches StoreInfos with a `name` or `show_name`
    * that contains the given case-insensitive name.
    */
  var name: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var pphNames: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Filter StoreInfos that match any of the given `season_id`s. */
  var seasonIds: js.UndefOr[String] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var studioNames: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
  /**
    * Filter StoreInfos that match a given `video_id`.
    * NOTE: this field is deprecated and will be removed on V2; `video_ids`
    * should be used instead.
    */
  var videoId: js.UndefOr[String] = js.undefined
  /** Filter StoreInfos that match any of the given `video_id`s. */
  var videoIds: js.UndefOr[String] = js.undefined
}

object Countries {
  @scala.inline
  def apply(
    accountId: String,
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    countries: String = null,
    fields: String = null,
    key: String = null,
    mids: String = null,
    name: String = null,
    oauth_token: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    pphNames: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    seasonIds: String = null,
    studioNames: String = null,
    uploadType: String = null,
    upload_protocol: String = null,
    videoId: String = null,
    videoIds: String = null
  ): Countries = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (mids != null) __obj.updateDynamic("mids")(mids.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.get.asInstanceOf[js.Any])
    if (pphNames != null) __obj.updateDynamic("pphNames")(pphNames.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (seasonIds != null) __obj.updateDynamic("seasonIds")(seasonIds.asInstanceOf[js.Any])
    if (studioNames != null) __obj.updateDynamic("studioNames")(studioNames.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    if (videoIds != null) __obj.updateDynamic("videoIds")(videoIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Countries]
  }
}

