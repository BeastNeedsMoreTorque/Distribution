package typings.awsSdk.anon

import typings.awsSdk.elasticacheMod.IntegerOptional
import typings.awsSdk.elasticacheMod.String
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/elasticache.DescribeReplicationGroupsMessage & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeReplicationGroups extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The identifier for the replication group to be described. This parameter is not case sensitive. If you do not specify this parameter, information about all replication groups is returned.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.native
}

object DescribeReplicationGroups {
  @scala.inline
  def apply(
    $waiter: WaiterConfiguration = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    ReplicationGroupId: String = null
  ): DescribeReplicationGroups = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords.get.asInstanceOf[js.Any])
    if (ReplicationGroupId != null) __obj.updateDynamic("ReplicationGroupId")(ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReplicationGroups]
  }
}

