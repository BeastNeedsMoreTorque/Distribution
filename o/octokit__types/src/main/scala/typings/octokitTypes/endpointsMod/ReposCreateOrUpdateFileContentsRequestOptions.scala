package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.SlashreposSlashColonownerSlashColonrepoSlashcontentsSlashColonpath
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileContentsRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: PUT
  var request: RequestRequestOptions
  var url: SlashreposSlashColonownerSlashColonrepoSlashcontentsSlashColonpath
}

object ReposCreateOrUpdateFileContentsRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: PUT,
    request: RequestRequestOptions,
    url: SlashreposSlashColonownerSlashColonrepoSlashcontentsSlashColonpath
  ): ReposCreateOrUpdateFileContentsRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileContentsRequestOptions]
  }
}

