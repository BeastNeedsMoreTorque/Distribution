package typings.pulumiAws.inputMod.lb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleConditionSourceIp extends js.Object {
  /**
    * List of exactly one pattern to match. Required when `field` is set.
    */
  var values: Input[js.Array[Input[String]]] = js.native
}

object ListenerRuleConditionSourceIp {
  @scala.inline
  def apply(values: Input[js.Array[Input[String]]]): ListenerRuleConditionSourceIp = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleConditionSourceIp]
  }
}

