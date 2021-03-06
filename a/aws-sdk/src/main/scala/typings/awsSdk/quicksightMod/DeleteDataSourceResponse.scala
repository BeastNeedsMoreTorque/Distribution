package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDataSourceResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the data source that you deleted.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The ID of the data source. This ID is unique per AWS Region for each AWS account.
    */
  var DataSourceId: js.UndefOr[ResourceId] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object DeleteDataSourceResponse {
  @scala.inline
  def apply(
    Arn: Arn = null,
    DataSourceId: ResourceId = null,
    RequestId: String = null,
    Status: js.UndefOr[StatusCode] = js.undefined
  ): DeleteDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (DataSourceId != null) __obj.updateDynamic("DataSourceId")(DataSourceId.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataSourceResponse]
  }
}

