package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecordsOutput extends js.Object {
  /**
    * The number of milliseconds the GetRecords response is from the tip of the stream, indicating how far behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are no new records to process at this moment.
    */
  var MillisBehindLatest: js.UndefOr[typings.awsSdk.kinesisMod.MillisBehindLatest] = js.native
  /**
    * The next position in the shard from which to start sequentially reading data records. If set to null, the shard has been closed and the requested iterator does not return any more data. 
    */
  var NextShardIterator: js.UndefOr[ShardIterator] = js.native
  /**
    * The data records retrieved from the shard.
    */
  var Records: RecordList = js.native
}

object GetRecordsOutput {
  @scala.inline
  def apply(
    Records: RecordList,
    MillisBehindLatest: js.UndefOr[MillisBehindLatest] = js.undefined,
    NextShardIterator: ShardIterator = null
  ): GetRecordsOutput = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    if (!js.isUndefined(MillisBehindLatest)) __obj.updateDynamic("MillisBehindLatest")(MillisBehindLatest.get.asInstanceOf[js.Any])
    if (NextShardIterator != null) __obj.updateDynamic("NextShardIterator")(NextShardIterator.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecordsOutput]
  }
}

