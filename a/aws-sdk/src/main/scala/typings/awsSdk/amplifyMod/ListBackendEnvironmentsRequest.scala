package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBackendEnvironmentsRequest extends js.Object {
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  The name of the backend environment 
    */
  var environmentName: js.UndefOr[EnvironmentName] = js.native
  /**
    *  The maximum number of records to list in a single response. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    *  A pagination token. Set to null to start listing backend environments from the start. If a non-null pagination token is returned in a result, pass its value in here to list more backend environments. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListBackendEnvironmentsRequest {
  @scala.inline
  def apply(
    appId: AppId,
    environmentName: EnvironmentName = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null
  ): ListBackendEnvironmentsRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    if (environmentName != null) __obj.updateDynamic("environmentName")(environmentName.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackendEnvironmentsRequest]
  }
}

