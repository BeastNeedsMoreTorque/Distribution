package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityMarkThreadAsReadEndpoint extends js.Object {
  var thread_id: Double
}

object ActivityMarkThreadAsReadEndpoint {
  @scala.inline
  def apply(thread_id: Double): ActivityMarkThreadAsReadEndpoint = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityMarkThreadAsReadEndpoint]
  }
}

