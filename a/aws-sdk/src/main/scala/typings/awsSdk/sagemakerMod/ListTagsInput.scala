package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsInput extends js.Object {
  /**
    * Maximum number of tags to return.
    */
  var MaxResults: js.UndefOr[ListTagsMaxResults] = js.native
  /**
    *  If the response to the previous ListTags request is truncated, Amazon SageMaker returns this token. To retrieve the next set of tags, use it in the subsequent request. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource whose tags you want to retrieve.
    */
  var ResourceArn: typings.awsSdk.sagemakerMod.ResourceArn = js.native
}

object ListTagsInput {
  @scala.inline
  def apply(
    ResourceArn: ResourceArn,
    MaxResults: js.UndefOr[ListTagsMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsInput]
  }
}

