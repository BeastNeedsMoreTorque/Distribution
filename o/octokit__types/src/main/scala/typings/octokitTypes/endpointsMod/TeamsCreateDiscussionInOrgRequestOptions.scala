package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.POST
import typings.octokitTypes.octokitTypesStrings.SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussions
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateDiscussionInOrgRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: POST
  var request: RequestRequestOptions
  var url: SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussions
}

object TeamsCreateDiscussionInOrgRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: POST,
    request: RequestRequestOptions,
    url: SlashorgsSlashColonorgSlashteamsSlashColonteam_slugSlashdiscussions
  ): TeamsCreateDiscussionInOrgRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateDiscussionInOrgRequestOptions]
  }
}

