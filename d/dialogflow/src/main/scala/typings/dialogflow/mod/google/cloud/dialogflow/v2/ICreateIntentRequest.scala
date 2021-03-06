package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CreateIntentRequest. */
trait ICreateIntentRequest extends js.Object {
  /** CreateIntentRequest intent */
  var intent: js.UndefOr[IIntent | Null] = js.undefined
  /** CreateIntentRequest intentView */
  var intentView: js.UndefOr[
    IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String) | Null
  ] = js.undefined
  /** CreateIntentRequest languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** CreateIntentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object ICreateIntentRequest {
  @scala.inline
  def apply(
    intent: js.UndefOr[Null | IIntent] = js.undefined,
    intentView: js.UndefOr[
      Null | IntentView | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.IntentView * / any */ String)
    ] = js.undefined,
    languageCode: js.UndefOr[Null | String] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined
  ): ICreateIntentRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(intent)) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(intentView)) __obj.updateDynamic("intentView")(intentView.asInstanceOf[js.Any])
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateIntentRequest]
  }
}

