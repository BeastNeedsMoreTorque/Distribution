package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListPendingInvitationsLegacyEndpoint extends js.Object {
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  var team_id: Double
}

object TeamsListPendingInvitationsLegacyEndpoint {
  @scala.inline
  def apply(
    team_id: Double,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined
  ): TeamsListPendingInvitationsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsListPendingInvitationsLegacyEndpoint]
  }
}

