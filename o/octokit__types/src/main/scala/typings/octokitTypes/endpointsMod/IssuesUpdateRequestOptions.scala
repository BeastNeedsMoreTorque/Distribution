package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PATCH
import typings.octokitTypes.octokitTypesStrings.SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_number
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: PATCH
  var request: RequestRequestOptions
  var url: SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_number
}

object IssuesUpdateRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: PATCH,
    request: RequestRequestOptions,
    url: SlashreposSlashColonownerSlashColonrepoSlashissuesSlashColonissue_number
  ): IssuesUpdateRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesUpdateRequestOptions]
  }
}

