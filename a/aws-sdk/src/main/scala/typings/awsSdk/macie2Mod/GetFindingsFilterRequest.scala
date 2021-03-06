package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsFilterRequest extends js.Object {
  /**
    * The unique identifier for the Amazon Macie resource or account that the request applies to.
    */
  var id: string = js.native
}

object GetFindingsFilterRequest {
  @scala.inline
  def apply(id: string): GetFindingsFilterRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsFilterRequest]
  }
}

