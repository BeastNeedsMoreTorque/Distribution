package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checksuite extends js.Object {
  var app: Events
  var check_suite: IdNumber
  var completed_at: String
  var conclusion: String
  var details_url: String
  var external_id: String
  var head_sha: String
  var html_url: String
  var id: Double
  var name: String
  var node_id: String
  var output: Annotationscount
  var pull_requests: js.Array[Base]
  var started_at: String
  var status: String
  var url: String
}

object Checksuite {
  @scala.inline
  def apply(
    app: Events,
    check_suite: IdNumber,
    completed_at: String,
    conclusion: String,
    details_url: String,
    external_id: String,
    head_sha: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    output: Annotationscount,
    pull_requests: js.Array[Base],
    started_at: String,
    status: String,
    url: String
  ): Checksuite = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], check_suite = check_suite.asInstanceOf[js.Any], completed_at = completed_at.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], details_url = details_url.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], started_at = started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checksuite]
  }
}

