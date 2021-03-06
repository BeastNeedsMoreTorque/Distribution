package typings.dialogflow.mod.google.cloud.dialogflow.v2

import typings.dialogflow.mod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BatchUpdateIntentsRequest. */
trait IBatchUpdateIntentsRequest extends js.Object {
  /** BatchUpdateIntentsRequest intentBatchInline */
  var intentBatchInline: js.UndefOr[IIntentBatch | Null] = js.undefined
  /** BatchUpdateIntentsRequest intentBatchUri */
  var intentBatchUri: js.UndefOr[String | Null] = js.undefined
  /** BatchUpdateIntentsRequest intentView */
  var intentView: js.UndefOr[
    IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String) | Null
  ] = js.undefined
  /** BatchUpdateIntentsRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** BatchUpdateIntentsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  /** BatchUpdateIntentsRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IBatchUpdateIntentsRequest {
  @scala.inline
  def apply(
    intentBatchInline: js.UndefOr[Null | IIntentBatch] = js.undefined,
    intentBatchUri: js.UndefOr[Null | String] = js.undefined,
    intentView: js.UndefOr[
      Null | IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String)
    ] = js.undefined,
    languageCode: js.UndefOr[Null | String] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined,
    updateMask: js.UndefOr[Null | IFieldMask] = js.undefined
  ): IBatchUpdateIntentsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(intentBatchInline)) __obj.updateDynamic("intentBatchInline")(intentBatchInline.asInstanceOf[js.Any])
    if (!js.isUndefined(intentBatchUri)) __obj.updateDynamic("intentBatchUri")(intentBatchUri.asInstanceOf[js.Any])
    if (!js.isUndefined(intentView)) __obj.updateDynamic("intentView")(intentView.asInstanceOf[js.Any])
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(updateMask)) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchUpdateIntentsRequest]
  }
}

