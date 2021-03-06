package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListAccountsForPlanStubbedEndpoint
import typings.octokitTypes.endpointsMod.AppsListAccountsForPlanStubbedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersAppsListAccountsForPlanStubbedEndpoint extends js.Object {
  var parameters: AppsListAccountsForPlanStubbedEndpoint
  var response: OctokitResponse[AppsListAccountsForPlanStubbedResponseData]
}

object ParametersAppsListAccountsForPlanStubbedEndpoint {
  @scala.inline
  def apply(
    parameters: AppsListAccountsForPlanStubbedEndpoint,
    response: OctokitResponse[AppsListAccountsForPlanStubbedResponseData]
  ): ParametersAppsListAccountsForPlanStubbedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListAccountsForPlanStubbedEndpoint]
  }
}

