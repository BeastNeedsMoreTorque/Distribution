package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedConfigurationVersions extends js.Object {
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[HostedConfigurationVersionSummaryList] = js.native
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.appconfigMod.NextToken] = js.native
}

object HostedConfigurationVersions {
  @scala.inline
  def apply(Items: HostedConfigurationVersionSummaryList = null, NextToken: NextToken = null): HostedConfigurationVersions = {
    val __obj = js.Dynamic.literal()
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedConfigurationVersions]
  }
}

