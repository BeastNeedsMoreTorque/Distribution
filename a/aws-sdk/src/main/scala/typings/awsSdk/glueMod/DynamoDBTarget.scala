package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDBTarget extends js.Object {
  /**
    * The name of the DynamoDB table to crawl.
    */
  var Path: js.UndefOr[typings.awsSdk.glueMod.Path] = js.native
  /**
    * Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can take a long time when the table is not a high throughput table. A value of true means to scan all records, while a value of false means to sample the records. If no value is specified, the value defaults to true.
    */
  var scanAll: js.UndefOr[NullableBoolean] = js.native
  /**
    * The percentage of the configured read capacity units to use by the AWS Glue crawler. Read capacity units is a term defined by DynamoDB, and is a numeric value that acts as rate limiter for the number of reads that can be performed on that table per second. The valid values are null or a value between 0.1 to 1.5. A null value is used when user does not provide a value, and defaults to 0.5 of the configured Read Capacity Unit (for provisioned tables), or 0.25 of the max configured Read Capacity Unit (for tables using on-demand mode).
    */
  var scanRate: js.UndefOr[NullableDouble] = js.native
}

object DynamoDBTarget {
  @scala.inline
  def apply(
    Path: Path = null,
    scanAll: js.UndefOr[NullableBoolean] = js.undefined,
    scanRate: js.UndefOr[NullableDouble] = js.undefined
  ): DynamoDBTarget = {
    val __obj = js.Dynamic.literal()
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    if (!js.isUndefined(scanAll)) __obj.updateDynamic("scanAll")(scanAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scanRate)) __obj.updateDynamic("scanRate")(scanRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDBTarget]
  }
}

