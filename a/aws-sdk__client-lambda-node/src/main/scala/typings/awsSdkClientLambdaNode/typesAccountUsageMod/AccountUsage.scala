package typings.awsSdkClientLambdaNode.typesAccountUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUsage extends js.Object {
  /**
    * <p>The number of your account's existing functions per region.</p>
    */
  var FunctionCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>Total size, in bytes, of the account's deployment packages per region.</p>
    */
  var TotalCodeSize: js.UndefOr[Double] = js.undefined
}

object AccountUsage {
  @scala.inline
  def apply(FunctionCount: js.UndefOr[Double] = js.undefined, TotalCodeSize: js.UndefOr[Double] = js.undefined): AccountUsage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FunctionCount)) __obj.updateDynamic("FunctionCount")(FunctionCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalCodeSize)) __obj.updateDynamic("TotalCodeSize")(TotalCodeSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountUsage]
  }
}

