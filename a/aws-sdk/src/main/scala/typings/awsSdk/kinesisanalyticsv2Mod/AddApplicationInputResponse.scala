package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationInputResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
  /**
    * Describes the application input configuration. 
    */
  var InputDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputDescriptions] = js.native
}

object AddApplicationInputResponse {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN = null,
    ApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined,
    InputDescriptions: InputDescriptions = null
  ): AddApplicationInputResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationARN != null) __obj.updateDynamic("ApplicationARN")(ApplicationARN.asInstanceOf[js.Any])
    if (!js.isUndefined(ApplicationVersionId)) __obj.updateDynamic("ApplicationVersionId")(ApplicationVersionId.get.asInstanceOf[js.Any])
    if (InputDescriptions != null) __obj.updateDynamic("InputDescriptions")(InputDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationInputResponse]
  }
}

