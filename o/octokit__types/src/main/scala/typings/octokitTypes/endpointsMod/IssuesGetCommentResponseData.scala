package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Eventsurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetCommentResponseData extends js.Object {
  var body: String
  var created_at: String
  var html_url: String
  var id: Double
  var node_id: String
  var updated_at: String
  var url: String
  var user: Eventsurl
}

object IssuesGetCommentResponseData {
  @scala.inline
  def apply(
    body: String,
    created_at: String,
    html_url: String,
    id: Double,
    node_id: String,
    updated_at: String,
    url: String,
    user: Eventsurl
  ): IssuesGetCommentResponseData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesGetCommentResponseData]
  }
}

