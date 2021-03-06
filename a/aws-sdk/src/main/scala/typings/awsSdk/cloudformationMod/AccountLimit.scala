package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountLimit extends js.Object {
  /**
    * The name of the account limit. Values: ConcurrentResourcesLimit | StackLimit | StackOutputsLimit 
    */
  var Name: js.UndefOr[LimitName] = js.native
  /**
    * The value that is associated with the account limit name.
    */
  var Value: js.UndefOr[LimitValue] = js.native
}

object AccountLimit {
  @scala.inline
  def apply(Name: LimitName = null, Value: js.UndefOr[LimitValue] = js.undefined): AccountLimit = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountLimit]
  }
}

