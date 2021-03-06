package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryResultsInput extends js.Object {
  /**
    * The maximum number of results (rows) to return in this request.
    */
  var MaxResults: js.UndefOr[MaxQueryResults] = js.native
  /**
    * A token generated by the Athena service that specifies where to continue pagination if a previous request was truncated. To obtain the next set of pages, pass in the NextToken from the response object of the previous page call.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The unique ID of the query execution.
    */
  var QueryExecutionId: typings.awsSdk.athenaMod.QueryExecutionId = js.native
}

object GetQueryResultsInput {
  @scala.inline
  def apply(
    QueryExecutionId: QueryExecutionId,
    MaxResults: js.UndefOr[MaxQueryResults] = js.undefined,
    NextToken: Token = null
  ): GetQueryResultsInput = {
    val __obj = js.Dynamic.literal(QueryExecutionId = QueryExecutionId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryResultsInput]
  }
}

