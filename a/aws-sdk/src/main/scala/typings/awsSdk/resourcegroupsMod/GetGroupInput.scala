package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupInput extends js.Object {
  /**
    * The name of the resource group.
    */
  var GroupName: typings.awsSdk.resourcegroupsMod.GroupName = js.native
}

object GetGroupInput {
  @scala.inline
  def apply(GroupName: GroupName): GetGroupInput = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupInput]
  }
}

