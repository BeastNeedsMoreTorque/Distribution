package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Restricts messages returned to those matching a filter. Syntax:
    * https://cloud.google.com/appengine/docs/standard/python/search/query_strings
    * Fields/functions available for filtering are: - message_type, from the
    * MSH-9 segment, e.g. 'NOT message_type = "ADT"' - send_date or sendDate,
    * the YYYY-MM-DD date the message was sent in the   dataset's time_zone,
    * from the MSH-7 segment; e.g.   'send_date < "2017-01-02"' - send_time,
    * the timestamp of when the message was sent, using the RFC3339   time
    * format for comparisons, from the MSH-7 segment; e.g. 'send_time <
    * "2017-01-02T00:00:00-05:00"' - send_facility, the hospital/trust that the
    * message came from, from the   MSH-4 segment, e.g. 'send_facility = "RAL"'
    * - HL7RegExp(expr), which does regular expression matching of expr against
    * the HL7 message payload using re2 (http://code.google.com/p/re2/) syntax;
    * e.g. 'HL7RegExp("^.*\|.*\|CERNER")' - PatientId(value, type), which
    * matches if the message lists a patient   having an ID of the given value
    * and type in the PID-2, PID-3, or PID-4   segments; e.g.
    * 'PatientId("123456", "MRN")' - HasLabel(x), a boolean returning true if
    * the message has a label with   key x (having any value) set using the
    * labels map in Message; e.g.   'HasLabel("priority")' - Label(x), a string
    * value of the label with key x as set using the labels   map in Message,
    * e.g. 'Label("priority") = "high"' Negation on the patient ID function and
    * the label function are not supported, e.g. invalid queries: 'NOT
    * PatientId("123456", "MRN")', 'NOT HasLabel("tag1")', 'NOT Label("tag2") =
    * "val2"'. Conjunction of multiple patient ID functions is not supported,
    * e.g. an invalid query: 'PatientId("123456", "MRN") AND
    * PatientId("456789", "MRN")'. Conjunction of multiple label functions is
    * also not supported, e.g. an invalid query: 'HasLabel("tag1") AND
    * Label("tag2") = "val2"'. Conjunction of one patient ID function, one
    * label function and other fields is supported, e.g. a valid query:
    * 'PatientId("123456", "MRN") AND HasLabel("tag1") AND message_type =
    * "ADT"'.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Orders messages returned by the specified order_by clause. Syntax:
    * https://cloud.google.com/apis/design/design_patterns#sorting_order Fields
    * available for ordering are: - send_time
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Limit on the number of messages to return in a single response. If zero
    * the default page size of 100 is used.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token value returned from the previous List request, if
    * any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Name of the HL7v2 store to retrieve messages from.
    */
  var parent: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    fields: String = null,
    filter: String = null,
    key: String = null,
    oauth_token: String = null,
    orderBy: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    parent: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList]
  }
}

