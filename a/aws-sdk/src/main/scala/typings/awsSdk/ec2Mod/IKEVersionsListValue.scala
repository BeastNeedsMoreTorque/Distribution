package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKEVersionsListValue extends js.Object {
  /**
    * The IKE version.
    */
  var Value: js.UndefOr[String] = js.native
}

object IKEVersionsListValue {
  @scala.inline
  def apply(Value: String = null): IKEVersionsListValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKEVersionsListValue]
  }
}

