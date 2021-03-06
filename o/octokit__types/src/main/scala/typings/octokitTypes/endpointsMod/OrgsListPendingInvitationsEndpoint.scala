package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListPendingInvitationsEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
}

object OrgsListPendingInvitationsEndpoint {
  @scala.inline
  def apply(
    org_ : String,
    page: js.UndefOr[Double] = js.undefined,
    per_page: js.UndefOr[Double] = js.undefined
  ): OrgsListPendingInvitationsEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(per_page)) __obj.updateDynamic("per_page")(per_page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListPendingInvitationsEndpoint]
  }
}

