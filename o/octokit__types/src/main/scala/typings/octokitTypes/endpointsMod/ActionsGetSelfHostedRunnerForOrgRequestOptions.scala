package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.GET
import typings.octokitTypes.octokitTypesStrings.SlashorgsSlashColonorgSlashactionsSlashrunnersSlashColonrunner_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetSelfHostedRunnerForOrgRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: GET
  var request: RequestRequestOptions
  var url: SlashorgsSlashColonorgSlashactionsSlashrunnersSlashColonrunner_id
}

object ActionsGetSelfHostedRunnerForOrgRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: GET,
    request: RequestRequestOptions,
    url: SlashorgsSlashColonorgSlashactionsSlashrunnersSlashColonrunner_id
  ): ActionsGetSelfHostedRunnerForOrgRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetSelfHostedRunnerForOrgRequestOptions]
  }
}

