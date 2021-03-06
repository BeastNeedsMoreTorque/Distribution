package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFailuresForLicenseConfigurationOperationsRequest extends js.Object {
  /**
    * Amazon Resource Name of the license configuration.
    */
  var LicenseConfigurationArn: String = js.native
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.native
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListFailuresForLicenseConfigurationOperationsRequest {
  @scala.inline
  def apply(
    LicenseConfigurationArn: String,
    MaxResults: js.UndefOr[BoxInteger] = js.undefined,
    NextToken: String = null
  ): ListFailuresForLicenseConfigurationOperationsRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFailuresForLicenseConfigurationOperationsRequest]
  }
}

