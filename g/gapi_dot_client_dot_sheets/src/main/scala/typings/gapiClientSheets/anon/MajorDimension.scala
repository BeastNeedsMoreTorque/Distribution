package typings.gapiClientSheets.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MajorDimension extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  /**
    * How dates, times, and durations should be represented in the output.
    * This is ignored if value_render_option is
    * FORMATTED_VALUE.
    * The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var dateTimeRenderOption: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The major dimension that results should use.
    *
    * For example, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then
    * requesting `range=A1:B2,majorDimension=ROWS` returns `[[1,2],[3,4]]`,
    * whereas requesting `range=A1:B2,majorDimension=COLUMNS` returns
    * `[[1,3],[2,4]]`.
    */
  var majorDimension: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** The A1 notation of the values to retrieve. */
  var range: String
  /** The ID of the spreadsheet to retrieve data from. */
  var spreadsheetId: String
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
  /**
    * How values should be represented in the output.
    * The default render option is ValueRenderOption.FORMATTED_VALUE.
    */
  var valueRenderOption: js.UndefOr[String] = js.undefined
}

object MajorDimension {
  @scala.inline
  def apply(
    range: String,
    spreadsheetId: String,
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    callback: String = null,
    dateTimeRenderOption: String = null,
    fields: String = null,
    key: String = null,
    majorDimension: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    uploadType: String = null,
    upload_protocol: String = null,
    valueRenderOption: String = null
  ): MajorDimension = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], spreadsheetId = spreadsheetId.asInstanceOf[js.Any])
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (dateTimeRenderOption != null) __obj.updateDynamic("dateTimeRenderOption")(dateTimeRenderOption.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (majorDimension != null) __obj.updateDynamic("majorDimension")(majorDimension.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    if (valueRenderOption != null) __obj.updateDynamic("valueRenderOption")(valueRenderOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[MajorDimension]
  }
}

