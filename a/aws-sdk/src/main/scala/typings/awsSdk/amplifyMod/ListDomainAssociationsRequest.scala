package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainAssociationsRequest extends js.Object {
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  The maximum number of records to list in a single response. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    *  A pagination token. Set to null to start listing apps from the start. If non-null, a pagination token is returned in a result. Pass its value in here to list more projects. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDomainAssociationsRequest {
  @scala.inline
  def apply(appId: AppId, maxResults: js.UndefOr[MaxResults] = js.undefined, nextToken: NextToken = null): ListDomainAssociationsRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainAssociationsRequest]
  }
}

