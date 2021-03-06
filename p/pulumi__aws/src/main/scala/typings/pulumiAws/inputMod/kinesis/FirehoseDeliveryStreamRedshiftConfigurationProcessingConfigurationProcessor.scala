package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor extends js.Object {
  /**
    * Array of processor parameters. More details are given below
    */
  var parameters: js.UndefOr[
    Input[
      js.Array[
        Input[
          FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter
        ]
      ]
    ]
  ] = js.native
  /**
    * The type of processor. Valid Values: `Lambda`
    */
  var `type`: Input[String] = js.native
}

object FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor {
  @scala.inline
  def apply(
    `type`: Input[String],
    parameters: Input[
      js.Array[
        Input[
          FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter
        ]
      ]
    ] = null
  ): FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor]
  }
}

