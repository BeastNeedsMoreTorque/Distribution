package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.rpc.IStatus
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DetectIntentResponse. */
trait IDetectIntentResponse extends js.Object {
  /** DetectIntentResponse outputAudio */
  var outputAudio: js.UndefOr[Uint8Array | String | Null] = js.undefined
  /** DetectIntentResponse outputAudioConfig */
  var outputAudioConfig: js.UndefOr[IOutputAudioConfig | Null] = js.undefined
  /** DetectIntentResponse queryResult */
  var queryResult: js.UndefOr[IQueryResult | Null] = js.undefined
  /** DetectIntentResponse responseId */
  var responseId: js.UndefOr[String | Null] = js.undefined
  /** DetectIntentResponse webhookStatus */
  var webhookStatus: js.UndefOr[IStatus | Null] = js.undefined
}

object IDetectIntentResponse {
  @scala.inline
  def apply(
    outputAudio: js.UndefOr[Null | Uint8Array | String] = js.undefined,
    outputAudioConfig: js.UndefOr[Null | IOutputAudioConfig] = js.undefined,
    queryResult: js.UndefOr[Null | IQueryResult] = js.undefined,
    responseId: js.UndefOr[Null | String] = js.undefined,
    webhookStatus: js.UndefOr[Null | IStatus] = js.undefined
  ): IDetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(outputAudio)) __obj.updateDynamic("outputAudio")(outputAudio.asInstanceOf[js.Any])
    if (!js.isUndefined(outputAudioConfig)) __obj.updateDynamic("outputAudioConfig")(outputAudioConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(queryResult)) __obj.updateDynamic("queryResult")(queryResult.asInstanceOf[js.Any])
    if (!js.isUndefined(responseId)) __obj.updateDynamic("responseId")(responseId.asInstanceOf[js.Any])
    if (!js.isUndefined(webhookStatus)) __obj.updateDynamic("webhookStatus")(webhookStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetectIntentResponse]
  }
}

