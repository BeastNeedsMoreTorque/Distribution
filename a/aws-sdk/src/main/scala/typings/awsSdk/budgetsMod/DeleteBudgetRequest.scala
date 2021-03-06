package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBudgetRequest extends js.Object {
  /**
    * The accountId that is associated with the budget that you want to delete.
    */
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  /**
    * The name of the budget that you want to delete.
    */
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName = js.native
}

object DeleteBudgetRequest {
  @scala.inline
  def apply(AccountId: AccountId, BudgetName: BudgetName): DeleteBudgetRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBudgetRequest]
  }
}

