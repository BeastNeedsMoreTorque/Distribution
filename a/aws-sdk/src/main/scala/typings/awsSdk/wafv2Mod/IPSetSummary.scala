package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPSetSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: js.UndefOr[ResourceArn] = js.native
  /**
    * A description of the IP set that helps with identification. You cannot change the description of an IP set after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: js.UndefOr[EntityId] = js.native
  /**
    * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var LockToken: js.UndefOr[typings.awsSdk.wafv2Mod.LockToken] = js.native
  /**
    * The name of the IP set. You cannot change the name of an IPSet after you create it.
    */
  var Name: js.UndefOr[EntityName] = js.native
}

object IPSetSummary {
  @scala.inline
  def apply(
    ARN: ResourceArn = null,
    Description: EntityDescription = null,
    Id: EntityId = null,
    LockToken: LockToken = null,
    Name: EntityName = null
  ): IPSetSummary = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (LockToken != null) __obj.updateDynamic("LockToken")(LockToken.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSetSummary]
  }
}

