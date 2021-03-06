package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PATCH
import typings.octokitTypes.octokitTypesStrings.`SlashreposSlashColonownerSlashColonrepoSlashcheck-runsSlashColoncheck_run_id`
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: PATCH
  var request: RequestRequestOptions
  var url: `SlashreposSlashColonownerSlashColonrepoSlashcheck-runsSlashColoncheck_run_id`
}

object ChecksUpdateRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: PATCH,
    request: RequestRequestOptions,
    url: `SlashreposSlashColonownerSlashColonrepoSlashcheck-runsSlashColoncheck_run_id`
  ): ChecksUpdateRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateRequestOptions]
  }
}

