package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceState extends js.Object {
  /**
    * The status code for the instance.
    */
  var code: js.UndefOr[integer] = js.native
  /**
    * The state of the instance (e.g., running or pending).
    */
  var name: js.UndefOr[String] = js.native
}

object InstanceState {
  @scala.inline
  def apply(code: js.UndefOr[integer] = js.undefined, name: String = null): InstanceState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceState]
  }
}

