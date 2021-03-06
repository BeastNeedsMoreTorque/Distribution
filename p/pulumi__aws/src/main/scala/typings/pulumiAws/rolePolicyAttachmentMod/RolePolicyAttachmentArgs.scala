package typings.pulumiAws.rolePolicyAttachmentMod

import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.roleMod.Role
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RolePolicyAttachmentArgs extends js.Object {
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: Input[ARN] = js.native
  /**
    * The role the policy should be applied to
    */
  val role: Input[String | Role] = js.native
}

object RolePolicyAttachmentArgs {
  @scala.inline
  def apply(policyArn: Input[ARN], role: Input[String | Role]): RolePolicyAttachmentArgs = {
    val __obj = js.Dynamic.literal(policyArn = policyArn.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[RolePolicyAttachmentArgs]
  }
}

