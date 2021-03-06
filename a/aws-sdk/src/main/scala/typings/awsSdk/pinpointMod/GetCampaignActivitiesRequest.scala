package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCampaignActivitiesRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  /**
    * The unique identifier for the campaign.
    */
  var CampaignId: string = js.native
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics.
    */
  var PageSize: js.UndefOr[string] = js.native
  /**
    * The NextToken string that specifies which page of results to return in a paginated response.
    */
  var Token: js.UndefOr[string] = js.native
}

object GetCampaignActivitiesRequest {
  @scala.inline
  def apply(ApplicationId: string, CampaignId: string, PageSize: string = null, Token: string = null): GetCampaignActivitiesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (Token != null) __obj.updateDynamic("Token")(Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignActivitiesRequest]
  }
}

