package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashuserSlashstarredSlashColonownerSlashColonrepo
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityCheckRepoIsStarredByAuthenticatedUserRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: GET
  var request: RequestRequestOptions
  var url: SlashuserSlashstarredSlashColonownerSlashColonrepo
}

object ActivityCheckRepoIsStarredByAuthenticatedUserRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: GET,
    request: RequestRequestOptions,
    url: SlashuserSlashstarredSlashColonownerSlashColonrepo
  ): ActivityCheckRepoIsStarredByAuthenticatedUserRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityCheckRepoIsStarredByAuthenticatedUserRequestOptions]
  }
}

