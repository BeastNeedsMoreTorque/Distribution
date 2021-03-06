package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortRange extends js.Object {
  /**
    * The first port in the range of ports, inclusive.
    */
  var FromPort: js.UndefOr[PortNumber] = js.native
  /**
    * The last port in the range of ports, inclusive.
    */
  var ToPort: js.UndefOr[PortNumber] = js.native
}

object PortRange {
  @scala.inline
  def apply(FromPort: js.UndefOr[PortNumber] = js.undefined, ToPort: js.UndefOr[PortNumber] = js.undefined): PortRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FromPort)) __obj.updateDynamic("FromPort")(FromPort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ToPort)) __obj.updateDynamic("ToPort")(ToPort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortRange]
  }
}

