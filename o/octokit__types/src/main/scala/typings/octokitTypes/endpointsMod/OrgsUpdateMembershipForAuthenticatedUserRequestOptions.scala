package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PATCH
import typings.octokitTypes.octokitTypesStrings.SlashuserSlashmembershipsSlashorgsSlashColonorg
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateMembershipForAuthenticatedUserRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: PATCH
  var request: RequestRequestOptions
  var url: SlashuserSlashmembershipsSlashorgsSlashColonorg
}

object OrgsUpdateMembershipForAuthenticatedUserRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: PATCH,
    request: RequestRequestOptions,
    url: SlashuserSlashmembershipsSlashorgsSlashColonorg
  ): OrgsUpdateMembershipForAuthenticatedUserRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsUpdateMembershipForAuthenticatedUserRequestOptions]
  }
}

